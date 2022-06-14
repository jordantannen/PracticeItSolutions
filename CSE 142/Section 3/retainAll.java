public void retainAll(Set<Integer> s1, Set<Integer> s2){
    Iterator<Integer> itr = s1.iterator();
    while (itr.hasNext()){
        if (!s2.contains(itr.next()))
            itr.remove();
    }
}