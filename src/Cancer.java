public class Cancer extends InsuranceProduct {

	private String cancerList;
	private String guaranteedType;
	private int limitAge;
	public CancerHistory m_CancerHistory;

	public Cancer(){

	}

	public String getCancerList() {
		return cancerList;
	}

	public void setCancerList(String cancerList) {
		this.cancerList = cancerList;
	}

	public String getGuaranteedType() {
		return guaranteedType;
	}

	public void setGuaranteedType(String guaranteedType) {
		this.guaranteedType = guaranteedType;
	}

	public int getLimitAge() {
		return limitAge;
	}

	public void setLimitAge(int limitAge) {
		this.limitAge = limitAge;
	}

	public CancerHistory getM_CancerHistory() {
		return m_CancerHistory;
	}

	public void setM_CancerHistory(CancerHistory m_CancerHistory) {
		this.m_CancerHistory = m_CancerHistory;
	}
	
	
}