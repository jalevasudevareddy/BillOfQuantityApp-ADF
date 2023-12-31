package model.applicationmodule;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.OutputStream;

import java.math.BigDecimal;


import model.applicationmodule.common.ReportsAM;

import model.reportview.BoqPcHdrViewVOImpl;
import model.reportview.BoqPcHdrViewVORowImpl;
import model.reportview.BoqPcLinesViewVOImpl;
import model.reportview.WorkDoneDetailsReportVOImpl;
import model.reportview.WorkDoneDetailsViewVOImpl;
import model.reportview.WorkDoneDetailsViewVORowImpl;

import model.reportview.WorkDoneLinesViewVOImpl;

import model.services.ExternalReportCustom;

import oracle.jbo.XMLInterface;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;

import oracle.xml.parser.v2.XMLNode;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 08 15:46:17 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReportsAMImpl extends ApplicationModuleImpl implements ReportsAM {
    /**
     * This is the default constructor (do not remove).
     */
    public ReportsAMImpl() {
    }


    public byte[] runWorkDoneDetailsReport(Number wdHdrId) {
        byte[] outputData = null;
        try {
            ByteArrayOutputStream opStream = new ByteArrayOutputStream();
            WorkDoneDetailsReportVOImpl wdHdrVO = getWorkDoneDetailsReportVO1();
            wdHdrVO.setNamedWhereClauseParam("p_header_id", wdHdrId);
            wdHdrVO.executeQuery();

            ((XMLNode)wdHdrVO.writeXML(1,
                                        XMLInterface.XML_OPT_ALL_ROWS)).print(opStream);
//            File file = new File("C:\\Users\\sumanth.yamani\\Downloads\\BOQ Uploads/WDDetails.xml");
//            FileOutputStream fop = new FileOutputStream(file);
//            opStream.writeTo(fop);
//            opStream.close();
            String reportPath =
                "/Custom/PAAS/Master Reports/Projects/Workdone Details Report.xdo";
            String format = "xlsx";
            ExternalReportCustom extService = new ExternalReportCustom();
            outputData =
                    extService.generatePDFReport(reportPath, format, opStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputData;
    }


    public byte[] runBoqPcReport(Number prjId) {
        byte[] outputXml = null;
        try {

            ByteArrayOutputStream opStream = new ByteArrayOutputStream();
            BoqPcHdrViewVOImpl prjHdrVO = getBoqPcHdrViewVO1();
            prjHdrVO.setNamedWhereClauseParam("p_prj_id", prjId);
            prjHdrVO.executeQuery();
            BoqPcHdrViewVORowImpl prjHdrRow =
                (BoqPcHdrViewVORowImpl)prjHdrVO.first();
            ((XMLNode)prjHdrRow.writeXML(1,
                                         XMLInterface.XML_OPT_ALL_ROWS)).print(opStream);
            ExternalReportCustom extService = new ExternalReportCustom();

            //            String XmlData = new String(opStream.toByteArray());
            //            System.out.println(XmlData);

            outputXml =
                    extService.generatePDFReport("/Custom/PAAS/PC Details Report.xdo",
                                                 "xlsx", opStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputXml;
    }

    /**
     * Container's getter for WorkDoneDetailsViewVO1.
     * @return WorkDoneDetailsViewVO1
     */
    public WorkDoneDetailsViewVOImpl getWorkDoneDetailsViewVO1() {
        return (WorkDoneDetailsViewVOImpl)findViewObject("WorkDoneDetailsViewVO1");
    }

    /**
     * Container's getter for WorkDoneLinesViewVO1.
     * @return WorkDoneLinesViewVO1
     */
    public WorkDoneLinesViewVOImpl getWorkDoneLinesViewVO1() {
        return (WorkDoneLinesViewVOImpl)findViewObject("WorkDoneLinesViewVO1");
    }

    /**
     * Container's getter for WorkDoneDetailsViewToLinesViewVL1.
     * @return WorkDoneDetailsViewToLinesViewVL1
     */
    public ViewLinkImpl getWorkDoneDetailsViewToLinesViewVL1() {
        return (ViewLinkImpl)findViewLink("WorkDoneDetailsViewToLinesViewVL1");
    }

    /**
     * Container's getter for BoqPcHdrViewVO1.
     * @return BoqPcHdrViewVO1
     */
    public BoqPcHdrViewVOImpl getBoqPcHdrViewVO1() {
        return (BoqPcHdrViewVOImpl)findViewObject("BoqPcHdrViewVO1");
    }

    /**
     * Container's getter for BoqPcLinesViewVO1.
     * @return BoqPcLinesViewVO1
     */
    public BoqPcLinesViewVOImpl getBoqPcLinesViewVO1() {
        return (BoqPcLinesViewVOImpl)findViewObject("BoqPcLinesViewVO1");
    }

    /**
     * Container's getter for BoqPcHdrviewToLinesViewVL1.
     * @return BoqPcHdrviewToLinesViewVL1
     */
    public ViewLinkImpl getBoqPcHdrviewToLinesViewVL1() {
        return (ViewLinkImpl)findViewLink("BoqPcHdrviewToLinesViewVL1");
    }

    /**
     * Container's getter for WorkDoneDetailsReportVO1.
     * @return WorkDoneDetailsReportVO1
     */
    public WorkDoneDetailsReportVOImpl getWorkDoneDetailsReportVO1() {
        return (WorkDoneDetailsReportVOImpl)findViewObject("WorkDoneDetailsReportVO1");
    }
}
