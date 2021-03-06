package gluu.scim.client.model;


/**
 * SCIM Bulk responses
 *
 * @author Reda Zerrad Date: 04.19.2012
 */

public class BulkResponses  {
	       
	
	private String method;
	private String bulkId;
	private String version;
	private String location;
	private BulkResponseStatus status;
	
	public BulkResponses(){
		method = new String();
		bulkId = new String();
		version = new String();
		location = new String();
	    status = new BulkResponseStatus();
		
	}
	
	
	public String getMethod(){
		
		return this.method;
	}
	
	public void setMethod(String method){
		
		this.method = method;
	}
	
	
public String getBulkId(){
		
		return this.bulkId;
	}
	
	public void setBulkId(String bulkId){
		
		this.bulkId = bulkId;
	}
	
public String getVersion(){
		
		return this.version;
	}
	
	public void setVersion(String version){
		
		this.version = version;
	}
	

	
public String getLocation(){
		
		return this.location;
	}
	
	public void setLocation(String location){
		
		this.location = location;
	}
	
	
public BulkResponseStatus getStatus(){
		
		return this.status;
	}
	
	public void setStatus(BulkResponseStatus status){
		
		this.status = status;
	}

}
