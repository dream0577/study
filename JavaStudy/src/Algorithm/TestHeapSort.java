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
	 * 创最大建堆
	 * @param data ：堆排序
	 * @param lastIndex:最后一个位置
	 * 算法描述：
	 * 1、左节点=2k+1,右节点=2k+2
	 * 2、比较左右节点，计算左右节点最大值
	 * 3、左右节点的最大值与当前节点比较，计算机出最大值，并进行交换
	 * 4、重发1-3步骤，遍历所有数据
	 ************************************************/
	public static void createMaxHeapSort(int[] data,int lastIndex){		
		for(int i=(lastIndex-1)/2;i>=0;i--){			
			int k=i;//保存当前节点				
			while( 2*k+1 <lastIndex){
				int biggerIndex=2*k+1;//左节点赋值给biggerIndex
				if(biggerIndex<lastIndex){
					if(data[biggerIndex]<data[biggerIndex+1]){
						biggerIndex++;//左节点小于右节点，那么右节点赋值给biggerIndex
					}
				}				
				//与当前节点进行比较
				if(data[k]<data[biggerIndex]){
					swap(data,k,biggerIndex);
				}else{
					break;
				}
			}
		}
	}
}