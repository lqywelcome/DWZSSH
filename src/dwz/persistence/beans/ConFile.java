package dwz.persistence.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ConFile generated by MyEclipse Persistence Tools
 */

public class ConFile implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -6981145032527275806L;
	private String				id;
	private ConFolder			conFolder;
	private String				userId;
	private String				name;
	private String				ext;
	private String				path;
	private Integer				size				= 0;
	private Integer				resize				= 0;
	private Date				insertDate;
	private Date				updateDate;


	// Constructors

	/** default constructor */
	public ConFile() {
	}

	/** minimal constructor */
	public ConFile(String name, String path, Date insertDate, Date updateDate) {
		this.name = name;
		this.path = path;
		this.insertDate = insertDate;
		this.updateDate = updateDate;
	}

	/** full constructor */
	public ConFile(ConFolder conFolder, String userId, String name, String ext,
			String path, Integer size, Integer resize, Date insertDate,
			Date updateDate) {
		this.userId = userId;
		this.conFolder = conFolder;
		this.name = name;
		this.ext = ext;
		this.path = path;
		this.size = size;
		this.resize = resize;
		this.insertDate = insertDate;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
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

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public Integer getResize() {
		return resize;
	}

	public void setResize(Integer resize) {
		this.resize = resize;
	}

	public ConFolder getConFolder() {
		return conFolder;
	}

	public void setConFolder(ConFolder conFolder) {
		this.conFolder = conFolder;
	}


}