package model.applicationmodule.client;

import java.util.Map;

import model.applicationmodule.common.BOQSetupAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 29 14:31:43 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BOQSetupAMClient extends ApplicationModuleImpl implements BOQSetupAM {
    /**
     * This is the default constructor (do not remove).
     */
    public BOQSetupAMClient() {
    }


    public void CreateActivityLine() {
        Object _ret =
            this.riInvokeExportedMethod(this, "CreateActivityLine", null,
                                        null);
        return;
    }

    public void editDocument() {
        Object _ret =
            this.riInvokeExportedMethod(this, "editDocument", null, null);
        return;
    }

    public void createResourceMasterGroupRow() {
        Object _ret =
            this.riInvokeExportedMethod(this, "createResourceMasterGroupRow",
                                        null, null);
        return;
    }

    public void createDocument() {
        Object _ret =
            this.riInvokeExportedMethod(this, "createDocument", null, null);
        return;
    }

    public void cancelDocument() {
        Object _ret =
            this.riInvokeExportedMethod(this, "cancelDocument", null, null);
        return;
    }

    public void createSubGroupLine() {
        Object _ret =
            this.riInvokeExportedMethod(this, "createSubGroupLine", null,
                                        null);
        return;
    }

    public void setExpenditureCategoryValue() {
        Object _ret =
            this.riInvokeExportedMethod(this, "setExpenditureCategoryValue",
                                        null, null);
        return;
    }

    public void createItemLine() {
        Object _ret =
            this.riInvokeExportedMethod(this, "createItemLine", null, null);
        return;
    }

    public void setExpenditureTypeValue() {
        Object _ret =
            this.riInvokeExportedMethod(this, "setExpenditureTypeValue", null,
                                        null);
        return;
    }

    public void createTransBuLine() {
        Object _ret =
            this.riInvokeExportedMethod(this, "createTransBuLine", null, null);
        return;
    }

    public void createAccountsSetupRow() {
        Object _ret =
            this.riInvokeExportedMethod(this, "createAccountsSetupRow", null,
                                        null);
        return;
    }

    public void crateTransAccountsRow() {
        Object _ret =
            this.riInvokeExportedMethod(this, "crateTransAccountsRow", null,
                                        null);
        return;
    }

    public String validateBillCategory() {
        Object _ret =
            this.riInvokeExportedMethod(this, "validateBillCategory", null,
                                        null);
        return (String)_ret;
    }

    public String createGLAccountCombination() {
        Object _ret =
            this.riInvokeExportedMethod(this, "createGLAccountCombination",
                                        null, null);
        return (String)_ret;
    }

    public String validateAccountingRow() {
        Object _ret =
            this.riInvokeExportedMethod(this, "validateAccountingRow", null,
                                        null);
        return (String)_ret;
    }

    public String refreshBOQAccntSetupRow(Map attributesMap) {
        Object _ret =
            this.riInvokeExportedMethod(this, "refreshBOQAccntSetupRow",
                                        new String[] { "java.util.Map" },
                                        new Object[] { attributesMap });
        return (String)_ret;
    }
}