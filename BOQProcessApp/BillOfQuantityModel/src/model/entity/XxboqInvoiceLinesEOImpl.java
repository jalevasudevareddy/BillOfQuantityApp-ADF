package model.entity;

import java.math.BigDecimal;

import java.sql.Date;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 15 11:29:20 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqInvoiceLinesEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        InvoiceHeaderId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getInvoiceHeaderId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setInvoiceHeaderId((BigDecimal)value);
            }
        },
        InvoiceLineId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getInvoiceLineId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setInvoiceLineId((BigDecimal)value);
            }
        },
        BoqLineId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getBoqLineId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setBoqLineId((BigDecimal)value);
            }
        },
        InvoiceCummulativeQty {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getInvoiceCummulativeQty();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setInvoiceCummulativeQty((BigDecimal)value);
            }
        },
        CreationDate {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        BoqHeaderId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getBoqHeaderId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setBoqHeaderId((BigDecimal)value);
            }
        },
        WdCummulativeQty {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getWdCummulativeQty();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setWdCummulativeQty((BigDecimal)value);
            }
        },
        PreviousCummulativeQty {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getPreviousCummulativeQty();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setPreviousCummulativeQty((BigDecimal)value);
            }
        },
        ActualInvoiceQty {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getActualInvoiceQty();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setActualInvoiceQty((BigDecimal)value);
            }
        },
        CurrentBoqRate {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getCurrentBoqRate();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setCurrentBoqRate((BigDecimal)value);
            }
        },
        ErrorMsg {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getErrorMsg();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setErrorMsg((String)value);
            }
        },
        PreviousBoqRate {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getPreviousBoqRate();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setPreviousBoqRate((BigDecimal)value);
            }
        },
        Remarks {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getRemarks();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        },
        ExtendedFlag {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getExtendedFlag();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setExtendedFlag((String)value);
            }
        },
        MasterBoqHeaderId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getMasterBoqHeaderId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setMasterBoqHeaderId((BigDecimal)value);
            }
        },
        MasterBoqLineId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getMasterBoqLineId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setMasterBoqLineId((BigDecimal)value);
            }
        },
        MasterInvoiceLineId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getMasterInvoiceLineId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setMasterInvoiceLineId((BigDecimal)value);
            }
        },
        MasterWdLineId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getMasterWdLineId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setMasterWdLineId((BigDecimal)value);
            }
        },
        WdLineId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getWdLineId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setWdLineId((BigDecimal)value);
            }
        },
        ActInvQtyPer {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getActInvQtyPer();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setActInvQtyPer((BigDecimal)value);
            }
        },
        InvCummQtyPer {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getInvCummQtyPer();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setInvCummQtyPer((BigDecimal)value);
            }
        },
        PreviousCertifiedCummulativeQty {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getPreviousCertifiedCummulativeQty();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setPreviousCertifiedCummulativeQty((BigDecimal)value);
            }
        },
        BaseLineBoqLineId {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getBaseLineBoqLineId();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setBaseLineBoqLineId((BigDecimal)value);
            }
        },
        InvoicedCummulativeAmt {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getInvoicedCummulativeAmt();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setInvoicedCummulativeAmt((BigDecimal)value);
            }
        },
        XxboqInvoiceDetailsEO {
            public Object get(XxboqInvoiceLinesEOImpl obj) {
                return obj.getXxboqInvoiceDetailsEO();
            }

            public void put(XxboqInvoiceLinesEOImpl obj, Object value) {
                obj.setXxboqInvoiceDetailsEO((XxboqInvoiceDetailsEOImpl)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqInvoiceLinesEOImpl object);

        public abstract void put(XxboqInvoiceLinesEOImpl object, Object value);

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
    private static final byte USERNAME_HISTORY_TYPE = 13;


    public static final int INVOICEHEADERID =
        AttributesEnum.InvoiceHeaderId.index();
    public static final int INVOICELINEID =
        AttributesEnum.InvoiceLineId.index();
    public static final int BOQLINEID = AttributesEnum.BoqLineId.index();
    public static final int INVOICECUMMULATIVEQTY =
        AttributesEnum.InvoiceCummulativeQty.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int BOQHEADERID = AttributesEnum.BoqHeaderId.index();
    public static final int WDCUMMULATIVEQTY =
        AttributesEnum.WdCummulativeQty.index();
    public static final int PREVIOUSCUMMULATIVEQTY =
        AttributesEnum.PreviousCummulativeQty.index();
    public static final int ACTUALINVOICEQTY =
        AttributesEnum.ActualInvoiceQty.index();
    public static final int CURRENTBOQRATE =
        AttributesEnum.CurrentBoqRate.index();
    public static final int ERRORMSG = AttributesEnum.ErrorMsg.index();
    public static final int PREVIOUSBOQRATE =
        AttributesEnum.PreviousBoqRate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int EXTENDEDFLAG = AttributesEnum.ExtendedFlag.index();
    public static final int MASTERBOQHEADERID =
        AttributesEnum.MasterBoqHeaderId.index();
    public static final int MASTERBOQLINEID =
        AttributesEnum.MasterBoqLineId.index();
    public static final int MASTERINVOICELINEID =
        AttributesEnum.MasterInvoiceLineId.index();
    public static final int MASTERWDLINEID =
        AttributesEnum.MasterWdLineId.index();
    public static final int WDLINEID = AttributesEnum.WdLineId.index();
    public static final int ACTINVQTYPER = AttributesEnum.ActInvQtyPer.index();
    public static final int INVCUMMQTYPER =
        AttributesEnum.InvCummQtyPer.index();
    public static final int PREVIOUSCERTIFIEDCUMMULATIVEQTY =
        AttributesEnum.PreviousCertifiedCummulativeQty.index();
    public static final int BASELINEBOQLINEID =
        AttributesEnum.BaseLineBoqLineId.index();
    public static final int INVOICEDCUMMULATIVEAMT =
        AttributesEnum.InvoicedCummulativeAmt.index();
    public static final int XXBOQINVOICEDETAILSEO =
        AttributesEnum.XxboqInvoiceDetailsEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqInvoiceLinesEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxboqInvoiceLinesEO");
    }

    /**
     * Gets the attribute value for InvoiceHeaderId, using the alias name InvoiceHeaderId.
     * @return the InvoiceHeaderId
     */
    public BigDecimal getInvoiceHeaderId() {
        return (BigDecimal)getAttributeInternal(INVOICEHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoiceHeaderId.
     * @param value value to set the InvoiceHeaderId
     */
    public void setInvoiceHeaderId(BigDecimal value) {
        setAttributeInternal(INVOICEHEADERID, value);
    }

    /**
     * Gets the attribute value for InvoiceLineId, using the alias name InvoiceLineId.
     * @return the InvoiceLineId
     */
    public BigDecimal getInvoiceLineId() {
        return (BigDecimal)getAttributeInternal(INVOICELINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoiceLineId.
     * @param value value to set the InvoiceLineId
     */
    public void setInvoiceLineId(BigDecimal value) {
        setAttributeInternal(INVOICELINEID, value);
    }

    /**
     * Gets the attribute value for BoqLineId, using the alias name BoqLineId.
     * @return the BoqLineId
     */
    public BigDecimal getBoqLineId() {
        return (BigDecimal)getAttributeInternal(BOQLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BoqLineId.
     * @param value value to set the BoqLineId
     */
    public void setBoqLineId(BigDecimal value) {
        setAttributeInternal(BOQLINEID, value);
    }

    /**
     * Gets the attribute value for InvoiceCummulativeQty, using the alias name InvoiceCummulativeQty.
     * @return the InvoiceCummulativeQty
     */
    public BigDecimal getInvoiceCummulativeQty() {
        return (BigDecimal)getAttributeInternal(INVOICECUMMULATIVEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoiceCummulativeQty.
     * @param value value to set the InvoiceCummulativeQty
     */
    public void setInvoiceCummulativeQty(BigDecimal value) {
        setAttributeInternal(INVOICECUMMULATIVEQTY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for BoqHeaderId, using the alias name BoqHeaderId.
     * @return the BoqHeaderId
     */
    public BigDecimal getBoqHeaderId() {
        return (BigDecimal)getAttributeInternal(BOQHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BoqHeaderId.
     * @param value value to set the BoqHeaderId
     */
    public void setBoqHeaderId(BigDecimal value) {
        setAttributeInternal(BOQHEADERID, value);
    }

    /**
     * Gets the attribute value for WdCummulativeQty, using the alias name WdCummulativeQty.
     * @return the WdCummulativeQty
     */
    public BigDecimal getWdCummulativeQty() {
        return (BigDecimal)getAttributeInternal(WDCUMMULATIVEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for WdCummulativeQty.
     * @param value value to set the WdCummulativeQty
     */
    public void setWdCummulativeQty(BigDecimal value) {
        setAttributeInternal(WDCUMMULATIVEQTY, value);
    }

    /**
     * Gets the attribute value for PreviousCummulativeQty, using the alias name PreviousCummulativeQty.
     * @return the PreviousCummulativeQty
     */
    public BigDecimal getPreviousCummulativeQty() {
        return (BigDecimal)getAttributeInternal(PREVIOUSCUMMULATIVEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PreviousCummulativeQty.
     * @param value value to set the PreviousCummulativeQty
     */
    public void setPreviousCummulativeQty(BigDecimal value) {
        setAttributeInternal(PREVIOUSCUMMULATIVEQTY, value);
    }

    /**
     * Gets the attribute value for ActualInvoiceQty, using the alias name ActualInvoiceQty.
     * @return the ActualInvoiceQty
     */
    public BigDecimal getActualInvoiceQty() {
        return (BigDecimal)getAttributeInternal(ACTUALINVOICEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActualInvoiceQty.
     * @param value value to set the ActualInvoiceQty
     */
    public void setActualInvoiceQty(BigDecimal value) {
        setAttributeInternal(ACTUALINVOICEQTY, value);
    }

    /**
     * Gets the attribute value for CurrentBoqRate, using the alias name CurrentBoqRate.
     * @return the CurrentBoqRate
     */
    public BigDecimal getCurrentBoqRate() {
        return (BigDecimal)getAttributeInternal(CURRENTBOQRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrentBoqRate.
     * @param value value to set the CurrentBoqRate
     */
    public void setCurrentBoqRate(BigDecimal value) {
        setAttributeInternal(CURRENTBOQRATE, value);
    }

    /**
     * Gets the attribute value for ErrorMsg, using the alias name ErrorMsg.
     * @return the ErrorMsg
     */
    public String getErrorMsg() {
        return (String)getAttributeInternal(ERRORMSG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ErrorMsg.
     * @param value value to set the ErrorMsg
     */
    public void setErrorMsg(String value) {
        setAttributeInternal(ERRORMSG, value);
    }

    /**
     * Gets the attribute value for PreviousBoqRate, using the alias name PreviousBoqRate.
     * @return the PreviousBoqRate
     */
    public BigDecimal getPreviousBoqRate() {
        return (BigDecimal)getAttributeInternal(PREVIOUSBOQRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PreviousBoqRate.
     * @param value value to set the PreviousBoqRate
     */
    public void setPreviousBoqRate(BigDecimal value) {
        setAttributeInternal(PREVIOUSBOQRATE, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the Remarks
     */
    public String getRemarks() {
        return (String)getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for ExtendedFlag, using the alias name ExtendedFlag.
     * @return the ExtendedFlag
     */
    public String getExtendedFlag() {
        return (String)getAttributeInternal(EXTENDEDFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtendedFlag.
     * @param value value to set the ExtendedFlag
     */
    public void setExtendedFlag(String value) {
        setAttributeInternal(EXTENDEDFLAG, value);
    }

    /**
     * Gets the attribute value for MasterBoqHeaderId, using the alias name MasterBoqHeaderId.
     * @return the MasterBoqHeaderId
     */
    public BigDecimal getMasterBoqHeaderId() {
        return (BigDecimal)getAttributeInternal(MASTERBOQHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterBoqHeaderId.
     * @param value value to set the MasterBoqHeaderId
     */
    public void setMasterBoqHeaderId(BigDecimal value) {
        setAttributeInternal(MASTERBOQHEADERID, value);
    }

    /**
     * Gets the attribute value for MasterBoqLineId, using the alias name MasterBoqLineId.
     * @return the MasterBoqLineId
     */
    public BigDecimal getMasterBoqLineId() {
        return (BigDecimal)getAttributeInternal(MASTERBOQLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterBoqLineId.
     * @param value value to set the MasterBoqLineId
     */
    public void setMasterBoqLineId(BigDecimal value) {
        setAttributeInternal(MASTERBOQLINEID, value);
    }

    /**
     * Gets the attribute value for MasterInvoiceLineId, using the alias name MasterInvoiceLineId.
     * @return the MasterInvoiceLineId
     */
    public BigDecimal getMasterInvoiceLineId() {
        return (BigDecimal)getAttributeInternal(MASTERINVOICELINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterInvoiceLineId.
     * @param value value to set the MasterInvoiceLineId
     */
    public void setMasterInvoiceLineId(BigDecimal value) {
        setAttributeInternal(MASTERINVOICELINEID, value);
    }

    /**
     * Gets the attribute value for MasterWdLineId, using the alias name MasterWdLineId.
     * @return the MasterWdLineId
     */
    public BigDecimal getMasterWdLineId() {
        return (BigDecimal)getAttributeInternal(MASTERWDLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterWdLineId.
     * @param value value to set the MasterWdLineId
     */
    public void setMasterWdLineId(BigDecimal value) {
        setAttributeInternal(MASTERWDLINEID, value);
    }

    /**
     * Gets the attribute value for WdLineId, using the alias name WdLineId.
     * @return the WdLineId
     */
    public BigDecimal getWdLineId() {
        return (BigDecimal)getAttributeInternal(WDLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WdLineId.
     * @param value value to set the WdLineId
     */
    public void setWdLineId(BigDecimal value) {
        setAttributeInternal(WDLINEID, value);
    }

    /**
     * Gets the attribute value for ActInvQtyPer, using the alias name ActInvQtyPer.
     * @return the ActInvQtyPer
     */
    public BigDecimal getActInvQtyPer() {
        return (BigDecimal)getAttributeInternal(ACTINVQTYPER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActInvQtyPer.
     * @param value value to set the ActInvQtyPer
     */
    public void setActInvQtyPer(BigDecimal value) {
        setAttributeInternal(ACTINVQTYPER, value);
    }

    /**
     * Gets the attribute value for InvCummQtyPer, using the alias name InvCummQtyPer.
     * @return the InvCummQtyPer
     */
    public BigDecimal getInvCummQtyPer() {
        return (BigDecimal)getAttributeInternal(INVCUMMQTYPER);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvCummQtyPer.
     * @param value value to set the InvCummQtyPer
     */
    public void setInvCummQtyPer(BigDecimal value) {
        setAttributeInternal(INVCUMMQTYPER, value);
    }

    /**
     * Gets the attribute value for PreviousCertifiedCummulativeQty, using the alias name PreviousCertifiedCummulativeQty.
     * @return the PreviousCertifiedCummulativeQty
     */
    public BigDecimal getPreviousCertifiedCummulativeQty() {
        return (BigDecimal)getAttributeInternal(PREVIOUSCERTIFIEDCUMMULATIVEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PreviousCertifiedCummulativeQty.
     * @param value value to set the PreviousCertifiedCummulativeQty
     */
    public void setPreviousCertifiedCummulativeQty(BigDecimal value) {
        setAttributeInternal(PREVIOUSCERTIFIEDCUMMULATIVEQTY, value);
    }

    /**
     * Gets the attribute value for BaseLineBoqLineId, using the alias name BaseLineBoqLineId.
     * @return the BaseLineBoqLineId
     */
    public BigDecimal getBaseLineBoqLineId() {
        return (BigDecimal)getAttributeInternal(BASELINEBOQLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BaseLineBoqLineId.
     * @param value value to set the BaseLineBoqLineId
     */
    public void setBaseLineBoqLineId(BigDecimal value) {
        setAttributeInternal(BASELINEBOQLINEID, value);
    }

    /**
     * Gets the attribute value for InvoicedCummulativeAmt, using the alias name InvoicedCummulativeAmt.
     * @return the InvoicedCummulativeAmt
     */
    public BigDecimal getInvoicedCummulativeAmt() {
        return (BigDecimal)getAttributeInternal(INVOICEDCUMMULATIVEAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoicedCummulativeAmt.
     * @param value value to set the InvoicedCummulativeAmt
     */
    public void setInvoicedCummulativeAmt(BigDecimal value) {
        setAttributeInternal(INVOICEDCUMMULATIVEAMT, value);
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

    /**
     * @return the associated entity XxboqInvoiceDetailsEOImpl.
     */
    public XxboqInvoiceDetailsEOImpl getXxboqInvoiceDetailsEO() {
        return (XxboqInvoiceDetailsEOImpl)getAttributeInternal(XXBOQINVOICEDETAILSEO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxboqInvoiceDetailsEOImpl.
     */
    public void setXxboqInvoiceDetailsEO(XxboqInvoiceDetailsEOImpl value) {
        setAttributeInternal(XXBOQINVOICEDETAILSEO, value);
    }


    /**
     * @param invoiceLineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal invoiceLineId) {
        return new Key(new Object[] { invoiceLineId });
    }

    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq =
            new SequenceImpl("XXBOQ_INVOICE_LINES_S", getDBTransaction());
        setInvoiceLineId(seq.getSequenceNumber().bigDecimalValue());
    }

    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
        if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
            // Custom History type logic goes here
            return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
        }
        return super.getHistoryContextForAttribute(attr);
    }
}
