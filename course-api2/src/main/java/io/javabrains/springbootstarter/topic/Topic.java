package io.javabrains.springbootstarter.topic;

public class Topic {

	public Topic() {

	}

	public Topic(String id, String name, String descriptions) {
		super();
		this.Id = id;
		this.name = name;
		this.descriptions = descriptions;
	}	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the descriptions
	 */
	public String getDescriptions() {
		return descriptions;
	}
	/**
	 * @param descriptions the descriptions to set
	 */
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	private String Id;
	private String name;
	private String descriptions;
}
