package model.view;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 03 14:45:04 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WorkDoneQtyLinesVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public WorkDoneQtyLinesVOImpl() {
    }

    /**
     * Returns the variable value for p_wd_header_id.
     * @return variable value for p_wd_header_id
     */
    public BigDecimal getp_wd_header_id() {
        return (BigDecimal)ensureVariableManager().getVariableValue("p_wd_header_id");
    }

    /**
     * Sets <code>value</code> for variable p_wd_header_id.
     * @param value value to bind as p_wd_header_id
     */
    public void setp_wd_header_id(BigDecimal value) {
        ensureVariableManager().setVariableValue("p_wd_header_id", value);
    }

    /**
     * Returns the variable value for p_boq_line_id.
     * @return variable value for p_boq_line_id
     */
    public BigDecimal getp_boq_line_id() {
        return (BigDecimal)ensureVariableManager().getVariableValue("p_boq_line_id");
    }

    /**
     * Sets <code>value</code> for variable p_boq_line_id.
     * @param value value to bind as p_boq_line_id
     */
    public void setp_boq_line_id(BigDecimal value) {
        ensureVariableManager().setVariableValue("p_boq_line_id", value);
    }
}
