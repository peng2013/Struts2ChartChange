package action;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

import bean.Product;

public class Products2Action extends ActionSupport {
	private Product product1;
	private Product product2;
	
	private Product[] products;
	private List<Product>productList;
	
	private List myProductList;
	private Map myProductMap;
	private Set myProductSet;
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
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public List getMyProductList() {
		return myProductList;
	}
	public void setMyProductList(List myProductList) {
		this.myProductList = myProductList;
	}
	public Map getMyProductMap() {
		return myProductMap;
	}
	public void setMyProductMap(Map myProductMap) {
		this.myProductMap = myProductMap;
	}
	public Set getMyPrdouctSet() {
		return myProductSet;
	}
	public void setMyPrdouctSet(Set myPrdouctSet) {
		this.myProductSet = myPrdouctSet;
	}
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
