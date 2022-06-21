public void splitStack(Stack<Integer> stack){
    Queue<Integer> q = new LinkedList<>();
    int oldLength = stack.size();
    
    while(!stack.isEmpty()){
        q.add(stack.pop());
    }
    
    for (int i = 0; i < oldLength; i++){
        int num = q.remove();
        if (num < 0)
            stack.push(num);
        else
            q.add(num);
    }
    
    while(!q.isEmpty()){
        stack.push(q.remove());
    }
}