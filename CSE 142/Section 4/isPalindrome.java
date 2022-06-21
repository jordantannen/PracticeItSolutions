public boolean isPalindrome(Queue<Integer> q){
    if (q.isEmpty())
        return true;
    
    Stack<Integer> ph = new Stack<>();
    int size = q.size();
    boolean isPali = true;
    
    for (int i = 0; i < size; i++){
        int n = q.remove();
        q.add(n);
        ph.push(n);
    }
    
    for (int i = 0; i < size; i++){
        int n1 = ph.pop();
        int n2 = q.remove();
        if (n1 != n2){
            isPali = false;
        }
        q.add(n2);
    }
    
    return isPali;
}