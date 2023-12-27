package model.searchview;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 26 14:33:47 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GetAccountingMaxRowScrVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        AccSetupId {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getAccSetupId();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setAccSetupId((BigDecimal)value);
            }
        },
        BuId {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getBuId();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setBuId((BigDecimal)value);
            }
        },
        Destination {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getDestination();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setDestination((String)value);
            }
        },
        ArType {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getArType();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setArType((String)value);
            }
        },
        CustomerType {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getCustomerType();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setCustomerType((String)value);
            }
        },
        ArContext {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getArContext();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setArContext((String)value);
            }
        },
        ArTrxTypeId {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getArTrxTypeId();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setArTrxTypeId((BigDecimal)value);
            }
        },
        ArTrxType {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getArTrxType();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setArTrxType((String)value);
            }
        },
        ArSourceId {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getArSourceId();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setArSourceId((BigDecimal)value);
            }
        },
        ArSource {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getArSource();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setArSource((String)value);
            }
        },
        GlSource {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getGlSource();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setGlSource((String)value);
            }
        },
        GlCategory {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getGlCategory();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setGlCategory((String)value);
            }
        },
        BillCategory {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getBillCategory();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setBillCategory((String)value);
            }
        },
        NaturalAccount {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getNaturalAccount();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setNaturalAccount((String)value);
            }
        },
        SubAccount {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getSubAccount();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setSubAccount((String)value);
            }
        },
        StartDate {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getStartDate();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setStartDate((Date)value);
            }
        },
        EndDate {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getEndDate();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setEndDate((Date)value);
            }
        },
        CreationDate {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        CreatedBy {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        LastUpdatedDate {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        },
        LastUpdatedBy {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        },
        AccountCombination {
            public Object get(GetAccountingMaxRowScrVORowImpl obj) {
                return obj.getAccountCombination();
            }

            public void put(GetAccountingMaxRowScrVORowImpl obj,
                            Object value) {
                obj.setAccountCombination((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(GetAccountingMaxRowScrVORowImpl object);

        public abstract void put(GetAccountingMaxRowScrVORowImpl object,
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
    public static final int ACCSETUPID = AttributesEnum.AccSetupId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int DESTINATION = AttributesEnum.Destination.index();
    public static final int ARTYPE = AttributesEnum.ArType.index();
    public static final int CUSTOMERTYPE = AttributesEnum.CustomerType.index();
    public static final int ARCONTEXT = AttributesEnum.ArContext.index();
    public static final int ARTRXTYPEID = AttributesEnum.ArTrxTypeId.index();
    public static final int ARTRXTYPE = AttributesEnum.ArTrxType.index();
    public static final int ARSOURCEID = AttributesEnum.ArSourceId.index();
    public static final int ARSOURCE = AttributesEnum.ArSource.index();
    public static final int GLSOURCE = AttributesEnum.GlSource.index();
    public static final int GLCATEGORY = AttributesEnum.GlCategory.index();
    public static final int BILLCATEGORY = AttributesEnum.BillCategory.index();
    public static final int NATURALACCOUNT =
        AttributesEnum.NaturalAccount.index();
    public static final int SUBACCOUNT = AttributesEnum.SubAccount.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int ACCOUNTCOMBINATION =
        AttributesEnum.AccountCombination.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GetAccountingMaxRowScrVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute AccSetupId.
     * @return the AccSetupId
     */
    public BigDecimal getAccSetupId() {
        return (BigDecimal)getAttributeInternal(ACCSETUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AccSetupId.
     * @param value value to set the  AccSetupId
     */
    public void setAccSetupId(BigDecimal value) {
        setAttributeInternal(ACCSETUPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuId.
     * @return the BuId
     */
    public BigDecimal getBuId() {
        return (BigDecimal)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuId.
     * @param value value to set the  BuId
     */
    public void setBuId(BigDecimal value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Destination.
     * @return the Destination
     */
    public String getDestination() {
        return (String)getAttributeInternal(DESTINATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Destination.
     * @param value value to set the  Destination
     */
    public void setDestination(String value) {
        setAttributeInternal(DESTINATION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ArType.
     * @return the ArType
     */
    public String getArType() {
        return (String)getAttributeInternal(ARTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ArType.
     * @param value value to set the  ArType
     */
    public void setArType(String value) {
        setAttributeInternal(ARTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerType.
     * @return the CustomerType
     */
    public String getCustomerType() {
        return (String)getAttributeInternal(CUSTOMERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CustomerType.
     * @param value value to set the  CustomerType
     */
    public void setCustomerType(String value) {
        setAttributeInternal(CUSTOMERTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ArContext.
     * @return the ArContext
     */
    public String getArContext() {
        return (String)getAttributeInternal(ARCONTEXT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ArContext.
     * @param value value to set the  ArContext
     */
    public void setArContext(String value) {
        setAttributeInternal(ARCONTEXT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ArTrxTypeId.
     * @return the ArTrxTypeId
     */
    public BigDecimal getArTrxTypeId() {
        return (BigDecimal)getAttributeInternal(ARTRXTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ArTrxTypeId.
     * @param value value to set the  ArTrxTypeId
     */
    public void setArTrxTypeId(BigDecimal value) {
        setAttributeInternal(ARTRXTYPEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ArTrxType.
     * @return the ArTrxType
     */
    public String getArTrxType() {
        return (String)getAttributeInternal(ARTRXTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ArTrxType.
     * @param value value to set the  ArTrxType
     */
    public void setArTrxType(String value) {
        setAttributeInternal(ARTRXTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ArSourceId.
     * @return the ArSourceId
     */
    public BigDecimal getArSourceId() {
        return (BigDecimal)getAttributeInternal(ARSOURCEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ArSourceId.
     * @param value value to set the  ArSourceId
     */
    public void setArSourceId(BigDecimal value) {
        setAttributeInternal(ARSOURCEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ArSource.
     * @return the ArSource
     */
    public String getArSource() {
        return (String)getAttributeInternal(ARSOURCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ArSource.
     * @param value value to set the  ArSource
     */
    public void setArSource(String value) {
        setAttributeInternal(ARSOURCE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute GlSource.
     * @return the GlSource
     */
    public String getGlSource() {
        return (String)getAttributeInternal(GLSOURCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute GlSource.
     * @param value value to set the  GlSource
     */
    public void setGlSource(String value) {
        setAttributeInternal(GLSOURCE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute GlCategory.
     * @return the GlCategory
     */
    public String getGlCategory() {
        return (String)getAttributeInternal(GLCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute GlCategory.
     * @param value value to set the  GlCategory
     */
    public void setGlCategory(String value) {
        setAttributeInternal(GLCATEGORY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BillCategory.
     * @return the BillCategory
     */
    public String getBillCategory() {
        return (String)getAttributeInternal(BILLCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BillCategory.
     * @param value value to set the  BillCategory
     */
    public void setBillCategory(String value) {
        setAttributeInternal(BILLCATEGORY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute NaturalAccount.
     * @return the NaturalAccount
     */
    public String getNaturalAccount() {
        return (String)getAttributeInternal(NATURALACCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute NaturalAccount.
     * @param value value to set the  NaturalAccount
     */
    public void setNaturalAccount(String value) {
        setAttributeInternal(NATURALACCOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SubAccount.
     * @return the SubAccount
     */
    public String getSubAccount() {
        return (String)getAttributeInternal(SUBACCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SubAccount.
     * @param value value to set the  SubAccount
     */
    public void setSubAccount(String value) {
        setAttributeInternal(SUBACCOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StartDate.
     * @return the StartDate
     */
    public Date getStartDate() {
        return (Date)getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StartDate.
     * @param value value to set the  StartDate
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EndDate.
     * @return the EndDate
     */
    public Date getEndDate() {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EndDate.
     * @param value value to set the  EndDate
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CreationDate.
     * @param value value to set the  CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CreatedBy.
     * @param value value to set the  CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LastUpdatedDate.
     * @param value value to set the  LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LastUpdatedBy.
     * @param value value to set the  LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AccountCombination.
     * @return the AccountCombination
     */
    public String getAccountCombination() {
        return (String)getAttributeInternal(ACCOUNTCOMBINATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AccountCombination.
     * @param value value to set the  AccountCombination
     */
    public void setAccountCombination(String value) {
        setAttributeInternal(ACCOUNTCOMBINATION, value);
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