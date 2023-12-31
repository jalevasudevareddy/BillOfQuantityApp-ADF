package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 24 17:55:44 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CostCodeRescrsAmntScrVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CostCodeRescrsAmntScrVOImpl() {
    }


    /**
     * Returns the bind variable value for p_val_line_id.
     * @return bind variable value for p_val_line_id
     */
    public BigDecimal getp_val_line_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_val_line_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_val_line_id.
     * @param value value to bind as p_val_line_id
     */
    public void setp_val_line_id(BigDecimal value) {
        setNamedWhereClauseParam("p_val_line_id", value);
    }

    /**
     * Returns the bind variable value for p_val_cost_code_id.
     * @return bind variable value for p_val_cost_code_id
     */
    public BigDecimal getp_val_cost_code_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_val_cost_code_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_val_cost_code_id.
     * @param value value to bind as p_val_cost_code_id
     */
    public void setp_val_cost_code_id(BigDecimal value) {
        setNamedWhereClauseParam("p_val_cost_code_id", value);
    }
}
