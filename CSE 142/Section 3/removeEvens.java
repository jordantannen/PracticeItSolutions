public Set<Integer> removeEvens(Set<Integer> set){
    Set<Integer> newSet = new TreeSet<>();
    Iterator<Integer> itr = set.iterator();
    while (itr.hasNext()){
        int num = itr.next();
        if (num % 2 == 0){
            newSet.add(num);
            itr.remove();
        }
    }
    return newSet;
}