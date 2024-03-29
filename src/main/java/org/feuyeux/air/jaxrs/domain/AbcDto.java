package org.feuyeux.air.jaxrs.domain;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Transferring Bean
 * 
 * @author feuyeux@gmail.com
 * 05/08/2012
 * @version 0.1.0
 * @since 0.0.1
 */
@XmlRootElement(name = "abc")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class AbcDto {
	private Integer id;
	private String name;
	private String value;

	public AbcDto() {

	}

	public AbcDto(Integer id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	@XmlAttribute
	public Integer getId() {
		return id;
	}

	// @XmlElement(name="id")
	// public Integer getId1() {
	// return id;
	// }

	@XmlAttribute
	public String getName() {
		return name;
	}

	@XmlAttribute
	public String getValue() {
		return value;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		final StringBuilder buffer = new StringBuilder();
		buffer.append(this.getClass().getName());
		buffer.append("[").append("id= ").append(id);
		buffer.append(", name= ").append(name);
		buffer.append(", value= ").append(value);
		buffer.append(" ]");
		return buffer.toString();
	}
}