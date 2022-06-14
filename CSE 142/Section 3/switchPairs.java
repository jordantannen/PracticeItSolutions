public void switchPairs(List<String> words){
    String placeholder = "";
    for (int i = 0; i < words.size() - 1; i += 2){
        placeholder = words.get(i);
        words.set(i, words.get(i + 1));
        words.set(i + 1, placeholder);
    }
}