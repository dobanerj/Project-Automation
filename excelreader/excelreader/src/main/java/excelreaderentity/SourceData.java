package excelreaderentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SourceData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srNo;
	private long crewId;
	private String li_lr_id;
	private double ggid;
	private String resource_name;
	private String cap_email_id;
	private String vg_email;
	private String cg_manager;
	private String vg_manager;
	private String level;
	private String grade_revised;
	private String local_grade;
	private String region;
	private String region_revised;
	private String gad_cost_center;
	private String project_code;
	private String project_name;
	private String job_title;
	private String skill;
	private String practice;
	private String sub_practice;
	private String po;
	private String sow_name;
	private String sow_id;
	private String sow_start_date;
	private String sow_end_date;
	private String exhibit_type;
	private String resource_type;
	private String hours;
	private String hourly_rate;
	private String amount;
	private String role_start_date;
	private String role_end_date;
	private String location;
	private String location_vg;
	private String total_contract_amount;
	private String payment_type;
	private String comments;
	private String sbu;
	private String fs_non_fs_subk;
	private String bu_portfolios;
	private String lob;
	private String de;
	private String em;
	private String current_status;
	private String end_date;
	private String hard_token_id;
	private String desk_location;
	private String thin_client_id;
	private String card_no;
	private String odc_access;
	private String laptop_surrendered;
	private String awb_no;
	private String courier_delivery_partner;
	private String delivered_on;
	private String roll_off;
	public SourceData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SourceData(int srNo, long crewId, String li_lr_id, double ggid, String resource_name, String cap_email_id,
			String vg_email, String cg_manager, String vg_manager, String level, String grade_revised,
			String local_grade, String region, String region_revised, String gad_cost_center, String project_code,
			String project_name, String job_title, String skill, String practice, String sub_practice, String po,
			String sow_name, String sow_id, String sow_start_date, String sow_end_date, String exhibit_type,
			String resource_type, String hours, String hourly_rate, String amount, String role_start_date,
			String role_end_date, String location, String location_vg, String total_contract_amount,
			String payment_type, String comments, String sbu, String fs_non_fs_subk, String bu_portfolios, String lob,
			String de, String em, String current_status, String end_date, String hard_token_id, String desk_location,
			String thin_client_id, String card_no, String odc_access, String laptop_surrendered, String awb_no,
			String courier_delivery_partner, String delivered_on, String roll_off) {
		super();
		this.srNo = srNo;
		this.crewId = crewId;
		this.li_lr_id = li_lr_id;
		this.ggid = ggid;
		this.resource_name = resource_name;
		this.cap_email_id = cap_email_id;
		this.vg_email = vg_email;
		this.cg_manager = cg_manager;
		this.vg_manager = vg_manager;
		this.level = level;
		this.grade_revised = grade_revised;
		this.local_grade = local_grade;
		this.region = region;
		this.region_revised = region_revised;
		this.gad_cost_center = gad_cost_center;
		this.project_code = project_code;
		this.project_name = project_name;
		this.job_title = job_title;
		this.skill = skill;
		this.practice = practice;
		this.sub_practice = sub_practice;
		this.po = po;
		this.sow_name = sow_name;
		this.sow_id = sow_id;
		this.sow_start_date = sow_start_date;
		this.sow_end_date = sow_end_date;
		this.exhibit_type = exhibit_type;
		this.resource_type = resource_type;
		this.hours = hours;
		this.hourly_rate = hourly_rate;
		this.amount = amount;
		this.role_start_date = role_start_date;
		this.role_end_date = role_end_date;
		this.location = location;
		this.location_vg = location_vg;
		this.total_contract_amount = total_contract_amount;
		this.payment_type = payment_type;
		this.comments = comments;
		this.sbu = sbu;
		this.fs_non_fs_subk = fs_non_fs_subk;
		this.bu_portfolios = bu_portfolios;
		this.lob = lob;
		this.de = de;
		this.em = em;
		this.current_status = current_status;
		this.end_date = end_date;
		this.hard_token_id = hard_token_id;
		this.desk_location = desk_location;
		this.thin_client_id = thin_client_id;
		this.card_no = card_no;
		this.odc_access = odc_access;
		this.laptop_surrendered = laptop_surrendered;
		this.awb_no = awb_no;
		this.courier_delivery_partner = courier_delivery_partner;
		this.delivered_on = delivered_on;
		this.roll_off = roll_off;
	}
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public long getCrewId() {
		return crewId;
	}
	public void setCrewId(long crewId) {
		this.crewId = crewId;
	}
	public String getLi_lr_id() {
		return li_lr_id;
	}
	public void setLi_lr_id(String li_lr_id) {
		this.li_lr_id = li_lr_id;
	}
	public double getGgid() {
		return ggid;
	}
	public void setGgid(double ggid) {
		this.ggid = ggid;
	}
	public String getResource_name() {
		return resource_name;
	}
	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}
	public String getCap_email_id() {
		return cap_email_id;
	}
	public void setCap_email_id(String cap_email_id) {
		this.cap_email_id = cap_email_id;
	}
	public String getVg_email() {
		return vg_email;
	}
	public void setVg_email(String vg_email) {
		this.vg_email = vg_email;
	}
	public String getCg_manager() {
		return cg_manager;
	}
	public void setCg_manager(String cg_manager) {
		this.cg_manager = cg_manager;
	}
	public String getVg_manager() {
		return vg_manager;
	}
	public void setVg_manager(String vg_manager) {
		this.vg_manager = vg_manager;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getGrade_revised() {
		return grade_revised;
	}
	public void setGrade_revised(String grade_revised) {
		this.grade_revised = grade_revised;
	}
	public String getLocal_grade() {
		return local_grade;
	}
	public void setLocal_grade(String local_grade) {
		this.local_grade = local_grade;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion_revised() {
		return region_revised;
	}
	public void setRegion_revised(String region_revised) {
		this.region_revised = region_revised;
	}
	public String getGad_cost_center() {
		return gad_cost_center;
	}
	public void setGad_cost_center(String gad_cost_center) {
		this.gad_cost_center = gad_cost_center;
	}
	public String getProject_code() {
		return project_code;
	}
	public void setProject_code(String project_code) {
		this.project_code = project_code;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getPractice() {
		return practice;
	}
	public void setPractice(String practice) {
		this.practice = practice;
	}
	public String getSub_practice() {
		return sub_practice;
	}
	public void setSub_practice(String sub_practice) {
		this.sub_practice = sub_practice;
	}
	public String getPo() {
		return po;
	}
	public void setPo(String po) {
		this.po = po;
	}
	public String getSow_name() {
		return sow_name;
	}
	public void setSow_name(String sow_name) {
		this.sow_name = sow_name;
	}
	public String getSow_id() {
		return sow_id;
	}
	public void setSow_id(String sow_id) {
		this.sow_id = sow_id;
	}
	public String getSow_start_date() {
		return sow_start_date;
	}
	public void setSow_start_date(String sow_start_date) {
		this.sow_start_date = sow_start_date;
	}
	public String getSow_end_date() {
		return sow_end_date;
	}
	public void setSow_end_date(String sow_end_date) {
		this.sow_end_date = sow_end_date;
	}
	public String getExhibit_type() {
		return exhibit_type;
	}
	public void setExhibit_type(String exhibit_type) {
		this.exhibit_type = exhibit_type;
	}
	public String getResource_type() {
		return resource_type;
	}
	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getHourly_rate() {
		return hourly_rate;
	}
	public void setHourly_rate(String hourly_rate) {
		this.hourly_rate = hourly_rate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRole_start_date() {
		return role_start_date;
	}
	public void setRole_start_date(String role_start_date) {
		this.role_start_date = role_start_date;
	}
	public String getRole_end_date() {
		return role_end_date;
	}
	public void setRole_end_date(String role_end_date) {
		this.role_end_date = role_end_date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation_vg() {
		return location_vg;
	}
	public void setLocation_vg(String location_vg) {
		this.location_vg = location_vg;
	}
	public String getTotal_contract_amount() {
		return total_contract_amount;
	}
	public void setTotal_contract_amount(String total_contract_amount) {
		this.total_contract_amount = total_contract_amount;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSbu() {
		return sbu;
	}
	public void setSbu(String sbu) {
		this.sbu = sbu;
	}
	public String getFs_non_fs_subk() {
		return fs_non_fs_subk;
	}
	public void setFs_non_fs_subk(String fs_non_fs_subk) {
		this.fs_non_fs_subk = fs_non_fs_subk;
	}
	public String getBu_portfolios() {
		return bu_portfolios;
	}
	public void setBu_portfolios(String bu_portfolios) {
		this.bu_portfolios = bu_portfolios;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	public String getEm() {
		return em;
	}
	public void setEm(String em) {
		this.em = em;
	}
	public String getCurrent_status() {
		return current_status;
	}
	public void setCurrent_status(String current_status) {
		this.current_status = current_status;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getHard_token_id() {
		return hard_token_id;
	}
	public void setHard_token_id(String hard_token_id) {
		this.hard_token_id = hard_token_id;
	}
	public String getDesk_location() {
		return desk_location;
	}
	public void setDesk_location(String desk_location) {
		this.desk_location = desk_location;
	}
	public String getThin_client_id() {
		return thin_client_id;
	}
	public void setThin_client_id(String thin_client_id) {
		this.thin_client_id = thin_client_id;
	}
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	public String getOdc_access() {
		return odc_access;
	}
	public void setOdc_access(String odc_access) {
		this.odc_access = odc_access;
	}
	public String getLaptop_surrendered() {
		return laptop_surrendered;
	}
	public void setLaptop_surrendered(String laptop_surrendered) {
		this.laptop_surrendered = laptop_surrendered;
	}
	public String getAwb_no() {
		return awb_no;
	}
	public void setAwb_no(String awb_no) {
		this.awb_no = awb_no;
	}
	public String getCourier_delivery_partner() {
		return courier_delivery_partner;
	}
	public void setCourier_delivery_partner(String courier_delivery_partner) {
		this.courier_delivery_partner = courier_delivery_partner;
	}
	public String getDelivered_on() {
		return delivered_on;
	}
	public void setDelivered_on(String delivered_on) {
		this.delivered_on = delivered_on;
	}
	public String getRoll_off() {
		return roll_off;
	}
	public void setRoll_off(String roll_off) {
		this.roll_off = roll_off;
	}	
	
}
