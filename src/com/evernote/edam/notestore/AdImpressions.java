/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.notestore;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 * Information for tracking the display of a particular ad by a client.
 * 
 * <dl>
 *  <dt>adId</dt>
 *    <dd>
 *      The identifier for this ad, from a previous Ad.id given to the client
 *    </dd>
 * 
 *  <dt>impressionCount</dt>
 *    <dd>
 *      The number of times this ad was displayed since the last successful
 *      ad retrieval.  The client should only report times the ad was selected
 *      when the client was visible.
 *    </dd>
 * 
 *  <dt>impressionTime</dt>
 *    <dd>
 *      The number of seconds that the client displayed the advertisement since
 *      the last successful ad retrieval.  This corresponds to the seconds that
 *      the client application was visible.
 *    </dd>
 * </dl>
 */
public class AdImpressions implements TBase<AdImpressions, AdImpressions._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("AdImpressions");

  private static final TField AD_ID_FIELD_DESC = new TField("adId", TType.I32, (short)1);
  private static final TField IMPRESSION_COUNT_FIELD_DESC = new TField("impressionCount", TType.I32, (short)2);
  private static final TField IMPRESSION_TIME_FIELD_DESC = new TField("impressionTime", TType.I32, (short)3);

  private int adId;
  private int impressionCount;
  private int impressionTime;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    AD_ID((short)1, "adId"),
    IMPRESSION_COUNT((short)2, "impressionCount"),
    IMPRESSION_TIME((short)3, "impressionTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // AD_ID
          return AD_ID;
        case 2: // IMPRESSION_COUNT
          return IMPRESSION_COUNT;
        case 3: // IMPRESSION_TIME
          return IMPRESSION_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ADID_ISSET_ID = 0;
  private static final int __IMPRESSIONCOUNT_ISSET_ID = 1;
  private static final int __IMPRESSIONTIME_ISSET_ID = 2;
  private boolean[] __isset_vector = new boolean[3];

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AD_ID, new FieldMetaData("adId", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.IMPRESSION_COUNT, new FieldMetaData("impressionCount", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.IMPRESSION_TIME, new FieldMetaData("impressionTime", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(AdImpressions.class, metaDataMap);
  }

  public AdImpressions() {
  }

  public AdImpressions(
    int adId,
    int impressionCount,
    int impressionTime)
  {
    this();
    this.adId = adId;
    setAdIdIsSet(true);
    this.impressionCount = impressionCount;
    setImpressionCountIsSet(true);
    this.impressionTime = impressionTime;
    setImpressionTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdImpressions(AdImpressions other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.adId = other.adId;
    this.impressionCount = other.impressionCount;
    this.impressionTime = other.impressionTime;
  }

  public AdImpressions deepCopy() {
    return new AdImpressions(this);
  }

  public void clear() {
    setAdIdIsSet(false);
    this.adId = 0;
    setImpressionCountIsSet(false);
    this.impressionCount = 0;
    setImpressionTimeIsSet(false);
    this.impressionTime = 0;
  }

  public int getAdId() {
    return this.adId;
  }

  public void setAdId(int adId) {
    this.adId = adId;
    setAdIdIsSet(true);
  }

  public void unsetAdId() {
    __isset_vector[__ADID_ISSET_ID] = false;
  }

  /** Returns true if field adId is set (has been asigned a value) and false otherwise */
  public boolean isSetAdId() {
    return __isset_vector[__ADID_ISSET_ID];
  }

  public void setAdIdIsSet(boolean value) {
    __isset_vector[__ADID_ISSET_ID] = value;
  }

  public int getImpressionCount() {
    return this.impressionCount;
  }

  public void setImpressionCount(int impressionCount) {
    this.impressionCount = impressionCount;
    setImpressionCountIsSet(true);
  }

  public void unsetImpressionCount() {
    __isset_vector[__IMPRESSIONCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field impressionCount is set (has been asigned a value) and false otherwise */
  public boolean isSetImpressionCount() {
    return __isset_vector[__IMPRESSIONCOUNT_ISSET_ID];
  }

  public void setImpressionCountIsSet(boolean value) {
    __isset_vector[__IMPRESSIONCOUNT_ISSET_ID] = value;
  }

  public int getImpressionTime() {
    return this.impressionTime;
  }

  public void setImpressionTime(int impressionTime) {
    this.impressionTime = impressionTime;
    setImpressionTimeIsSet(true);
  }

  public void unsetImpressionTime() {
    __isset_vector[__IMPRESSIONTIME_ISSET_ID] = false;
  }

  /** Returns true if field impressionTime is set (has been asigned a value) and false otherwise */
  public boolean isSetImpressionTime() {
    return __isset_vector[__IMPRESSIONTIME_ISSET_ID];
  }

  public void setImpressionTimeIsSet(boolean value) {
    __isset_vector[__IMPRESSIONTIME_ISSET_ID] = value;
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AD_ID:
      if (value == null) {
        unsetAdId();
      } else {
        setAdId((Integer)value);
      }
      break;

    case IMPRESSION_COUNT:
      if (value == null) {
        unsetImpressionCount();
      } else {
        setImpressionCount((Integer)value);
      }
      break;

    case IMPRESSION_TIME:
      if (value == null) {
        unsetImpressionTime();
      } else {
        setImpressionTime((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AD_ID:
      return new Integer(getAdId());

    case IMPRESSION_COUNT:
      return new Integer(getImpressionCount());

    case IMPRESSION_TIME:
      return new Integer(getImpressionTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AD_ID:
      return isSetAdId();
    case IMPRESSION_COUNT:
      return isSetImpressionCount();
    case IMPRESSION_TIME:
      return isSetImpressionTime();
    }
    throw new IllegalStateException();
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AdImpressions)
      return this.equals((AdImpressions)that);
    return false;
  }

  public boolean equals(AdImpressions that) {
    if (that == null)
      return false;

    boolean this_present_adId = true;
    boolean that_present_adId = true;
    if (this_present_adId || that_present_adId) {
      if (!(this_present_adId && that_present_adId))
        return false;
      if (this.adId != that.adId)
        return false;
    }

    boolean this_present_impressionCount = true;
    boolean that_present_impressionCount = true;
    if (this_present_impressionCount || that_present_impressionCount) {
      if (!(this_present_impressionCount && that_present_impressionCount))
        return false;
      if (this.impressionCount != that.impressionCount)
        return false;
    }

    boolean this_present_impressionTime = true;
    boolean that_present_impressionTime = true;
    if (this_present_impressionTime || that_present_impressionTime) {
      if (!(this_present_impressionTime && that_present_impressionTime))
        return false;
      if (this.impressionTime != that.impressionTime)
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(AdImpressions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AdImpressions typedOther = (AdImpressions)other;

    lastComparison = Boolean.valueOf(isSetAdId()).compareTo(typedOther.isSetAdId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdId()) {      lastComparison = TBaseHelper.compareTo(this.adId, typedOther.adId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImpressionCount()).compareTo(typedOther.isSetImpressionCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImpressionCount()) {      lastComparison = TBaseHelper.compareTo(this.impressionCount, typedOther.impressionCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImpressionTime()).compareTo(typedOther.isSetImpressionTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImpressionTime()) {      lastComparison = TBaseHelper.compareTo(this.impressionTime, typedOther.impressionTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
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
      switch (field.id) {
        case 1: // AD_ID
          if (field.type == TType.I32) {
            this.adId = iprot.readI32();
            setAdIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // IMPRESSION_COUNT
          if (field.type == TType.I32) {
            this.impressionCount = iprot.readI32();
            setImpressionCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // IMPRESSION_TIME
          if (field.type == TType.I32) {
            this.impressionTime = iprot.readI32();
            setImpressionTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(AD_ID_FIELD_DESC);
    oprot.writeI32(this.adId);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(IMPRESSION_COUNT_FIELD_DESC);
    oprot.writeI32(this.impressionCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(IMPRESSION_TIME_FIELD_DESC);
    oprot.writeI32(this.impressionTime);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("AdImpressions(");
    boolean first = true;

    sb.append("adId:");
    sb.append(this.adId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("impressionCount:");
    sb.append(this.impressionCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("impressionTime:");
    sb.append(this.impressionTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!isSetAdId()) {
      throw new TProtocolException("Required field 'adId' is unset! Struct:" + toString());
    }

    if (!isSetImpressionCount()) {
      throw new TProtocolException("Required field 'impressionCount' is unset! Struct:" + toString());
    }

    if (!isSetImpressionTime()) {
      throw new TProtocolException("Required field 'impressionTime' is unset! Struct:" + toString());
    }

  }

}

