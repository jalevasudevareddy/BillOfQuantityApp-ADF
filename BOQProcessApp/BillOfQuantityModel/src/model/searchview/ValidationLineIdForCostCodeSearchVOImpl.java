package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 31 11:46:22 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ValidationLineIdForCostCodeSearchVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ValidationLineIdForCostCodeSearchVOImpl() {
    }

    /**
     * Returns the bind variable value for p_cost_code_id.
     * @return bind variable value for p_cost_code_id
     */
    public BigDecimal getp_cost_code_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_cost_code_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_cost_code_id.
     * @param value value to bind as p_cost_code_id
     */
    public void setp_cost_code_id(BigDecimal value) {
        setNamedWhereClauseParam("p_cost_code_id", value);
    }

    /**
     * Returns the bind variable value for p_hdr_id.
     * @return bind variable value for p_hdr_id
     */
    public BigDecimal getp_hdr_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_hdr_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_hdr_id.
     * @param value value to bind as p_hdr_id
     */
    public void setp_hdr_id(BigDecimal value) {
        setNamedWhereClauseParam("p_hdr_id", value);
    }
}
