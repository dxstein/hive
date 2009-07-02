/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.metastore.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;
import com.facebook.thrift.transport.*;

public class Schema implements TBase, java.io.Serializable {
private List<FieldSchema> fieldSchemas;
private Map<String,String> properties;

public final Isset __isset = new Isset();
public static final class Isset implements java.io.Serializable {
public boolean fieldSchemas = false;
public boolean properties = false;
}

public Schema() {
}

public Schema(
List<FieldSchema> fieldSchemas,
Map<String,String> properties)
{
this();
this.fieldSchemas = fieldSchemas;
this.__isset.fieldSchemas = true;
this.properties = properties;
this.__isset.properties = true;
}

public int getFieldSchemasSize() {
return (this.fieldSchemas == null) ? 0 : this.fieldSchemas.size();
}

public java.util.Iterator<FieldSchema> getFieldSchemasIterator() {
return (this.fieldSchemas == null) ? null : this.fieldSchemas.iterator();
}

public void addToFieldSchemas(FieldSchema elem) {
if (this.fieldSchemas == null) {
this.fieldSchemas = new ArrayList<FieldSchema>();
}
this.fieldSchemas.add(elem);
this.__isset.fieldSchemas = true;
}

public List<FieldSchema> getFieldSchemas() {
return this.fieldSchemas;
}

public void setFieldSchemas(List<FieldSchema> fieldSchemas) {
this.fieldSchemas = fieldSchemas;
this.__isset.fieldSchemas = true;
}

public void unsetFieldSchemas() {
this.fieldSchemas = null;
this.__isset.fieldSchemas = false;
}

public int getPropertiesSize() {
return (this.properties == null) ? 0 : this.properties.size();
}

public void putToProperties(String key, String val) {
if (this.properties == null) {
this.properties = new HashMap<String,String>();
}
this.properties.put(key, val);
this.__isset.properties = true;
}

public Map<String,String> getProperties() {
return this.properties;
}

public void setProperties(Map<String,String> properties) {
this.properties = properties;
this.__isset.properties = true;
}

public void unsetProperties() {
this.properties = null;
this.__isset.properties = false;
}

public boolean equals(Object that) {
if (that == null)
  return false;
if (that instanceof Schema)
  return this.equals((Schema)that);
return false;
}

public boolean equals(Schema that) {
if (that == null)
  return false;

boolean this_present_fieldSchemas = true && (this.fieldSchemas != null);
boolean that_present_fieldSchemas = true && (that.fieldSchemas != null);
if (this_present_fieldSchemas || that_present_fieldSchemas) {
if (!(this_present_fieldSchemas && that_present_fieldSchemas))
  return false;
if (!this.fieldSchemas.equals(that.fieldSchemas))
  return false;
}

boolean this_present_properties = true && (this.properties != null);
boolean that_present_properties = true && (that.properties != null);
if (this_present_properties || that_present_properties) {
if (!(this_present_properties && that_present_properties))
  return false;
if (!this.properties.equals(that.properties))
  return false;
}

return true;
}

public int hashCode() {
return 0;
}

public void read(TProtocol iprot) throws TException {
TField field;
iprot.readStructBegin();
while (true)
{
field = iprot.readFieldBegin();
if (field.type == TType.STOP) { 
  break;
}
switch (field.id)
{
  case 1:
    if (field.type == TType.LIST) {
      {
        TList _list48 = iprot.readListBegin();
        this.fieldSchemas = new ArrayList<FieldSchema>(_list48.size);
        for (int _i49 = 0; _i49 < _list48.size; ++_i49)
        {
          FieldSchema _elem50 = new FieldSchema();
          _elem50 = new FieldSchema();
          _elem50.read(iprot);
          this.fieldSchemas.add(_elem50);
        }
        iprot.readListEnd();
      }
      this.__isset.fieldSchemas = true;
    } else { 
      TProtocolUtil.skip(iprot, field.type);
    }
    break;
  case 2:
    if (field.type == TType.MAP) {
      {
        TMap _map51 = iprot.readMapBegin();
        this.properties = new HashMap<String,String>(2*_map51.size);
        for (int _i52 = 0; _i52 < _map51.size; ++_i52)
        {
          String _key53;
          String _val54;
          _key53 = iprot.readString();
          _val54 = iprot.readString();
          this.properties.put(_key53, _val54);
        }
        iprot.readMapEnd();
      }
      this.__isset.properties = true;
    } else { 
      TProtocolUtil.skip(iprot, field.type);
    }
    break;
  default:
    TProtocolUtil.skip(iprot, field.type);
    break;
}
iprot.readFieldEnd();
}
iprot.readStructEnd();
}

public void write(TProtocol oprot) throws TException {
TStruct struct = new TStruct("Schema");
oprot.writeStructBegin(struct);
TField field = new TField();
if (this.fieldSchemas != null) {
field.name = "fieldSchemas";
field.type = TType.LIST;
field.id = 1;
oprot.writeFieldBegin(field);
{
  oprot.writeListBegin(new TList(TType.STRUCT, this.fieldSchemas.size()));
  for (FieldSchema _iter55 : this.fieldSchemas)  {
    _iter55.write(oprot);
  }
  oprot.writeListEnd();
}
oprot.writeFieldEnd();
}
if (this.properties != null) {
field.name = "properties";
field.type = TType.MAP;
field.id = 2;
oprot.writeFieldBegin(field);
{
  oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.properties.size()));
  for (String _iter56 : this.properties.keySet())  {
    oprot.writeString(_iter56);
    oprot.writeString(this.properties.get(_iter56));
  }
  oprot.writeMapEnd();
}
oprot.writeFieldEnd();
}
oprot.writeFieldStop();
oprot.writeStructEnd();
}

public String toString() {
StringBuilder sb = new StringBuilder("Schema(");
sb.append("fieldSchemas:");
sb.append(this.fieldSchemas);
sb.append(",properties:");
sb.append(this.properties);
sb.append(")");
return sb.toString();
}

}

