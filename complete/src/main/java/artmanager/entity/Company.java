package artmanager.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String businessname;
	@Column
	private String cuit;
	@Column
	private String contractnumber;//contrato,
	@Column
	private String activity;//actividad
	@Column
	private String ciiu;//ciiu
	@Embedded
	private Address address;
	
	/* @ManyToMany
	  @JoinTable(
	      name="COMPANY_USER",
	      joinColumns=@JoinColumn(name="COMPANY_ID", referencedColumnName="ID"),
	      inverseJoinColumns=@JoinColumn(name="USER_ID", referencedColumnName="ID"))*/
	 @ManyToMany
	  @JoinTable(
	      name="COMPANY_USER",
	      joinColumns=@JoinColumn(name="COMPANY_ID", referencedColumnName="ID"),
	      inverseJoinColumns=@JoinColumn(name="username", referencedColumnName="username"))
	private List<User> users;

	
	public Company(){
		Address address= new Address();
		this.setAddress(address);
	}
	
	public Company(artmanager.dto.Company company){
		this.setId(company.getId());
		this.setBusinessname(company.getBusinessname());
		this.setCuit(company.getCuit());
		this.setActivity(company.getActivity());
		this.setCiiu(company.getCiiu());
		this.setContractnumber(company.getContractnumber());
		
		Address address= new Address();
		this.setAddress(address);
		this.getAddress().setAddresscity(company.getAddress().getCity());
		this.getAddress().setAddressnumber(company.getAddress().getNumber());
		this.getAddress().setAddressstreet(company.getAddress().getStreet());
		this.getAddress().setAddresszipcode(company.getAddress().getZipcode());
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}


	
}
