package rohvi;

public class Member extends User{
	
	private int phoneNum; 
	private int date; 
	private boolean paidMember;
	private PromoGroup promoGroup; 
	private int promoCode;
	private int costOfPlan;
	private int startDate;
	private int endDate;
	private String membershipPlanMessage;
	private Employee rohviEmployee; 
	private int dateApproved;
	private boolean termsConditions;
	private String referralType;
	private String selfSegmentationField;
	private int numDuoReturns;
	private int numHoneyryderReturns;
	private int numVerdigrisReturns;
	private int duoSum;
	private String comments;
	private Plan membershipPlan;
	private String billingAddress;
	/**
	 * @return the phoneNum
	 */
	public int getPhoneNum() {
		return phoneNum;
	}
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}
	/**
	 * @return the paidMember
	 */
	public boolean isPaidMember() {
		return paidMember;
	}
	/**
	 * @param paidMember the paidMember to set
	 */
	public void setPaidMember(boolean paidMember) {
		this.paidMember = paidMember;
	}
	/**
	 * @return the promoGroup
	 */
	public PromoGroup getPromoGroup() {
		return promoGroup;
	}
	/**
	 * @param promoGroup the promoGroup to set
	 */
	public void setPromoGroup(PromoGroup promoGroup) {
		this.promoGroup = promoGroup;
	}
	/**
	 * @return the promoCode
	 */
	public int getPromoCode() {
		return promoCode;
	}
	/**
	 * @param promoCode the promoCode to set
	 */
	public void setPromoCode(int promoCode) {
		this.promoCode = promoCode;
	}
	/**
	 * @return the costOfPlan
	 */
	public int getCostOfPlan() {
		return costOfPlan;
	}
	/**
	 * @param costOfPlan the costOfPlan to set
	 */
	public void setCostOfPlan(int costOfPlan) {
		this.costOfPlan = costOfPlan;
	}
	/**
	 * @return the startDate
	 */
	public int getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public int getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the membershipPlanMessage
	 */
	public String getMembershipPlanMessage() {
		return membershipPlanMessage;
	}
	/**
	 * @param membershipPlanMessage the membershipPlanMessage to set
	 */
	public void setMembershipPlanMessage(String membershipPlanMessage) {
		this.membershipPlanMessage = membershipPlanMessage;
	}
	/**
	 * @return the rohviEmployee
	 */
	public Employee getRohviEmployee() {
		return rohviEmployee;
	}
	/**
	 * @param rohviEmployee the rohviEmployee to set
	 */
	public void setRohviEmployee(Employee rohviEmployee) {
		this.rohviEmployee = rohviEmployee;
	}
	/**
	 * @return the dateApproved
	 */
	public int getDateApproved() {
		return dateApproved;
	}
	/**
	 * @param dateApproved the dateApproved to set
	 */
	public void setDateApproved(int dateApproved) {
		this.dateApproved = dateApproved;
	}
	/**
	 * @return the termsConditions
	 */
	public boolean isTermsConditions() {
		return termsConditions;
	}
	/**
	 * @param termsConditions the termsConditions to set
	 */
	public void setTermsConditions(boolean termsConditions) {
		this.termsConditions = termsConditions;
	}
	/**
	 * @return the referralType
	 */
	public String getReferralType() {
		return referralType;
	}
	/**
	 * @param referralType the referralType to set
	 */
	public void setReferralType(String referralType) {
		this.referralType = referralType;
	}
	/**
	 * @return the selfSegmentationField
	 */
	public String getSelfSegmentationField() {
		return selfSegmentationField;
	}
	/**
	 * @param selfSegmentationField the selfSegmentationField to set
	 */
	public void setSelfSegmentationField(String selfSegmentationField) {
		this.selfSegmentationField = selfSegmentationField;
	}
	/**
	 * @return the numDuoReturns
	 */
	public int getNumDuoReturns() {
		return numDuoReturns;
	}
	/**
	 * @param numDuoReturns the numDuoReturns to set
	 */
	public void setNumDuoReturns(int numDuoReturns) {
		this.numDuoReturns = numDuoReturns;
	}
	/**
	 * @return the numHoneyryderReturns
	 */
	public int getNumHoneyryderReturns() {
		return numHoneyryderReturns;
	}
	/**
	 * @param numHoneyryderReturns the numHoneyryderReturns to set
	 */
	public void setNumHoneyryderReturns(int numHoneyryderReturns) {
		this.numHoneyryderReturns = numHoneyryderReturns;
	}
	/**
	 * @return the numVerdigrisReturns
	 */
	public int getNumVerdigrisReturns() {
		return numVerdigrisReturns;
	}
	/**
	 * @param numVerdigrisReturns the numVerdigrisReturns to set
	 */
	public void setNumVerdigrisReturns(int numVerdigrisReturns) {
		this.numVerdigrisReturns = numVerdigrisReturns;
	}
	/**
	 * @return the duoSum
	 */
	public int getDuoSum() {
		return duoSum;
	}
	/**
	 * @param duoSum the duoSum to set
	 */
	public void setDuoSum(int duoSum) {
		this.duoSum = duoSum;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the membershipPlan
	 */
	public Plan getMembershipPlan() {
		return membershipPlan;
	}
	/**
	 * @param membershipPlan the membershipPlan to set
	 */
	public void setMembershipPlan(Plan membershipPlan) {
		this.membershipPlan = membershipPlan;
	}
	/**
	 * @return the billingAddress
	 */
	public String getBillingAddress() {
		return billingAddress;
	}
	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	
}
