package model.entity;

import java.math.BigDecimal;

import oracle.jbo.domain.Date;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 20 15:04:04 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqAccountsSetupEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * Validation method for StartDate.
     */
    public boolean validateStartDate(Date startdate) {
        if (getEndDate() != null && startdate != null) {
            oracle.jbo.domain.Date startDate1 =
                (oracle.jbo.domain.Date)startdate.getData();
            oracle.jbo.domain.Date endDate =
                (oracle.jbo.domain.Date)getEndDate().getData();
            if (startDate1.dateValue().compareTo(endDate.dateValue()) <= 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * Validation method for EndDate.
     */
    public boolean validateEndDate(Date enddate) {
        if (getStartDate() != null && enddate != null) {
            oracle.jbo.domain.Date startDate =
                (oracle.jbo.domain.Date)getStartDate().getData();
            oracle.jbo.domain.Date endDate1 =
                (oracle.jbo.domain.Date)enddate.getData();
            if (startDate.dateValue().compareTo(endDate1.dateValue()) <= 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        AccSetupId {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getAccSetupId();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setAccSetupId((BigDecimal)value);
            }
        },
        BuId {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getBuId();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setBuId((BigDecimal)value);
            }
        },
        Destination {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getDestination();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setDestination((String)value);
            }
        },
        ArType {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getArType();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setArType((String)value);
            }
        },
        CustomerType {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getCustomerType();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setCustomerType((String)value);
            }
        },
        ArContext {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getArContext();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setArContext((String)value);
            }
        },
        ArTrxTypeId {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getArTrxTypeId();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setArTrxTypeId((BigDecimal)value);
            }
        },
        ArTrxType {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getArTrxType();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setArTrxType((String)value);
            }
        },
        ArSourceId {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getArSourceId();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setArSourceId((BigDecimal)value);
            }
        },
        ArSource {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getArSource();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setArSource((String)value);
            }
        },
        GlSource {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getGlSource();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setGlSource((String)value);
            }
        },
        GlCategory {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getGlCategory();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setGlCategory((String)value);
            }
        },
        BillCategory {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getBillCategory();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setBillCategory((String)value);
            }
        },
        NaturalAccount {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getNaturalAccount();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setNaturalAccount((String)value);
            }
        },
        SubAccount {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getSubAccount();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setSubAccount((String)value);
            }
        },
        StartDate {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getStartDate();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        },
        EndDate {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getEndDate();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        },
        CreationDate {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        AccountCombination {
            public Object get(XxboqAccountsSetupEOImpl obj) {
                return obj.getAccountCombination();
            }

            public void put(XxboqAccountsSetupEOImpl obj, Object value) {
                obj.setAccountCombination((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqAccountsSetupEOImpl object);

        public abstract void put(XxboqAccountsSetupEOImpl object,
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
    public XxboqAccountsSetupEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("model.entity.XxboqAccountsSetupEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for AccSetupId, using the alias name AccSetupId.
     * @return the AccSetupId
     */
    public BigDecimal getAccSetupId() {
        return (BigDecimal)getAttributeInternal(ACCSETUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccSetupId.
     * @param value value to set the AccSetupId
     */
    public void setAccSetupId(BigDecimal value) {
        setAttributeInternal(ACCSETUPID, value);
    }

    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the BuId
     */
    public BigDecimal getBuId() {
        return (BigDecimal)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(BigDecimal value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for Destination, using the alias name Destination.
     * @return the Destination
     */
    public String getDestination() {
        return (String)getAttributeInternal(DESTINATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Destination.
     * @param value value to set the Destination
     */
    public void setDestination(String value) {
        setAttributeInternal(DESTINATION, value);
    }

    /**
     * Gets the attribute value for ArType, using the alias name ArType.
     * @return the ArType
     */
    public String getArType() {
        return (String)getAttributeInternal(ARTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArType.
     * @param value value to set the ArType
     */
    public void setArType(String value) {
        setAttributeInternal(ARTYPE, value);
    }

    /**
     * Gets the attribute value for CustomerType, using the alias name CustomerType.
     * @return the CustomerType
     */
    public String getCustomerType() {
        return (String)getAttributeInternal(CUSTOMERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerType.
     * @param value value to set the CustomerType
     */
    public void setCustomerType(String value) {
        setAttributeInternal(CUSTOMERTYPE, value);
    }

    /**
     * Gets the attribute value for ArContext, using the alias name ArContext.
     * @return the ArContext
     */
    public String getArContext() {
        return (String)getAttributeInternal(ARCONTEXT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArContext.
     * @param value value to set the ArContext
     */
    public void setArContext(String value) {
        setAttributeInternal(ARCONTEXT, value);
    }

    /**
     * Gets the attribute value for ArTrxTypeId, using the alias name ArTrxTypeId.
     * @return the ArTrxTypeId
     */
    public BigDecimal getArTrxTypeId() {
        return (BigDecimal)getAttributeInternal(ARTRXTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArTrxTypeId.
     * @param value value to set the ArTrxTypeId
     */
    public void setArTrxTypeId(BigDecimal value) {
        setAttributeInternal(ARTRXTYPEID, value);
    }

    /**
     * Gets the attribute value for ArTrxType, using the alias name ArTrxType.
     * @return the ArTrxType
     */
    public String getArTrxType() {
        return (String)getAttributeInternal(ARTRXTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArTrxType.
     * @param value value to set the ArTrxType
     */
    public void setArTrxType(String value) {
        setAttributeInternal(ARTRXTYPE, value);
    }

    /**
     * Gets the attribute value for ArSourceId, using the alias name ArSourceId.
     * @return the ArSourceId
     */
    public BigDecimal getArSourceId() {
        return (BigDecimal)getAttributeInternal(ARSOURCEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArSourceId.
     * @param value value to set the ArSourceId
     */
    public void setArSourceId(BigDecimal value) {
        setAttributeInternal(ARSOURCEID, value);
    }

    /**
     * Gets the attribute value for ArSource, using the alias name ArSource.
     * @return the ArSource
     */
    public String getArSource() {
        return (String)getAttributeInternal(ARSOURCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArSource.
     * @param value value to set the ArSource
     */
    public void setArSource(String value) {
        setAttributeInternal(ARSOURCE, value);
    }

    /**
     * Gets the attribute value for GlSource, using the alias name GlSource.
     * @return the GlSource
     */
    public String getGlSource() {
        return (String)getAttributeInternal(GLSOURCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlSource.
     * @param value value to set the GlSource
     */
    public void setGlSource(String value) {
        setAttributeInternal(GLSOURCE, value);
    }

    /**
     * Gets the attribute value for GlCategory, using the alias name GlCategory.
     * @return the GlCategory
     */
    public String getGlCategory() {
        return (String)getAttributeInternal(GLCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlCategory.
     * @param value value to set the GlCategory
     */
    public void setGlCategory(String value) {
        setAttributeInternal(GLCATEGORY, value);
    }

    /**
     * Gets the attribute value for BillCategory, using the alias name BillCategory.
     * @return the BillCategory
     */
    public String getBillCategory() {
        return (String)getAttributeInternal(BILLCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillCategory.
     * @param value value to set the BillCategory
     */
    public void setBillCategory(String value) {
        setAttributeInternal(BILLCATEGORY, value);
    }

    /**
     * Gets the attribute value for NaturalAccount, using the alias name NaturalAccount.
     * @return the NaturalAccount
     */
    public String getNaturalAccount() {
        return (String)getAttributeInternal(NATURALACCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for NaturalAccount.
     * @param value value to set the NaturalAccount
     */
    public void setNaturalAccount(String value) {
        setAttributeInternal(NATURALACCOUNT, value);
    }

    /**
     * Gets the attribute value for SubAccount, using the alias name SubAccount.
     * @return the SubAccount
     */
    public String getSubAccount() {
        return (String)getAttributeInternal(SUBACCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubAccount.
     * @param value value to set the SubAccount
     */
    public void setSubAccount(String value) {
        setAttributeInternal(SUBACCOUNT, value);
    }

    /**
     * Gets the attribute value for StartDate, using the alias name StartDate.
     * @return the StartDate
     */
    public Date getStartDate() {
        return (Date)getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartDate.
     * @param value value to set the StartDate
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for EndDate, using the alias name EndDate.
     * @return the EndDate
     */
    public Date getEndDate() {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDate.
     * @param value value to set the EndDate
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }


    /**
     * Gets the attribute value for AccountCombination, using the alias name AccountCombination.
     * @return the AccountCombination
     */
    public String getAccountCombination() {
        return (String)getAttributeInternal(ACCOUNTCOMBINATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccountCombination.
     * @param value value to set the AccountCombination
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


    /**
     * @param accSetupId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal accSetupId) {
        return new Key(new Object[] { accSetupId });
    }

    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq =
            new SequenceImpl("XXBOQ_ACCOUNTS_SETUP_S", getDBTransaction());
        setAccSetupId(new BigDecimal(seq.getSequenceNumber().toString()));
    }

    private static final byte USERNAME_HISTORY_TYPE = 13;

    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
        if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
            // Custom History type logic goes here
            return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
        }
        return super.getHistoryContextForAttribute(attr);
    }

}
