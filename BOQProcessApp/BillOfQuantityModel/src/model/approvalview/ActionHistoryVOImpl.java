package model.approvalview;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 04 17:01:26 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ActionHistoryVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ActionHistoryVOImpl() {
    }

    /**
     * Returns the variable value for p_doc_type_id.
     * @return variable value for p_doc_type_id
     */
    public Number getp_doc_type_id() {
        return (Number)ensureVariableManager().getVariableValue("p_doc_type_id");
    }

    /**
     * Sets <code>value</code> for variable p_doc_type_id.
     * @param value value to bind as p_doc_type_id
     */
    public void setp_doc_type_id(Number value) {
        ensureVariableManager().setVariableValue("p_doc_type_id", value);
    }

    /**
     * Returns the variable value for p_doc_id.
     * @return variable value for p_doc_id
     */
    public Number getp_doc_id() {
        return (Number)ensureVariableManager().getVariableValue("p_doc_id");
    }

    /**
     * Sets <code>value</code> for variable p_doc_id.
     * @param value value to bind as p_doc_id
     */
    public void setp_doc_id(Number value) {
        ensureVariableManager().setVariableValue("p_doc_id", value);
    }
}