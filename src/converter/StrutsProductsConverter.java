package converter;

import java.util.Map;

import org.apache.struts2.components.Else;
import org.apache.struts2.util.StrutsTypeConverter;

import bean.Product;

public class StrutsProductsConverter extends StrutsTypeConverter {
 //ʵ�ִ��ַ���ת����Product��������
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		//���ַ������鳤�ȴ���1��ת����Product[]����
		if(values.length>1){
			//����values����Ԫ�صĸ���������Product����
			Product [] products=new Product[values.length];
			//ѭ������values�����е�Ԫ��
			for(int i=0;i<values.length;i++){
				Product product=new Product();
				String [] productValues=values[i].split(",");
				//����Ĵ��뿪ʼΪ��ǰProduct�������Ը�ֵ
				product.setName(productValues[0].trim());
				product.setPrice(Float.parseFloat(productValues[1].trim()));
				product.setCount(Integer.parseInt(productValues[2].trim()));
				products[i]=product;
			}
			return products;
		}
		//���values���鳤��Ϊ1��ת����Product����
		else{
			Product product=new Product();
			String[] productsValues=values[0].split(",");
			product.setName(productsValues[0].trim());
			product.setPrice(Float.parseFloat(productsValues[1].trim()));
			product.setCount(Integer.parseInt(productsValues[2].trim()));
			return product;
		}
	}
//ʵ�ִ�Product�������͵��ַ���
	@Override
	public String convertToString(Map context, Object o) {
		// ��o��Product����ʱ������ת�����ַ���
		if(o instanceof Product){
			Product product=(Product)o;
			return product.getName()+","+product.getPrice()+","+product.getCount();
		}
		//��o���������ʱ����������ÿһ��Product����ת�����ַ�����ʹ��[..]���ַ���������
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
