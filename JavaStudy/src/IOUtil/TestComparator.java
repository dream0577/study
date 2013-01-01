package IOUtil;

import java.util.Arrays;
import java.util.Comparator;

/*********************************************************************************
 * Camparable与Comparator的区别
         简单说：
               实现Camparable接口可以直接使用sort方法Collections.sort(List list)排序
	 实现Comparator接口的可以用Collections.sort(List list, Comparator c)排序
	 一个类实现了Camparable接口则表明这个类的对象之间是可以相互比较的，这个类对象组成的集合就可以直接使用sort方法排序。
	Comparator可以看成一种算法的实现，将算法和数据分离，Comparator也可以在下面两种环境下使用：
	1、类的设计师没有考虑到比较问题而没有实现Comparable，可以通过Comparator来实现排序而不必改变对象本身
	2、可以使用多种排序标准，比如升序、降序等
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