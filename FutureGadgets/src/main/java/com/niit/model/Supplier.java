package com.niit.model;
import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Supplier implements Serializable 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long supplierId;
	private String supplierName;
	private long supplierPhoneNo;
	private String supplierEmailId;
	private String productImageUrl;
	public Supplier() {
		// TODO Auto-generated constructor stub
	}
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public long getSupplierPhoneNo() {
		return supplierPhoneNo;
	}
	public void setSupplierPhoneNo(long supplierPhoneNo) {
		this.supplierPhoneNo = supplierPhoneNo;
	}
	public String getSupplierEmailId() {
		return supplierEmailId;
	}
	public void setSupplierEmailId(String supplierEmailId) {
		this.supplierEmailId = supplierEmailId;
	}
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	
	
}
