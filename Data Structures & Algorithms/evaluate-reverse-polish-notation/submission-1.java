class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String c:tokens){
            if((c.equals("+"))||(c.equals("-"))||(c.equals("*"))||(c.equals("/"))){
                int first=stack.pop();
                int second=stack.pop();

                if(c.equals("+")){
                    stack.push(first+second);
                }else if(c.equals("-")){
                    stack.push(second-first);
                }else if(c.equals("*")){
                    stack.push(first*second);
                }else if(c.equals("/")){
                    stack.push(second/first);
                }else{}
            }else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.peek();
    }
}
