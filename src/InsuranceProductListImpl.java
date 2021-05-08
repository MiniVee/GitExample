import java.util.ArrayList;

public class InsuranceProductListImpl implements InsuranceProductsList {

	private ArrayList<InsuranceProduct> insuranceProductList;
	public InsuranceProduct m_InsuranceProduct;

	public InsuranceProductListImpl(){
		
	}

	public boolean add(InsuranceProduct insuranceProduct){
		return false;
	}
	
	public boolean delete(InsuranceProduct insuranceProduct){
		return false;
	}

	public InsuranceProduct search(InsuranceProduct insuranceProduct){
		return null;
	}

	public ArrayList<InsuranceProduct> getInsuranceProductList() {
		return insuranceProductList;
	}

	public void setInsuranceProductList(ArrayList<InsuranceProduct> insuranceProductList) {
		this.insuranceProductList = insuranceProductList;
	}

}