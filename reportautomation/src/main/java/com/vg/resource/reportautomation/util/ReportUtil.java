package com.vg.resource.reportautomation.util;

public interface ReportUtil {
    public final String query="select vg_gad_excel.li_lr_id," + 
            "vg_gad_excel.per_nr, vg_gad_excel.local_grade,vg_gad_excel.region,"+
            "vg_gad_excel.project_name, vg_gad_excel.practice, vg_gad_excel.sub_practice, "+
           " vg_gad_excel.bu_portfolios, vg_sourcing.ggid, vg_sourcing.amount, vg_sourcing.comment, "+
           " vg_sourcing.hourly_rate, vg_sourcing.hours, vg_sourcing.job_role, vg_sourcing.level, "+
            "vg_sourcing.po, vg_sourcing.primaryskill, vg_sourcing.resource_name, "+
            "vg_sourcing.role_end_date, vg_sourcing.role_start_date, vg_sourcing.sow_id, "+
            "vg_sourcing.status, vg_sourcing.total_contract_amount, "+
            "vg_sourcing.vgcrew_id from vg_sourcing "+
            "inner join vg_gad_excel on vg_sourcing.ggid=vg_gad_excel.ggid";

     public final String HC_REPORT_LOCATION= "C:/Report/HCReport.xlsx ";    
     public final String HC_REPORT_SR_NO= "SR.No"; 
      public final String HC_REPORT_CREW_ID= "CREWId";     
} 
