class MinStack {
    private Deque<Integer> minStack;
    private Deque<Integer> mainStack;
    public MinStack() {
        minStack=new ArrayDeque<>();
        mainStack=new ArrayDeque<>();
    }
    
    public void push(int val) {
        mainStack.push(val);

        if(minStack.isEmpty()||val<=minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int removedvalue=mainStack.pop();

        if(removedvalue==minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
