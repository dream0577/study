package Algorithm;

public class TestHeapSort{
	public static void testHeapSort(){
		int[] data=new int[]{2,3,4,8,9,5,3};
		heapSort(data);
		print(data);
	}
	
	public static void heapSort(int[]data){
		for(int i=0;i<data.length;i++){
			createMaxHeapSort(data,data.length-1-i);
			swap(data,0,data.length-1-i);
		}
	}
	
	public static void swap(int[] data,int k,int biggerIndex){
		int temp=0;
		if(k==biggerIndex){
			return;
		}
		
		temp=data[k];
		data[k]=data[biggerIndex];
		data[biggerIndex]=temp;
	}
	
	public static void print(int[] data){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"  ");
		}
	}
	
	
	/**********************************************
	 * ����󽨶�
	 * @param data ��������
	 * @param lastIndex:���һ��λ��
	 * �㷨������
	 * 1����ڵ�=2k+1,�ҽڵ�=2k+2
	 * 2���Ƚ����ҽڵ㣬�������ҽڵ����ֵ
	 * 3�����ҽڵ�����ֵ�뵱ǰ�ڵ�Ƚϣ�����������ֵ�������н���
	 * 4���ط�1-3���裬������������
	 ************************************************/
	public static void createMaxHeapSort(int[] data,int lastIndex){		
		for(int i=(lastIndex-1)/2;i>=0;i--){			
			int k=i;//���浱ǰ�ڵ�				
			while( 2*k+1 <lastIndex){
				int biggerIndex=2*k+1;//��ڵ㸳ֵ��biggerIndex
				if(biggerIndex<lastIndex){
					if(data[biggerIndex]<data[biggerIndex+1]){
						biggerIndex++;//��ڵ�С���ҽڵ㣬��ô�ҽڵ㸳ֵ��biggerIndex
					}
				}				
				//�뵱ǰ�ڵ���бȽ�
				if(data[k]<data[biggerIndex]){
					swap(data,k,biggerIndex);
				}else{
					break;
				}
			}
		}
	}
}