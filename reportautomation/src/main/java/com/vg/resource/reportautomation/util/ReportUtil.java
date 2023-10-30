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

     public final String HC_REPORT_GENERATE_LOCATION= "C:/Users/dobanerj/Document/Report/HCReport.xlsx";   
     
     public final String HC_REPORT_SR_NO= "SR.No"; 
     public final String HC_REPORT_CREW_ID= "CREWId";  
     public final String HC_REPORT_LI_LR_ID= "LI/LRID"; 
     public final String HC_REPORT_GG_ID= "GGID"; 
     public final String HC_REPORT_RESOURCE_NAME= "RESOURCE NAME"; 
     public final String HC_REPORT_CAP_EMAIL_ID= "CAPEMAIL ID"; 
     public final String HC_REPORT_VG_EMAIL= "VG EMAIL"; 
     public final String HC_REPORT_CG_MANAGER= "CG MANAGER"; 
     public final String HC_REPORT_VG_MANAGER= "VG MANAGER"; 
     public final String HC_REPORT_LEVEL= "LEVEL"; 
     public final String HC_REPORT_GRADE_REVISED= "GRADE REVISED"; 
     public final String HC_REPORT_LOCAL_GRADE= "LOCAL GRADE"; 
     public final String HC_REPORT_REGION= "REGION"; 
     public final String HC_REPORT_REGION_REVISED= "REGION REVISED"; 
     public final String HC_REPORT_GAD_COST_CENTER= "COST CENTER"; 
     public final String HC_REPORT_PROJECT_CODE= "PROJECT CODE"; 
     public final String HC_REPORT_PROJECT_NAME= "PROJECT NAME"; 
     public final String HC_REPORT_JOB_ROLE= "JOB ROLE"; 
     public final String HC_REPORT_SKILL= "SKILL"; 
     public final String HC_REPORT_PRACTICE= "PRACTICE"; 
     public final String HC_REPORT_SUB_PRACTICE= "SUB PRACTICE";
     public final String HC_REPORT_PO= "PO"; 
     public final String HC_REPORT_SOW_NAME= "SOW NAME"; 
     public final String HC_REPORT_SOW_ID= "SOW ID"; 
     public final String HC_REPORT_SOW_START_DATE= "SOW START DATE"; 
     public final String HC_REPORT_SOW_END_DATE= "SOW END DATE"; 
     public final String HC_REPORT_EXHIBIT_TYPE= "EXHIBIT TYPE";
     public final String HC_REPORT_RESOURCE_TYPE= "RESOURCE TYPE";
     public final String HC_REPORT_HOURS= "HOURS";
     public final String HC_REPORT_HOURLY_RATE= "HOURLY RATE";
     public final String HC_REPORT_AMOUNT= "AMOUNT";
     public final String HC_REPORT_ROLE_START_DATE= "ROLE START DATE";
     public final String HC_REPORT_ROLE_END_DATE= "ROLE END DATE";
     public final String HC_REPORT_LOCATION= "LOCATION"; 
     public final String HC_REPORT_LOCATION_VG= "LOCATION VG"; 
     public final String HC_REPORT_TOTAL_CONTRACT_AMOUNT= "TOTAL CONTRACT AMOUNT";
     public final String HC_REPORT_PAYMENT_TYPE= "PAYMENT TYPE"; 
     public final String HC_REPORT_COMMENT= "COMMENT"; 
     public final String HC_REPORT_SBU= "SBU";
     public final String HC_REPORT_LOB= "LOB"; 
     public final String HC_REPORT_DE= "DE";
     public final String HC_REPORT_EM= "EM"; 
     public final String HC_REPORT_CURRENT_STATUS= "CURRENT STATUS"; 
     public final String HC_REPORT_BU_PORTFOLIOS= "BU PORTFOLIOS"; 
     public final String HC_REPORT_END_DATE_R2D2= "END DATE R2D2"; 
     
} 
