package model.view;

import java.math.BigDecimal;

import model.entity.XxboqActivityDetailsEOImpl;
import model.entity.XxboqJobItemAnalysisEOImpl;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 17:12:58 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class JobItemAnalysisVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ActivityId {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getActivityId();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setActivityId((Number)value);
            }
        },
        BusinessUnitId {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getBusinessUnitId();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setBusinessUnitId((Number)value);
            }
        },
        CreatedBy {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        CreationDate {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        JobCode {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getJobCode();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setJobCode((String)value);
            }
        },
        JobItemAnalysisId {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getJobItemAnalysisId();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setJobItemAnalysisId((Number)value);
            }
        },
        LastUpdatedBy {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        },
        LastUpdatedDate {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        },
        Quantity {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getQuantity();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setQuantity((Number)value);
            }
        },
        UnitRate {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getUnitRate();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setUnitRate((Number)value);
            }
        },
        Uom {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getUom();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setUom((String)value);
            }
        },
        ProjectJobHeaderId {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getProjectJobHeaderId();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setProjectJobHeaderId((Number)value);
            }
        },
        ActivityId1 {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getActivityId1();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setActivityId1((BigDecimal)value);
            }
        },
        ActivityCode {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getActivityCode();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setActivityCode((String)value);
            }
        },
        Uom1 {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getUom1();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setUom1((String)value);
            }
        },
        Description {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getDescription();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        },
        TransActivityCode {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getTransActivityCode();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setTransActivityCode((String)value);
            }
        },
        TransUnitRate {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getTransUnitRate();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setTransUnitRate((BigDecimal)value);
            }
        },
        TransDescription {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getTransDescription();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setTransDescription((String)value);
            }
        },
        TransManPower {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getTransManPower();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setTransManPower((BigDecimal)value);
            }
        },
        TransSubcontractor {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getTransSubcontractor();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setTransSubcontractor((BigDecimal)value);
            }
        },
        TransMaterial {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getTransMaterial();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setTransMaterial((BigDecimal)value);
            }
        },
        TransEquipment {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getTransEquipment();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setTransEquipment((BigDecimal)value);
            }
        },
        TransGenaralExpences {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getTransGenaralExpences();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setTransGenaralExpences((BigDecimal)value);
            }
        },
        JobItemResourceVO {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getJobItemResourceVO();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        ProjectJobHeaderVO {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getProjectJobHeaderVO();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        ActivityDetailsSearchVO1 {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getActivityDetailsSearchVO1();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        UomCodeVO1 {
            public Object get(JobItemAnalysisVORowImpl obj) {
                return obj.getUomCodeVO1();
            }

            public void put(JobItemAnalysisVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(JobItemAnalysisVORowImpl object);

        public abstract void put(JobItemAnalysisVORowImpl object,
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


    public static final int ACTIVITYID = AttributesEnum.ActivityId.index();
    public static final int BUSINESSUNITID =
        AttributesEnum.BusinessUnitId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int JOBCODE = AttributesEnum.JobCode.index();
    public static final int JOBITEMANALYSISID =
        AttributesEnum.JobItemAnalysisId.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int UNITRATE = AttributesEnum.UnitRate.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int PROJECTJOBHEADERID =
        AttributesEnum.ProjectJobHeaderId.index();
    public static final int ACTIVITYID1 = AttributesEnum.ActivityId1.index();
    public static final int ACTIVITYCODE = AttributesEnum.ActivityCode.index();
    public static final int UOM1 = AttributesEnum.Uom1.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int TRANSACTIVITYCODE =
        AttributesEnum.TransActivityCode.index();
    public static final int TRANSUNITRATE =
        AttributesEnum.TransUnitRate.index();
    public static final int TRANSDESCRIPTION =
        AttributesEnum.TransDescription.index();
    public static final int TRANSMANPOWER =
        AttributesEnum.TransManPower.index();
    public static final int TRANSSUBCONTRACTOR =
        AttributesEnum.TransSubcontractor.index();
    public static final int TRANSMATERIAL =
        AttributesEnum.TransMaterial.index();
    public static final int TRANSEQUIPMENT =
        AttributesEnum.TransEquipment.index();
    public static final int TRANSGENARALEXPENCES =
        AttributesEnum.TransGenaralExpences.index();
    public static final int JOBITEMRESOURCEVO =
        AttributesEnum.JobItemResourceVO.index();
    public static final int PROJECTJOBHEADERVO =
        AttributesEnum.ProjectJobHeaderVO.index();
    public static final int ACTIVITYDETAILSSEARCHVO1 =
        AttributesEnum.ActivityDetailsSearchVO1.index();
    public static final int UOMCODEVO1 = AttributesEnum.UomCodeVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public JobItemAnalysisVORowImpl() {
    }

    /**
     * Gets XxboqJobItemAnalysisEO entity object.
     * @return the XxboqJobItemAnalysisEO
     */
    public XxboqJobItemAnalysisEOImpl getXxboqJobItemAnalysisEO() {
        return (XxboqJobItemAnalysisEOImpl)getEntity(0);
    }


    /**
     * Gets XxboqActivityDetailsEO entity object.
     * @return the XxboqActivityDetailsEO
     */
    public XxboqActivityDetailsEOImpl getXxboqActivityDetailsEO() {
        return (XxboqActivityDetailsEOImpl)getEntity(1);
    }

    /**
     * Gets the attribute value for ACTIVITY_ID using the alias name ActivityId.
     * @return the ACTIVITY_ID
     */
    public Number getActivityId() {
        return (Number)getAttributeInternal(ACTIVITYID);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVITY_ID using the alias name ActivityId.
     * @param value value to set the ACTIVITY_ID
     */
    public void setActivityId(Number value) {
        setAttributeInternal(ACTIVITYID, value);
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
     * Gets the attribute value for JOB_CODE using the alias name JobCode.
     * @return the JOB_CODE
     */
    public String getJobCode() {
        return (String)getAttributeInternal(JOBCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for JOB_CODE using the alias name JobCode.
     * @param value value to set the JOB_CODE
     */
    public void setJobCode(String value) {
        setAttributeInternal(JOBCODE, value);
    }

    /**
     * Gets the attribute value for JOB_ITEM_ANALYSIS_ID using the alias name JobItemAnalysisId.
     * @return the JOB_ITEM_ANALYSIS_ID
     */
    public Number getJobItemAnalysisId() {
        return (Number)getAttributeInternal(JOBITEMANALYSISID);
    }

    /**
     * Sets <code>value</code> as attribute value for JOB_ITEM_ANALYSIS_ID using the alias name JobItemAnalysisId.
     * @param value value to set the JOB_ITEM_ANALYSIS_ID
     */
    public void setJobItemAnalysisId(Number value) {
        setAttributeInternal(JOBITEMANALYSISID, value);
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
     * Gets the attribute value for QUANTITY using the alias name Quantity.
     * @return the QUANTITY
     */
    public Number getQuantity() {
        return (Number)getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY using the alias name Quantity.
     * @param value value to set the QUANTITY
     */
    public void setQuantity(Number value) {
        setAttributeInternal(QUANTITY, value);
    }


    /**
     * Gets the attribute value for UNIT_RATE using the alias name UnitRate.
     * @return the UNIT_RATE
     */
    public Number getUnitRate() {
        return (Number)getAttributeInternal(UNITRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for UNIT_RATE using the alias name UnitRate.
     * @param value value to set the UNIT_RATE
     */
    public void setUnitRate(Number value) {
        setAttributeInternal(UNITRATE, value);
    }

    /**
     * Gets the attribute value for UOM using the alias name Uom.
     * @return the UOM
     */
    public String getUom() {
        return (String)getAttributeInternal(UOM);
    }

    /**
     * Sets <code>value</code> as attribute value for UOM using the alias name Uom.
     * @param value value to set the UOM
     */
    public void setUom(String value) {
        setAttributeInternal(UOM, value);
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
     * Gets the attribute value for ACTIVITY_ID using the alias name ActivityId1.
     * @return the ACTIVITY_ID
     */
    public BigDecimal getActivityId1() {
        return (BigDecimal)getAttributeInternal(ACTIVITYID1);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVITY_ID using the alias name ActivityId1.
     * @param value value to set the ACTIVITY_ID
     */
    public void setActivityId1(BigDecimal value) {
        setAttributeInternal(ACTIVITYID1, value);
    }

    /**
     * Gets the attribute value for ACTIVITY_CODE using the alias name ActivityCode.
     * @return the ACTIVITY_CODE
     */
    public String getActivityCode() {
        return (String)getAttributeInternal(ACTIVITYCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVITY_CODE using the alias name ActivityCode.
     * @param value value to set the ACTIVITY_CODE
     */
    public void setActivityCode(String value) {
        setAttributeInternal(ACTIVITYCODE, value);
    }

    /**
     * Gets the attribute value for UOM using the alias name Uom1.
     * @return the UOM
     */
    public String getUom1() {
        return (String)getAttributeInternal(UOM1);
    }

    /**
     * Sets <code>value</code> as attribute value for UOM using the alias name Uom1.
     * @param value value to set the UOM
     */
    public void setUom1(String value) {
        setAttributeInternal(UOM1, value);
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
     * Gets the attribute value for the calculated attribute TransActivityCode.
     * @return the TransActivityCode
     */
    public String getTransActivityCode() {
        return (String)getAttributeInternal(TRANSACTIVITYCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransActivityCode.
     * @param value value to set the  TransActivityCode
     */
    public void setTransActivityCode(String value) {
        setAttributeInternal(TRANSACTIVITYCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransUnitRate.
     * @return the TransUnitRate
     */
    public BigDecimal getTransUnitRate() {
        BigDecimal unitRate =
            new BigDecimal((getTransManPower() != null ? getTransManPower().doubleValue() :
                            0) +
                           (getTransMaterial() != null ? getTransMaterial().doubleValue() :
                            0) +
                           (getTransSubcontractor() != null ? getTransSubcontractor().doubleValue() :
                            0) +
                           (getTransEquipment() != null ? getTransEquipment().doubleValue() :
                            0) +
                           (getTransGenaralExpences() != null ? getTransGenaralExpences().doubleValue() :
                            0));

        return unitRate;
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransUnitRate.
     * @param value value to set the  TransUnitRate
     */
    public void setTransUnitRate(BigDecimal value) {
        setAttributeInternal(TRANSUNITRATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDescription.
     * @return the TransDescription
     */
    public String getTransDescription() {
        return (String)getAttributeInternal(TRANSDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDescription.
     * @param value value to set the  TransDescription
     */
    public void setTransDescription(String value) {
        setAttributeInternal(TRANSDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransManPower.
     * @return the TransManPower
     */
    public BigDecimal getTransManPower() {
        return (BigDecimal)getAttributeInternal(TRANSMANPOWER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransManPower.
     * @param value value to set the  TransManPower
     */
    public void setTransManPower(BigDecimal value) {
        setAttributeInternal(TRANSMANPOWER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSubcontractor.
     * @return the TransSubcontractor
     */
    public BigDecimal getTransSubcontractor() {
        return (BigDecimal)getAttributeInternal(TRANSSUBCONTRACTOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSubcontractor.
     * @param value value to set the  TransSubcontractor
     */
    public void setTransSubcontractor(BigDecimal value) {
        setAttributeInternal(TRANSSUBCONTRACTOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransMaterial.
     * @return the TransMaterial
     */
    public BigDecimal getTransMaterial() {
        return (BigDecimal)getAttributeInternal(TRANSMATERIAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransMaterial.
     * @param value value to set the  TransMaterial
     */
    public void setTransMaterial(BigDecimal value) {
        setAttributeInternal(TRANSMATERIAL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEquipment.
     * @return the TransEquipment
     */
    public BigDecimal getTransEquipment() {
        return (BigDecimal)getAttributeInternal(TRANSEQUIPMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEquipment.
     * @param value value to set the  TransEquipment
     */
    public void setTransEquipment(BigDecimal value) {
        setAttributeInternal(TRANSEQUIPMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransGenaralExpences.
     * @return the TransGenaralExpences
     */
    public BigDecimal getTransGenaralExpences() {
        return (BigDecimal)getAttributeInternal(TRANSGENARALEXPENCES);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransGenaralExpences.
     * @param value value to set the  TransGenaralExpences
     */
    public void setTransGenaralExpences(BigDecimal value) {
        setAttributeInternal(TRANSGENARALEXPENCES, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link JobItemResourceVO.
     */
    public RowIterator getJobItemResourceVO() {
        return (RowIterator)getAttributeInternal(JOBITEMRESOURCEVO);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ProjectJobHeaderVO.
     */
    public Row getProjectJobHeaderVO() {
        return (Row)getAttributeInternal(PROJECTJOBHEADERVO);
    }

    /**
     * Sets the master-detail link ProjectJobHeaderVO between this object and <code>value</code>.
     */
    public void setProjectJobHeaderVO(Row value) {
        setAttributeInternal(PROJECTJOBHEADERVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ActivityDetailsSearchVO1.
     */
    public RowSet getActivityDetailsSearchVO1() {
        return (RowSet)getAttributeInternal(ACTIVITYDETAILSSEARCHVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UomCodeVO1.
     */
    public RowSet getUomCodeVO1() {
        return (RowSet)getAttributeInternal(UOMCODEVO1);
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