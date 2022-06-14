public boolean equals(Set<Integer> s1, Set<Integer> s2){
	if (s1.size() != s2.size())
		return false;
	
	Iterator<Integer> itr = s1.iterator();
	while (itr.hasNext()){
			if (!s2.contains(itr.next()))
					return false;
	}
	return true;
}