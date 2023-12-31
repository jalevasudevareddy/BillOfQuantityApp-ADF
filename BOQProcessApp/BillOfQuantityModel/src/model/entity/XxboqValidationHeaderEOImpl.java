package model.entity;

import java.math.BigDecimal;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Mar 11 16:35:57 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqValidationHeaderEOImpl extends EntityImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ValidationHeaderId {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getValidationHeaderId();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setValidationHeaderId((Number)value);
            }
        },
        BusinessUnitId {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getBusinessUnitId();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setBusinessUnitId((Number)value);
            }
        },
        ProjectId {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getProjectId();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setProjectId((Number)value);
            }
        },
        Version {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getVersion();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setVersion((Number)value);
            }
        },
        Status {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getStatus();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        },
        BudgetType {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getBudgetType();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setBudgetType((String)value);
            }
        },
        IbcNumber {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getIbcNumber();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setIbcNumber((String)value);
            }
        },
        ApprovedBy {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getApprovedBy();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setApprovedBy((String)value);
            }
        },
        ApprovedDate {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getApprovedDate();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setApprovedDate((Date)value);
            }
        },
        CreationDate {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        IbcReason {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getIbcReason();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setIbcReason((String)value);
            }
        },
        ImportDate {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getImportDate();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setImportDate((Date)value);
            }
        },
        RevisionDate {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getRevisionDate();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setRevisionDate((Date)value);
            }
        },
        IsDocumentValid {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getIsDocumentValid();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setIsDocumentValid((String)value);
            }
        },
        TotalNetFinalAmount {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getTotalNetFinalAmount();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setTotalNetFinalAmount((BigDecimal)value);
            }
        },
        TotalCandyNetFinalAmount {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getTotalCandyNetFinalAmount();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setTotalCandyNetFinalAmount((BigDecimal)value);
            }
        },
        MasterValidationHeaderId {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getMasterValidationHeaderId();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setMasterValidationHeaderId((BigDecimal)value);
            }
        },
        FileName {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getFileName();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setFileName((String)value);
            }
        },
        CurrentFlag {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getCurrentFlag();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setCurrentFlag((String)value);
            }
        },
        TotalCandySellingAmount {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getTotalCandySellingAmount();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setTotalCandySellingAmount((BigDecimal)value);
            }
        },
        ReasonForVariation {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getReasonForVariation();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setReasonForVariation((String)value);
            }
        },
        BaseLine {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getBaseLine();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setBaseLine((String)value);
            }
        },
        BaseLineValidationHdrId {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getBaseLineValidationHdrId();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setBaseLineValidationHdrId((BigDecimal)value);
            }
        },
        ParentValidationHeaderId {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getParentValidationHeaderId();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setParentValidationHeaderId((BigDecimal)value);
            }
        },
        ContractId {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getContractId();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setContractId((BigDecimal)value);
            }
        },
        ContractType {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getContractType();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setContractType((String)value);
            }
        },
        Description {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getDescription();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        },
        LedgerCurrencyConvDate {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getLedgerCurrencyConvDate();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setLedgerCurrencyConvDate((Date)value);
            }
        },
        LedgerCurrencyConvRateType {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getLedgerCurrencyConvRateType();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setLedgerCurrencyConvRateType((String)value);
            }
        },
        LedgerCurrencyConvRate {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getLedgerCurrencyConvRate();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setLedgerCurrencyConvRate((BigDecimal)value);
            }
        },
        XxboqValidationLinesEO {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getXxboqValidationLinesEO();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        XxUploadErrorsEO {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getXxUploadErrorsEO();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        BoqValidationLinesVO {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getBoqValidationLinesVO();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        BoqUploadErrorsVO {
            public Object get(XxboqValidationHeaderEOImpl obj) {
                return obj.getBoqUploadErrorsVO();
            }

            public void put(XxboqValidationHeaderEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqValidationHeaderEOImpl object);

        public abstract void put(XxboqValidationHeaderEOImpl object,
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


    public static final int VALIDATIONHEADERID =
        AttributesEnum.ValidationHeaderId.index();
    public static final int BUSINESSUNITID =
        AttributesEnum.BusinessUnitId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int VERSION = AttributesEnum.Version.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int BUDGETTYPE = AttributesEnum.BudgetType.index();
    public static final int IBCNUMBER = AttributesEnum.IbcNumber.index();
    public static final int APPROVEDBY = AttributesEnum.ApprovedBy.index();
    public static final int APPROVEDDATE = AttributesEnum.ApprovedDate.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int IBCREASON = AttributesEnum.IbcReason.index();
    public static final int IMPORTDATE = AttributesEnum.ImportDate.index();
    public static final int REVISIONDATE = AttributesEnum.RevisionDate.index();
    public static final int ISDOCUMENTVALID =
        AttributesEnum.IsDocumentValid.index();
    public static final int TOTALNETFINALAMOUNT =
        AttributesEnum.TotalNetFinalAmount.index();
    public static final int TOTALCANDYNETFINALAMOUNT =
        AttributesEnum.TotalCandyNetFinalAmount.index();
    public static final int MASTERVALIDATIONHEADERID =
        AttributesEnum.MasterValidationHeaderId.index();
    public static final int FILENAME = AttributesEnum.FileName.index();
    public static final int CURRENTFLAG = AttributesEnum.CurrentFlag.index();
    public static final int TOTALCANDYSELLINGAMOUNT =
        AttributesEnum.TotalCandySellingAmount.index();
    public static final int REASONFORVARIATION =
        AttributesEnum.ReasonForVariation.index();
    public static final int BASELINE = AttributesEnum.BaseLine.index();
    public static final int BASELINEVALIDATIONHDRID =
        AttributesEnum.BaseLineValidationHdrId.index();
    public static final int PARENTVALIDATIONHEADERID =
        AttributesEnum.ParentValidationHeaderId.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int CONTRACTTYPE = AttributesEnum.ContractType.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int LEDGERCURRENCYCONVDATE =
        AttributesEnum.LedgerCurrencyConvDate.index();
    public static final int LEDGERCURRENCYCONVRATETYPE =
        AttributesEnum.LedgerCurrencyConvRateType.index();
    public static final int LEDGERCURRENCYCONVRATE =
        AttributesEnum.LedgerCurrencyConvRate.index();
    public static final int XXBOQVALIDATIONLINESEO =
        AttributesEnum.XxboqValidationLinesEO.index();
    public static final int XXUPLOADERRORSEO =
        AttributesEnum.XxUploadErrorsEO.index();
    public static final int BOQVALIDATIONLINESVO =
        AttributesEnum.BoqValidationLinesVO.index();
    public static final int BOQUPLOADERRORSVO =
        AttributesEnum.BoqUploadErrorsVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqValidationHeaderEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxboqValidationHeaderEO");
    }

    /**
     * Gets the attribute value for ValidationHeaderId, using the alias name ValidationHeaderId.
     * @return the ValidationHeaderId
     */
    public Number getValidationHeaderId() {
        return (Number)getAttributeInternal(VALIDATIONHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ValidationHeaderId.
     * @param value value to set the ValidationHeaderId
     */
    public void setValidationHeaderId(Number value) {
        setAttributeInternal(VALIDATIONHEADERID, value);
    }

    /**
     * Gets the attribute value for BusinessUnitId, using the alias name BusinessUnitId.
     * @return the BusinessUnitId
     */
    public Number getBusinessUnitId() {
        return (Number)getAttributeInternal(BUSINESSUNITID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BusinessUnitId.
     * @param value value to set the BusinessUnitId
     */
    public void setBusinessUnitId(Number value) {
        setAttributeInternal(BUSINESSUNITID, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the ProjectId
     */
    public Number getProjectId() {
        return (Number)getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(Number value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for Version, using the alias name Version.
     * @return the Version
     */
    public Number getVersion() {
        return (Number)getAttributeInternal(VERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Version.
     * @param value value to set the Version
     */
    public void setVersion(Number value) {
        setAttributeInternal(VERSION, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the Status
     */
    public String getStatus() {
        return (String)getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for BudgetType, using the alias name BudgetType.
     * @return the BudgetType
     */
    public String getBudgetType() {
        return (String)getAttributeInternal(BUDGETTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BudgetType.
     * @param value value to set the BudgetType
     */
    public void setBudgetType(String value) {
        setAttributeInternal(BUDGETTYPE, value);
    }

    /**
     * Gets the attribute value for IbcNumber, using the alias name IbcNumber.
     * @return the IbcNumber
     */
    public String getIbcNumber() {
        return (String)getAttributeInternal(IBCNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for IbcNumber.
     * @param value value to set the IbcNumber
     */
    public void setIbcNumber(String value) {
        setAttributeInternal(IBCNUMBER, value);
    }

    /**
     * Gets the attribute value for ApprovedBy, using the alias name ApprovedBy.
     * @return the ApprovedBy
     */
    public String getApprovedBy() {
        return (String)getAttributeInternal(APPROVEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApprovedBy.
     * @param value value to set the ApprovedBy
     */
    public void setApprovedBy(String value) {
        setAttributeInternal(APPROVEDBY, value);
    }

    /**
     * Gets the attribute value for ApprovedDate, using the alias name ApprovedDate.
     * @return the ApprovedDate
     */
    public Date getApprovedDate() {
        return (Date)getAttributeInternal(APPROVEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApprovedDate.
     * @param value value to set the ApprovedDate
     */
    public void setApprovedDate(Date value) {
        setAttributeInternal(APPROVEDDATE, value);
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
     * Gets the attribute value for IbcReason, using the alias name IbcReason.
     * @return the IbcReason
     */
    public String getIbcReason() {
        return (String)getAttributeInternal(IBCREASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for IbcReason.
     * @param value value to set the IbcReason
     */
    public void setIbcReason(String value) {
        setAttributeInternal(IBCREASON, value);
    }

    /**
     * Gets the attribute value for ImportDate, using the alias name ImportDate.
     * @return the ImportDate
     */
    public Date getImportDate() {
        return (Date)getAttributeInternal(IMPORTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ImportDate.
     * @param value value to set the ImportDate
     */
    public void setImportDate(Date value) {
        setAttributeInternal(IMPORTDATE, value);
    }

    /**
     * Gets the attribute value for RevisionDate, using the alias name RevisionDate.
     * @return the RevisionDate
     */
    public Date getRevisionDate() {
        return (Date)getAttributeInternal(REVISIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RevisionDate.
     * @param value value to set the RevisionDate
     */
    public void setRevisionDate(Date value) {
        setAttributeInternal(REVISIONDATE, value);
    }

    /**
     * Gets the attribute value for IsDocumentValid, using the alias name IsDocumentValid.
     * @return the IsDocumentValid
     */
    public String getIsDocumentValid() {
        return (String)getAttributeInternal(ISDOCUMENTVALID);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsDocumentValid.
     * @param value value to set the IsDocumentValid
     */
    public void setIsDocumentValid(String value) {
        setAttributeInternal(ISDOCUMENTVALID, value);
    }

    /**
     * Gets the attribute value for TotalNetFinalAmount, using the alias name TotalNetFinalAmount.
     * @return the TotalNetFinalAmount
     */
    public BigDecimal getTotalNetFinalAmount() {
        return (BigDecimal)getAttributeInternal(TOTALNETFINALAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalNetFinalAmount.
     * @param value value to set the TotalNetFinalAmount
     */
    public void setTotalNetFinalAmount(BigDecimal value) {
        setAttributeInternal(TOTALNETFINALAMOUNT, value);
    }

    /**
     * Gets the attribute value for TotalCandyNetFinalAmount, using the alias name TotalCandyNetFinalAmount.
     * @return the TotalCandyNetFinalAmount
     */
    public BigDecimal getTotalCandyNetFinalAmount() {
        return (BigDecimal)getAttributeInternal(TOTALCANDYNETFINALAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalCandyNetFinalAmount.
     * @param value value to set the TotalCandyNetFinalAmount
     */
    public void setTotalCandyNetFinalAmount(BigDecimal value) {
        setAttributeInternal(TOTALCANDYNETFINALAMOUNT, value);
    }

    /**
     * Gets the attribute value for MasterValidationHeaderId, using the alias name MasterValidationHeaderId.
     * @return the MasterValidationHeaderId
     */
    public BigDecimal getMasterValidationHeaderId() {
        return (BigDecimal)getAttributeInternal(MASTERVALIDATIONHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterValidationHeaderId.
     * @param value value to set the MasterValidationHeaderId
     */
    public void setMasterValidationHeaderId(BigDecimal value) {
        setAttributeInternal(MASTERVALIDATIONHEADERID, value);
    }

    /**
     * Gets the attribute value for FileName, using the alias name FileName.
     * @return the FileName
     */
    public String getFileName() {
        return (String)getAttributeInternal(FILENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FileName.
     * @param value value to set the FileName
     */
    public void setFileName(String value) {
        setAttributeInternal(FILENAME, value);
    }

    /**
     * Gets the attribute value for CurrentFlag, using the alias name CurrentFlag.
     * @return the CurrentFlag
     */
    public String getCurrentFlag() {
        return (String)getAttributeInternal(CURRENTFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrentFlag.
     * @param value value to set the CurrentFlag
     */
    public void setCurrentFlag(String value) {
        setAttributeInternal(CURRENTFLAG, value);
    }


    /**
     * Gets the attribute value for TotalCandySellingAmount, using the alias name TotalCandySellingAmount.
     * @return the TotalCandySellingAmount
     */
    public BigDecimal getTotalCandySellingAmount() {
        return (BigDecimal)getAttributeInternal(TOTALCANDYSELLINGAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalCandySellingAmount.
     * @param value value to set the TotalCandySellingAmount
     */
    public void setTotalCandySellingAmount(BigDecimal value) {
        setAttributeInternal(TOTALCANDYSELLINGAMOUNT, value);
    }

    /**
     * Gets the attribute value for ReasonForVariation, using the alias name ReasonForVariation.
     * @return the ReasonForVariation
     */
    public String getReasonForVariation() {
        return (String)getAttributeInternal(REASONFORVARIATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReasonForVariation.
     * @param value value to set the ReasonForVariation
     */
    public void setReasonForVariation(String value) {
        setAttributeInternal(REASONFORVARIATION, value);
    }

    /**
     * Gets the attribute value for BaseLine, using the alias name BaseLine.
     * @return the BaseLine
     */
    public String getBaseLine() {
        return (String)getAttributeInternal(BASELINE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BaseLine.
     * @param value value to set the BaseLine
     */
    public void setBaseLine(String value) {
        setAttributeInternal(BASELINE, value);
    }

    /**
     * Gets the attribute value for BaseLineValidationHdrId, using the alias name BaseLineValidationHdrId.
     * @return the BaseLineValidationHdrId
     */
    public BigDecimal getBaseLineValidationHdrId() {
        return (BigDecimal)getAttributeInternal(BASELINEVALIDATIONHDRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BaseLineValidationHdrId.
     * @param value value to set the BaseLineValidationHdrId
     */
    public void setBaseLineValidationHdrId(BigDecimal value) {
        setAttributeInternal(BASELINEVALIDATIONHDRID, value);
    }

    /**
     * Gets the attribute value for ParentValidationHeaderId, using the alias name ParentValidationHeaderId.
     * @return the ParentValidationHeaderId
     */
    public BigDecimal getParentValidationHeaderId() {
        return (BigDecimal)getAttributeInternal(PARENTVALIDATIONHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParentValidationHeaderId.
     * @param value value to set the ParentValidationHeaderId
     */
    public void setParentValidationHeaderId(BigDecimal value) {
        setAttributeInternal(PARENTVALIDATIONHEADERID, value);
    }

    /**
     * Gets the attribute value for ContractId, using the alias name ContractId.
     * @return the ContractId
     */
    public BigDecimal getContractId() {
        return (BigDecimal)getAttributeInternal(CONTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContractId.
     * @param value value to set the ContractId
     */
    public void setContractId(BigDecimal value) {
        setAttributeInternal(CONTRACTID, value);
    }

    /**
     * Gets the attribute value for ContractType, using the alias name ContractType.
     * @return the ContractType
     */
    public String getContractType() {
        return (String)getAttributeInternal(CONTRACTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContractType.
     * @param value value to set the ContractType
     */
    public void setContractType(String value) {
        setAttributeInternal(CONTRACTTYPE, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the Description
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for LedgerCurrencyConvDate, using the alias name LedgerCurrencyConvDate.
     * @return the LedgerCurrencyConvDate
     */
    public Date getLedgerCurrencyConvDate() {
        return (Date)getAttributeInternal(LEDGERCURRENCYCONVDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LedgerCurrencyConvDate.
     * @param value value to set the LedgerCurrencyConvDate
     */
    public void setLedgerCurrencyConvDate(Date value) {
        setAttributeInternal(LEDGERCURRENCYCONVDATE, value);
    }

    /**
     * Gets the attribute value for LedgerCurrencyConvRateType, using the alias name LedgerCurrencyConvRateType.
     * @return the LedgerCurrencyConvRateType
     */
    public String getLedgerCurrencyConvRateType() {
        return (String)getAttributeInternal(LEDGERCURRENCYCONVRATETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LedgerCurrencyConvRateType.
     * @param value value to set the LedgerCurrencyConvRateType
     */
    public void setLedgerCurrencyConvRateType(String value) {
        setAttributeInternal(LEDGERCURRENCYCONVRATETYPE, value);
    }

    /**
     * Gets the attribute value for LedgerCurrencyConvRate, using the alias name LedgerCurrencyConvRate.
     * @return the LedgerCurrencyConvRate
     */
    public BigDecimal getLedgerCurrencyConvRate() {
        return (BigDecimal)getAttributeInternal(LEDGERCURRENCYCONVRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LedgerCurrencyConvRate.
     * @param value value to set the LedgerCurrencyConvRate
     */
    public void setLedgerCurrencyConvRate(BigDecimal value) {
        setAttributeInternal(LEDGERCURRENCYCONVRATE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXxboqValidationLinesEO() {
        return (RowIterator)getAttributeInternal(XXBOQVALIDATIONLINESEO);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXxUploadErrorsEO() {
        return (RowIterator)getAttributeInternal(XXUPLOADERRORSEO);
    }


    /**
     * Uses the link BoqValidationHdrToLinesVL to return rows of BoqValidationLinesVO
     */
    public RowIterator getBoqValidationLinesVO() {
        return (RowIterator)getAttributeInternal(BOQVALIDATIONLINESVO);
    }


    /**
     * Uses the link ValidationHdrToErrorsVL to return rows of BoqUploadErrorsVO
     */
    public RowIterator getBoqUploadErrorsVO() {
        return (RowIterator)getAttributeInternal(BOQUPLOADERRORSVO);
    }


    /**
     * @param validationHeaderId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number validationHeaderId) {
        return new Key(new Object[] { validationHeaderId });
    }

    protected void create(AttributeList attributeList) {
        SequenceImpl seq =
            new SequenceImpl("XXBOQ_VALIDATION_HEADER_S", getDBTransaction());

        setValidationHeaderId(seq.getSequenceNumber());

        super.create(attributeList);

    }

    //    @Override
    //    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
    //        if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
    //            // Custom History type logic goes here
    //            return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
    //        }
    //        return super.getHistoryContextForAttribute(attr);
    //    }

    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
        if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
            // Custom History type logic goes here
            if (ADFContext.getCurrent().getSessionScope().get("userMap") !=
                null) {
                return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
            } else if ((ADFContext.getCurrent().getSessionScope()).get("userName") !=
                       null) {
                return (String)(ADFContext.getCurrent().getSessionScope()).get("userName");
            } else {
                return "anonymous";
            }
        }
        return super.getHistoryContextForAttribute(attr);
    }
}
