package artmanager.dto;

import java.util.ArrayList;
import java.util.List;

public class Visit {
	
	private Long id;
	//datos establecimiento
	private String establishmentname;
	private Long establishmentid;
	private String number;
	private String codeafip;
	private Address address;
	private String phone;
	private String email;
	//datos company
	private Long companyid;
	private String businessname;//razon social
	private String cuit;//cuit
	private String contractnumber;//contrato, 
	private String activity;//actividad
	private String ciiu;//ciiu
	
	private String date;
	private Boolean failedvisit;
	private String datepost;
	private String evidenceform;
	private List<Recommendation> recommendations;
	private String username;
	private String preventorname;
	private Long userid;
	
	
	public Visit(){
		List<Recommendation> list = new ArrayList<Recommendation>();
		this.setRecommendations(list);
		Address address = new Address();
		this.setAddress(address);
	}
	
	public Visit(artmanager.entity.Visit visit){
		if(visit.getId()!=null)this.setId(visit.getId());
		if(visit.getActivity()!=null)this.setActivity(visit.getActivity());
		if(visit.getAddress()!=null){
			artmanager.dto.Address address = new artmanager.dto.Address(visit.getAddress());
			this.setAddress(address);
		}
		
		if(visit.getBusinessname()!=null)this.setBusinessname(visit.getBusinessname());
		if(visit.getCiiu()!=null)this.setCiiu(visit.getCiiu());
		if(visit.getCodeafip()!=null)this.setCodeafip(visit.getCodeafip());
		if(visit.getCompanyid()!=null)this.setCompanyid(visit.getCompanyid());
		if(visit.getContractnumber()!=null)this.setContractnumber(visit.getContractnumber());
		if(visit.getCuit()!=null)this.setCuit(visit.getCuit());
		if(visit.getDate()!=null)this.setDate(visit.getDate());
		if(visit.getDatepost()!=null)this.setDatepost(visit.getDatepost());
		if(visit.getEmail()!=null)this.setEmail(visit.getEmail());
		if(visit.getEstablishmentid()!=null)this.setEstablishmentid(visit.getEstablishmentid());
		if(visit.getEstablishmentname()!=null)this.setEstablishmentname(visit.getEstablishmentname());
		if(visit.getEvidenceform()!=null)this.setEvidenceform(visit.getEvidenceform());
		if(visit.getFailedvisit()!=null)this.setFailedvisit(visit.getFailedvisit());
		if(visit.getNumber()!=null)this.setNumber(visit.getNumber());
		if(visit.getPhone()!=null)this.setPhone(visit.getPhone());
		List<Recommendation> list = new ArrayList<Recommendation>();
		/*this.setRecommendations(list);
		if(visit.getRecommendations()!=null){
			for (artmanager.entity.Recommendation recommendation : visit.getRecommendations()) {
				artmanager.dto.Recommendation r = new artmanager.dto.Recommendation(recommendation);
				this.getRecommendations().add(r);
			}
			
		}*/
		if(visit.getUsername()!=null)this.setUsername(visit.getUsername());
		if(visit.getPreventorname()!=null)this.setPreventorname(visit.getPreventorname());
		if(visit.getUserid()!=null)this.setUserid(visit.getUserid());
				
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEstablishmentname() {
		return establishmentname;
	}
	public void setEstablishmentname(String establishmentname) {
		this.establishmentname = establishmentname;
	}
	public Long getEstablishmentid() {
		return establishmentid;
	}
	public void setEstablishmentid(Long establishmentid) {
		this.establishmentid = establishmentid;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCodeafip() {
		return codeafip;
	}
	public void setCodeafip(String codeafip) {
		this.codeafip = codeafip;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	public String getBusinessname() {
		return businessname;
	}
	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getContractnumber() {
		return contractnumber;
	}
	public void setContractnumber(String contractnumber) {
		this.contractnumber = contractnumber;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getCiiu() {
		return ciiu;
	}
	public void setCiiu(String ciiu) {
		this.ciiu = ciiu;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Boolean getFailedvisit() {
		return failedvisit;
	}
	public void setFailedvisit(Boolean failedvisit) {
		this.failedvisit = failedvisit;
	}
	public String getDatepost() {
		return datepost;
	}
	public void setDatepost(String datepost) {
		this.datepost = datepost;
	}
	public String getEvidenceform() {
		return evidenceform;
	}
	public void setEvidenceform(String evidenceform) {
		this.evidenceform = evidenceform;
	}
	public List<Recommendation> getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(List<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getPreventorname() {
		return preventorname;
	}

	public void setPreventorname(String preventorname) {
		this.preventorname = preventorname;
	}
	

	
	

}
