public boolean equals(Stack<Integer> s1, Stack<Integer> s2){
    if (s1.size() != s2.size())
        return false;
    
    Stack<Integer> ph = new Stack<>();
    boolean isEqual = true;
    
    while (!s1.isEmpty()){
        int n1 = s1.pop();
        int n2 = s2.pop();
        
        if (n1 != n2){
            isEqual = false;
            s1.push(n1);
            s2.push(n2);
            break;
        }
        ph.push(n1);
    }
    
    while (!ph.isEmpty()){
        int n = ph.pop();
        s1.push(n);
        s2.push(n);
    }
    return isEqual;
}