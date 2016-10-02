package com.sample.productSampleApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Product.
 */

@Entity
@Table(name="PRODUCT")
public class Product extends BaseModel{
	
	/** The product id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private long productId;
	
	@Column(name ="product_name")
	/** The name. */
	private String name;
	
	@Column(name ="product_model_detail")
	/** The version. */
	private String modelInfo;
	
	@Column(name ="product_price")
	/** The price. */
	private String price;
	
	@Column(name ="product_description")
	/** The description. */
	private String description;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="category_id")
	/** The category. */
	private Category category;
	
	/** The is available. */
	@Column(name="is_available")
	private boolean isAvailable;
	
	/** The brand name. */
	@Column(name="brand_name")
	private String brandName;
	
	/** The size. */
	@Column(name="product_size")
	private String size;
	
    /** The quantity in single product unit. */
	@Column(name="quantity_in_product_unit")
    private String quantityInSingleProductUnit;
    
   
   /* @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name = "TABLENAME")
    @MapKeyColumn(name = "KEY")
    @Column(name = "VALUE")
    public Map<String, String> specificationAttributetMap ;*/

	/**
	 * Gets the product id.
	 *
	 * @return the product id
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * Sets the product id.
	 *
	 * @param productId the new product id
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		return modelInfo;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(String version) {
		this.modelInfo = version;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	public String getModelInfo() {
		return modelInfo;
	}

	public void setModelInfo(String modelInfo) {
		this.modelInfo = modelInfo;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	/**
	 * Gets the brand name.
	 *
	 * @return the brand name
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * Sets the brand name.
	 *
	 * @param brandName the new brand name
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * Gets the quantity in single product unit.
	 *
	 * @return the quantity in single product unit
	 */
	public String getQuantityInSingleProductUnit() {
		return quantityInSingleProductUnit;
	}

	/**
	 * Sets the quantity in single product unit.
	 *
	 * @param quantityInSingleProductUnit the new quantity in single product unit
	 */
	public void setQuantityInSingleProductUnit(String quantityInSingleProductUnit) {
		this.quantityInSingleProductUnit = quantityInSingleProductUnit;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name
				+ ", modelInfo=" + modelInfo + ", price=" + price
				+ ", description=" + description + ", category=" + category
				+ ", isAvailable=" + isAvailable + ", brandName=" + brandName
				+ ", size=" + size + ", quantityInSingleProductUnit="
				+ quantityInSingleProductUnit + "]";
	}


	    
   
}
