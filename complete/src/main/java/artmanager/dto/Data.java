package artmanager.dto;

import artmanager.entity.User;

public class Data {
	private Long companyid;
	private String businessname;//razon social
	private String cuit;//cuit
	private String contractnumber;//contrato, 
	private String activity;//actividad
	private String ciiu;//ciiu
	
	private Long establishmentid;
	private String name;
	private String number;
	private Address address;	
	private String codeafip;
	//opcionales mail y telefono como referencia 
	private String phone;
	private String email;
	
	private User user;
	
	Data(){}
	public Data(Establishment establishment){
		this.setCompanyid(establishment.getCompany().getId());
		this.setBusinessname(establishment.getCompany().getBusinessname());
		this.setCuit(establishment.getCompany().getCuit());
		this.setActivity(establishment.getCompany().getActivity());
		this.setCiiu(establishment.getCompany().getCiiu());
		this.setContractnumber(establishment.getCompany().getContractnumber());
		
		if(establishment.getId()!=null)this.setEstablishmentid(establishment.getId());
		if(establishment.getName()!=null)this.setName(establishment.getName());
		if(establishment.getNumber()!=null)this.setNumber(establishment.getNumber());
		if(establishment.getCodeafip()!=null)this.setCodeafip(establishment.getCodeafip());
		if(establishment.getPhone()!=null)this.setPhone(establishment.getPhone());
		if(establishment.getEmail()!=null)this.setEmail(establishment.getEmail());
		
		
		Address address = new Address();
		this.setAddress(address);
		if(establishment.getAddress()!=null){
			if(establishment.getAddress().getNumber()!=null)this.getAddress().setNumber(establishment.getAddress().getNumber());
			if(establishment.getAddress().getStreet()!=null)this.getAddress().setStreet(establishment.getAddress().getStreet());
			if(establishment.getAddress().getFloor()!=null)this.getAddress().setFloor(establishment.getAddress().getFloor());
			if(establishment.getAddress().getOffice()!=null)this.getAddress().setOffice(establishment.getAddress().getOffice());
			
			if(establishment.getAddress().getZipcode()!=null)this.getAddress().setZipcode(establishment.getAddress().getZipcode());
			if(establishment.getAddress().getCity()!=null)this.getAddress().setCity(establishment.getAddress().getCity());
			if(establishment.getAddress().getProvince()!=null)this.getAddress().setProvince(establishment.getAddress().getProvince());
		}
		
		User user = new User();
		this.setUser(user);
		if(establishment.getUser()!=null && establishment.getUser().getId()!=null)this.getUser().setId(establishment.getUser().getId());
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCodeafip() {
		return codeafip;
	}

	public void setCodeafip(String codeafip) {
		this.codeafip = codeafip;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public Long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	public Long getEstablishmentid() {
		return establishmentid;
	}
	public void setEstablishmentid(Long establishmentid) {
		this.establishmentid = establishmentid;
	}

}
