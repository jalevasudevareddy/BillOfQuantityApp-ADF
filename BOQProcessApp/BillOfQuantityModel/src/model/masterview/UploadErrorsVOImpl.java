package model.masterview;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 11:02:17 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UploadErrorsVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public UploadErrorsVOImpl() {
    }

    /**
     * Returns the variable value for p_table_code.
     * @return variable value for p_table_code
     */
    public String getp_table_code() {
        return (String)ensureVariableManager().getVariableValue("p_table_code");
    }

    /**
     * Sets <code>value</code> for variable p_table_code.
     * @param value value to bind as p_table_code
     */
    public void setp_table_code(String value) {
        ensureVariableManager().setVariableValue("p_table_code", value);
    }

    /**
     * Returns the variable value for p_upload_id.
     * @return variable value for p_upload_id
     */
    public Long getp_upload_id() {
        return (Long)ensureVariableManager().getVariableValue("p_upload_id");
    }

    /**
     * Sets <code>value</code> for variable p_upload_id.
     * @param value value to bind as p_upload_id
     */
    public void setp_upload_id(Long value) {
        ensureVariableManager().setVariableValue("p_upload_id", value);
    }
}
