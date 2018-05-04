package artmanager.dto;

public class Address {
	
	private String street;
	private String number;
	private String floor;
	private String office;
	private String city;
	private String province;
	private String zipcode;
	
	public Address(){}
	
	public Address(artmanager.entity.Address address){
		if(address!=null){
			if(address.getAddressnumber()!=null)this.setNumber(address.getAddressnumber());
			if(address.getAddressstreet()!=null)this.setStreet(address.getAddressstreet());
			if(address.getAddressfloor()!=null)this.setFloor(address.getAddressfloor());
			if(address.getAddressoffice()!=null)this.setOffice(address.getAddressoffice());
			if(address.getAddresszipcode()!=null)this.setZipcode(address.getAddresszipcode());
			if(address.getAddresscity()!=null)this.setCity(address.getAddresscity());
			if(address.getAddressprovince()!=null)this.setProvince(address.getAddressprovince());
		}
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
	

}
