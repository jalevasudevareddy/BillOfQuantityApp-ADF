package model.applicationmodule.client;

import model.applicationmodule.common.ReportsAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 08 16:17:08 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReportsAMClient extends ApplicationModuleImpl implements ReportsAM {
    /**
     * This is the default constructor (do not remove).
     */
    public ReportsAMClient() {
    }


    public byte[] runWorkDoneDetailsReport(Number wdHdrId) {
        Object _ret =
            this.riInvokeExportedMethod(this, "runWorkDoneDetailsReport",
                                        new String[] { "java.lang.Number" },
                                        new Object[] { wdHdrId });
        return (byte[])_ret;
    }

    public byte[] runBoqPcReport(Number prjId) {
        Object _ret =
            this.riInvokeExportedMethod(this, "runBoqPcReport", new String[] { "java.lang.Number" },
                                        new Object[] { prjId });
        return (byte[])_ret;
    }
}
