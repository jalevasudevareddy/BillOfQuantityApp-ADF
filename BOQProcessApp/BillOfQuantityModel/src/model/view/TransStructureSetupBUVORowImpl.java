package model.view;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 15:58:19 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransStructureSetupBUVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BuId {
            public Object get(TransStructureSetupBUVORowImpl obj) {
                return obj.getBuId();
            }

            public void put(TransStructureSetupBUVORowImpl obj, Object value) {
                obj.setBuId((Long)value);
            }
        },
        BuName {
            public Object get(TransStructureSetupBUVORowImpl obj) {
                return obj.getBuName();
            }

            public void put(TransStructureSetupBUVORowImpl obj, Object value) {
                obj.setBuName((String)value);
            }
        },
        ProjectId {
            public Object get(TransStructureSetupBUVORowImpl obj) {
                return obj.getProjectId();
            }

            public void put(TransStructureSetupBUVORowImpl obj, Object value) {
                obj.setProjectId((String)value);
            }
        },
        ProjectNumber {
            public Object get(TransStructureSetupBUVORowImpl obj) {
                return obj.getProjectNumber();
            }

            public void put(TransStructureSetupBUVORowImpl obj, Object value) {
                obj.setProjectNumber((String)value);
            }
        },
        StructureSetupVO {
            public Object get(TransStructureSetupBUVORowImpl obj) {
                return obj.getStructureSetupVO();
            }

            public void put(TransStructureSetupBUVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        UserBUSearchVO1 {
            public Object get(TransStructureSetupBUVORowImpl obj) {
                return obj.getUserBUSearchVO1();
            }

            public void put(TransStructureSetupBUVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        PrjProjectsVO1 {
            public Object get(TransStructureSetupBUVORowImpl obj) {
                return obj.getPrjProjectsVO1();
            }

            public void put(TransStructureSetupBUVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(TransStructureSetupBUVORowImpl object);

        public abstract void put(TransStructureSetupBUVORowImpl object,
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


    public static final int BUID = AttributesEnum.BuId.index();
    public static final int BUNAME = AttributesEnum.BuName.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int PROJECTNUMBER =
        AttributesEnum.ProjectNumber.index();
    public static final int STRUCTURESETUPVO =
        AttributesEnum.StructureSetupVO.index();
    public static final int USERBUSEARCHVO1 =
        AttributesEnum.UserBUSearchVO1.index();
    public static final int PRJPROJECTSVO1 =
        AttributesEnum.PrjProjectsVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TransStructureSetupBUVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute BuId.
     * @return the BuId
     */
    public Long getBuId() {
        return (Long)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuId.
     * @param value value to set the  BuId
     */
    public void setBuId(Long value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuName.
     * @return the BuName
     */
    public String getBuName() {
        return (String)getAttributeInternal(BUNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuName.
     * @param value value to set the  BuName
     */
    public void setBuName(String value) {
        setAttributeInternal(BUNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProjectId.
     * @return the ProjectId
     */
    public String getProjectId() {
        return (String)getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProjectId.
     * @param value value to set the  ProjectId
     */
    public void setProjectId(String value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProjectNumber.
     * @return the ProjectNumber
     */
    public String getProjectNumber() {
        return (String)getAttributeInternal(PROJECTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProjectNumber.
     * @param value value to set the  ProjectNumber
     */
    public void setProjectNumber(String value) {
        setAttributeInternal(PROJECTNUMBER, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link StructureSetupVO.
     */
    public RowIterator getStructureSetupVO() {
        return (RowIterator)getAttributeInternal(STRUCTURESETUPVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UserBUSearchVO1.
     */
    public RowSet getUserBUSearchVO1() {
        return (RowSet)getAttributeInternal(USERBUSEARCHVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PrjProjectsVO1.
     */
    public RowSet getPrjProjectsVO1() {
        return (RowSet)getAttributeInternal(PRJPROJECTSVO1);
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