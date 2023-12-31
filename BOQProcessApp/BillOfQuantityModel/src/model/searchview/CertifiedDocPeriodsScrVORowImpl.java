package model.searchview;

import java.sql.Date;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 31 12:20:50 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CertifiedDocPeriodsScrVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        PeriodOfMeasure {
            public Object get(CertifiedDocPeriodsScrVORowImpl obj) {
                return obj.getPeriodOfMeasure();
            }

            public void put(CertifiedDocPeriodsScrVORowImpl obj,
                            Object value) {
                obj.setPeriodOfMeasure((String)value);
            }
        }
        ,
        PeriodDate {
            public Object get(CertifiedDocPeriodsScrVORowImpl obj) {
                return obj.getPeriodDate();
            }

            public void put(CertifiedDocPeriodsScrVORowImpl obj,
                            Object value) {
                obj.setPeriodDate((Date)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CertifiedDocPeriodsScrVORowImpl object);

        public abstract void put(CertifiedDocPeriodsScrVORowImpl object,
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


    public static final int PERIODOFMEASURE = AttributesEnum.PeriodOfMeasure.index();
    public static final int PERIODDATE = AttributesEnum.PeriodDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CertifiedDocPeriodsScrVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute PeriodOfMeasure.
     * @return the PeriodOfMeasure
     */
    public String getPeriodOfMeasure() {
        return (String)getAttributeInternal(PERIODOFMEASURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PeriodOfMeasure.
     * @param value value to set the  PeriodOfMeasure
     */
    public void setPeriodOfMeasure(String value) {
        setAttributeInternal(PERIODOFMEASURE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PeriodDate.
     * @return the PeriodDate
     */
    public Date getPeriodDate() {
        return (Date)getAttributeInternal(PERIODDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PeriodDate.
     * @param value value to set the  PeriodDate
     */
    public void setPeriodDate(Date value) {
        setAttributeInternal(PERIODDATE, value);
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
