package action;

import com.opensymphony.xwork2.Action;

import bean.Product;

public class Products1Action implements Action {
	//��װ���products�������������
	private Product[] products;
	

	public Product[] getProducts() {
		return products;
	}


	public void setProducts(Product[] products) {
		this.products = products;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
