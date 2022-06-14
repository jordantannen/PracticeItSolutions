public void reverse3(List<Integer> list){
    for (int i = 0; i < list.size() - 2; i += 3){
        list.add(i + 2, list.remove(i + 1));
        list.add(i + 2, list.remove(i));
    }
}