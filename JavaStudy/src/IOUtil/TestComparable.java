package IOUtil;

import java.util.Arrays;
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