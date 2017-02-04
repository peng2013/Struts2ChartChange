package converter;

import java.lang.reflect.Member;
import java.util.Map;

import bean.Product;
import ognl.DefaultTypeConverter;

public class ProductConverter extends DefaultTypeConverter {
	
	//重写简化后的convertValue方法
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		System.out.println("进入convertValue(Map context, Object value, Class toType)");
		//将字符串转换成Product类型
		if(toType==Product.class){
			//系统的请求参数通过value值转入，并且是一个字符串数组
			String [] params=(String[]) value;
			//创建一个Product对象实例
			Product product=new Product();
			//只处理请求参数数组的第一个元素，并将其转换为字符串数组
			String[] productValues=params[0].split(",");
			//开始设置product的3个属性
			product.setName(productValues[0].trim());
			product.setPrice(Float.parseFloat(productValues[1].trim()));
			product.setCount(Integer.parseInt(productValues[2].trim()));
			System.out.println("jajaj"+product.getName()+","+product.getPrice()+","+product.getCount());
			return product;
		}
		//将Product类型转换成字符串
		else if(toType==String.class){
			System.out.println("进入convertValue(Map context, Object value, Class toType)sdfhsdf");
			Product product=(Product)value;
			return product.getName()+","+product.getPrice()+","+product.getCount();
		}
		return null;
	}


	

	

}
