package gluu.scim.client.model;

/**
* SCIM Group members
*
* @author Reda Zerrad Date: 05.03.2012
*/
public class ScimGroupMembers {
	
	private String value;
	private String display;
	
	public ScimGroupMembers(){
		
		value = new String();
		display = new String();
		
	}
	
	public String getValue(){
		return this.value;
	}
	
	public void setValue(String value){
		this.value = value;
	}
	
	public String getDisplay(){
		return this.display;
	}
	
	public void setDisplay(String display){
		this.display = display;
	}

}
