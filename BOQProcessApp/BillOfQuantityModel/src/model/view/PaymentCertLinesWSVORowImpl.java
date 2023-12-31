package model.view;

import java.math.BigDecimal;

import java.sql.Date;

import model.entity.XxboqPcLinesEOImpl;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 10 12:38:57 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PaymentCertLinesWSVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CreatedBy {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        CreationDate {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        Cummulative {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getCummulative();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setCummulative((BigDecimal)value);
            }
        },
        EnableFlag {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getEnableFlag();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setEnableFlag((String)value);
            }
        },
        LastUpdatedBy {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        },
        LastUpdatedDate {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        },
        Particulars {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getParticulars();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setParticulars((String)value);
            }
        },
        PcHeaderId {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getPcHeaderId();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setPcHeaderId((BigDecimal)value);
            }
        },
        PcLineId {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getPcLineId();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setPcLineId((BigDecimal)value);
            }
        },
        Previous {
            public Object get(PaymentCertLinesWSVORowImpl obj) {
                return obj.getPrevious();
            }

            public void put(PaymentCertLinesWSVORowImpl obj, Object value) {
                obj.setPrevious((BigDecimal)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(PaymentCertLinesWSVORowImpl object);

        public abstract void put(PaymentCertLinesWSVORowImpl object,
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

    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CUMMULATIVE = AttributesEnum.Cummulative.index();
    public static final int ENABLEFLAG = AttributesEnum.EnableFlag.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int PARTICULARS = AttributesEnum.Particulars.index();
    public static final int PCHEADERID = AttributesEnum.PcHeaderId.index();
    public static final int PCLINEID = AttributesEnum.PcLineId.index();
    public static final int PREVIOUS = AttributesEnum.Previous.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PaymentCertLinesWSVORowImpl() {
    }

    /**
     * Gets XxboqPcLinesEO entity object.
     * @return the XxboqPcLinesEO
     */
    public XxboqPcLinesEOImpl getXxboqPcLinesEO() {
        return (XxboqPcLinesEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CUMMULATIVE using the alias name Cummulative.
     * @return the CUMMULATIVE
     */
    public BigDecimal getCummulative() {
        return (BigDecimal)getAttributeInternal(CUMMULATIVE);
    }

    /**
     * Sets <code>value</code> as attribute value for CUMMULATIVE using the alias name Cummulative.
     * @param value value to set the CUMMULATIVE
     */
    public void setCummulative(BigDecimal value) {
        setAttributeInternal(CUMMULATIVE, value);
    }

    /**
     * Gets the attribute value for ENABLE_FLAG using the alias name EnableFlag.
     * @return the ENABLE_FLAG
     */
    public String getEnableFlag() {
        return (String)getAttributeInternal(ENABLEFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for ENABLE_FLAG using the alias name EnableFlag.
     * @param value value to set the ENABLE_FLAG
     */
    public void setEnableFlag(String value) {
        setAttributeInternal(ENABLEFLAG, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for PARTICULARS using the alias name Particulars.
     * @return the PARTICULARS
     */
    public String getParticulars() {
        return (String)getAttributeInternal(PARTICULARS);
    }

    /**
     * Sets <code>value</code> as attribute value for PARTICULARS using the alias name Particulars.
     * @param value value to set the PARTICULARS
     */
    public void setParticulars(String value) {
        setAttributeInternal(PARTICULARS, value);
    }

    /**
     * Gets the attribute value for PC_HEADER_ID using the alias name PcHeaderId.
     * @return the PC_HEADER_ID
     */
    public BigDecimal getPcHeaderId() {
        return (BigDecimal)getAttributeInternal(PCHEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for PC_HEADER_ID using the alias name PcHeaderId.
     * @param value value to set the PC_HEADER_ID
     */
    public void setPcHeaderId(BigDecimal value) {
        setAttributeInternal(PCHEADERID, value);
    }

    /**
     * Gets the attribute value for PC_LINE_ID using the alias name PcLineId.
     * @return the PC_LINE_ID
     */
    public BigDecimal getPcLineId() {
        return (BigDecimal)getAttributeInternal(PCLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PC_LINE_ID using the alias name PcLineId.
     * @param value value to set the PC_LINE_ID
     */
    public void setPcLineId(BigDecimal value) {
        setAttributeInternal(PCLINEID, value);
    }

    /**
     * Gets the attribute value for PREVIOUS using the alias name Previous.
     * @return the PREVIOUS
     */
    public BigDecimal getPrevious() {
        if (getAttributeInternal(PREVIOUS) == null) {
            return new BigDecimal(0);
        }
        return (BigDecimal)getAttributeInternal(PREVIOUS);
    }

    /**
     * Sets <code>value</code> as attribute value for PREVIOUS using the alias name Previous.
     * @param value value to set the PREVIOUS
     */
    public void setPrevious(BigDecimal value) {
        setAttributeInternal(PREVIOUS, value);
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
