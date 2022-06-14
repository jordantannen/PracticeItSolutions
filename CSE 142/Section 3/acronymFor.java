public String acronymFor(List<String> words){
    String acronym = "";
    
    for (String word : words){
        acronym += word.charAt(0);
    }
    
    return acronym.toUpperCase();
}