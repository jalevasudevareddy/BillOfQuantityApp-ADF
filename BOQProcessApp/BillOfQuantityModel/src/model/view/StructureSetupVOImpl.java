package model.view;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 15:59:53 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StructureSetupVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public StructureSetupVOImpl() {
    }

    /**
     * Returns the variable value for p_bu_id.
     * @return variable value for p_bu_id
     */
    public Long getp_bu_id() {
        return (Long)ensureVariableManager().getVariableValue("p_bu_id");
    }

    /**
     * Sets <code>value</code> for variable p_bu_id.
     * @param value value to bind as p_bu_id
     */
    public void setp_bu_id(Long value) {
        ensureVariableManager().setVariableValue("p_bu_id", value);
    }

    /**
     * Returns the variable value for p_prj_id.
     * @return variable value for p_prj_id
     */
    public Long getp_prj_id() {
        return (Long)ensureVariableManager().getVariableValue("p_prj_id");
    }

    /**
     * Sets <code>value</code> for variable p_prj_id.
     * @param value value to bind as p_prj_id
     */
    public void setp_prj_id(Long value) {
        ensureVariableManager().setVariableValue("p_prj_id", value);
    }
}
