public int numberOfOne(int n){
    int count=0;
    int flag=1;
    while(flag!=0){
        if((n&flag)==1)
            count++;
        flag=flag<<1;
    }
    return count;
}

public int numberOfOne(int n){
    int count=0;
    while(n!=0){
        ++count;
        n=n&(n-1);
    }
    return count;
}