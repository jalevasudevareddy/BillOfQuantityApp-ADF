package model.applicationmodule.client;

import java.math.BigDecimal;

import java.util.List;
import java.util.Map;

import model.applicationmodule.common.CommonUtilsAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 08 12:07:07 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CommonUtilsAMClient extends ApplicationModuleImpl implements CommonUtilsAM {
    /**
     * This is the default constructor (do not remove).
     */
    public CommonUtilsAMClient() {
    }


    public String cancelDocument(String remarks, Long docId, Long docTypeId) {
        Object _ret =
            this.riInvokeExportedMethod(this, "cancelDocument",
                                        new String[] { "java.lang.String", "java.lang.Long", "java.lang.Long" },
                                        new Object[] { remarks, docId, docTypeId });
        return (String) _ret;
    }

    public String decodeUrl() {
        Object _ret = this.riInvokeExportedMethod(this, "decodeUrl", null, null);
        return (String) _ret;
    }

    public String getCurrentUserRoles() {
        Object _ret = this.riInvokeExportedMethod(this, "getCurrentUserRoles", null, null);
        return (String) _ret;
    }

    public String homePageDoc() {
        Object _ret = this.riInvokeExportedMethod(this, "homePageDoc", null, null);
        return (String) _ret;
    }

    public void loadHomePage() {
        Object _ret = this.riInvokeExportedMethod(this, "loadHomePage", null, null);
        return;
    }

    public Map loadJWTData() {
        Object _ret = this.riInvokeExportedMethod(this, "loadJWTData", null, null);
        return (Map) _ret;
    }

    public String updateDocStatusAndCurrFlag(String docType, BigDecimal docHdrId) {
        Object _ret =
            this.riInvokeExportedMethod(this, "updateDocStatusAndCurrFlag",
                                        new String[] { "java.lang.String", "java.math.BigDecimal" },
                                        new Object[] { docType, docHdrId });
        return (String) _ret;
    }

    public String withdrawFromApproval(String remarks, Long docId, Long docTypeId) {
        Object _ret =
            this.riInvokeExportedMethod(this, "withdrawFromApproval",
                                        new String[] { "java.lang.String", "java.lang.Long", "java.lang.Long" },
                                        new Object[] { remarks, docId, docTypeId });
        return (String) _ret;
    }
}