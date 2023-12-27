package model.searchview;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 13 12:20:07 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CurrentInvoicedDocScrVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        InvoiceHeaderId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getInvoiceHeaderId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setInvoiceHeaderId((BigDecimal)value);
            }
        },
        BusinessUnitId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getBusinessUnitId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setBusinessUnitId((BigDecimal)value);
            }
        },
        ProjectId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getProjectId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setProjectId((BigDecimal)value);
            }
        },
        PeriodOfMeasure {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getPeriodOfMeasure();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setPeriodOfMeasure((String)value);
            }
        },
        InvoiceDocumentDate {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getInvoiceDocumentDate();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setInvoiceDocumentDate((Date)value);
            }
        },
        InvoiceDocumentNum {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getInvoiceDocumentNum();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setInvoiceDocumentNum((String)value);
            }
        },
        InvoiceStatus {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getInvoiceStatus();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setInvoiceStatus((String)value);
            }
        },
        InvoiceApprovedDate {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getInvoiceApprovedDate();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setInvoiceApprovedDate((Date)value);
            }
        },
        InvoiceApprovedBy {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getInvoiceApprovedBy();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setInvoiceApprovedBy((String)value);
            }
        },
        CreationDate {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        CreatedBy {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        LastUpdatedDate {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        },
        LastUpdatedBy {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        },
        WdHeaderId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getWdHeaderId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setWdHeaderId((BigDecimal)value);
            }
        },
        Version {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getVersion();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setVersion((BigDecimal)value);
            }
        },
        MasterWdHeaderId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getMasterWdHeaderId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setMasterWdHeaderId((BigDecimal)value);
            }
        },
        MasterInvoiceHeaderId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getMasterInvoiceHeaderId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setMasterInvoiceHeaderId((BigDecimal)value);
            }
        },
        ParentInvoiceHeaderId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getParentInvoiceHeaderId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setParentInvoiceHeaderId((BigDecimal)value);
            }
        },
        MasterBoqHeaderId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getMasterBoqHeaderId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setMasterBoqHeaderId((BigDecimal)value);
            }
        },
        BoqHeaderId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getBoqHeaderId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setBoqHeaderId((BigDecimal)value);
            }
        },
        CurrentFlag {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getCurrentFlag();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setCurrentFlag((String)value);
            }
        },
        FileName {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getFileName();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setFileName((String)value);
            }
        },
        MaterialAtSite {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getMaterialAtSite();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setMaterialAtSite((BigDecimal)value);
            }
        },
        AdvanceRecovered {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getAdvanceRecovered();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setAdvanceRecovered((BigDecimal)value);
            }
        },
        Retention {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getRetention();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setRetention((BigDecimal)value);
            }
        },
        OtherPayments {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getOtherPayments();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setOtherPayments((BigDecimal)value);
            }
        },
        AdvanceReceived {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getAdvanceReceived();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setAdvanceReceived((BigDecimal)value);
            }
        }
        ,
        ApplicationNum {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getApplicationNum();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setApplicationNum((String)value);
            }
        }
        ,
        DateOfApplication {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getDateOfApplication();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setDateOfApplication((Date)value);
            }
        }
        ,
        PaymentDueDate {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getPaymentDueDate();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setPaymentDueDate((Date)value);
            }
        }
        ,
        ContractId {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getContractId();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setContractId((BigDecimal)value);
            }
        }
        ,
        ValuationDate {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getValuationDate();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setValuationDate((Date)value);
            }
        }
        ,
        RetentionRelease {
            public Object get(CurrentInvoicedDocScrVORowImpl obj) {
                return obj.getRetentionRelease();
            }

            public void put(CurrentInvoicedDocScrVORowImpl obj, Object value) {
                obj.setRetentionRelease((BigDecimal)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CurrentInvoicedDocScrVORowImpl object);

        public abstract void put(CurrentInvoicedDocScrVORowImpl object,
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


    public static final int INVOICEHEADERID =
        AttributesEnum.InvoiceHeaderId.index();
    public static final int BUSINESSUNITID =
        AttributesEnum.BusinessUnitId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int PERIODOFMEASURE =
        AttributesEnum.PeriodOfMeasure.index();
    public static final int INVOICEDOCUMENTDATE =
        AttributesEnum.InvoiceDocumentDate.index();
    public static final int INVOICEDOCUMENTNUM =
        AttributesEnum.InvoiceDocumentNum.index();
    public static final int INVOICESTATUS =
        AttributesEnum.InvoiceStatus.index();
    public static final int INVOICEAPPROVEDDATE =
        AttributesEnum.InvoiceApprovedDate.index();
    public static final int INVOICEAPPROVEDBY =
        AttributesEnum.InvoiceApprovedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int WDHEADERID = AttributesEnum.WdHeaderId.index();
    public static final int VERSION = AttributesEnum.Version.index();
    public static final int MASTERWDHEADERID =
        AttributesEnum.MasterWdHeaderId.index();
    public static final int MASTERINVOICEHEADERID =
        AttributesEnum.MasterInvoiceHeaderId.index();
    public static final int PARENTINVOICEHEADERID =
        AttributesEnum.ParentInvoiceHeaderId.index();
    public static final int MASTERBOQHEADERID =
        AttributesEnum.MasterBoqHeaderId.index();
    public static final int BOQHEADERID = AttributesEnum.BoqHeaderId.index();
    public static final int CURRENTFLAG = AttributesEnum.CurrentFlag.index();
    public static final int FILENAME = AttributesEnum.FileName.index();
    public static final int MATERIALATSITE =
        AttributesEnum.MaterialAtSite.index();
    public static final int ADVANCERECOVERED =
        AttributesEnum.AdvanceRecovered.index();
    public static final int RETENTION = AttributesEnum.Retention.index();
    public static final int OTHERPAYMENTS =
        AttributesEnum.OtherPayments.index();
    public static final int ADVANCERECEIVED =
        AttributesEnum.AdvanceReceived.index();
    public static final int APPLICATIONNUM = AttributesEnum.ApplicationNum.index();
    public static final int DATEOFAPPLICATION = AttributesEnum.DateOfApplication.index();
    public static final int PAYMENTDUEDATE = AttributesEnum.PaymentDueDate.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int VALUATIONDATE = AttributesEnum.ValuationDate.index();
    public static final int RETENTIONRELEASE = AttributesEnum.RetentionRelease.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CurrentInvoicedDocScrVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute InvoiceHeaderId.
     * @return the InvoiceHeaderId
     */
    public BigDecimal getInvoiceHeaderId() {
        return (BigDecimal) getAttributeInternal(INVOICEHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InvoiceHeaderId.
     * @param value value to set the  InvoiceHeaderId
     */
    public void setInvoiceHeaderId(BigDecimal value) {
        setAttributeInternal(INVOICEHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BusinessUnitId.
     * @return the BusinessUnitId
     */
    public BigDecimal getBusinessUnitId() {
        return (BigDecimal) getAttributeInternal(BUSINESSUNITID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BusinessUnitId.
     * @param value value to set the  BusinessUnitId
     */
    public void setBusinessUnitId(BigDecimal value) {
        setAttributeInternal(BUSINESSUNITID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProjectId.
     * @return the ProjectId
     */
    public BigDecimal getProjectId() {
        return (BigDecimal) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProjectId.
     * @param value value to set the  ProjectId
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PeriodOfMeasure.
     * @return the PeriodOfMeasure
     */
    public String getPeriodOfMeasure() {
        return (String) getAttributeInternal(PERIODOFMEASURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PeriodOfMeasure.
     * @param value value to set the  PeriodOfMeasure
     */
    public void setPeriodOfMeasure(String value) {
        setAttributeInternal(PERIODOFMEASURE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InvoiceDocumentDate.
     * @return the InvoiceDocumentDate
     */
    public Date getInvoiceDocumentDate() {
        return (Date) getAttributeInternal(INVOICEDOCUMENTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InvoiceDocumentDate.
     * @param value value to set the  InvoiceDocumentDate
     */
    public void setInvoiceDocumentDate(Date value) {
        setAttributeInternal(INVOICEDOCUMENTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InvoiceDocumentNum.
     * @return the InvoiceDocumentNum
     */
    public String getInvoiceDocumentNum() {
        return (String) getAttributeInternal(INVOICEDOCUMENTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InvoiceDocumentNum.
     * @param value value to set the  InvoiceDocumentNum
     */
    public void setInvoiceDocumentNum(String value) {
        setAttributeInternal(INVOICEDOCUMENTNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InvoiceStatus.
     * @return the InvoiceStatus
     */
    public String getInvoiceStatus() {
        return (String) getAttributeInternal(INVOICESTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InvoiceStatus.
     * @param value value to set the  InvoiceStatus
     */
    public void setInvoiceStatus(String value) {
        setAttributeInternal(INVOICESTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InvoiceApprovedDate.
     * @return the InvoiceApprovedDate
     */
    public Date getInvoiceApprovedDate() {
        return (Date) getAttributeInternal(INVOICEAPPROVEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InvoiceApprovedDate.
     * @param value value to set the  InvoiceApprovedDate
     */
    public void setInvoiceApprovedDate(Date value) {
        setAttributeInternal(INVOICEAPPROVEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InvoiceApprovedBy.
     * @return the InvoiceApprovedBy
     */
    public String getInvoiceApprovedBy() {
        return (String) getAttributeInternal(INVOICEAPPROVEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InvoiceApprovedBy.
     * @param value value to set the  InvoiceApprovedBy
     */
    public void setInvoiceApprovedBy(String value) {
        setAttributeInternal(INVOICEAPPROVEDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CreationDate.
     * @param value value to set the  CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CreatedBy.
     * @param value value to set the  CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LastUpdatedDate.
     * @param value value to set the  LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LastUpdatedBy.
     * @param value value to set the  LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WdHeaderId.
     * @return the WdHeaderId
     */
    public BigDecimal getWdHeaderId() {
        return (BigDecimal) getAttributeInternal(WDHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WdHeaderId.
     * @param value value to set the  WdHeaderId
     */
    public void setWdHeaderId(BigDecimal value) {
        setAttributeInternal(WDHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Version.
     * @return the Version
     */
    public BigDecimal getVersion() {
        return (BigDecimal) getAttributeInternal(VERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Version.
     * @param value value to set the  Version
     */
    public void setVersion(BigDecimal value) {
        setAttributeInternal(VERSION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MasterWdHeaderId.
     * @return the MasterWdHeaderId
     */
    public BigDecimal getMasterWdHeaderId() {
        return (BigDecimal) getAttributeInternal(MASTERWDHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MasterWdHeaderId.
     * @param value value to set the  MasterWdHeaderId
     */
    public void setMasterWdHeaderId(BigDecimal value) {
        setAttributeInternal(MASTERWDHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MasterInvoiceHeaderId.
     * @return the MasterInvoiceHeaderId
     */
    public BigDecimal getMasterInvoiceHeaderId() {
        return (BigDecimal) getAttributeInternal(MASTERINVOICEHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MasterInvoiceHeaderId.
     * @param value value to set the  MasterInvoiceHeaderId
     */
    public void setMasterInvoiceHeaderId(BigDecimal value) {
        setAttributeInternal(MASTERINVOICEHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ParentInvoiceHeaderId.
     * @return the ParentInvoiceHeaderId
     */
    public BigDecimal getParentInvoiceHeaderId() {
        return (BigDecimal) getAttributeInternal(PARENTINVOICEHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ParentInvoiceHeaderId.
     * @param value value to set the  ParentInvoiceHeaderId
     */
    public void setParentInvoiceHeaderId(BigDecimal value) {
        setAttributeInternal(PARENTINVOICEHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MasterBoqHeaderId.
     * @return the MasterBoqHeaderId
     */
    public BigDecimal getMasterBoqHeaderId() {
        return (BigDecimal) getAttributeInternal(MASTERBOQHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MasterBoqHeaderId.
     * @param value value to set the  MasterBoqHeaderId
     */
    public void setMasterBoqHeaderId(BigDecimal value) {
        setAttributeInternal(MASTERBOQHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BoqHeaderId.
     * @return the BoqHeaderId
     */
    public BigDecimal getBoqHeaderId() {
        return (BigDecimal) getAttributeInternal(BOQHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BoqHeaderId.
     * @param value value to set the  BoqHeaderId
     */
    public void setBoqHeaderId(BigDecimal value) {
        setAttributeInternal(BOQHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentFlag.
     * @return the CurrentFlag
     */
    public String getCurrentFlag() {
        return (String) getAttributeInternal(CURRENTFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentFlag.
     * @param value value to set the  CurrentFlag
     */
    public void setCurrentFlag(String value) {
        setAttributeInternal(CURRENTFLAG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FileName.
     * @return the FileName
     */
    public String getFileName() {
        return (String) getAttributeInternal(FILENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FileName.
     * @param value value to set the  FileName
     */
    public void setFileName(String value) {
        setAttributeInternal(FILENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MaterialAtSite.
     * @return the MaterialAtSite
     */
    public BigDecimal getMaterialAtSite() {
        return (BigDecimal) getAttributeInternal(MATERIALATSITE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MaterialAtSite.
     * @param value value to set the  MaterialAtSite
     */
    public void setMaterialAtSite(BigDecimal value) {
        setAttributeInternal(MATERIALATSITE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AdvanceRecovered.
     * @return the AdvanceRecovered
     */
    public BigDecimal getAdvanceRecovered() {
        return (BigDecimal) getAttributeInternal(ADVANCERECOVERED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AdvanceRecovered.
     * @param value value to set the  AdvanceRecovered
     */
    public void setAdvanceRecovered(BigDecimal value) {
        setAttributeInternal(ADVANCERECOVERED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Retention.
     * @return the Retention
     */
    public BigDecimal getRetention() {
        return (BigDecimal) getAttributeInternal(RETENTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Retention.
     * @param value value to set the  Retention
     */
    public void setRetention(BigDecimal value) {
        setAttributeInternal(RETENTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OtherPayments.
     * @return the OtherPayments
     */
    public BigDecimal getOtherPayments() {
        return (BigDecimal) getAttributeInternal(OTHERPAYMENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OtherPayments.
     * @param value value to set the  OtherPayments
     */
    public void setOtherPayments(BigDecimal value) {
        setAttributeInternal(OTHERPAYMENTS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AdvanceReceived.
     * @return the AdvanceReceived
     */
    public BigDecimal getAdvanceReceived() {
        return (BigDecimal) getAttributeInternal(ADVANCERECEIVED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AdvanceReceived.
     * @param value value to set the  AdvanceReceived
     */
    public void setAdvanceReceived(BigDecimal value) {
        setAttributeInternal(ADVANCERECEIVED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ApplicationNum.
     * @return the ApplicationNum
     */
    public String getApplicationNum() {
        return (String) getAttributeInternal(APPLICATIONNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ApplicationNum.
     * @param value value to set the  ApplicationNum
     */
    public void setApplicationNum(String value) {
        setAttributeInternal(APPLICATIONNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DateOfApplication.
     * @return the DateOfApplication
     */
    public Date getDateOfApplication() {
        return (Date) getAttributeInternal(DATEOFAPPLICATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DateOfApplication.
     * @param value value to set the  DateOfApplication
     */
    public void setDateOfApplication(Date value) {
        setAttributeInternal(DATEOFAPPLICATION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PaymentDueDate.
     * @return the PaymentDueDate
     */
    public Date getPaymentDueDate() {
        return (Date) getAttributeInternal(PAYMENTDUEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PaymentDueDate.
     * @param value value to set the  PaymentDueDate
     */
    public void setPaymentDueDate(Date value) {
        setAttributeInternal(PAYMENTDUEDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ContractId.
     * @return the ContractId
     */
    public BigDecimal getContractId() {
        return (BigDecimal) getAttributeInternal(CONTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ContractId.
     * @param value value to set the  ContractId
     */
    public void setContractId(BigDecimal value) {
        setAttributeInternal(CONTRACTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ValuationDate.
     * @return the ValuationDate
     */
    public Date getValuationDate() {
        return (Date) getAttributeInternal(VALUATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ValuationDate.
     * @param value value to set the  ValuationDate
     */
    public void setValuationDate(Date value) {
        setAttributeInternal(VALUATIONDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RetentionRelease.
     * @return the RetentionRelease
     */
    public BigDecimal getRetentionRelease() {
        return (BigDecimal) getAttributeInternal(RETENTIONRELEASE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RetentionRelease.
     * @param value value to set the  RetentionRelease
     */
    public void setRetentionRelease(BigDecimal value) {
        setAttributeInternal(RETENTIONRELEASE, value);
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