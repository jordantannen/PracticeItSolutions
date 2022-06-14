public boolean equals(Set<Integer> s1, Set<Integer> s2){
	Iterator<Integer> itr = s1.iterator();
	while (itr.hasNext()){
			if (!s2.contains(itr.next()))
					return false;
	}
	return s1.size() == s2.size();
}