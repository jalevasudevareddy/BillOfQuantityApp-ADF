package model.progview;


import java.sql.ResultSet;

import java.util.List;

import model.services.ARTransactionTypeAttributes;

import model.services.ExternalReportCustom;

import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 28 16:43:58 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ARTrxnTypeVOImpl extends ViewObjectImpl {
    
    
    private List<ARTransactionTypeAttributes> rowData = null;
    long rows = -1;
    int ROWS_PER_PAGE = 10;
    private ExternalReportCustom externalReportCustom;   
    
    
    /**
     * This is the default constructor (do not remove).
     */
    public ARTrxnTypeVOImpl() {
        externalReportCustom = new ExternalReportCustom();
    }

     public void initVOForDataCollection() {
            try {
                initVO();
                if (rowData != null) {
                     rows = -1;
                   } else {
                     rows = 0;
                   }
            } catch (Exception e) {
                e.printStackTrace();
            }
     }
     private int getFetchPos(Object rowset) {
     int value = ((Integer)getUserDataForCollection(rowset)).intValue();
     return value;
     }
     
     private void setFetchPos(Object rowset, int pos) {
      if (pos == rows) {
        setFetchCompleteForCollection(rowset, true);
      }
      setUserDataForCollection(rowset, new Integer(pos));
     }
     
     
     protected void executeQueryForCollection(Object qc, Object[] params,
                                             int noUserParams) {
        try{
         
            if(params!=null) {
                Object[] o1=(Object[])params[0];
                Object orgId=o1[1];
                        if(orgId!=null) {
                            setp_org_id(Long.parseLong(orgId.toString()));
                            initVOForDataCollection();
                        }
                  
                    if(rowData!=null){
                        setFetchPos(qc, 0);
                       super.executeQueryForCollection(qc, params, noUserParams);
                    }
                }
                else{
                    setFetchCompleteForCollection(qc,true);
                }
            
        }
        catch(Exception e) {
            System.err.println("ERROR MESSAGE FROM ARTRXTYPE  LOV---->"+e.getMessage());
        }
     }

     /**
     * hasNextForCollection - overridden for custom java data source support.
     */
     protected boolean hasNextForCollection(Object qc) {
        if(getFetchPos(qc) >=rowData.size()){
            setFetchCompleteForCollection(qc,true);
        }
        return true;
     }

    /**
     * createRowFromResultSet - overridden for custom java data source support.
     */
     protected ViewRowImpl createRowFromResultSet(Object qc,
                                                  ResultSet resultSet) {
         ViewRowImpl r=createNewRowForCollection(qc);
         int pos = getFetchPos(qc);
         if (pos == -1) {
              pos = 0;
            }
         int Rowsize=rowData.size();
         if(pos<=Rowsize-1){
             populateAttributeForRow(r, 0,rowData.get(pos).getTrxnTypeId());
             populateAttributeForRow(r, 1, rowData.get(pos).getTrxnTypeName());
             populateAttributeForRow(r, 2, rowData.get(pos).getDesc());
             populateAttributeForRow(r, 3, rowData.get(pos).getCmTrxName());
             setFetchPos(qc, pos + 1);
         }
         return r;
     }

     private void initVO() throws Exception{
         java.util.List<ARTransactionTypeAttributes> RowDataCollection =externalReportCustom.findARTransactionTypeReport(getp_org_id());
         if(RowDataCollection!=null && RowDataCollection.size()>0)
                     rowData = RowDataCollection;
     }

    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        long value = super.getQueryHitCount(viewRowSet);
        return value;
    }

    /**
     * Returns the bind variable value for p_org_id.
     * @return bind variable value for p_org_id
     */
    public Long getp_org_id() {
        return (Long)getNamedWhereClauseParam("p_org_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_org_id.
     * @param value value to bind as p_org_id
     */
    public void setp_org_id(Long value) {
        setNamedWhereClauseParam("p_org_id", value);
    }
}