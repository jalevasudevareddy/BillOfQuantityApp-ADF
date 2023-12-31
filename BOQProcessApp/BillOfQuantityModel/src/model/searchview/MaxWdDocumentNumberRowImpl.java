package model.searchview;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 06 12:56:23 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MaxWdDocumentNumberRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        MaxWdDocumentNum {
            public Object get(MaxWdDocumentNumberRowImpl obj) {
                return obj.getMaxWdDocumentNum();
            }

            public void put(MaxWdDocumentNumberRowImpl obj, Object value) {
                obj.setMaxWdDocumentNum((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(MaxWdDocumentNumberRowImpl object);

        public abstract void put(MaxWdDocumentNumberRowImpl object,
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
    public static final int MAXWDDOCUMENTNUM =
        AttributesEnum.MaxWdDocumentNum.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MaxWdDocumentNumberRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute MaxWdDocumentNum.
     * @return the MaxWdDocumentNum
     */
    public String getMaxWdDocumentNum() {
        return (String)getAttributeInternal(MAXWDDOCUMENTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MaxWdDocumentNum.
     * @param value value to set the  MaxWdDocumentNum
     */
    public void setMaxWdDocumentNum(String value) {
        setAttributeInternal(MAXWDDOCUMENTNUM, value);
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
