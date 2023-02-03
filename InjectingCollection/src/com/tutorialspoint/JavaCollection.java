package com.tutorialspoint;
import java.util.*;

public class JavaCollection {
	
	private BeanReference BeanReferenceObj; 
	private Set addressSet;
	private Map addressMap;	
	private Properties addressProps;
		
	public BeanReference getBeanReferenceObj() {
		System.out.println("Reference List : "+BeanReferenceObj.getAddressList());
		return BeanReferenceObj;
	}
	public void setBeanReferenceObj(BeanReference beanReferenceObj) {
		BeanReferenceObj = beanReferenceObj;
	}
	public Set getAddressSet() {
		System.out.println("Set : "+addressSet);
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		System.out.println("Maps : "+addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProps() {
		System.out.println("Props : "+addressProps);
		return addressProps;
	}
	public void setAddressProps(Properties addressProps) {
		this.addressProps = addressProps;
	}
	
	

}
