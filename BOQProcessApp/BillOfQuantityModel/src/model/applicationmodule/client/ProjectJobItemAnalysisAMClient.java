package model.applicationmodule.client;

import java.util.Map;

import java.util.Set;

import model.applicationmodule.common.CommonUtilsAM;
import model.applicationmodule.common.ProjectJobItemAnalysisAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 06 15:28:30 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProjectJobItemAnalysisAMClient extends ApplicationModuleImpl implements ProjectJobItemAnalysisAM {
    /**
     * This is the default constructor (do not remove).
     */
    public ProjectJobItemAnalysisAMClient() {
    }


    public CommonUtilsAM getCommonUtilsAM() {
        return (CommonUtilsAM)findApplicationModule("CommonUtilsAM1");
    }


    public void initTransProjectJobHeaderVO() {
        Object _ret =
            this.riInvokeExportedMethod(this, "initTransProjectJobHeaderVO",
                                        null, null);
        return;
    }

    public Number createNewProjectJobHeaderAnalysis() {
        Object _ret =
            this.riInvokeExportedMethod(this, "createNewProjectJobHeaderAnalysis",
                                        null, null);
        return (Number)_ret;
    }

    public Boolean isJobItemAnalysisCreatedForProject() {
        Object _ret =
            this.riInvokeExportedMethod(this, "isJobItemAnalysisCreatedForProject",
                                        null, null);
        return (Boolean)_ret;
    }

    public Boolean makeAsCurrentProjectJobHeader(Number prjJobHdrId) {
        Object _ret =
            this.riInvokeExportedMethod(this, "makeAsCurrentProjectJobHeader",
                                        new String[] { "oracle.jbo.domain.Number" },
                                        new Object[] { prjJobHdrId });
        return (Boolean)_ret;
    }

    public void refreshProjectJobResourceVO() {
        Object _ret =
            this.riInvokeExportedMethod(this, "refreshProjectJobResourceVO",
                                        null, null);
        return;
    }

    public void refreshProjectJobHeaderVO() {
        Object _ret =
            this.riInvokeExportedMethod(this, "refreshProjectJobHeaderVO",
                                        null, null);
        return;
    }

    public void initProjectJobResourceRow() {
        Object _ret =
            this.riInvokeExportedMethod(this, "initProjectJobResourceRow",
                                        null, null);
        return;
    }

    public void refreshItemJobAnalysisVO() {
        Object _ret =
            this.riInvokeExportedMethod(this, "refreshItemJobAnalysisVO", null,
                                        null);
        return;
    }

    public void deleteJobItemAnalysisResources() {
        Object _ret =
            this.riInvokeExportedMethod(this, "deleteJobItemAnalysisResources",
                                        null, null);
        return;
    }

    public Boolean makeAsCurrentProjectJobActivity(Number prjJobActId) {
        Object _ret =
            this.riInvokeExportedMethod(this, "makeAsCurrentProjectJobActivity",
                                        new String[] { "oracle.jbo.domain.Number" },
                                        new Object[] { prjJobActId });
        return (Boolean)_ret;
    }

    public void refreshPopulateJobRescVO() {
        Object _ret =
            this.riInvokeExportedMethod(this, "refreshPopulateJobRescVO", null,
                                        null);
        return;
    }

    public void refreshProjectUsedResourcesVO() {
        Object _ret =
            this.riInvokeExportedMethod(this, "refreshProjectUsedResourcesVO",
                                        null, null);
        return;
    }

    public String updateProjectResourcesRates() {
        Object _ret =
            this.riInvokeExportedMethod(this, "updateProjectResourcesRates",
                                        null, null);
        return (String)_ret;
    }

    public String updateProjectResourcesRate() {
        Object _ret =
            this.riInvokeExportedMethod(this, "updateProjectResourcesRate",
                                        null, null);
        return (String)_ret;
    }

    public void populateSelectedResources(Set selectedItems) {
        Object _ret =
            this.riInvokeExportedMethod(this, "populateSelectedResources",
                                        new String[] { "java.util.Set" },
                                        new Object[] { selectedItems });
        return;
    }

    public void calculateAndUpdatePrjItemUnitRate() {
        Object _ret =
            this.riInvokeExportedMethod(this, "calculateAndUpdatePrjItemUnitRate",
                                        null, null);
        return;
    }

    public String updateItemAnyStatusWith(String newStatus) {
        Object _ret =
            this.riInvokeExportedMethod(this, "updateItemAnyStatusWith",
                                        new String[] { "java.lang.String" },
                                        new Object[] { newStatus });
        return (String)_ret;
    }

    public Number reviseCurrentPrjJobItemAnalysis() {
        Object _ret =
            this.riInvokeExportedMethod(this, "reviseCurrentPrjJobItemAnalysis",
                                        null, null);
        return (Number)_ret;
    }

    public void makeRevicesItemAnalysisAsCurrentRow(Number revisedItemAnyId) {
        Object _ret =
            this.riInvokeExportedMethod(this, "makeRevicesItemAnalysisAsCurrentRow",
                                        new String[] { "oracle.jbo.domain.Number" },
                                        new Object[] { revisedItemAnyId });
        return;
    }

    public String copyPrjJobItemAnalysis() {
        Object _ret =
            this.riInvokeExportedMethod(this, "copyPrjJobItemAnalysis", null,
                                        null);
        return (String)_ret;
    }
}