package model.view;

import java.math.BigDecimal;

import java.sql.Date;

import model.entity.XxboqActivityPlanLinesEOImpl;

import oracle.jbo.Row;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 23 17:21:51 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ActivityLineLevelPlanVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ActivityLevelLineid {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getActivityLevelLineid();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setActivityLevelLineid((BigDecimal)value);
            }
        },
        ActivityLineLevelId {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getActivityLineLevelId();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setActivityLineLevelId((BigDecimal)value);
            }
        },
        BoqQuantity {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getBoqQuantity();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setBoqQuantity((BigDecimal)value);
            }
        },
        ColumnId {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getColumnId();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setColumnId((String)value);
            }
        },
        CreatedBy {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        CreationDate {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        LastUpdatedBy {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        },
        LastUpdatedDate {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        },
        Period {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getPeriod();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setPeriod((String)value);
            }
        },
        ActivityLevelPlanningVO {
            public Object get(ActivityLineLevelPlanVORowImpl obj) {
                return obj.getActivityLevelPlanningVO();
            }

            public void put(ActivityLineLevelPlanVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ActivityLineLevelPlanVORowImpl object);

        public abstract void put(ActivityLineLevelPlanVORowImpl object,
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

    public static final int ACTIVITYLEVELLINEID =
        AttributesEnum.ActivityLevelLineid.index();
    public static final int ACTIVITYLINELEVELID =
        AttributesEnum.ActivityLineLevelId.index();
    public static final int BOQQUANTITY = AttributesEnum.BoqQuantity.index();
    public static final int COLUMNID = AttributesEnum.ColumnId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int PERIOD = AttributesEnum.Period.index();
    public static final int ACTIVITYLEVELPLANNINGVO =
        AttributesEnum.ActivityLevelPlanningVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ActivityLineLevelPlanVORowImpl() {
    }

    /**
     * Gets XxboqActivityPlanLinesEO entity object.
     * @return the XxboqActivityPlanLinesEO
     */
    public XxboqActivityPlanLinesEOImpl getXxboqActivityPlanLinesEO() {
        return (XxboqActivityPlanLinesEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ACTIVITY_LEVEL_LINEID using the alias name ActivityLevelLineid.
     * @return the ACTIVITY_LEVEL_LINEID
     */
    public BigDecimal getActivityLevelLineid() {
        return (BigDecimal)getAttributeInternal(ACTIVITYLEVELLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVITY_LEVEL_LINEID using the alias name ActivityLevelLineid.
     * @param value value to set the ACTIVITY_LEVEL_LINEID
     */
    public void setActivityLevelLineid(BigDecimal value) {
        setAttributeInternal(ACTIVITYLEVELLINEID, value);
    }

    /**
     * Gets the attribute value for ACTIVITY_LINE_LEVEL_ID using the alias name ActivityLineLevelId.
     * @return the ACTIVITY_LINE_LEVEL_ID
     */
    public BigDecimal getActivityLineLevelId() {
        return (BigDecimal)getAttributeInternal(ACTIVITYLINELEVELID);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVITY_LINE_LEVEL_ID using the alias name ActivityLineLevelId.
     * @param value value to set the ACTIVITY_LINE_LEVEL_ID
     */
    public void setActivityLineLevelId(BigDecimal value) {
        setAttributeInternal(ACTIVITYLINELEVELID, value);
    }

    /**
     * Gets the attribute value for BOQ_QUANTITY using the alias name BoqQuantity.
     * @return the BOQ_QUANTITY
     */
    public BigDecimal getBoqQuantity() {
        return (BigDecimal)getAttributeInternal(BOQQUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for BOQ_QUANTITY using the alias name BoqQuantity.
     * @param value value to set the BOQ_QUANTITY
     */
    public void setBoqQuantity(BigDecimal value) {
        setAttributeInternal(BOQQUANTITY, value);
    }

    /**
     * Gets the attribute value for COLUMN_ID using the alias name ColumnId.
     * @return the COLUMN_ID
     */
    public String getColumnId() {
        return (String)getAttributeInternal(COLUMNID);
    }

    /**
     * Sets <code>value</code> as attribute value for COLUMN_ID using the alias name ColumnId.
     * @param value value to set the COLUMN_ID
     */
    public void setColumnId(String value) {
        setAttributeInternal(COLUMNID, value);
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
     * Gets the attribute value for PERIOD using the alias name Period.
     * @return the PERIOD
     */
    public String getPeriod() {
        return (String)getAttributeInternal(PERIOD);
    }

    /**
     * Sets <code>value</code> as attribute value for PERIOD using the alias name Period.
     * @param value value to set the PERIOD
     */
    public void setPeriod(String value) {
        setAttributeInternal(PERIOD, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ActivityLevelPlanningVO.
     */
    public Row getActivityLevelPlanningVO() {
        return (Row)getAttributeInternal(ACTIVITYLEVELPLANNINGVO);
    }

    /**
     * Sets the master-detail link ActivityLevelPlanningVO between this object and <code>value</code>.
     */
    public void setActivityLevelPlanningVO(Row value) {
        setAttributeInternal(ACTIVITYLEVELPLANNINGVO, value);
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
