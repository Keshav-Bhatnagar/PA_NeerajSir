class MinStack {

    Stack<Integer>st=new Stack<>();
    // Stack<Integer>min=new Stack<>();
    public MinStack() {
    }
    
    public void push(int value) {
        st.push(value);
        // min.push(value);

    }
    
    public void pop() {
        st.pop();
        // min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int mini=Integer.MAX_VALUE;
        for(int i:st){
            if(i<mini)mini=i;
        }
        return mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */