package cn.supreme.ws.cxf_rest.server;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author ASUS
 * XmlRootElement注解表示pojo类组装的格式xml/json
 */
@XmlRootElement(name="student")
public class Student {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	private String name;
	private Date birthday;
}
