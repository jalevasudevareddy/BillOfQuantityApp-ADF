package model.searchview;

import java.math.BigDecimal;

import model.entity.XxboqActivityDetailsEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 17:36:49 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ActivityDetailsSearchVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ActivityCode {
            public Object get(ActivityDetailsSearchVORowImpl obj) {
                return obj.getActivityCode();
            }

            public void put(ActivityDetailsSearchVORowImpl obj, Object value) {
                obj.setActivityCode((String)value);
            }
        },
        ActivityId {
            public Object get(ActivityDetailsSearchVORowImpl obj) {
                return obj.getActivityId();
            }

            public void put(ActivityDetailsSearchVORowImpl obj, Object value) {
                obj.setActivityId((BigDecimal)value);
            }
        },
        EndDate {
            public Object get(ActivityDetailsSearchVORowImpl obj) {
                return obj.getEndDate();
            }

            public void put(ActivityDetailsSearchVORowImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        },
        StartDate {
            public Object get(ActivityDetailsSearchVORowImpl obj) {
                return obj.getStartDate();
            }

            public void put(ActivityDetailsSearchVORowImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        },
        Description {
            public Object get(ActivityDetailsSearchVORowImpl obj) {
                return obj.getDescription();
            }

            public void put(ActivityDetailsSearchVORowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ActivityDetailsSearchVORowImpl object);

        public abstract void put(ActivityDetailsSearchVORowImpl object,
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

    public static final int ACTIVITYCODE = AttributesEnum.ActivityCode.index();
    public static final int ACTIVITYID = AttributesEnum.ActivityId.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ActivityDetailsSearchVORowImpl() {
    }

    /**
     * Gets XxboqActivityDetailsEO entity object.
     * @return the XxboqActivityDetailsEO
     */
    public XxboqActivityDetailsEOImpl getXxboqActivityDetailsEO() {
        return (XxboqActivityDetailsEOImpl)getEntity(0);
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
     * Gets the attribute value for ACTIVITY_ID using the alias name ActivityId.
     * @return the ACTIVITY_ID
     */
    public BigDecimal getActivityId() {
        return (BigDecimal)getAttributeInternal(ACTIVITYID);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVITY_ID using the alias name ActivityId.
     * @param value value to set the ACTIVITY_ID
     */
    public void setActivityId(BigDecimal value) {
        setAttributeInternal(ACTIVITYID, value);
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