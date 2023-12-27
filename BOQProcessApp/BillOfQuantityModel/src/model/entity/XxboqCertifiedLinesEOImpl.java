package model.entity;

import java.math.BigDecimal;

import java.sql.Date;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 03 14:39:45 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqCertifiedLinesEOImpl extends EntityImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CertifiedHeaderId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getCertifiedHeaderId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setCertifiedHeaderId((BigDecimal)value);
            }
        },
        CertifiedLineId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getCertifiedLineId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setCertifiedLineId((BigDecimal)value);
            }
        },
        BoqLineId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getBoqLineId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setBoqLineId((BigDecimal)value);
            }
        },
        CertifiedCummulativeQty {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getCertifiedCummulativeQty();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setCertifiedCummulativeQty((BigDecimal)value);
            }
        },
        CreationDate {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        RowID {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getRowID();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        BoqHeaderId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getBoqHeaderId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setBoqHeaderId((BigDecimal)value);
            }
        },
        InvoiceCummulativeQty {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getInvoiceCummulativeQty();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setInvoiceCummulativeQty((BigDecimal)value);
            }
        },
        WdCummulativeQty {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getWdCummulativeQty();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setWdCummulativeQty((BigDecimal)value);
            }
        },
        PreviousCummulativeQty {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getPreviousCummulativeQty();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setPreviousCummulativeQty((BigDecimal)value);
            }
        },
        ActualCertifiedQty {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getActualCertifiedQty();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setActualCertifiedQty((BigDecimal)value);
            }
        },
        CurrentBoqRate {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getCurrentBoqRate();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setCurrentBoqRate((BigDecimal)value);
            }
        },
        ErrorMsg {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getErrorMsg();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setErrorMsg((String)value);
            }
        },
        PreviousBoqRate {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getPreviousBoqRate();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setPreviousBoqRate((BigDecimal)value);
            }
        },
        Remarks {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getRemarks();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        },
        ExtendedFlag {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getExtendedFlag();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setExtendedFlag((String)value);
            }
        },
        InvoiceLineId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getInvoiceLineId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setInvoiceLineId((BigDecimal)value);
            }
        },
        MasterBoqHeaderId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getMasterBoqHeaderId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setMasterBoqHeaderId((BigDecimal)value);
            }
        },
        MasterBoqLineId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getMasterBoqLineId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setMasterBoqLineId((BigDecimal)value);
            }
        },
        MasterCertLineId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getMasterCertLineId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setMasterCertLineId((BigDecimal)value);
            }
        },
        MasterInvoiceLineId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getMasterInvoiceLineId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setMasterInvoiceLineId((BigDecimal)value);
            }
        },
        MasterCertHeaderId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getMasterCertHeaderId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setMasterCertHeaderId((BigDecimal)value);
            }
        },
        ActCertQtyPer {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getActCertQtyPer();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setActCertQtyPer((BigDecimal)value);
            }
        },
        CertCummQtyPer {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getCertCummQtyPer();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setCertCummQtyPer((BigDecimal)value);
            }
        },
        BaseLineBoqLineId {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getBaseLineBoqLineId();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setBaseLineBoqLineId((BigDecimal)value);
            }
        },
        CertifiedCummulativeAmt {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getCertifiedCummulativeAmt();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setCertifiedCummulativeAmt((BigDecimal)value);
            }
        },
        XxboqCertifiedDetailsEO {
            public Object get(XxboqCertifiedLinesEOImpl obj) {
                return obj.getXxboqCertifiedDetailsEO();
            }

            public void put(XxboqCertifiedLinesEOImpl obj, Object value) {
                obj.setXxboqCertifiedDetailsEO((XxboqCertifiedDetailsEOImpl)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqCertifiedLinesEOImpl object);

        public abstract void put(XxboqCertifiedLinesEOImpl object,
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
    private static final byte USERNAME_HISTORY_TYPE = 13;


    public static final int CERTIFIEDHEADERID =
        AttributesEnum.CertifiedHeaderId.index();
    public static final int CERTIFIEDLINEID =
        AttributesEnum.CertifiedLineId.index();
    public static final int BOQLINEID = AttributesEnum.BoqLineId.index();
    public static final int CERTIFIEDCUMMULATIVEQTY =
        AttributesEnum.CertifiedCummulativeQty.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int ROWID = AttributesEnum.RowID.index();
    public static final int BOQHEADERID = AttributesEnum.BoqHeaderId.index();
    public static final int INVOICECUMMULATIVEQTY =
        AttributesEnum.InvoiceCummulativeQty.index();
    public static final int WDCUMMULATIVEQTY =
        AttributesEnum.WdCummulativeQty.index();
    public static final int PREVIOUSCUMMULATIVEQTY =
        AttributesEnum.PreviousCummulativeQty.index();
    public static final int ACTUALCERTIFIEDQTY =
        AttributesEnum.ActualCertifiedQty.index();
    public static final int CURRENTBOQRATE =
        AttributesEnum.CurrentBoqRate.index();
    public static final int ERRORMSG = AttributesEnum.ErrorMsg.index();
    public static final int PREVIOUSBOQRATE =
        AttributesEnum.PreviousBoqRate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int EXTENDEDFLAG = AttributesEnum.ExtendedFlag.index();
    public static final int INVOICELINEID =
        AttributesEnum.InvoiceLineId.index();
    public static final int MASTERBOQHEADERID =
        AttributesEnum.MasterBoqHeaderId.index();
    public static final int MASTERBOQLINEID =
        AttributesEnum.MasterBoqLineId.index();
    public static final int MASTERCERTLINEID =
        AttributesEnum.MasterCertLineId.index();
    public static final int MASTERINVOICELINEID =
        AttributesEnum.MasterInvoiceLineId.index();
    public static final int MASTERCERTHEADERID =
        AttributesEnum.MasterCertHeaderId.index();
    public static final int ACTCERTQTYPER =
        AttributesEnum.ActCertQtyPer.index();
    public static final int CERTCUMMQTYPER =
        AttributesEnum.CertCummQtyPer.index();
    public static final int BASELINEBOQLINEID =
        AttributesEnum.BaseLineBoqLineId.index();
    public static final int CERTIFIEDCUMMULATIVEAMT =
        AttributesEnum.CertifiedCummulativeAmt.index();
    public static final int XXBOQCERTIFIEDDETAILSEO =
        AttributesEnum.XxboqCertifiedDetailsEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqCertifiedLinesEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxboqCertifiedLinesEO");
    }

    /**
     * Gets the attribute value for CertifiedHeaderId, using the alias name CertifiedHeaderId.
     * @return the CertifiedHeaderId
     */
    public BigDecimal getCertifiedHeaderId() {
        return (BigDecimal)getAttributeInternal(CERTIFIEDHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertifiedHeaderId.
     * @param value value to set the CertifiedHeaderId
     */
    public void setCertifiedHeaderId(BigDecimal value) {
        setAttributeInternal(CERTIFIEDHEADERID, value);
    }

    /**
     * Gets the attribute value for CertifiedLineId, using the alias name CertifiedLineId.
     * @return the CertifiedLineId
     */
    public BigDecimal getCertifiedLineId() {
        return (BigDecimal)getAttributeInternal(CERTIFIEDLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertifiedLineId.
     * @param value value to set the CertifiedLineId
     */
    public void setCertifiedLineId(BigDecimal value) {
        setAttributeInternal(CERTIFIEDLINEID, value);
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
     * Gets the attribute value for CertifiedCummulativeQty, using the alias name CertifiedCummulativeQty.
     * @return the CertifiedCummulativeQty
     */
    public BigDecimal getCertifiedCummulativeQty() {
        return (BigDecimal)getAttributeInternal(CERTIFIEDCUMMULATIVEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertifiedCummulativeQty.
     * @param value value to set the CertifiedCummulativeQty
     */
    public void setCertifiedCummulativeQty(BigDecimal value) {
        setAttributeInternal(CERTIFIEDCUMMULATIVEQTY, value);
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
     * Gets the attribute value for RowID, using the alias name RowID.
     * @return the RowID
     */
    public String getRowID() {
        return (String)getAttributeInternal(ROWID);
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
     * Gets the attribute value for ActualCertifiedQty, using the alias name ActualCertifiedQty.
     * @return the ActualCertifiedQty
     */
    public BigDecimal getActualCertifiedQty() {
        return (BigDecimal)getAttributeInternal(ACTUALCERTIFIEDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActualCertifiedQty.
     * @param value value to set the ActualCertifiedQty
     */
    public void setActualCertifiedQty(BigDecimal value) {
        setAttributeInternal(ACTUALCERTIFIEDQTY, value);
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
     * Gets the attribute value for MasterCertLineId, using the alias name MasterCertLineId.
     * @return the MasterCertLineId
     */
    public BigDecimal getMasterCertLineId() {
        return (BigDecimal)getAttributeInternal(MASTERCERTLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterCertLineId.
     * @param value value to set the MasterCertLineId
     */
    public void setMasterCertLineId(BigDecimal value) {
        setAttributeInternal(MASTERCERTLINEID, value);
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
     * Gets the attribute value for MasterCertHeaderId, using the alias name MasterCertHeaderId.
     * @return the MasterCertHeaderId
     */
    public BigDecimal getMasterCertHeaderId() {
        return (BigDecimal)getAttributeInternal(MASTERCERTHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterCertHeaderId.
     * @param value value to set the MasterCertHeaderId
     */
    public void setMasterCertHeaderId(BigDecimal value) {
        setAttributeInternal(MASTERCERTHEADERID, value);
    }

    /**
     * Gets the attribute value for ActCertQtyPer, using the alias name ActCertQtyPer.
     * @return the ActCertQtyPer
     */
    public BigDecimal getActCertQtyPer() {
        return (BigDecimal)getAttributeInternal(ACTCERTQTYPER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActCertQtyPer.
     * @param value value to set the ActCertQtyPer
     */
    public void setActCertQtyPer(BigDecimal value) {
        setAttributeInternal(ACTCERTQTYPER, value);
    }

    /**
     * Gets the attribute value for CertCummQtyPer, using the alias name CertCummQtyPer.
     * @return the CertCummQtyPer
     */
    public BigDecimal getCertCummQtyPer() {
        return (BigDecimal)getAttributeInternal(CERTCUMMQTYPER);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertCummQtyPer.
     * @param value value to set the CertCummQtyPer
     */
    public void setCertCummQtyPer(BigDecimal value) {
        setAttributeInternal(CERTCUMMQTYPER, value);
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
     * Gets the attribute value for CertifiedCummulativeAmt, using the alias name CertifiedCummulativeAmt.
     * @return the CertifiedCummulativeAmt
     */
    public BigDecimal getCertifiedCummulativeAmt() {
        return (BigDecimal)getAttributeInternal(CERTIFIEDCUMMULATIVEAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertifiedCummulativeAmt.
     * @param value value to set the CertifiedCummulativeAmt
     */
    public void setCertifiedCummulativeAmt(BigDecimal value) {
        setAttributeInternal(CERTIFIEDCUMMULATIVEAMT, value);
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
     * @return the associated entity XxboqCertifiedDetailsEOImpl.
     */
    public XxboqCertifiedDetailsEOImpl getXxboqCertifiedDetailsEO() {
        return (XxboqCertifiedDetailsEOImpl)getAttributeInternal(XXBOQCERTIFIEDDETAILSEO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxboqCertifiedDetailsEOImpl.
     */
    public void setXxboqCertifiedDetailsEO(XxboqCertifiedDetailsEOImpl value) {
        setAttributeInternal(XXBOQCERTIFIEDDETAILSEO, value);
    }

    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq =
            new SequenceImpl("XXBOQ_CERTIFIED_LINES_S", getDBTransaction());
        BigDecimal lineNum = seq.getSequenceNumber().bigDecimalValue();
        setCertifiedLineId(lineNum);
        setMasterCertLineId(lineNum);
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