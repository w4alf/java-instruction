package business;

public class Request {

	private int requestId;			
	private int userId; 				
	private String description; 			
	private String justification;       	
	private String dateNeeded;        		
	private String deliveryMode; 			
	private String status; 					
	private String total; 					 
	private String submittedDate; 		
	private String reasonForRejection;
	
	public Request() {
		super();

	}

	public Request(int requestId, int userId, String description, String justification, String dateNeeded,
			String deliveryMode, String status, String total, String submittedDate, String reasonForRejection) {
		super();
		this.requestId = requestId;
		this.userId = userId;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
	}

	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the justification
	 */
	public String getJustification() {
		return justification;
	}

	/**
	 * @param justification the justification to set
	 */
	public void setJustification(String justification) {
		this.justification = justification;
	}

	/**
	 * @return the dateNeeded
	 */
	public String getDateNeeded() {
		return dateNeeded;
	}

	/**
	 * @param dateNeeded the dateNeeded to set
	 */
	public void setDateNeeded(String dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	/**
	 * @return the deliveryMode
	 */
	public String getDeliveryMode() {
		return deliveryMode;
	}

	/**
	 * @param deliveryMode the deliveryMode to set
	 */
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	/**
	 * @return the submittedDate
	 */
	public String getSubmittedDate() {
		return submittedDate;
	}

	/**
	 * @param submittedDate the submittedDate to set
	 */
	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
	}

	/**
	 * @return the reasonForRejection
	 */
	public String getReasonForRejection() {
		return reasonForRejection;
	}

	/**
	 * @param reasonForRejection the reasonForRejection to set
	 */
	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	@Override
	public String toString() {
		return "Request [requestId=" + requestId + ", userId=" + userId + ", description=" + description
				+ ", justification=" + justification + ", dateNeeded=" + dateNeeded + ", deliveryMode=" + deliveryMode
				+ ", status=" + status + ", total=" + total + ", submittedDate=" + submittedDate
				+ ", reasonForRejection=" + reasonForRejection + "]";
	}		
	
	
}
