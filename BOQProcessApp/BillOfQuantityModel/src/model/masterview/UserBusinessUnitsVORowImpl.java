package model.masterview;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 29 16:52:43 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserBusinessUnitsVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BuAccessId {
            public Object get(UserBusinessUnitsVORowImpl obj) {
                return obj.getBuAccessId();
            }

            public void put(UserBusinessUnitsVORowImpl obj, Object value) {
                obj.setBuAccessId((Number)value);
            }
        },
        BuId {
            public Object get(UserBusinessUnitsVORowImpl obj) {
                return obj.getBuId();
            }

            public void put(UserBusinessUnitsVORowImpl obj, Object value) {
                obj.setBuId((Number)value);
            }
        },
        UserId {
            public Object get(UserBusinessUnitsVORowImpl obj) {
                return obj.getUserId();
            }

            public void put(UserBusinessUnitsVORowImpl obj, Object value) {
                obj.setUserId((Number)value);
            }
        },
        BuId1 {
            public Object get(UserBusinessUnitsVORowImpl obj) {
                return obj.getBuId1();
            }

            public void put(UserBusinessUnitsVORowImpl obj, Object value) {
                obj.setBuId1((Number)value);
            }
        },
        BuCode {
            public Object get(UserBusinessUnitsVORowImpl obj) {
                return obj.getBuCode();
            }

            public void put(UserBusinessUnitsVORowImpl obj, Object value) {
                obj.setBuCode((String)value);
            }
        },
        BuName {
            public Object get(UserBusinessUnitsVORowImpl obj) {
                return obj.getBuName();
            }

            public void put(UserBusinessUnitsVORowImpl obj, Object value) {
                obj.setBuName((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(UserBusinessUnitsVORowImpl object);

        public abstract void put(UserBusinessUnitsVORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() +
                AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int BUACCESSID = AttributesEnum.BuAccessId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int BUID1 = AttributesEnum.BuId1.index();
    public static final int BUCODE = AttributesEnum.BuCode.index();
    public static final int BUNAME = AttributesEnum.BuName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UserBusinessUnitsVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute BuAccessId.
     * @return the BuAccessId
     */
    public Number getBuAccessId() {
        return (Number)getAttributeInternal(BUACCESSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuAccessId.
     * @param value value to set the  BuAccessId
     */
    public void setBuAccessId(Number value) {
        setAttributeInternal(BUACCESSID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuId.
     * @return the BuId
     */
    public Number getBuId() {
        return (Number)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuId.
     * @param value value to set the  BuId
     */
    public void setBuId(Number value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UserId.
     * @return the UserId
     */
    public Number getUserId() {
        return (Number)getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UserId.
     * @param value value to set the  UserId
     */
    public void setUserId(Number value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuId1.
     * @return the BuId1
     */
    public Number getBuId1() {
        return (Number)getAttributeInternal(BUID1);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuId1.
     * @param value value to set the  BuId1
     */
    public void setBuId1(Number value) {
        setAttributeInternal(BUID1, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuCode.
     * @return the BuCode
     */
    public String getBuCode() {
        return (String)getAttributeInternal(BUCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuCode.
     * @param value value to set the  BuCode
     */
    public void setBuCode(String value) {
        setAttributeInternal(BUCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuName.
     * @return the BuName
     */
    public String getBuName() {
        return (String)getAttributeInternal(BUNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuName.
     * @param value value to set the  BuName
     */
    public void setBuName(String value) {
        setAttributeInternal(BUNAME, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) &&
            (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index -
                AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) &&
            (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index -
                AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}