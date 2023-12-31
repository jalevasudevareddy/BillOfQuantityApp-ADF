package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 26 14:33:47 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GetAccountingMaxRowScrVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public GetAccountingMaxRowScrVOImpl() {
    }

    /**
     * Returns the bind variable value for p_bu_id.
     * @return bind variable value for p_bu_id
     */
    public BigDecimal getp_bu_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_bu_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_bu_id.
     * @param value value to bind as p_bu_id
     */
    public void setp_bu_id(BigDecimal value) {
        setNamedWhereClauseParam("p_bu_id", value);
    }

    /**
     * Returns the bind variable value for p_cat_type.
     * @return bind variable value for p_cat_type
     */
    public String getp_cat_type() {
        return (String)getNamedWhereClauseParam("p_cat_type");
    }

    /**
     * Sets <code>value</code> for bind variable p_cat_type.
     * @param value value to bind as p_cat_type
     */
    public void setp_cat_type(String value) {
        setNamedWhereClauseParam("p_cat_type", value);
    }
}
