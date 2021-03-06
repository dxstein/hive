/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * JDBM LICENSE v1.00
 *
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided
 * that the following conditions are met:
 *
 * 1. Redistributions of source code must retain copyright
 *    statements and notices.  Redistributions must also contain a
 *    copy of this document.
 *
 * 2. Redistributions in binary form must reproduce the
 *    above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other
 *    materials provided with the distribution.
 *
 * 3. The name "JDBM" must not be used to endorse or promote
 *    products derived from this Software without prior written
 *    permission of Cees de Groot.  For written permission,
 *    please contact cg@cdegroot.com.
 *
 * 4. Products derived from this Software may not be called "JDBM"
 *    nor may "JDBM" appear in their names without prior written
 *    permission of Cees de Groot.
 *
 * 5. Due credit should be given to the JDBM Project
 *    (http://jdbm.sourceforge.net/).
 *
 * THIS SOFTWARE IS PROVIDED BY THE JDBM PROJECT AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL
 * CEES DE GROOT OR ANY CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Copyright 2000 (C) Cees de Groot. All Rights Reserved.
 * Copyright 2000-2001 (C) Alex Boisvert. All Rights Reserved.
 * Contributions are Copyright (C) 2000 by their associated contributors.
 *
 * $Id: Provider.java,v 1.3 2005/06/25 23:12:32 doomdark Exp $
 */

package org.apache.hadoop.hive.ql.util.jdbm.recman;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.hadoop.hive.ql.util.jdbm.RecordManager;
import org.apache.hadoop.hive.ql.util.jdbm.RecordManagerOptions;
import org.apache.hadoop.hive.ql.util.jdbm.RecordManagerProvider;
import org.apache.hadoop.hive.ql.util.jdbm.helper.MRU;

/**
 * Provider of the default RecordManager implementation.
 * 
 * @author <a href="mailto:boisvert@intalio.com">Alex Boisvert</a>
 * @version $Id: Provider.java,v 1.3 2005/06/25 23:12:32 doomdark Exp $
 */
public final class Provider implements RecordManagerProvider {

  /**
   * Create a default implementation record manager.
   * 
   * @param name
   *          Name of the record file.
   * @param options
   *          Record manager options.
   * @throws IOException
   *           if an I/O related exception occurs while creating or opening the
   *           record manager.
   * @throws UnsupportedOperationException
   *           if some options are not supported by the implementation.
   * @throws IllegalArgumentException
   *           if some options are invalid.
   */
  public RecordManager createRecordManager(String name, Properties options)
      throws IOException {
    RecordManager recman;

    recman = new BaseRecordManager(name);
    recman = getCachedRecordManager(recman, options);
    return recman;
  }

  private RecordManager getCachedRecordManager(RecordManager recman,
      Properties options) {
    String value;
    int cacheSize;

    value = options.getProperty(RecordManagerOptions.DISABLE_TRANSACTIONS,
        "false");
    if (value.equalsIgnoreCase("TRUE")) {
      ((BaseRecordManager) recman).disableTransactions();
    }

    value = options.getProperty(RecordManagerOptions.CACHE_SIZE, "1000");
    cacheSize = Integer.parseInt(value);

    value = options.getProperty(RecordManagerOptions.CACHE_TYPE,
        RecordManagerOptions.NORMAL_CACHE);
    if (value.equalsIgnoreCase(RecordManagerOptions.NORMAL_CACHE)) {
      MRU cache = new MRU(cacheSize);
      recman = new CacheRecordManager(recman, cache);
    } else if (value.equalsIgnoreCase(RecordManagerOptions.SOFT_REF_CACHE)) {
      throw new IllegalArgumentException("Soft reference cache not implemented");
    } else if (value.equalsIgnoreCase(RecordManagerOptions.WEAK_REF_CACHE)) {
      throw new IllegalArgumentException("Weak reference cache not implemented");
    } else if (value.equalsIgnoreCase(RecordManagerOptions.NO_CACHE)) {
      // do nothing
    } else {
      throw new IllegalArgumentException("Invalid cache type: " + value);
    }

    return recman;
  }

  public RecordManager createRecordManager(File file, Properties options)
      throws IOException {
    RecordManager recman = new BaseRecordManager(file);
    recman = getCachedRecordManager(recman, options);
    return recman;
  }

}
