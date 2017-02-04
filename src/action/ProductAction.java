package action;

import com.opensymphony.xwork2.Action;

import bean.Product;

public class ProductAction implements Action {

	private Product product;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(product.getName()+","+product.getPrice()+","+product.getCount());
		return SUCCESS;
	}

}
