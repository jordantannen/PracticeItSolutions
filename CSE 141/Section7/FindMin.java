public int findMin(int[] list){
    int min = list[0];
    for (int i = 1; i < list.length; i++){
        if (list[i] < min)
            min = list[i];
    }
    return min;
}