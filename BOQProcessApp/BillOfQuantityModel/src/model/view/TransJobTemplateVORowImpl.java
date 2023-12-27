package model.view;

import java.math.BigDecimal;

import oracle.jbo.RowSet;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 03 12:34:22 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransJobTemplateVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TransBuId {
            public Object get(TransJobTemplateVORowImpl obj) {
                return obj.getTransBuId();
            }

            public void put(TransJobTemplateVORowImpl obj, Object value) {
                obj.setTransBuId((BigDecimal)value);
            }
        },
        TransBUName {
            public Object get(TransJobTemplateVORowImpl obj) {
                return obj.getTransBUName();
            }

            public void put(TransJobTemplateVORowImpl obj, Object value) {
                obj.setTransBUName((String)value);
            }
        },
        TransTemplateNumber {
            public Object get(TransJobTemplateVORowImpl obj) {
                return obj.getTransTemplateNumber();
            }

            public void put(TransJobTemplateVORowImpl obj, Object value) {
                obj.setTransTemplateNumber((String)value);
            }
        },
        TransTemplateName {
            public Object get(TransJobTemplateVORowImpl obj) {
                return obj.getTransTemplateName();
            }

            public void put(TransJobTemplateVORowImpl obj, Object value) {
                obj.setTransTemplateName((String)value);
            }
        },
        UserBUSearchVO1 {
            public Object get(TransJobTemplateVORowImpl obj) {
                return obj.getUserBUSearchVO1();
            }

            public void put(TransJobTemplateVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(TransJobTemplateVORowImpl object);

        public abstract void put(TransJobTemplateVORowImpl object,
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


    public static final int TRANSBUID = AttributesEnum.TransBuId.index();
    public static final int TRANSBUNAME = AttributesEnum.TransBUName.index();
    public static final int TRANSTEMPLATENUMBER =
        AttributesEnum.TransTemplateNumber.index();
    public static final int TRANSTEMPLATENAME =
        AttributesEnum.TransTemplateName.index();
    public static final int USERBUSEARCHVO1 =
        AttributesEnum.UserBUSearchVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TransJobTemplateVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute TransBuId.
     * @return the TransBuId
     */
    public BigDecimal getTransBuId() {
        return (BigDecimal)getAttributeInternal(TRANSBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBuId.
     * @param value value to set the  TransBuId
     */
    public void setTransBuId(BigDecimal value) {
        setAttributeInternal(TRANSBUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBUName.
     * @return the TransBUName
     */
    public String getTransBUName() {
        return (String)getAttributeInternal(TRANSBUNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBUName.
     * @param value value to set the  TransBUName
     */
    public void setTransBUName(String value) {
        setAttributeInternal(TRANSBUNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransTemplateNumber.
     * @return the TransTemplateNumber
     */
    public String getTransTemplateNumber() {
        return (String)getAttributeInternal(TRANSTEMPLATENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransTemplateNumber.
     * @param value value to set the  TransTemplateNumber
     */
    public void setTransTemplateNumber(String value) {
        setAttributeInternal(TRANSTEMPLATENUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransTemplateName.
     * @return the TransTemplateName
     */
    public String getTransTemplateName() {
        return (String)getAttributeInternal(TRANSTEMPLATENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransTemplateName.
     * @param value value to set the  TransTemplateName
     */
    public void setTransTemplateName(String value) {
        setAttributeInternal(TRANSTEMPLATENAME, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UserBUSearchVO1.
     */
    public RowSet getUserBUSearchVO1() {
        return (RowSet)getAttributeInternal(USERBUSEARCHVO1);
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