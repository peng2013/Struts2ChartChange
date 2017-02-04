package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

public class TypeConversionAction implements Action {

	private String[] products=new String[3];
	private int[] numbers=new int[3];
	private List<Integer> collections;
	
	public String[] getProducts() {
		return products;
	}


	public void setProducts(String[] products) {
		this.products = products;
	}


	public int[] getNumbers() {
		return numbers;
	}


	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}


	public List<Integer> getCollections() {
		return collections;
	}


	public void setCollections(List<Integer> collections) {
		this.collections = collections;
	}



	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
