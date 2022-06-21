public void reverseByN(Queue<Integer> q, int n){
    Stack<Integer> s = new Stack<>();
    int loops = q.size() / n;
    int extras = q.size() % n;
    
    for (int i = 0; i < loops; i++){
        for (int j = 0; j < n; j++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    
    for (int i = 0; i < extras; i++){
        s.push(q.remove());
    }
    while(!s.isEmpty()){
        q.add(s.pop());
    }
}