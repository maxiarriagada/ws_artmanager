package artmanager.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import artmanager.entity.Company;
import artmanager.entity.Address;

@Entity
@Table(name="Establishment")
public class Establishment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private String number;
	@Embedded
	@Autowired
	private Address address;
	@Column
	private String codeafip;
	@Column
	private String phone;
	@Column
	private String email;
	@ManyToOne
    @JoinColumn(name = "company_id")
	private Company company;
	
	
	@ManyToOne
    @JoinColumn(name = "username", referencedColumnName="username")
	private User user;
	
	public Establishment(){
		Address address = new Address();
		this.setAddress(address);
	}
	
	public Establishment(artmanager.dto.Establishment establishment){
		if(establishment.getId()!=null)this.setId(establishment.getId());
		if(establishment.getName()!=null)this.setName(establishment.getName());
		if(establishment.getNumber()!=null)this.setNumber(establishment.getNumber());
		if(establishment.getCodeafip()!=null)this.setCodeafip(establishment.getCodeafip());
		if(establishment.getPhone()!=null)this.setPhone(establishment.getPhone());
		if(establishment.getEmail()!=null)this.setEmail(establishment.getEmail());
		
		Address address = new Address();
		this.setAddress(address);
		if(establishment.getAddress()!=null){
			if(establishment.getAddress().getNumber()!=null)this.getAddress().setAddressnumber(establishment.getAddress().getNumber());
			if(establishment.getAddress().getStreet()!=null)this.getAddress().setAddressstreet(establishment.getAddress().getStreet());
			if(establishment.getAddress().getZipcode()!=null)this.getAddress().setAddresszipcode(establishment.getAddress().getZipcode());
			if(establishment.getAddress().getCity()!=null)this.getAddress().setAddresscity(establishment.getAddress().getCity());
			if(establishment.getAddress().getProvince()!=null)this.getAddress().setAddressprovince(establishment.getAddress().getProvince());
		}
		
		Company company = new Company(establishment.getCompany());
		this.setCompany(company);
		
		User user = new User();
		this.setUser(user);
		if(establishment.getUser()!=null && establishment.getUser().getId()!=null)this.getUser().setId(establishment.getUser().getId());
		if(establishment.getUser()!=null && establishment.getUser().getUsername()!=null)this.getUser().setUsername(establishment.getUser().getUsername());
		
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
