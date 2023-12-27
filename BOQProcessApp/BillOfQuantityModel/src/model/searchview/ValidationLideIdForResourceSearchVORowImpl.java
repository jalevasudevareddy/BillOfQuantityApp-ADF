package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 31 11:47:45 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ValidationLideIdForResourceSearchVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ValidationLineId {
            public Object get(ValidationLideIdForResourceSearchVORowImpl obj) {
                return obj.getValidationLineId();
            }

            public void put(ValidationLideIdForResourceSearchVORowImpl obj,
                            Object value) {
                obj.setValidationLineId((BigDecimal)value);
            }
        },
        ValidationCostCodeId {
            public Object get(ValidationLideIdForResourceSearchVORowImpl obj) {
                return obj.getValidationCostCodeId();
            }

            public void put(ValidationLideIdForResourceSearchVORowImpl obj,
                            Object value) {
                obj.setValidationCostCodeId((BigDecimal)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ValidationLideIdForResourceSearchVORowImpl object);

        public abstract void put(ValidationLideIdForResourceSearchVORowImpl object,
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
    public static final int VALIDATIONLINEID =
        AttributesEnum.ValidationLineId.index();
    public static final int VALIDATIONCOSTCODEID =
        AttributesEnum.ValidationCostCodeId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ValidationLideIdForResourceSearchVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute ValidationLineId.
     * @return the ValidationLineId
     */
    public BigDecimal getValidationLineId() {
        return (BigDecimal)getAttributeInternal(VALIDATIONLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ValidationLineId.
     * @param value value to set the  ValidationLineId
     */
    public void setValidationLineId(BigDecimal value) {
        setAttributeInternal(VALIDATIONLINEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ValidationCostCodeId.
     * @return the ValidationCostCodeId
     */
    public BigDecimal getValidationCostCodeId() {
        return (BigDecimal)getAttributeInternal(VALIDATIONCOSTCODEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ValidationCostCodeId.
     * @param value value to set the  ValidationCostCodeId
     */
    public void setValidationCostCodeId(BigDecimal value) {
        setAttributeInternal(VALIDATIONCOSTCODEID, value);
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