package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 31 16:21:50 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BOQWorkListNotificationCountVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BoqCount {
            public Object get(BOQWorkListNotificationCountVORowImpl obj) {
                return obj.getBoqCount();
            }

            public void put(BOQWorkListNotificationCountVORowImpl obj,
                            Object value) {
                obj.setBoqCount((BigDecimal)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(BOQWorkListNotificationCountVORowImpl object);

        public abstract void put(BOQWorkListNotificationCountVORowImpl object,
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

    public static final int BOQCOUNT = AttributesEnum.BoqCount.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BOQWorkListNotificationCountVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute BoqCount.
     * @return the BoqCount
     */
    public BigDecimal getBoqCount() {
        return (BigDecimal)getAttributeInternal(BOQCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BoqCount.
     * @param value value to set the  BoqCount
     */
    public void setBoqCount(BigDecimal value) {
        setAttributeInternal(BOQCOUNT, value);
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
