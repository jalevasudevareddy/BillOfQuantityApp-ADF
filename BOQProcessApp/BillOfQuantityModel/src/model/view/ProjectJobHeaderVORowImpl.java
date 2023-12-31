package model.view;

import model.entity.XxboqProjectJobHeaderEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 06 13:01:32 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProjectJobHeaderVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ApprovedBy {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getApprovedBy();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setApprovedBy((String)value);
            }
        },
        ApprovedDate {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getApprovedDate();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setApprovedDate((Date)value);
            }
        },
        BusinessUnitId {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getBusinessUnitId();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setBusinessUnitId((Number)value);
            }
        },
        CreatedBy {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        CreationDate {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        LastUpdatedBy {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        },
        LastUpdatedDate {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        },
        ProjectId {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getProjectId();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setProjectId((Number)value);
            }
        },
        ProjectJobHeaderId {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getProjectJobHeaderId();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setProjectJobHeaderId((Number)value);
            }
        },
        Status {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getStatus();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        },
        Version {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getVersion();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setVersion((Number)value);
            }
        },
        BuId {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getBuId();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setBuId((Number)value);
            }
        },
        BuName {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getBuName();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setBuName((String)value);
            }
        },
        ProjectId1 {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getProjectId1();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setProjectId1((Number)value);
            }
        },
        BuId1 {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getBuId1();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setBuId1((Number)value);
            }
        },
        ProjectNumber {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getProjectNumber();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setProjectNumber((String)value);
            }
        },
        ProjectName {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getProjectName();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setProjectName((String)value);
            }
        },
        StartDate {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getStartDate();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        },
        EndDate {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getEndDate();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        },
        Description {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getDescription();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        },
        JobItemAnalysisVO {
            public Object get(ProjectJobHeaderVORowImpl obj) {
                return obj.getJobItemAnalysisVO();
            }

            public void put(ProjectJobHeaderVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ProjectJobHeaderVORowImpl object);

        public abstract void put(ProjectJobHeaderVORowImpl object,
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


    public static final int APPROVEDBY = AttributesEnum.ApprovedBy.index();
    public static final int APPROVEDDATE = AttributesEnum.ApprovedDate.index();
    public static final int BUSINESSUNITID =
        AttributesEnum.BusinessUnitId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int PROJECTJOBHEADERID =
        AttributesEnum.ProjectJobHeaderId.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int VERSION = AttributesEnum.Version.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int BUNAME = AttributesEnum.BuName.index();
    public static final int PROJECTID1 = AttributesEnum.ProjectId1.index();
    public static final int BUID1 = AttributesEnum.BuId1.index();
    public static final int PROJECTNUMBER =
        AttributesEnum.ProjectNumber.index();
    public static final int PROJECTNAME = AttributesEnum.ProjectName.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int JOBITEMANALYSISVO =
        AttributesEnum.JobItemAnalysisVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProjectJobHeaderVORowImpl() {
    }

    /**
     * Gets XxboqProjectJobHeaderEO entity object.
     * @return the XxboqProjectJobHeaderEO
     */
    public XxboqProjectJobHeaderEOImpl getXxboqProjectJobHeaderEO() {
        return (XxboqProjectJobHeaderEOImpl)getEntity(0);
    }

    /**
     * Gets XxinvBusinessUnitsEO entity object.
     * @return the XxinvBusinessUnitsEO
     */
    public EntityImpl getXxinvBusinessUnitsEO() {
        return (EntityImpl)getEntity(1);
    }

    /**
     * Gets XxpjProjectsEO entity object.
     * @return the XxpjProjectsEO
     */
    public EntityImpl getXxpjProjectsEO() {
        return (EntityImpl)getEntity(2);
    }

    /**
     * Gets the attribute value for APPROVED_BY using the alias name ApprovedBy.
     * @return the APPROVED_BY
     */
    public String getApprovedBy() {
        return (String)getAttributeInternal(APPROVEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVED_BY using the alias name ApprovedBy.
     * @param value value to set the APPROVED_BY
     */
    public void setApprovedBy(String value) {
        setAttributeInternal(APPROVEDBY, value);
    }

    /**
     * Gets the attribute value for APPROVED_DATE using the alias name ApprovedDate.
     * @return the APPROVED_DATE
     */
    public Date getApprovedDate() {
        return (Date)getAttributeInternal(APPROVEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVED_DATE using the alias name ApprovedDate.
     * @param value value to set the APPROVED_DATE
     */
    public void setApprovedDate(Date value) {
        setAttributeInternal(APPROVEDDATE, value);
    }

    /**
     * Gets the attribute value for BUSINESS_UNIT_ID using the alias name BusinessUnitId.
     * @return the BUSINESS_UNIT_ID
     */
    public Number getBusinessUnitId() {
        return (Number)getAttributeInternal(BUSINESSUNITID);
    }

    /**
     * Sets <code>value</code> as attribute value for BUSINESS_UNIT_ID using the alias name BusinessUnitId.
     * @param value value to set the BUSINESS_UNIT_ID
     */
    public void setBusinessUnitId(Number value) {
        setAttributeInternal(BUSINESSUNITID, value);
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
     * Gets the attribute value for PROJECT_ID using the alias name ProjectId.
     * @return the PROJECT_ID
     */
    public Number getProjectId() {
        return (Number)getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_ID using the alias name ProjectId.
     * @param value value to set the PROJECT_ID
     */
    public void setProjectId(Number value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for PROJECT_JOB_HEADER_ID using the alias name ProjectJobHeaderId.
     * @return the PROJECT_JOB_HEADER_ID
     */
    public Number getProjectJobHeaderId() {
        return (Number)getAttributeInternal(PROJECTJOBHEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_JOB_HEADER_ID using the alias name ProjectJobHeaderId.
     * @param value value to set the PROJECT_JOB_HEADER_ID
     */
    public void setProjectJobHeaderId(Number value) {
        setAttributeInternal(PROJECTJOBHEADERID, value);
    }

    /**
     * Gets the attribute value for STATUS using the alias name Status.
     * @return the STATUS
     */
    public String getStatus() {
        return (String)getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS using the alias name Status.
     * @param value value to set the STATUS
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for VERSION using the alias name Version.
     * @return the VERSION
     */
    public Number getVersion() {
        return (Number)getAttributeInternal(VERSION);
    }

    /**
     * Sets <code>value</code> as attribute value for VERSION using the alias name Version.
     * @param value value to set the VERSION
     */
    public void setVersion(Number value) {
        setAttributeInternal(VERSION, value);
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
     * Gets the attribute value for BU_NAME using the alias name BuName.
     * @return the BU_NAME
     */
    public String getBuName() {
        return (String)getAttributeInternal(BUNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for BU_NAME using the alias name BuName.
     * @param value value to set the BU_NAME
     */
    public void setBuName(String value) {
        setAttributeInternal(BUNAME, value);
    }

    /**
     * Gets the attribute value for PROJECT_ID using the alias name ProjectId1.
     * @return the PROJECT_ID
     */
    public Number getProjectId1() {
        return (Number)getAttributeInternal(PROJECTID1);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_ID using the alias name ProjectId1.
     * @param value value to set the PROJECT_ID
     */
    public void setProjectId1(Number value) {
        setAttributeInternal(PROJECTID1, value);
    }

    /**
     * Gets the attribute value for BU_ID using the alias name BuId1.
     * @return the BU_ID
     */
    public Number getBuId1() {
        return (Number)getAttributeInternal(BUID1);
    }

    /**
     * Sets <code>value</code> as attribute value for BU_ID using the alias name BuId1.
     * @param value value to set the BU_ID
     */
    public void setBuId1(Number value) {
        setAttributeInternal(BUID1, value);
    }

    /**
     * Gets the attribute value for PROJECT_NUMBER using the alias name ProjectNumber.
     * @return the PROJECT_NUMBER
     */
    public String getProjectNumber() {
        return (String)getAttributeInternal(PROJECTNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_NUMBER using the alias name ProjectNumber.
     * @param value value to set the PROJECT_NUMBER
     */
    public void setProjectNumber(String value) {
        setAttributeInternal(PROJECTNUMBER, value);
    }

    /**
     * Gets the attribute value for PROJECT_NAME using the alias name ProjectName.
     * @return the PROJECT_NAME
     */
    public String getProjectName() {
        return (String)getAttributeInternal(PROJECTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_NAME using the alias name ProjectName.
     * @param value value to set the PROJECT_NAME
     */
    public void setProjectName(String value) {
        setAttributeInternal(PROJECTNAME, value);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate.
     * @return the START_DATE
     */
    public Date getStartDate() {
        return (Date)getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
     * @param value value to set the START_DATE
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for END_DATE using the alias name EndDate.
     * @return the END_DATE
     */
    public Date getEndDate() {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate.
     * @param value value to set the END_DATE
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link JobItemAnalysisVO.
     */
    public RowIterator getJobItemAnalysisVO() {
        return (RowIterator)getAttributeInternal(JOBITEMANALYSISVO);
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
