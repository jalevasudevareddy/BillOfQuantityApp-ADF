package model.view;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 27 14:48:21 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CertifiedQtyDetailsVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CertifiedQtyDetailsVOImpl() {
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

    /**
     * Returns the variable value for p_prj_num.
     * @return variable value for p_prj_num
     */
    public String getp_prj_num() {
        return (String)ensureVariableManager().getVariableValue("p_prj_num");
    }

    /**
     * Sets <code>value</code> for variable p_prj_num.
     * @param value value to bind as p_prj_num
     */
    public void setp_prj_num(String value) {
        ensureVariableManager().setVariableValue("p_prj_num", value);
    }
}
