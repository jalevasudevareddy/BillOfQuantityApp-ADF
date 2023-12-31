package model.entity;

import java.math.BigDecimal;

import java.sql.Date;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 23 17:13:22 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqActivityPlanLinesEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ActivityLineLevelId {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getActivityLineLevelId();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setActivityLineLevelId((BigDecimal)value);
            }
        },
        ActivityLevelLineid {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getActivityLevelLineid();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setActivityLevelLineid((BigDecimal)value);
            }
        },
        Period {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getPeriod();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setPeriod((String)value);
            }
        },
        ColumnId {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getColumnId();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setColumnId((String)value);
            }
        },
        BoqQuantity {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getBoqQuantity();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setBoqQuantity((BigDecimal)value);
            }
        },
        CreationDate {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        XxboqActivityPlanningEO {
            public Object get(XxboqActivityPlanLinesEOImpl obj) {
                return obj.getXxboqActivityPlanningEO();
            }

            public void put(XxboqActivityPlanLinesEOImpl obj, Object value) {
                obj.setXxboqActivityPlanningEO((XxboqActivityPlanningEOImpl)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqActivityPlanLinesEOImpl object);

        public abstract void put(XxboqActivityPlanLinesEOImpl object,
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


    public static final int ACTIVITYLINELEVELID =
        AttributesEnum.ActivityLineLevelId.index();
    public static final int ACTIVITYLEVELLINEID =
        AttributesEnum.ActivityLevelLineid.index();
    public static final int PERIOD = AttributesEnum.Period.index();
    public static final int COLUMNID = AttributesEnum.ColumnId.index();
    public static final int BOQQUANTITY = AttributesEnum.BoqQuantity.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int XXBOQACTIVITYPLANNINGEO =
        AttributesEnum.XxboqActivityPlanningEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqActivityPlanLinesEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("model.entity.XxboqActivityPlanLinesEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for ActivityLineLevelId, using the alias name ActivityLineLevelId.
     * @return the ActivityLineLevelId
     */
    public BigDecimal getActivityLineLevelId() {
        return (BigDecimal)getAttributeInternal(ACTIVITYLINELEVELID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActivityLineLevelId.
     * @param value value to set the ActivityLineLevelId
     */
    public void setActivityLineLevelId(BigDecimal value) {
        setAttributeInternal(ACTIVITYLINELEVELID, value);
    }

    /**
     * Gets the attribute value for ActivityLevelLineid, using the alias name ActivityLevelLineid.
     * @return the ActivityLevelLineid
     */
    public BigDecimal getActivityLevelLineid() {
        return (BigDecimal)getAttributeInternal(ACTIVITYLEVELLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActivityLevelLineid.
     * @param value value to set the ActivityLevelLineid
     */
    public void setActivityLevelLineid(BigDecimal value) {
        setAttributeInternal(ACTIVITYLEVELLINEID, value);
    }

    /**
     * Gets the attribute value for Period, using the alias name Period.
     * @return the Period
     */
    public String getPeriod() {
        return (String)getAttributeInternal(PERIOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Period.
     * @param value value to set the Period
     */
    public void setPeriod(String value) {
        setAttributeInternal(PERIOD, value);
    }

    /**
     * Gets the attribute value for ColumnId, using the alias name ColumnId.
     * @return the ColumnId
     */
    public String getColumnId() {
        return (String)getAttributeInternal(COLUMNID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ColumnId.
     * @param value value to set the ColumnId
     */
    public void setColumnId(String value) {
        setAttributeInternal(COLUMNID, value);
    }

    /**
     * Gets the attribute value for BoqQuantity, using the alias name BoqQuantity.
     * @return the BoqQuantity
     */
    public BigDecimal getBoqQuantity() {
        return (BigDecimal)getAttributeInternal(BOQQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BoqQuantity.
     * @param value value to set the BoqQuantity
     */
    public void setBoqQuantity(BigDecimal value) {
        setAttributeInternal(BOQQUANTITY, value);
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
     * @return the associated entity XxboqActivityPlanningEOImpl.
     */
    public XxboqActivityPlanningEOImpl getXxboqActivityPlanningEO() {
        return (XxboqActivityPlanningEOImpl)getAttributeInternal(XXBOQACTIVITYPLANNINGEO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxboqActivityPlanningEOImpl.
     */
    public void setXxboqActivityPlanningEO(XxboqActivityPlanningEOImpl value) {
        setAttributeInternal(XXBOQACTIVITYPLANNINGEO, value);
    }

    /**
     * @param activityLineLevelId key constituent
     * @param activityLevelLineid key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal activityLineLevelId,
                                       BigDecimal activityLevelLineid) {
        return new Key(new Object[] { activityLineLevelId,
                                      activityLevelLineid });
    }
    private static final byte USERNAME_HISTORY_TYPE = 13;

    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
        if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
            // Custom History type logic goes here
            return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
        }
        return super.getHistoryContextForAttribute(attr);
    }
}
