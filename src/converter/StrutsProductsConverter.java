package converter;

import java.util.Map;

import org.apache.struts2.components.Else;
import org.apache.struts2.util.StrutsTypeConverter;

import bean.Product;

public class StrutsProductsConverter extends StrutsTypeConverter {
 //实现从字符串转换成Product对象类型
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		//当字符串数组长度大于1，转换成Product[]对象
		if(values.length>1){
			//根据values数组元素的个数来创建Product数组
			Product [] products=new Product[values.length];
			//循环处理values数组中的元素
			for(int i=0;i<values.length;i++){
				Product product=new Product();
				String [] productValues=values[i].split(",");
				//下面的代码开始为当前Product对象属性赋值
				product.setName(productValues[0].trim());
				product.setPrice(Float.parseFloat(productValues[1].trim()));
				product.setCount(Integer.parseInt(productValues[2].trim()));
				products[i]=product;
			}
			return products;
		}
		//如果values数组长度为1，转换成Product对象
		else{
			Product product=new Product();
			String[] productsValues=values[0].split(",");
			product.setName(productsValues[0].trim());
			product.setPrice(Float.parseFloat(productsValues[1].trim()));
			product.setCount(Integer.parseInt(productsValues[2].trim()));
			return product;
		}
	}
//实现从Product对象类型到字符串
	@Override
	public String convertToString(Map context, Object o) {
		// 当o是Product对象时，将其转换成字符串
		if(o instanceof Product){
			Product product=(Product)o;
			return product.getName()+","+product.getPrice()+","+product.getCount();
		}
		//当o是数组对象时，将数组中每一个Product对象转换成字符串，使用[..]将字符串括起来
		else if(o instanceof Product[]){
			String result="";
			Product[] products=(Product[])o;
			for(Product product:products){
				result+="["+product.getName()+","+product.getPrice()+","+product.getCount()+"]";
			}
			return result;
		}
		else
			return "";
	}

}
