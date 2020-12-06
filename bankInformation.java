package objectOriented.Banking;



public class bankInformation {
	
	private String CardVerificationValue;
	private int expirationDate;
	private int securityCode;
	private String cardHolder;
	
	

	//Creation
	public bankInformation (String cardverificationValue, int expirationDate, int securityCode, String cardHolder){
		this.CardVerificationValue = cardverificationValue;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
		this.cardHolder = cardHolder;
		}



	public String getCardverificationValue() {
		return CardVerificationValue;
	}



	public void setCardverificationValue(String cardverificationValue) {
		this.CardVerificationValue = cardverificationValue;
	}



	public int getExpirationDate() {
		return expirationDate;
	}



	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}



	public int getSecurityCode() {
		return securityCode;
	}



	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}



	public String getCardHolder() {
		return cardHolder;
	}



	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	
	public String toString() {
		return String.format("[Card Verification Value: %s] [Expiration Date: %d] [Security Code: %d] [Card Holder: %s]", CardVerificationValue, expirationDate, securityCode, cardHolder);
	}
	
}
