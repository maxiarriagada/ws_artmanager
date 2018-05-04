package artmanager.dto;

import org.springframework.beans.factory.annotation.Autowired;

import artmanager.dto.Company;
import artmanager.entity.User;

public class Establishment {
	
	private Long id;
	@Autowired
	private String name;
	private String number;
	private Address address;	
	private String codeafip;
	//opcionales mail y telefono como referencia 
	private String phone;
	private String email;
	private Company company;
	private User user;
	
	public Establishment(){
		Address address = new Address();
		this.setAddress(address);
	}
	

	public Establishment (artmanager.entity.Establishment establishment){
		if(establishment.getId()!=null)this.setId(establishment.getId());
		if(establishment.getName()!=null)this.setName(establishment.getName());
		if(establishment.getNumber()!=null)this.setNumber(establishment.getNumber());
		if(establishment.getCodeafip()!=null)this.setCodeafip(establishment.getCodeafip());
		if(establishment.getPhone()!=null)this.setPhone(establishment.getPhone());
		if(establishment.getEmail()!=null)this.setEmail(establishment.getEmail());
		
		
		Address address = new Address();
		this.setAddress(address);
		if(establishment.getAddress()!=null){
			if(establishment.getAddress().getAddressnumber()!=null)this.getAddress().setNumber(establishment.getAddress().getAddressnumber());
			if(establishment.getAddress().getAddressstreet()!=null)this.getAddress().setStreet(establishment.getAddress().getAddressstreet());
			if(establishment.getAddress().getAddressfloor()!=null)this.getAddress().setFloor(establishment.getAddress().getAddressfloor());
			if(establishment.getAddress().getAddressoffice()!=null)this.getAddress().setOffice(establishment.getAddress().getAddressoffice());
			
			if(establishment.getAddress().getAddresszipcode()!=null)this.getAddress().setZipcode(establishment.getAddress().getAddresszipcode());
			if(establishment.getAddress().getAddresscity()!=null)this.getAddress().setCity(establishment.getAddress().getAddresscity());
			if(establishment.getAddress().getAddressprovince()!=null)this.getAddress().setProvince(establishment.getAddress().getAddressprovince());
		}
		
	
		Company company = new Company(establishment.getCompany());
		this.setCompany(company);
		
		User user = new User();
		this.setUser(user);
		if(establishment.getUser()!=null && establishment.getUser().getId()!=null)this.getUser().setId(establishment.getUser().getId());
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	

}
