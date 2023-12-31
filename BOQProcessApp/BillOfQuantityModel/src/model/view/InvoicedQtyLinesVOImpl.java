package model.view;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 27 12:04:21 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvoicedQtyLinesVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public InvoicedQtyLinesVOImpl() {
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
