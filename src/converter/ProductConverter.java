package converter;

import java.lang.reflect.Member;
import java.util.Map;

import bean.Product;
import ognl.DefaultTypeConverter;

public class ProductConverter extends DefaultTypeConverter {
	
	//��д�򻯺��convertValue����
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		System.out.println("����convertValue(Map context, Object value, Class toType)");
		//���ַ���ת����Product����
		if(toType==Product.class){
			//ϵͳ���������ͨ��valueֵת�룬������һ���ַ�������
			String [] params=(String[]) value;
			//����һ��Product����ʵ��
			Product product=new Product();
			//ֻ���������������ĵ�һ��Ԫ�أ�������ת��Ϊ�ַ�������
			String[] productValues=params[0].split(",");
			//��ʼ����product��3������
			product.setName(productValues[0].trim());
			product.setPrice(Float.parseFloat(productValues[1].trim()));
			product.setCount(Integer.parseInt(productValues[2].trim()));
			System.out.println("jajaj"+product.getName()+","+product.getPrice()+","+product.getCount());
			return product;
		}
		//��Product����ת�����ַ���
		else if(toType==String.class){
			System.out.println("����convertValue(Map context, Object value, Class toType)sdfhsdf");
			Product product=(Product)value;
			return product.getName()+","+product.getPrice()+","+product.getCount();
		}
		return null;
	}


	

	

}
