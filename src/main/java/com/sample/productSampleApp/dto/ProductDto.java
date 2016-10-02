package com.sample.productSampleApp.dto;

public class ProductDto {

	private String inputId;
	private String productName;
	private String categryId;
	private String description;
	private String modelInfo;
	private String price;
	private String brandName;
	private boolean isAvaialble;

	public String getInputId() {
		return inputId;
	}

	public void setInputId(String inputId) {
		this.inputId = inputId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategryId() {
		return categryId;
	}

	public void setCategryId(String categryId) {
		this.categryId = categryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModelInfo() {
		return modelInfo;
	}

	public void setModelInfo(String modelInfo) {
		this.modelInfo = modelInfo;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public boolean isAvaialble() {
		return isAvaialble;
	}

	public void setAvaialble(boolean isAvaialble) {
		this.isAvaialble = isAvaialble;
	}

}
