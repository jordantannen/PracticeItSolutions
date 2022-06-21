public boolean isConsecutive(Stack<Integer> s){
    Queue<Integer> q = new LinkedList<>();
    boolean isGood = true;
    int lastNum = s.pop();
    q.add(lastNum);
    
    while(!s.isEmpty()){
        int num = s.pop();
        q.add(num);
        if (lastNum - 1 != num)
            isGood = false;
        lastNum = num;
    }
    
    while(!q.isEmpty()){
        s.push(q.remove());
    }
    
    while(!s.isEmpty()){
        q.add(s.pop());
    }
    
    while(!q.isEmpty()){
        s.push(q.remove());
    }
    return isGood;
}