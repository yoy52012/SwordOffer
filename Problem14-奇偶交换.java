/**
 * 输入一个整数数组 ，实现一个函数来调整使该数组中所有奇数位于前半部分，所有偶数位于后半部分
 */  
public void ReorderOddEven(int[] array,int n){
		if(array==null||n<=0){
			throw new IllegalArgumentException();
		}
		int start=0;
		int end=n-1;
		while(start<end){
			while(start<end&&(array[start]&0x01)!=0)
				start++;
			while(start<end&&(array[end]&0x01)==0)
				end--;
			int tmp=array[start];
			array[start]=array[end];
			array[end]=tmp;
		}
	}