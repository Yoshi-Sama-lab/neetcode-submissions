class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String c:operations){
            if((c.equals("+"))||(c.equals("C"))||c.equals("D")){
                if(c.equals("+")){
                    int second=stack.pop();
                    int first=stack.pop();
                    stack.push(first);
                    stack.push(second);
                    stack.push(first+second);
                }else if(c.equals("C")){
                    stack.pop();
                }else if(c.equals("D")){
                    int previous=stack.peek();
                    stack.push(previous*2);
                }else{}
            }else{
                stack.push(Integer.parseInt(c));
            }
        }
        int total=0;
        while(!stack.isEmpty()){
            total+=stack.pop();
        }
        return total;
    }
}