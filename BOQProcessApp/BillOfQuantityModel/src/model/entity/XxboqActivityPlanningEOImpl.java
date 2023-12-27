package model.entity;

import java.math.BigDecimal;

import java.sql.Date;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 23 10:18:45 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqActivityPlanningEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ActivityLevelLineid {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getActivityLevelLineid();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setActivityLevelLineid((BigDecimal)value);
            }
        },
        HeaderId {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getHeaderId();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setHeaderId((BigDecimal)value);
            }
        },
        BuId {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getBuId();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setBuId((BigDecimal)value);
            }
        },
        ProjectId {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getProjectId();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setProjectId((BigDecimal)value);
            }
        },
        ActivityStructure {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getActivityStructure();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setActivityStructure((String)value);
            }
        },
        BoqQuantity {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getBoqQuantity();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setBoqQuantity((BigDecimal)value);
            }
        },
        StructureId {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getStructureId();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setStructureId((BigDecimal)value);
            }
        },
        ActivityId {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getActivityId();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setActivityId((BigDecimal)value);
            }
        },
        CreationDate {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        XxboqPlanningScheduleHdrEO {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getXxboqPlanningScheduleHdrEO();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setXxboqPlanningScheduleHdrEO((XxboqPlanningScheduleHdrEOImpl)value);
            }
        },
        XxboqJobLevelPlanningEO {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getXxboqJobLevelPlanningEO();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        XxboqActivityPlanLinesEO {
            public Object get(XxboqActivityPlanningEOImpl obj) {
                return obj.getXxboqActivityPlanLinesEO();
            }

            public void put(XxboqActivityPlanningEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqActivityPlanningEOImpl object);

        public abstract void put(XxboqActivityPlanningEOImpl object,
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
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int ACTIVITYSTRUCTURE =
        AttributesEnum.ActivityStructure.index();
    public static final int BOQQUANTITY = AttributesEnum.BoqQuantity.index();
    public static final int STRUCTUREID = AttributesEnum.StructureId.index();
    public static final int ACTIVITYID = AttributesEnum.ActivityId.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int XXBOQPLANNINGSCHEDULEHDREO =
        AttributesEnum.XxboqPlanningScheduleHdrEO.index();
    public static final int XXBOQJOBLEVELPLANNINGEO =
        AttributesEnum.XxboqJobLevelPlanningEO.index();
    public static final int XXBOQACTIVITYPLANLINESEO =
        AttributesEnum.XxboqActivityPlanLinesEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqActivityPlanningEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("model.entity.XxboqActivityPlanningEO");
        }
        return mDefinitionObject;
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
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the HeaderId
     */
    public BigDecimal getHeaderId() {
        return (BigDecimal)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(BigDecimal value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the BuId
     */
    public BigDecimal getBuId() {
        return (BigDecimal)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(BigDecimal value) {
        setAttributeInternal(BUID, value);
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
     * Gets the attribute value for ActivityStructure, using the alias name ActivityStructure.
     * @return the ActivityStructure
     */
    public String getActivityStructure() {
        return (String)getAttributeInternal(ACTIVITYSTRUCTURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActivityStructure.
     * @param value value to set the ActivityStructure
     */
    public void setActivityStructure(String value) {
        setAttributeInternal(ACTIVITYSTRUCTURE, value);
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
     * Gets the attribute value for StructureId, using the alias name StructureId.
     * @return the StructureId
     */
    public BigDecimal getStructureId() {
        return (BigDecimal)getAttributeInternal(STRUCTUREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StructureId.
     * @param value value to set the StructureId
     */
    public void setStructureId(BigDecimal value) {
        setAttributeInternal(STRUCTUREID, value);
    }

    /**
     * Gets the attribute value for ActivityId, using the alias name ActivityId.
     * @return the ActivityId
     */
    public BigDecimal getActivityId() {
        return (BigDecimal)getAttributeInternal(ACTIVITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActivityId.
     * @param value value to set the ActivityId
     */
    public void setActivityId(BigDecimal value) {
        setAttributeInternal(ACTIVITYID, value);
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
     * @return the associated entity XxboqPlanningScheduleHdrEOImpl.
     */
    public XxboqPlanningScheduleHdrEOImpl getXxboqPlanningScheduleHdrEO() {
        return (XxboqPlanningScheduleHdrEOImpl)getAttributeInternal(XXBOQPLANNINGSCHEDULEHDREO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxboqPlanningScheduleHdrEOImpl.
     */
    public void setXxboqPlanningScheduleHdrEO(XxboqPlanningScheduleHdrEOImpl value) {
        setAttributeInternal(XXBOQPLANNINGSCHEDULEHDREO, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXxboqJobLevelPlanningEO() {
        return (RowIterator)getAttributeInternal(XXBOQJOBLEVELPLANNINGEO);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXxboqActivityPlanLinesEO() {
        return (RowIterator)getAttributeInternal(XXBOQACTIVITYPLANLINESEO);
    }


    /**
     * @param activityLevelLineid key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal activityLevelLineid) {
        return new Key(new Object[] { activityLevelLineid });
    }

    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq =
            new SequenceImpl("XXBOQ_ACTIVITY_LEVEL_PLAN_S", getDBTransaction());
        setActivityLevelLineid(new BigDecimal(seq.getSequenceNumber().toString()));
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