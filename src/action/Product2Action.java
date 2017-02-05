package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import bean.Product;

public class Product2Action implements Action {
	//封装多个请求参数的productList属性
	private List<Product> productList;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
