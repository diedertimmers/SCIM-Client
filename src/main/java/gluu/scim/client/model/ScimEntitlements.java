package gluu.scim.client.model;
/**
 * SCIM Entitlements 
 *
 * @author Reda Zerrad Date: 04.23.2012
 */
public class ScimEntitlements {

	private String value;
	
	public ScimEntitlements(){
		value = new String();
	}
	
	public String getValue(){
		return this.value;
	}
	
	public void setValue(String value){
		this.value = value;
	}
}
