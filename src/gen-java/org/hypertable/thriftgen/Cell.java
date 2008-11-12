/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.hypertable.thriftgen;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;
import com.facebook.thrift.transport.*;

public class Cell implements TBase, java.io.Serializable, Cloneable {
  public String row_key;
  public static final int ROW_KEY = 1;
  public String column_family;
  public static final int COLUMN_FAMILY = 2;
  public String column_qualifier;
  public static final int COLUMN_QUALIFIER = 3;
  public byte[] value;
  public static final int VALUE = 4;
  public long timestamp;
  public static final int TIMESTAMP = 5;
  public long revision;
  public static final int REVISION = 6;
  public short flag;
  public static final int FLAG = 7;

  public final Isset __isset = new Isset();
  public static final class Isset implements java.io.Serializable {
    public boolean row_key = false;
    public boolean column_family = false;
    public boolean column_qualifier = false;
    public boolean value = false;
    public boolean timestamp = false;
    public boolean revision = false;
    public boolean flag = false;
  }

  public Cell() {
    this.flag = 255;

  }

  public Cell(
    String row_key,
    String column_family,
    String column_qualifier,
    byte[] value,
    long timestamp,
    long revision,
    short flag)
  {
    this();
    this.row_key = row_key;
    this.__isset.row_key = (row_key != null);
    this.column_family = column_family;
    this.__isset.column_family = (column_family != null);
    this.column_qualifier = column_qualifier;
    this.__isset.column_qualifier = (column_qualifier != null);
    this.value = value;
    this.__isset.value = (value != null);
    this.timestamp = timestamp;
    this.__isset.timestamp = true;
    this.revision = revision;
    this.__isset.revision = true;
    this.flag = flag;
    this.__isset.flag = true;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Cell(Cell other) {
    __isset.row_key = other.__isset.row_key;
    if (other.row_key != null) {
      this.row_key = other.row_key;
    }
    __isset.column_family = other.__isset.column_family;
    if (other.column_family != null) {
      this.column_family = other.column_family;
    }
    __isset.column_qualifier = other.__isset.column_qualifier;
    if (other.column_qualifier != null) {
      this.column_qualifier = other.column_qualifier;
    }
    __isset.value = other.__isset.value;
    if (other.value != null) {
      this.value = other.value;
    }
    __isset.timestamp = other.__isset.timestamp;
    this.timestamp = other.timestamp;
    __isset.revision = other.__isset.revision;
    this.revision = other.revision;
    __isset.flag = other.__isset.flag;
    this.flag = other.flag;
  }

  public Cell clone() {
    return new Cell(this);
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Cell)
      return this.equals((Cell)that);
    return false;
  }

  public boolean equals(Cell that) {
    if (that == null)
      return false;

    boolean this_present_row_key = true && (this.__isset.row_key) && (this.row_key != null);
    boolean that_present_row_key = true && (that.__isset.row_key) && (that.row_key != null);
    if (this_present_row_key || that_present_row_key) {
      if (!(this_present_row_key && that_present_row_key))
        return false;
      if (!this.row_key.equals(that.row_key))
        return false;
    }

    boolean this_present_column_family = true && (this.__isset.column_family) && (this.column_family != null);
    boolean that_present_column_family = true && (that.__isset.column_family) && (that.column_family != null);
    if (this_present_column_family || that_present_column_family) {
      if (!(this_present_column_family && that_present_column_family))
        return false;
      if (!this.column_family.equals(that.column_family))
        return false;
    }

    boolean this_present_column_qualifier = true && (this.__isset.column_qualifier) && (this.column_qualifier != null);
    boolean that_present_column_qualifier = true && (that.__isset.column_qualifier) && (that.column_qualifier != null);
    if (this_present_column_qualifier || that_present_column_qualifier) {
      if (!(this_present_column_qualifier && that_present_column_qualifier))
        return false;
      if (!this.column_qualifier.equals(that.column_qualifier))
        return false;
    }

    boolean this_present_value = true && (this.__isset.value) && (this.value != null);
    boolean that_present_value = true && (that.__isset.value) && (that.value != null);
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!java.util.Arrays.equals(this.value, that.value))
        return false;
    }

    boolean this_present_timestamp = true && (this.__isset.timestamp);
    boolean that_present_timestamp = true && (that.__isset.timestamp);
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_revision = true && (this.__isset.revision);
    boolean that_present_revision = true && (that.__isset.revision);
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    boolean this_present_flag = true && (this.__isset.flag);
    boolean that_present_flag = true && (that.__isset.flag);
    if (this_present_flag || that_present_flag) {
      if (!(this_present_flag && that_present_flag))
        return false;
      if (this.flag != that.flag)
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
        case ROW_KEY:
          if (field.type == TType.STRING) {
            this.row_key = iprot.readString();
            this.__isset.row_key = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COLUMN_FAMILY:
          if (field.type == TType.STRING) {
            this.column_family = iprot.readString();
            this.__isset.column_family = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COLUMN_QUALIFIER:
          if (field.type == TType.STRING) {
            this.column_qualifier = iprot.readString();
            this.__isset.column_qualifier = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VALUE:
          if (field.type == TType.STRING) {
            this.value = iprot.readBinary();
            this.__isset.value = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TIMESTAMP:
          if (field.type == TType.I64) {
            this.timestamp = iprot.readI64();
            this.__isset.timestamp = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REVISION:
          if (field.type == TType.I64) {
            this.revision = iprot.readI64();
            this.__isset.revision = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FLAG:
          if (field.type == TType.I16) {
            this.flag = iprot.readI16();
            this.__isset.flag = true;
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

    // check for required fields
  }

  public void write(TProtocol oprot) throws TException {


    TStruct struct = new TStruct("Cell");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    if (this.row_key != null) {
      field.name = "row_key";
      field.type = TType.STRING;
      field.id = ROW_KEY;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.row_key);
      oprot.writeFieldEnd();
    }
    if (this.column_family != null) {
      field.name = "column_family";
      field.type = TType.STRING;
      field.id = COLUMN_FAMILY;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.column_family);
      oprot.writeFieldEnd();
    }
    if (this.column_qualifier != null) {
      field.name = "column_qualifier";
      field.type = TType.STRING;
      field.id = COLUMN_QUALIFIER;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.column_qualifier);
      oprot.writeFieldEnd();
    }
    if (this.value != null) {
      field.name = "value";
      field.type = TType.STRING;
      field.id = VALUE;
      oprot.writeFieldBegin(field);
      oprot.writeBinary(this.value);
      oprot.writeFieldEnd();
    }
    field.name = "timestamp";
    field.type = TType.I64;
    field.id = TIMESTAMP;
    oprot.writeFieldBegin(field);
    oprot.writeI64(this.timestamp);
    oprot.writeFieldEnd();
    field.name = "revision";
    field.type = TType.I64;
    field.id = REVISION;
    oprot.writeFieldBegin(field);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    field.name = "flag";
    field.type = TType.I16;
    field.id = FLAG;
    oprot.writeFieldBegin(field);
    oprot.writeI16(this.flag);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("Cell(");
    boolean first = true;

    if (__isset.row_key) {
      if (!first) sb.append(", ");
      sb.append("row_key:");
      sb.append(this.row_key);
      first = false;
    }
    if (__isset.column_family) {
      if (!first) sb.append(", ");
      sb.append("column_family:");
      sb.append(this.column_family);
      first = false;
    }
    if (__isset.column_qualifier) {
      if (!first) sb.append(", ");
      sb.append("column_qualifier:");
      sb.append(this.column_qualifier);
      first = false;
    }
    if (__isset.value) {
      if (!first) sb.append(", ");
      sb.append("value:");
      sb.append(this.value);
      first = false;
    }
    if (__isset.timestamp) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
      first = false;
    }
    if (__isset.revision) {
      if (!first) sb.append(", ");
      sb.append("revision:");
      sb.append(this.revision);
      first = false;
    }
    if (__isset.flag) {
      if (!first) sb.append(", ");
      sb.append("flag:");
      sb.append(this.flag);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

}

