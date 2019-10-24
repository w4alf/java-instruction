package business;

public class LineItem {

	private int lineItemId;
	private int requestId;
	private int productId;
	private int quantity;
	
	public LineItem() {
		super();
		
	}

	public LineItem(int lineItemId, int requestId, int productId, int quantity) {
		super();
		this.lineItemId = lineItemId;
		this.requestId = requestId;
		this.productId = productId;
		this.quantity = quantity;
	}

	/**
	 * @return the lineItemId
	 */
	public int getLineItemId() {
		return lineItemId;
	}

	/**
	 * @param lineItemId the lineItemId to set
	 */
	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
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
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "lineItem [lineItemId=" + lineItemId + ", requestId=" + requestId + ", productId=" + productId
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
