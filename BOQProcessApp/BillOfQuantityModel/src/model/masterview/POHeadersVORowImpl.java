package model.masterview;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 29 09:53:01 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class POHeadersVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BuId {
            public Object get(POHeadersVORowImpl obj) {
                return obj.getBuId();
            }

            public void put(POHeadersVORowImpl obj, Object value) {
                obj.setBuId((Number)value);
            }
        },
        CurrencyCode {
            public Object get(POHeadersVORowImpl obj) {
                return obj.getCurrencyCode();
            }

            public void put(POHeadersVORowImpl obj, Object value) {
                obj.setCurrencyCode((String)value);
            }
        },
        DocumentStatus {
            public Object get(POHeadersVORowImpl obj) {
                return obj.getDocumentStatus();
            }

            public void put(POHeadersVORowImpl obj, Object value) {
                obj.setDocumentStatus((String)value);
            }
        },
        PoHeaderId {
            public Object get(POHeadersVORowImpl obj) {
                return obj.getPoHeaderId();
            }

            public void put(POHeadersVORowImpl obj, Object value) {
                obj.setPoHeaderId((Number)value);
            }
        },
        PoNumber {
            public Object get(POHeadersVORowImpl obj) {
                return obj.getPoNumber();
            }

            public void put(POHeadersVORowImpl obj, Object value) {
                obj.setPoNumber((String)value);
            }
        },
        SupplierId {
            public Object get(POHeadersVORowImpl obj) {
                return obj.getSupplierId();
            }

            public void put(POHeadersVORowImpl obj, Object value) {
                obj.setSupplierId((Number)value);
            }
        },
        TypeLoopupCode {
            public Object get(POHeadersVORowImpl obj) {
                return obj.getTypeLoopupCode();
            }

            public void put(POHeadersVORowImpl obj, Object value) {
                obj.setTypeLoopupCode((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(POHeadersVORowImpl object);

        public abstract void put(POHeadersVORowImpl object, Object value);

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
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int CURRENCYCODE = AttributesEnum.CurrencyCode.index();
    public static final int DOCUMENTSTATUS =
        AttributesEnum.DocumentStatus.index();
    public static final int POHEADERID = AttributesEnum.PoHeaderId.index();
    public static final int PONUMBER = AttributesEnum.PoNumber.index();
    public static final int SUPPLIERID = AttributesEnum.SupplierId.index();
    public static final int TYPELOOPUPCODE =
        AttributesEnum.TypeLoopupCode.index();

    /**
     * This is the default constructor (do not remove).
     */
    public POHeadersVORowImpl() {
    }

    /**
     * Gets XxpoHeadersEO entity object.
     * @return the XxpoHeadersEO
     */
    public EntityImpl getXxpoHeadersEO() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for BU_ID using the alias name BuId.
     * @return the BU_ID
     */
    public Number getBuId() {
        return (Number)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as attribute value for BU_ID using the alias name BuId.
     * @param value value to set the BU_ID
     */
    public void setBuId(Number value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for CURRENCY_CODE using the alias name CurrencyCode.
     * @return the CURRENCY_CODE
     */
    public String getCurrencyCode() {
        return (String)getAttributeInternal(CURRENCYCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for CURRENCY_CODE using the alias name CurrencyCode.
     * @param value value to set the CURRENCY_CODE
     */
    public void setCurrencyCode(String value) {
        setAttributeInternal(CURRENCYCODE, value);
    }

    /**
     * Gets the attribute value for DOCUMENT_STATUS using the alias name DocumentStatus.
     * @return the DOCUMENT_STATUS
     */
    public String getDocumentStatus() {
        return (String)getAttributeInternal(DOCUMENTSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for DOCUMENT_STATUS using the alias name DocumentStatus.
     * @param value value to set the DOCUMENT_STATUS
     */
    public void setDocumentStatus(String value) {
        setAttributeInternal(DOCUMENTSTATUS, value);
    }

    /**
     * Gets the attribute value for PO_HEADER_ID using the alias name PoHeaderId.
     * @return the PO_HEADER_ID
     */
    public Number getPoHeaderId() {
        return (Number)getAttributeInternal(POHEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for PO_HEADER_ID using the alias name PoHeaderId.
     * @param value value to set the PO_HEADER_ID
     */
    public void setPoHeaderId(Number value) {
        setAttributeInternal(POHEADERID, value);
    }

    /**
     * Gets the attribute value for PO_NUMBER using the alias name PoNumber.
     * @return the PO_NUMBER
     */
    public String getPoNumber() {
        return (String)getAttributeInternal(PONUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for PO_NUMBER using the alias name PoNumber.
     * @param value value to set the PO_NUMBER
     */
    public void setPoNumber(String value) {
        setAttributeInternal(PONUMBER, value);
    }

    /**
     * Gets the attribute value for SUPPLIER_ID using the alias name SupplierId.
     * @return the SUPPLIER_ID
     */
    public Number getSupplierId() {
        return (Number)getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIER_ID using the alias name SupplierId.
     * @param value value to set the SUPPLIER_ID
     */
    public void setSupplierId(Number value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for TYPE_LOOPUP_CODE using the alias name TypeLoopupCode.
     * @return the TYPE_LOOPUP_CODE
     */
    public String getTypeLoopupCode() {
        return (String)getAttributeInternal(TYPELOOPUPCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for TYPE_LOOPUP_CODE using the alias name TypeLoopupCode.
     * @param value value to set the TYPE_LOOPUP_CODE
     */
    public void setTypeLoopupCode(String value) {
        setAttributeInternal(TYPELOOPUPCODE, value);
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