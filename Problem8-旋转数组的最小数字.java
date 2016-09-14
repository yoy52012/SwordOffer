public int Min(int[] a){
    int left=0;
    int right=a.length-1;
    int mid=left;
    while(a[left]>=a[right]){
        
        if(right-left==1){
            mid=right;
            break;
        }

        mid=(left+right)/2;
        if(a[left]==a[right]&&a[mid]==a[right]){
            if(a[left+1]!=a[right-1]){
                mid=a[left+1]<a[right-1]?a[left+1]:a[right-1];
                break;
            }else{
                left++;
                right--;
            }
        }else{
            if(a[mid]>=a[left]){
                left=mid;
            }else if(mid<=a[right]){
                right=mid;
            }
        }
    }
    return a[mid];
    
}