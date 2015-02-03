package dwz.persistence.beans;

// Generated 2011-5-24 15:43:26 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * InvProduct generated by hbm2java
 */
public class InvProduct implements java.io.Serializable {

	private Integer id;
	private Integer brandId;
	private Integer categoryId;
	private String status;
	private String sku;
	private String name;
	private String shortDescription;
	private String longDescription;
	private String picUrl;
	private String metaTitle;
	private String metaKeyword;
	private String metaDescription;
	private BigDecimal regularPrice;
	private Integer quantity;
	private BigDecimal salesPrice;
	private Short showSalesPrice;
	private BigDecimal listPrice;
	private Short showListPrice;
	private Short showOnWeb;
	private Short callPricing;
	private String callPricingMessage;
	private BigDecimal cost;
	private Integer sellCount;
	private Integer hitCount;
	private String specUrl;
	private BigDecimal weight;
	private String weightUom;
	private Date insertDate;
	private Date updateDate;

	public InvProduct() {
	}

	public InvProduct(String sku) {
		this.sku = sku;
	}

	public InvProduct(Integer brandId, Integer categoryId, String status,
			String sku, String name, String shortDescription,
			String longDescription, String picUrl, String metaTitle,
			String metaKeyword, String metaDescription,
			BigDecimal regularPrice, Integer quantity, BigDecimal salesPrice,
			Short showSalesPrice, BigDecimal listPrice, Short showListPrice,
			Short showOnWeb, Short callPricing, String callPricingMessage,
			BigDecimal cost, Integer sellCount, Integer hitCount,
			String specUrl, BigDecimal weight, String weightUom,
			Date insertDate, Date updateDate) {
		this.brandId = brandId;
		this.categoryId = categoryId;
		this.status = status;
		this.sku = sku;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.picUrl = picUrl;
		this.metaTitle = metaTitle;
		this.metaKeyword = metaKeyword;
		this.metaDescription = metaDescription;
		this.regularPrice = regularPrice;
		this.quantity = quantity;
		this.salesPrice = salesPrice;
		this.showSalesPrice = showSalesPrice;
		this.listPrice = listPrice;
		this.showListPrice = showListPrice;
		this.showOnWeb = showOnWeb;
		this.callPricing = callPricing;
		this.callPricingMessage = callPricingMessage;
		this.cost = cost;
		this.sellCount = sellCount;
		this.hitCount = hitCount;
		this.specUrl = specUrl;
		this.weight = weight;
		this.weightUom = weightUom;
		this.insertDate = insertDate;
		this.updateDate = updateDate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getMetaTitle() {
		return this.metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getMetaKeyword() {
		return this.metaKeyword;
	}

	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public BigDecimal getRegularPrice() {
		return this.regularPrice;
	}

	public void setRegularPrice(BigDecimal regularPrice) {
		this.regularPrice = regularPrice;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSalesPrice() {
		return this.salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Short getShowSalesPrice() {
		return this.showSalesPrice;
	}

	public void setShowSalesPrice(Short showSalesPrice) {
		this.showSalesPrice = showSalesPrice;
	}

	public BigDecimal getListPrice() {
		return this.listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	public Short getShowListPrice() {
		return this.showListPrice;
	}

	public void setShowListPrice(Short showListPrice) {
		this.showListPrice = showListPrice;
	}

	public Short getShowOnWeb() {
		return this.showOnWeb;
	}

	public void setShowOnWeb(Short showOnWeb) {
		this.showOnWeb = showOnWeb;
	}

	public Short getCallPricing() {
		return this.callPricing;
	}

	public void setCallPricing(Short callPricing) {
		this.callPricing = callPricing;
	}

	public String getCallPricingMessage() {
		return this.callPricingMessage;
	}

	public void setCallPricingMessage(String callPricingMessage) {
		this.callPricingMessage = callPricingMessage;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Integer getSellCount() {
		return this.sellCount;
	}

	public void setSellCount(Integer sellCount) {
		this.sellCount = sellCount;
	}

	public Integer getHitCount() {
		return this.hitCount;
	}

	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}

	public String getSpecUrl() {
		return this.specUrl;
	}

	public void setSpecUrl(String specUrl) {
		this.specUrl = specUrl;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getWeightUom() {
		return this.weightUom;
	}

	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}

	public Date getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}