/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.log4j.Logger;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class HiveClusterStatus implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("HiveClusterStatus");
  private static final TField TASK_TRACKERS_FIELD_DESC = new TField("taskTrackers", TType.I32, (short)1);
  private static final TField MAP_TASKS_FIELD_DESC = new TField("mapTasks", TType.I32, (short)2);
  private static final TField REDUCE_TASKS_FIELD_DESC = new TField("reduceTasks", TType.I32, (short)3);
  private static final TField MAX_MAP_TASKS_FIELD_DESC = new TField("maxMapTasks", TType.I32, (short)4);
  private static final TField MAX_REDUCE_TASKS_FIELD_DESC = new TField("maxReduceTasks", TType.I32, (short)5);
  private static final TField STATE_FIELD_DESC = new TField("state", TType.I32, (short)6);

  private int taskTrackers;
  public static final int TASKTRACKERS = 1;
  private int mapTasks;
  public static final int MAPTASKS = 2;
  private int reduceTasks;
  public static final int REDUCETASKS = 3;
  private int maxMapTasks;
  public static final int MAXMAPTASKS = 4;
  private int maxReduceTasks;
  public static final int MAXREDUCETASKS = 5;
  private int state;
  public static final int STATE = 6;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean taskTrackers = false;
    public boolean mapTasks = false;
    public boolean reduceTasks = false;
    public boolean maxMapTasks = false;
    public boolean maxReduceTasks = false;
    public boolean state = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(TASKTRACKERS, new FieldMetaData("taskTrackers", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(MAPTASKS, new FieldMetaData("mapTasks", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(REDUCETASKS, new FieldMetaData("reduceTasks", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(MAXMAPTASKS, new FieldMetaData("maxMapTasks", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(MAXREDUCETASKS, new FieldMetaData("maxReduceTasks", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(STATE, new FieldMetaData("state", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(HiveClusterStatus.class, metaDataMap);
  }

  public HiveClusterStatus() {
  }

  public HiveClusterStatus(
    int taskTrackers,
    int mapTasks,
    int reduceTasks,
    int maxMapTasks,
    int maxReduceTasks,
    int state)
  {
    this();
    this.taskTrackers = taskTrackers;
    this.__isset.taskTrackers = true;
    this.mapTasks = mapTasks;
    this.__isset.mapTasks = true;
    this.reduceTasks = reduceTasks;
    this.__isset.reduceTasks = true;
    this.maxMapTasks = maxMapTasks;
    this.__isset.maxMapTasks = true;
    this.maxReduceTasks = maxReduceTasks;
    this.__isset.maxReduceTasks = true;
    this.state = state;
    this.__isset.state = true;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HiveClusterStatus(HiveClusterStatus other) {
    __isset.taskTrackers = other.__isset.taskTrackers;
    this.taskTrackers = other.taskTrackers;
    __isset.mapTasks = other.__isset.mapTasks;
    this.mapTasks = other.mapTasks;
    __isset.reduceTasks = other.__isset.reduceTasks;
    this.reduceTasks = other.reduceTasks;
    __isset.maxMapTasks = other.__isset.maxMapTasks;
    this.maxMapTasks = other.maxMapTasks;
    __isset.maxReduceTasks = other.__isset.maxReduceTasks;
    this.maxReduceTasks = other.maxReduceTasks;
    __isset.state = other.__isset.state;
    this.state = other.state;
  }

  @Override
  public HiveClusterStatus clone() {
    return new HiveClusterStatus(this);
  }

  public int getTaskTrackers() {
    return this.taskTrackers;
  }

  public void setTaskTrackers(int taskTrackers) {
    this.taskTrackers = taskTrackers;
    this.__isset.taskTrackers = true;
  }

  public void unsetTaskTrackers() {
    this.__isset.taskTrackers = false;
  }

  // Returns true if field taskTrackers is set (has been asigned a value) and false otherwise
  public boolean isSetTaskTrackers() {
    return this.__isset.taskTrackers;
  }

  public int getMapTasks() {
    return this.mapTasks;
  }

  public void setMapTasks(int mapTasks) {
    this.mapTasks = mapTasks;
    this.__isset.mapTasks = true;
  }

  public void unsetMapTasks() {
    this.__isset.mapTasks = false;
  }

  // Returns true if field mapTasks is set (has been asigned a value) and false otherwise
  public boolean isSetMapTasks() {
    return this.__isset.mapTasks;
  }

  public int getReduceTasks() {
    return this.reduceTasks;
  }

  public void setReduceTasks(int reduceTasks) {
    this.reduceTasks = reduceTasks;
    this.__isset.reduceTasks = true;
  }

  public void unsetReduceTasks() {
    this.__isset.reduceTasks = false;
  }

  // Returns true if field reduceTasks is set (has been asigned a value) and false otherwise
  public boolean isSetReduceTasks() {
    return this.__isset.reduceTasks;
  }

  public int getMaxMapTasks() {
    return this.maxMapTasks;
  }

  public void setMaxMapTasks(int maxMapTasks) {
    this.maxMapTasks = maxMapTasks;
    this.__isset.maxMapTasks = true;
  }

  public void unsetMaxMapTasks() {
    this.__isset.maxMapTasks = false;
  }

  // Returns true if field maxMapTasks is set (has been asigned a value) and false otherwise
  public boolean isSetMaxMapTasks() {
    return this.__isset.maxMapTasks;
  }

  public int getMaxReduceTasks() {
    return this.maxReduceTasks;
  }

  public void setMaxReduceTasks(int maxReduceTasks) {
    this.maxReduceTasks = maxReduceTasks;
    this.__isset.maxReduceTasks = true;
  }

  public void unsetMaxReduceTasks() {
    this.__isset.maxReduceTasks = false;
  }

  // Returns true if field maxReduceTasks is set (has been asigned a value) and false otherwise
  public boolean isSetMaxReduceTasks() {
    return this.__isset.maxReduceTasks;
  }

  public int getState() {
    return this.state;
  }

  public void setState(int state) {
    this.state = state;
    this.__isset.state = true;
  }

  public void unsetState() {
    this.__isset.state = false;
  }

  // Returns true if field state is set (has been asigned a value) and false otherwise
  public boolean isSetState() {
    return this.__isset.state;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case TASKTRACKERS:
      if (value == null) {
        unsetTaskTrackers();
      } else {
        setTaskTrackers((Integer)value);
      }
      break;

    case MAPTASKS:
      if (value == null) {
        unsetMapTasks();
      } else {
        setMapTasks((Integer)value);
      }
      break;

    case REDUCETASKS:
      if (value == null) {
        unsetReduceTasks();
      } else {
        setReduceTasks((Integer)value);
      }
      break;

    case MAXMAPTASKS:
      if (value == null) {
        unsetMaxMapTasks();
      } else {
        setMaxMapTasks((Integer)value);
      }
      break;

    case MAXREDUCETASKS:
      if (value == null) {
        unsetMaxReduceTasks();
      } else {
        setMaxReduceTasks((Integer)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((Integer)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case TASKTRACKERS:
      return new Integer(getTaskTrackers());

    case MAPTASKS:
      return new Integer(getMapTasks());

    case REDUCETASKS:
      return new Integer(getReduceTasks());

    case MAXMAPTASKS:
      return new Integer(getMaxMapTasks());

    case MAXREDUCETASKS:
      return new Integer(getMaxReduceTasks());

    case STATE:
      return getState();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case TASKTRACKERS:
      return isSetTaskTrackers();
    case MAPTASKS:
      return isSetMapTasks();
    case REDUCETASKS:
      return isSetReduceTasks();
    case MAXMAPTASKS:
      return isSetMaxMapTasks();
    case MAXREDUCETASKS:
      return isSetMaxReduceTasks();
    case STATE:
      return isSetState();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HiveClusterStatus)
      return this.equals((HiveClusterStatus)that);
    return false;
  }

  public boolean equals(HiveClusterStatus that) {
    if (that == null)
      return false;

    boolean this_present_taskTrackers = true;
    boolean that_present_taskTrackers = true;
    if (this_present_taskTrackers || that_present_taskTrackers) {
      if (!(this_present_taskTrackers && that_present_taskTrackers))
        return false;
      if (this.taskTrackers != that.taskTrackers)
        return false;
    }

    boolean this_present_mapTasks = true;
    boolean that_present_mapTasks = true;
    if (this_present_mapTasks || that_present_mapTasks) {
      if (!(this_present_mapTasks && that_present_mapTasks))
        return false;
      if (this.mapTasks != that.mapTasks)
        return false;
    }

    boolean this_present_reduceTasks = true;
    boolean that_present_reduceTasks = true;
    if (this_present_reduceTasks || that_present_reduceTasks) {
      if (!(this_present_reduceTasks && that_present_reduceTasks))
        return false;
      if (this.reduceTasks != that.reduceTasks)
        return false;
    }

    boolean this_present_maxMapTasks = true;
    boolean that_present_maxMapTasks = true;
    if (this_present_maxMapTasks || that_present_maxMapTasks) {
      if (!(this_present_maxMapTasks && that_present_maxMapTasks))
        return false;
      if (this.maxMapTasks != that.maxMapTasks)
        return false;
    }

    boolean this_present_maxReduceTasks = true;
    boolean that_present_maxReduceTasks = true;
    if (this_present_maxReduceTasks || that_present_maxReduceTasks) {
      if (!(this_present_maxReduceTasks && that_present_maxReduceTasks))
        return false;
      if (this.maxReduceTasks != that.maxReduceTasks)
        return false;
    }

    boolean this_present_state = true;
    boolean that_present_state = true;
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (this.state != that.state)
        return false;
    }

    return true;
  }

  @Override
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
        case TASKTRACKERS:
          if (field.type == TType.I32) {
            this.taskTrackers = iprot.readI32();
            this.__isset.taskTrackers = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MAPTASKS:
          if (field.type == TType.I32) {
            this.mapTasks = iprot.readI32();
            this.__isset.mapTasks = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REDUCETASKS:
          if (field.type == TType.I32) {
            this.reduceTasks = iprot.readI32();
            this.__isset.reduceTasks = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MAXMAPTASKS:
          if (field.type == TType.I32) {
            this.maxMapTasks = iprot.readI32();
            this.__isset.maxMapTasks = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MAXREDUCETASKS:
          if (field.type == TType.I32) {
            this.maxReduceTasks = iprot.readI32();
            this.__isset.maxReduceTasks = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STATE:
          if (field.type == TType.I32) {
            this.state = iprot.readI32();
            this.__isset.state = true;
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

    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TASK_TRACKERS_FIELD_DESC);
    oprot.writeI32(this.taskTrackers);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MAP_TASKS_FIELD_DESC);
    oprot.writeI32(this.mapTasks);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(REDUCE_TASKS_FIELD_DESC);
    oprot.writeI32(this.reduceTasks);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MAX_MAP_TASKS_FIELD_DESC);
    oprot.writeI32(this.maxMapTasks);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MAX_REDUCE_TASKS_FIELD_DESC);
    oprot.writeI32(this.maxReduceTasks);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(STATE_FIELD_DESC);
    oprot.writeI32(this.state);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HiveClusterStatus(");
    boolean first = true;

    sb.append("taskTrackers:");
    sb.append(this.taskTrackers);
    first = false;
    if (!first) sb.append(", ");
    sb.append("mapTasks:");
    sb.append(this.mapTasks);
    first = false;
    if (!first) sb.append(", ");
    sb.append("reduceTasks:");
    sb.append(this.reduceTasks);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxMapTasks:");
    sb.append(this.maxMapTasks);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxReduceTasks:");
    sb.append(this.maxReduceTasks);
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    String state_name = JobTrackerState.VALUES_TO_NAMES.get(this.state);
    if (state_name != null) {
      sb.append(state_name);
      sb.append(" (");
    }
    sb.append(this.state);
    if (state_name != null) {
      sb.append(")");
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetState() && !JobTrackerState.VALID_VALUES.contains(state)){
      throw new TProtocolException("The field 'state' has been assigned the invalid value " + state);
    }
  }

}

