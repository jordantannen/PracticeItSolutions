public void stutter(List<Integer> list){
    
    for (int i = 0; i < list.size(); i += 2){
        list.add(i + 1, list.get(i));
    }
}