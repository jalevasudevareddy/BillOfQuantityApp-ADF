package model.entity;

import java.math.BigDecimal;

import java.sql.Date;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 03 14:31:27 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqWorkDoneDetailsEOImpl extends EntityImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        WdHeaderId {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getWdHeaderId();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setWdHeaderId((BigDecimal)value);
            }
        },
        BusinessUnitId {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getBusinessUnitId();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setBusinessUnitId((BigDecimal)value);
            }
        },
        ProjectId {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getProjectId();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setProjectId((BigDecimal)value);
            }
        },
        PeriodOfMeasure {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getPeriodOfMeasure();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setPeriodOfMeasure((String)value);
            }
        },
        WdDocumentDate {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getWdDocumentDate();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        WdDocumentNum {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getWdDocumentNum();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setWdDocumentNum((String)value);
            }
        },
        WdStatus {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getWdStatus();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setWdStatus((String)value);
            }
        },
        WdApprovedDate {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getWdApprovedDate();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setWdApprovedDate((Date)value);
            }
        },
        CreationDate {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        Version {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getVersion();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setVersion((BigDecimal)value);
            }
        },
        WdApprovedBy {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getWdApprovedBy();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setWdApprovedBy((String)value);
            }
        },
        MasterWdHeaderId {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getMasterWdHeaderId();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setMasterWdHeaderId((BigDecimal)value);
            }
        },
        ParentWdHeaderId {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getParentWdHeaderId();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setParentWdHeaderId((BigDecimal)value);
            }
        },
        MasterBoqHeaderId {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getMasterBoqHeaderId();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setMasterBoqHeaderId((BigDecimal)value);
            }
        },
        BoqHeaderId {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getBoqHeaderId();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setBoqHeaderId((BigDecimal)value);
            }
        },
        CurrentFlag {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getCurrentFlag();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setCurrentFlag((String)value);
            }
        },
        FileName {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getFileName();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setFileName((String)value);
            }
        },
        ContractId {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getContractId();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setContractId((Number)value);
            }
        }
        ,
        ContractType {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getContractType();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setContractType((String)value);
            }
        }
        ,
        ValuationDate {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getValuationDate();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setValuationDate((Date)value);
            }
        }
        ,
        XxboqWorkDoneLinesEO {
            public Object get(XxboqWorkDoneDetailsEOImpl obj) {
                return obj.getXxboqWorkDoneLinesEO();
            }

            public void put(XxboqWorkDoneDetailsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqWorkDoneDetailsEOImpl object);

        public abstract void put(XxboqWorkDoneDetailsEOImpl object,
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
    private static final byte USERNAME_HISTORY_TYPE =13;


    public static final int WDHEADERID = AttributesEnum.WdHeaderId.index();
    public static final int BUSINESSUNITID =
        AttributesEnum.BusinessUnitId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int PERIODOFMEASURE =
        AttributesEnum.PeriodOfMeasure.index();
    public static final int WDDOCUMENTDATE =
        AttributesEnum.WdDocumentDate.index();
    public static final int WDDOCUMENTNUM =
        AttributesEnum.WdDocumentNum.index();
    public static final int WDSTATUS = AttributesEnum.WdStatus.index();
    public static final int WDAPPROVEDDATE =
        AttributesEnum.WdApprovedDate.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int VERSION = AttributesEnum.Version.index();
    public static final int WDAPPROVEDBY = AttributesEnum.WdApprovedBy.index();
    public static final int MASTERWDHEADERID =
        AttributesEnum.MasterWdHeaderId.index();
    public static final int PARENTWDHEADERID =
        AttributesEnum.ParentWdHeaderId.index();
    public static final int MASTERBOQHEADERID =
        AttributesEnum.MasterBoqHeaderId.index();
    public static final int BOQHEADERID = AttributesEnum.BoqHeaderId.index();
    public static final int CURRENTFLAG = AttributesEnum.CurrentFlag.index();
    public static final int FILENAME = AttributesEnum.FileName.index();
    public static final int XXBOQWORKDONELINESEO =
        AttributesEnum.XxboqWorkDoneLinesEO.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int CONTRACTTYPE = AttributesEnum.ContractType.index();
    public static final int VALUATIONDATE = AttributesEnum.ValuationDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqWorkDoneDetailsEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxboqWorkDoneDetailsEO");
    }

    /**
     * Gets the attribute value for WdHeaderId, using the alias name WdHeaderId.
     * @return the WdHeaderId
     */
    public BigDecimal getWdHeaderId() {
        return (BigDecimal)getAttributeInternal(WDHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WdHeaderId.
     * @param value value to set the WdHeaderId
     */
    public void setWdHeaderId(BigDecimal value) {
        setAttributeInternal(WDHEADERID, value);
    }

    /**
     * Gets the attribute value for BusinessUnitId, using the alias name BusinessUnitId.
     * @return the BusinessUnitId
     */
    public BigDecimal getBusinessUnitId() {
        return (BigDecimal)getAttributeInternal(BUSINESSUNITID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BusinessUnitId.
     * @param value value to set the BusinessUnitId
     */
    public void setBusinessUnitId(BigDecimal value) {
        setAttributeInternal(BUSINESSUNITID, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the ProjectId
     */
    public BigDecimal getProjectId() {
        return (BigDecimal)getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for PeriodOfMeasure, using the alias name PeriodOfMeasure.
     * @return the PeriodOfMeasure
     */
    public String getPeriodOfMeasure() {
        return (String)getAttributeInternal(PERIODOFMEASURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PeriodOfMeasure.
     * @param value value to set the PeriodOfMeasure
     */
    public void setPeriodOfMeasure(String value) {
        setAttributeInternal(PERIODOFMEASURE, value);
    }

    /**
     * Gets the attribute value for WdDocumentDate, using the alias name WdDocumentDate.
     * @return the WdDocumentDate
     */
    public Date getWdDocumentDate() {
        return (Date)getAttributeInternal(WDDOCUMENTDATE);
    }


    /**
     * Gets the attribute value for WdDocumentNum, using the alias name WdDocumentNum.
     * @return the WdDocumentNum
     */
    public String getWdDocumentNum() {
        return (String)getAttributeInternal(WDDOCUMENTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for WdDocumentNum.
     * @param value value to set the WdDocumentNum
     */
    public void setWdDocumentNum(String value) {
        setAttributeInternal(WDDOCUMENTNUM, value);
    }

    /**
     * Gets the attribute value for WdStatus, using the alias name WdStatus.
     * @return the WdStatus
     */
    public String getWdStatus() {
        return (String)getAttributeInternal(WDSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for WdStatus.
     * @param value value to set the WdStatus
     */
    public void setWdStatus(String value) {
        setAttributeInternal(WDSTATUS, value);
    }

    /**
     * Gets the attribute value for WdApprovedDate, using the alias name WdApprovedDate.
     * @return the WdApprovedDate
     */
    public Date getWdApprovedDate() {
        return (Date)getAttributeInternal(WDAPPROVEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for WdApprovedDate.
     * @param value value to set the WdApprovedDate
     */
    public void setWdApprovedDate(Date value) {
        setAttributeInternal(WDAPPROVEDDATE, value);
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
     * Gets the attribute value for Version, using the alias name Version.
     * @return the Version
     */
    public BigDecimal getVersion() {
        return (BigDecimal)getAttributeInternal(VERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Version.
     * @param value value to set the Version
     */
    public void setVersion(BigDecimal value) {
        setAttributeInternal(VERSION, value);
    }

    /**
     * Gets the attribute value for WdApprovedBy, using the alias name WdApprovedBy.
     * @return the WdApprovedBy
     */
    public String getWdApprovedBy() {
        return (String)getAttributeInternal(WDAPPROVEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for WdApprovedBy.
     * @param value value to set the WdApprovedBy
     */
    public void setWdApprovedBy(String value) {
        setAttributeInternal(WDAPPROVEDBY, value);
    }

    /**
     * Gets the attribute value for MasterWdHeaderId, using the alias name MasterWdHeaderId.
     * @return the MasterWdHeaderId
     */
    public BigDecimal getMasterWdHeaderId() {
        return (BigDecimal)getAttributeInternal(MASTERWDHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterWdHeaderId.
     * @param value value to set the MasterWdHeaderId
     */
    public void setMasterWdHeaderId(BigDecimal value) {
        setAttributeInternal(MASTERWDHEADERID, value);
    }

    /**
     * Gets the attribute value for ParentWdHeaderId, using the alias name ParentWdHeaderId.
     * @return the ParentWdHeaderId
     */
    public BigDecimal getParentWdHeaderId() {
        return (BigDecimal)getAttributeInternal(PARENTWDHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParentWdHeaderId.
     * @param value value to set the ParentWdHeaderId
     */
    public void setParentWdHeaderId(BigDecimal value) {
        setAttributeInternal(PARENTWDHEADERID, value);
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
     * Gets the attribute value for ContractId, using the alias name ContractId.
     * @return the ContractId
     */
    public Number getContractId() {
        return (Number)getAttributeInternal(CONTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContractId.
     * @param value value to set the ContractId
     */
    public void setContractId(Number value) {
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
     * Gets the attribute value for ValuationDate, using the alias name ValuationDate.
     * @return the ValuationDate
     */
    public Date getValuationDate() {
        return (Date)getAttributeInternal(VALUATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ValuationDate.
     * @param value value to set the ValuationDate
     */
    public void setValuationDate(Date value) {
        setAttributeInternal(VALUATIONDATE, value);
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
    public RowIterator getXxboqWorkDoneLinesEO() {
        return (RowIterator)getAttributeInternal(XXBOQWORKDONELINESEO);
    }


    /**
     * @param wdHeaderId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal wdHeaderId) {
        return new Key(new Object[]{wdHeaderId});
    }

    protected void create(AttributeList attributeList) {
          super.create(attributeList);
        SequenceImpl seq =
            new SequenceImpl("XXBOQ_WORK_DONE_DETAILS_S", getDBTransaction());
          BigDecimal seqNum = seq.getSequenceNumber().bigDecimalValue();
          setWdHeaderId(seqNum);
//          setMasterWdHeaderId(seqNum);
      }
    
//      @Override
//          protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
//              if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
//                  // Custom History type logic goes here
//              return (String) ((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
//              }
//              return super.getHistoryContextForAttribute(attr);
//          }

    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
        if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
            // Custom History type logic goes here
            if (ADFContext.getCurrent().getSessionScope().get("userMap") !=
                null) {
            return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
            } else if ((ADFContext.getCurrent().getSessionScope()).get("userName") !=
                       null) {
                return (String) (ADFContext.getCurrent().getSessionScope()).get("userName");
            } else {
                return "anonymous";
            }          
        }
        return super.getHistoryContextForAttribute(attr);
    }
}