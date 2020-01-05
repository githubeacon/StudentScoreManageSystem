package com.beacon.sms.bean;
/**
 * 
 * 作者:beacon
 * 创建日期:2017年10月30日上午10:12:51
 * 描述:地址实体类
 */
public class Address
{
	private String province;			//省份

	private String city;				//城市

	private String county;				//县

	private String detailedAddress;		//详细住址

	private String address;				//住址
	
	public String getAddress()
	{
		this.address=province+"省"+city+"市"+county+detailedAddress;
		
		return address;
	}

	@Override
	public String toString()
	{
		return "Address [province=" + province + ", city=" + city + ", county=" + county + ", detailedAddress="
				+ detailedAddress + ", address=" + address + "]";
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}
}
