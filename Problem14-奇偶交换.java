/**
 * ����һ���������� ��ʵ��һ������������ʹ����������������λ��ǰ�벿�֣�����ż��λ�ں�벿��
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