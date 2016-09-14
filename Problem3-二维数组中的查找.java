public boolean findNumber(int[][] matrix,int rows,int cols,int number){
    if(matrix.length==0||rows<=0||cols<=0){
        return false;
    }
    boolean find=false;
    int row=0;
    int col=cols-1;
    while(row<rows&&col>=0){
        if(matrix[row][col]==number){
            find=true;
            break;
        }else if(matrix[row][col]>number){
            col--;
        }else{
            row++;
        }
    }
    return find;
}