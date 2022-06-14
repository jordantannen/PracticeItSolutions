public void switchPairs(List<String> words){
    for (int i = 0; i < words.size() - 1; i += 2){
        String first = words.remove(i);
        words.add(i + 1, first);
    }
}