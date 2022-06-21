public void reverseHalf(Queue<Integer> q){
    Stack<Integer> ph = new Stack<>();
    int size = q.size();
    
    for (int i = 0; i < size; i++){
        if (i % 2 == 0){
            q.add(q.remove());
        }
        else {
            ph.push(q.remove());
        }
    }
    
    for (int i = 0; i < size; i++){
        if (i % 2 == 0)
            q.add(q.remove());
        else
            q.add(ph.pop());
    }
}