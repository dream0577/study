package IOUtil;

import java.util.Arrays;
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
public class TestComparable {
	public static void testComparable(){
		User[] user=new User[]{new User("a",300),new User("b",40)};
		Arrays.sort(user);
		for(int i=0;i<user.length;i++){
			User users=user[i];
			System.out.println(users.getId()+"   "+users.getAge());
		}
	}
}


class User implements Comparable{
	private String id;
	private int age;
	
	public User(String id,int age){
		this.id=id;
		this.age=age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id=id;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.age-((User)o).getAge();
	}
}