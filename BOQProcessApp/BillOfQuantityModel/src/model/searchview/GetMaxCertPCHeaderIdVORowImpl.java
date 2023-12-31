package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 03 21:18:47 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GetMaxCertPCHeaderIdVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Maxpc {
            public Object get(GetMaxCertPCHeaderIdVORowImpl obj) {
                return obj.getMaxpc();
            }

            public void put(GetMaxCertPCHeaderIdVORowImpl obj, Object value) {
                obj.setMaxpc((BigDecimal)value);
            }
        }
        ,
        Maxcert {
            public Object get(GetMaxCertPCHeaderIdVORowImpl obj) {
                return obj.getMaxcert();
            }

            public void put(GetMaxCertPCHeaderIdVORowImpl obj, Object value) {
                obj.setMaxcert((BigDecimal)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(GetMaxCertPCHeaderIdVORowImpl object);

        public abstract void put(GetMaxCertPCHeaderIdVORowImpl object,
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


    public static final int MAXPC = AttributesEnum.Maxpc.index();
    public static final int MAXCERT = AttributesEnum.Maxcert.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GetMaxCertPCHeaderIdVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Maxpc.
     * @return the Maxpc
     */
    public BigDecimal getMaxpc() {
        return (BigDecimal) getAttributeInternal(MAXPC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Maxpc.
     * @param value value to set the  Maxpc
     */
    public void setMaxpc(BigDecimal value) {
        setAttributeInternal(MAXPC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Maxcert.
     * @return the Maxcert
     */
    public BigDecimal getMaxcert() {
        return (BigDecimal) getAttributeInternal(MAXCERT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Maxcert.
     * @param value value to set the  Maxcert
     */
    public void setMaxcert(BigDecimal value) {
        setAttributeInternal(MAXCERT, value);
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
