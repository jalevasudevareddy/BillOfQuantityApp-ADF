package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 02 16:15:17 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CalculateInvoiceValuesVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        InvoiceCummulativeQty {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getInvoiceCummulativeQty();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setInvoiceCummulativeQty((BigDecimal)value);
            }
        }
        ,
        CurrentBoqRate {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getCurrentBoqRate();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setCurrentBoqRate((BigDecimal)value);
            }
        }
        ,
        LineType {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getLineType();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setLineType((String)value);
            }
        }
        ,
        Mainsum {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getMainsum();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setMainsum((BigDecimal)value);
            }
        }
        ,
        Variationssum {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getVariationssum();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setVariationssum((BigDecimal)value);
            }
        }
        ,
        Claimssum {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getClaimssum();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setClaimssum((BigDecimal)value);
            }
        }
        ,
        Advrecovered {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getAdvrecovered();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setAdvrecovered((BigDecimal)value);
            }
        }
        ,
        Retention {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getRetention();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setRetention((BigDecimal)value);
            }
        }
        ,
        AttributeNumber1 {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getAttributeNumber1();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setAttributeNumber1((BigDecimal)value);
            }
        }
        ,
        AttributeNumber2 {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getAttributeNumber2();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setAttributeNumber2((BigDecimal)value);
            }
        }
        ,
        AttributeNumber3 {
            public Object get(CalculateInvoiceValuesVORowImpl obj) {
                return obj.getAttributeNumber3();
            }

            public void put(CalculateInvoiceValuesVORowImpl obj,
                            Object value) {
                obj.setAttributeNumber3((BigDecimal)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CalculateInvoiceValuesVORowImpl object);

        public abstract void put(CalculateInvoiceValuesVORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int INVOICECUMMULATIVEQTY = AttributesEnum.InvoiceCummulativeQty.index();
    public static final int CURRENTBOQRATE = AttributesEnum.CurrentBoqRate.index();
    public static final int LINETYPE = AttributesEnum.LineType.index();
    public static final int MAINSUM = AttributesEnum.Mainsum.index();
    public static final int VARIATIONSSUM = AttributesEnum.Variationssum.index();
    public static final int CLAIMSSUM = AttributesEnum.Claimssum.index();
    public static final int ADVRECOVERED = AttributesEnum.Advrecovered.index();
    public static final int RETENTION = AttributesEnum.Retention.index();
    public static final int ATTRIBUTENUMBER1 = AttributesEnum.AttributeNumber1.index();
    public static final int ATTRIBUTENUMBER2 = AttributesEnum.AttributeNumber2.index();
    public static final int ATTRIBUTENUMBER3 = AttributesEnum.AttributeNumber3.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CalculateInvoiceValuesVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute InvoiceCummulativeQty.
     * @return the InvoiceCummulativeQty
     */
    public BigDecimal getInvoiceCummulativeQty() {
        return (BigDecimal) getAttributeInternal(INVOICECUMMULATIVEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InvoiceCummulativeQty.
     * @param value value to set the  InvoiceCummulativeQty
     */
    public void setInvoiceCummulativeQty(BigDecimal value) {
        setAttributeInternal(INVOICECUMMULATIVEQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentBoqRate.
     * @return the CurrentBoqRate
     */
    public BigDecimal getCurrentBoqRate() {
        return (BigDecimal) getAttributeInternal(CURRENTBOQRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentBoqRate.
     * @param value value to set the  CurrentBoqRate
     */
    public void setCurrentBoqRate(BigDecimal value) {
        setAttributeInternal(CURRENTBOQRATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LineType.
     * @return the LineType
     */
    public String getLineType() {
        return (String) getAttributeInternal(LINETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LineType.
     * @param value value to set the  LineType
     */
    public void setLineType(String value) {
        setAttributeInternal(LINETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Mainsum.
     * @return the Mainsum
     */
    public BigDecimal getMainsum() {
        return (BigDecimal) getAttributeInternal(MAINSUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Mainsum.
     * @param value value to set the  Mainsum
     */
    public void setMainsum(BigDecimal value) {
        setAttributeInternal(MAINSUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Variationssum.
     * @return the Variationssum
     */
    public BigDecimal getVariationssum() {
        return (BigDecimal) getAttributeInternal(VARIATIONSSUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Variationssum.
     * @param value value to set the  Variationssum
     */
    public void setVariationssum(BigDecimal value) {
        setAttributeInternal(VARIATIONSSUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Claimssum.
     * @return the Claimssum
     */
    public BigDecimal getClaimssum() {
        return (BigDecimal) getAttributeInternal(CLAIMSSUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Claimssum.
     * @param value value to set the  Claimssum
     */
    public void setClaimssum(BigDecimal value) {
        setAttributeInternal(CLAIMSSUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Advrecovered.
     * @return the Advrecovered
     */
    public BigDecimal getAdvrecovered() {
        return (BigDecimal) getAttributeInternal(ADVRECOVERED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Advrecovered.
     * @param value value to set the  Advrecovered
     */
    public void setAdvrecovered(BigDecimal value) {
        setAttributeInternal(ADVRECOVERED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Retention.
     * @return the Retention
     */
    public BigDecimal getRetention() {
        return (BigDecimal) getAttributeInternal(RETENTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Retention.
     * @param value value to set the  Retention
     */
    public void setRetention(BigDecimal value) {
        setAttributeInternal(RETENTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AttributeNumber1.
     * @return the AttributeNumber1
     */
    public BigDecimal getAttributeNumber1() {
        return (BigDecimal) getAttributeInternal(ATTRIBUTENUMBER1);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AttributeNumber1.
     * @param value value to set the  AttributeNumber1
     */
    public void setAttributeNumber1(BigDecimal value) {
        setAttributeInternal(ATTRIBUTENUMBER1, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AttributeNumber2.
     * @return the AttributeNumber2
     */
    public BigDecimal getAttributeNumber2() {
        return (BigDecimal) getAttributeInternal(ATTRIBUTENUMBER2);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AttributeNumber2.
     * @param value value to set the  AttributeNumber2
     */
    public void setAttributeNumber2(BigDecimal value) {
        setAttributeInternal(ATTRIBUTENUMBER2, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AttributeNumber3.
     * @return the AttributeNumber3
     */
    public BigDecimal getAttributeNumber3() {
        return (BigDecimal) getAttributeInternal(ATTRIBUTENUMBER3);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AttributeNumber3.
     * @param value value to set the  AttributeNumber3
     */
    public void setAttributeNumber3(BigDecimal value) {
        setAttributeInternal(ATTRIBUTENUMBER3, value);
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
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
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
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
