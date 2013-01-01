package IOUtil;

import java.util.Arrays;
import java.util.Comparator;

/*********************************************************************************
 * Camparable��Comparator������
         ��˵��
               ʵ��Camparable�ӿڿ���ֱ��ʹ��sort����Collections.sort(List list)����
	 ʵ��Comparator�ӿڵĿ�����Collections.sort(List list, Comparator c)����
	 һ����ʵ����Camparable�ӿ�����������Ķ���֮���ǿ����໥�Ƚϵģ�����������ɵļ��ϾͿ���ֱ��ʹ��sort��������
	Comparator���Կ���һ���㷨��ʵ�֣����㷨�����ݷ��룬ComparatorҲ�������������ֻ�����ʹ�ã�
	1��������ʦû�п��ǵ��Ƚ������û��ʵ��Comparable������ͨ��Comparator��ʵ����������ظı������
	2������ʹ�ö��������׼���������򡢽����
 **********************************************************************/
public class TestComparator {
	
	public static void testComparator(){
		Dog d1=new Dog("dog1",3,5);
		Dog d2=new Dog("dog2",2,4);
		Dog[] dogs=new Dog[]{d1,d2};
		
		for(int i=0;i<dogs.length;i++){
			Dog dog=dogs[i];
			System.out.println(dog.getName());
		}
		
		Arrays.sort(dogs,new ByWeightComparator());
		for(int i=0;i<dogs.length;i++){
			Dog dog=dogs[i];
			System.out.println(dog.getName());
		}
	}
}

class ByWeightComparator implements Comparator<Object>{

	@Override
	public int compare(Object firstDog, Object secondDog) {
		// TODO Auto-generated method stub
		int firstWeight=((Dog)firstDog).getWight();
		int secondWeight=((Dog)secondDog).getWight();
		
		return signum(firstWeight-secondWeight);
	}
	
	public static final int signum(int diff){
		if(diff>0){
			return 1;
		}else if(diff<0){
			return -1;
		}else{
			return 0;
		}
	}
	
}
class Dog{
	private String name;
	private int weight;
	private int height;
	
	public Dog(String name,int weight,int height){
		this.setName(name);
		this.weight=weight;
		this.height=height;
	}

	 public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	public String getName(){
		 return name;
	 }
	public int getHeight(){
		return height;
	}
	
	public void setHeight(int height){
		this.height=height;
	}
	
	public int getWight(){
		return weight;
	}
	
	public void setWeight(int weight){
		this.weight=weight;
	}
}