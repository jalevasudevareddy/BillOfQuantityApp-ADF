package model.applicationmodule.common;

import java.util.Map;

import java.util.Set;

import oracle.jbo.ApplicationModule;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 06 15:28:30 IST 2017
// ---------------------------------------------------------------------
public interface ProjectJobItemAnalysisAM extends ApplicationModule {
    void initTransProjectJobHeaderVO();

    Number createNewProjectJobHeaderAnalysis();

    Boolean isJobItemAnalysisCreatedForProject();

    Boolean makeAsCurrentProjectJobHeader(Number prjJobHdrId);

    void refreshProjectJobResourceVO();

    void refreshProjectJobHeaderVO();

    void initProjectJobResourceRow();

    void refreshItemJobAnalysisVO();

    void deleteJobItemAnalysisResources();

    Boolean makeAsCurrentProjectJobActivity(Number prjJobActId);


    void refreshPopulateJobRescVO();

    void refreshProjectUsedResourcesVO();

    String updateProjectResourcesRates();

    String updateProjectResourcesRate();

    void populateSelectedResources(Set selectedItems);

    void calculateAndUpdatePrjItemUnitRate();

    String updateItemAnyStatusWith(String newStatus);

    Number reviseCurrentPrjJobItemAnalysis();

    void makeRevicesItemAnalysisAsCurrentRow(Number revisedItemAnyId);

    String copyPrjJobItemAnalysis();
}