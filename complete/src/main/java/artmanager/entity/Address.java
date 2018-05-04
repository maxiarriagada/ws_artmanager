package artmanager.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String addressstreet;
	private String addressnumber;
	private String addressfloor;
	private String addressoffice;
	private String addresscity;
	private String addressprovince;
	private String addresszipcode;

	public Address() {
	}
	
	public Address(artmanager.dto.Address address){
		if(address!=null){
			if(address.getNumber()!=null)this.setAddressnumber(address.getNumber());
			if(address.getStreet()!=null)this.setAddressstreet(address.getStreet());
			if(address.getFloor()!=null)this.setAddressfloor(address.getFloor());
			if(address.getOffice()!=null)this.setAddressoffice(address.getOffice());
			if(address.getZipcode()!=null)this.setAddresszipcode(address.getZipcode());
			if(address.getCity()!=null)this.setAddresscity(address.getCity());
			if(address.getProvince()!=null)this.setAddressprovince(address.getProvince());
		}
	}
	
	public String getAddressstreet() {
		return addressstreet;
	}

	public void setAddressstreet(String addressstreet) {
		this.addressstreet = addressstreet;
	}

	public String getAddressnumber() {
		return addressnumber;
	}

	public void setAddressnumber(String addressnumber) {
		this.addressnumber = addressnumber;
	}

	public String getAddresscity() {
		return addresscity;
	}

	public void setAddresscity(String addresscity) {
		this.addresscity = addresscity;
	}

	public String getAddressprovince() {
		return addressprovince;
	}

	public void setAddressprovince(String addressprovince) {
		this.addressprovince = addressprovince;
	}

	public String getAddresszipcode() {
		return addresszipcode;
	}

	public void setAddresszipcode(String addresszipcode) {
		this.addresszipcode = addresszipcode;
	}

	public String getAddressfloor() {
		return addressfloor;
	}

	public void setAddressfloor(String addressfloor) {
		this.addressfloor = addressfloor;
	}

	public String getAddressoffice() {
		return addressoffice;
	}

	public void setAddressoffice(String addressoffice) {
		this.addressoffice = addressoffice;
	}


}
