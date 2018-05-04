package artmanager.dto;

import java.util.List;

import artmanager.entity.Address;

public class Company {
	
	private Long id;
	private String businessname;//razon social
	private String cuit;//cuit
	private String contractnumber;//contrato, 
	private String activity;//actividad
	private String ciiu;//ciiu
	//opcional address 
	private artmanager.dto.Address address;
	private List<Establishment> establishmentList;
	
	
	public Company(){
		artmanager.dto.Address address = new artmanager.dto.Address();
		this.setAddress(address);
		
	}
	
	public Company(artmanager.entity.Company company){
		this.setId(company.getId());
		this.setBusinessname(company.getBusinessname());
		this.setCuit(company.getCuit());
		this.setActivity(company.getActivity());
		this.setCiiu(company.getCiiu());
		this.setContractnumber(company.getContractnumber());
		
		artmanager.dto.Address address= new artmanager.dto.Address();
		this.setAddress(address);
		if (company.getAddress()!=null){
			this.getAddress().setCity(company.getAddress().getAddresscity());
			this.getAddress().setNumber(company.getAddress().getAddressnumber());
			this.getAddress().setStreet(company.getAddress().getAddressstreet());
			this.getAddress().setZipcode(company.getAddress().getAddresszipcode());
		}
	
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


	

	public List<Establishment> getEstablishmentList() {
		return establishmentList;
	}


	public void setEstablishmentList(List<Establishment> establishmentList) {
		this.establishmentList = establishmentList;
	}

	public artmanager.dto.Address getAddress() {
		return address;
	}

	public void setAddress(artmanager.dto.Address address) {
		this.address = address;
	}

	
}
