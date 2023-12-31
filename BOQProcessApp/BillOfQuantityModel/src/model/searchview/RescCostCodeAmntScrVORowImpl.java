package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 27 10:37:21 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RescCostCodeAmntScrVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TotRescAmnt {
            public Object get(RescCostCodeAmntScrVORowImpl obj) {
                return obj.getTotRescAmnt();
            }

            public void put(RescCostCodeAmntScrVORowImpl obj, Object value) {
                obj.setTotRescAmnt((BigDecimal)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(RescCostCodeAmntScrVORowImpl object);

        public abstract void put(RescCostCodeAmntScrVORowImpl object,
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


    public static final int TOTRESCAMNT = AttributesEnum.TotRescAmnt.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RescCostCodeAmntScrVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute TotRescAmnt.
     * @return the TotRescAmnt
     */
    public BigDecimal getTotRescAmnt() {
        return (BigDecimal)getAttributeInternal(TOTRESCAMNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TotRescAmnt.
     * @param value value to set the  TotRescAmnt
     */
    public void setTotRescAmnt(BigDecimal value) {
        setAttributeInternal(TOTRESCAMNT, value);
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
