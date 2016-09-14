/**
 * 斐波那契数列的递归写法
 */
public long Fibonacci(int n){
    if(n<=0)
        return 0;
    if(n==1)
        return 1;

    return Fibonacci(n-1)+Fibonacci(n-2);
}

/**
 * 斐波那契数列的非递归写法
 */
public long Fibonacci(int n){
    int one=1;
    int two=0;
    int res= 0;
    if(n<=0)
        return two;
    if(n==1)
        return one;
        
    for(int i=2;i<=n;i++){
        res=one+two;
        one=res;
        two=one;
    }
    return res;
}