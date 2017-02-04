package action;

import com.opensymphony.xwork2.Action;

import bean.Product;

public class ProductsAction implements Action {


	private Product product1;
	private Product product2;
	

	public Product getProduct1() {
		return product1;
	}


	public void setProduct1(Product product1) {
		this.product1 = product1;
	}


	public Product getProduct2() {
		return product2;
	}


	public void setProduct2(Product product2) {
		this.product2 = product2;
	}


	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
