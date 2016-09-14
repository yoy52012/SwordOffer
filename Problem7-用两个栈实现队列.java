public class CQueue{

    private Stack<Integer> stack1=new Stack<Integer>();
    private Stack<Integer> stack2=new Stack<Integer>();

    public void appendTial(int element){
        stack1.push(element);
    }

    public int deleteHead() throws Exception{
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.empty())
            throw new Exception("The queue  is empty!");

        return stack2.pop();
    }
}