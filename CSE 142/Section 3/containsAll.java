public boolean containsAll(Set<Integer> s1, Set<Integer> s2){
    Iterator<Integer> itr = s2.iterator();
    while (itr.hasNext()){
        if (!s1.contains(itr.next()))
            return false;
    }
    return true;
}