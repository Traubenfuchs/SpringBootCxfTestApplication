package at.loup.cxftest.xml.types;

import javax.xml.bind.annotation.XmlElement;

public class HelloRequestXml {

	private String name;

	@XmlElement(required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}