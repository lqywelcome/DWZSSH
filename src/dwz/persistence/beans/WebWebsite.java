package dwz.persistence.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * WebWebsite generated by MyEclipse Persistence Tools
 */

public class WebWebsite implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -7618681407465297874L;
	private Integer id;
	private String title;
	private String metaKeywords;
	private String metaDescription;
	private String template;
	private String layout;
	private String theme;
	private String logo;
	private String areaHeader;
	private String areaSidebar;
	private String areaBanner;
	private String areaFooter;
	private String icp;

	private Set webPages = new HashSet(0);

	// Constructors

	/** default constructor */
	public WebWebsite() {
	}

	/** minimal constructor */
	public WebWebsite(String type, String title) {
		this.title = title;
	}

	/** full constructor */
	public WebWebsite(String title, String metaKeywords,
			String metaDescription, String template, String layout,
			String theme,String logo, String areaHeader,
			String areaSidebar, String areaBanner, String areaFooter, String icp,
			Set webPages) {

		this.title = title;
		this.metaKeywords = metaKeywords;
		this.metaDescription = metaDescription;
		this.template = template;
		this.layout = layout;
		this.theme = theme;
		
		this.logo = logo;
		this.areaHeader = areaHeader;
		this.areaSidebar = areaSidebar;
		this.areaBanner = areaBanner;
		this.areaFooter = areaFooter;
		this.icp = icp;
		this.webPages = webPages;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getLayout() {
		return this.layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Set getWebPages() {
		return this.webPages;
	}

	public void setWebPages(Set webPages) {
		this.webPages = webPages;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getAreaHeader() {
		return areaHeader;
	}

	public void setAreaHeader(String areaHeader) {
		this.areaHeader = areaHeader;
	}

	public String getAreaSidebar() {
		return areaSidebar;
	}

	public void setAreaSidebar(String areaSidebar) {
		this.areaSidebar = areaSidebar;
	}

	public String getAreaBanner() {
		return areaBanner;
	}

	public void setAreaBanner(String areaBanner) {
		this.areaBanner = areaBanner;
	}

	public String getAreaFooter() {
		return areaFooter;
	}

	public void setAreaFooter(String areaFooter) {
		this.areaFooter = areaFooter;
	}

	public String getIcp() {
		return icp;
	}

	public void setIcp(String icp) {
		this.icp = icp;
	}

}