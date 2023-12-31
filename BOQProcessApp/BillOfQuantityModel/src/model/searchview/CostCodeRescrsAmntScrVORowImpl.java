package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 24 17:55:44 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CostCodeRescrsAmntScrVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TotalFinalRate {
            public Object get(CostCodeRescrsAmntScrVORowImpl obj) {
                return obj.getTotalFinalRate();
            }

            public void put(CostCodeRescrsAmntScrVORowImpl obj, Object value) {
                obj.setTotalFinalRate((BigDecimal)value);
            }
        },
        TotalNetUseAmount {
            public Object get(CostCodeRescrsAmntScrVORowImpl obj) {
                return obj.getTotalNetUseAmount();
            }

            public void put(CostCodeRescrsAmntScrVORowImpl obj, Object value) {
                obj.setTotalNetUseAmount((BigDecimal)value);
            }
        },
        TotCostCodeResrcsAmnt {
            public Object get(CostCodeRescrsAmntScrVORowImpl obj) {
                return obj.getTotCostCodeResrcsAmnt();
            }

            public void put(CostCodeRescrsAmntScrVORowImpl obj, Object value) {
                obj.setTotCostCodeResrcsAmnt((BigDecimal)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CostCodeRescrsAmntScrVORowImpl object);

        public abstract void put(CostCodeRescrsAmntScrVORowImpl object,
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


    public static final int TOTALFINALRATE =
        AttributesEnum.TotalFinalRate.index();
    public static final int TOTALNETUSEAMOUNT =
        AttributesEnum.TotalNetUseAmount.index();
    public static final int TOTCOSTCODERESRCSAMNT =
        AttributesEnum.TotCostCodeResrcsAmnt.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CostCodeRescrsAmntScrVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute TotalFinalRate.
     * @return the TotalFinalRate
     */
    public BigDecimal getTotalFinalRate() {
        return (BigDecimal)getAttributeInternal(TOTALFINALRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TotalFinalRate.
     * @param value value to set the  TotalFinalRate
     */
    public void setTotalFinalRate(BigDecimal value) {
        setAttributeInternal(TOTALFINALRATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TotalNetUseAmount.
     * @return the TotalNetUseAmount
     */
    public BigDecimal getTotalNetUseAmount() {
        return (BigDecimal)getAttributeInternal(TOTALNETUSEAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TotalNetUseAmount.
     * @param value value to set the  TotalNetUseAmount
     */
    public void setTotalNetUseAmount(BigDecimal value) {
        setAttributeInternal(TOTALNETUSEAMOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TotCostCodeResrcsAmnt.
     * @return the TotCostCodeResrcsAmnt
     */
    public BigDecimal getTotCostCodeResrcsAmnt() {
        return (BigDecimal)getAttributeInternal(TOTCOSTCODERESRCSAMNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TotCostCodeResrcsAmnt.
     * @param value value to set the  TotCostCodeResrcsAmnt
     */
    public void setTotCostCodeResrcsAmnt(BigDecimal value) {
        setAttributeInternal(TOTCOSTCODERESRCSAMNT, value);
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
