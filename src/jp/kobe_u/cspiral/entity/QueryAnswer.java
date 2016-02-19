package jp.kobe_u.cspiral.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="answer")
public class QueryAnswer{

	private String userId;
	private String locationName;
	private String phonetic;
	private boolean isPass;

	@XmlElement(name="userId")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@XmlElement(name="locationName")
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@XmlElement(name="phonetic")
	public String getPhonetic() {
		return phonetic;
	}
	public void setPhonetic(String phonetic) {
		this.phonetic = phonetic;
	}

	@XmlElement(name="isPass")
	public boolean getIsPass() {
		return isPass;
	}

	public void setIsPass(boolean value) {
		this.isPass = value;
	}
}
