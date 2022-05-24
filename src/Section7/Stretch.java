public static int[] stretch(int[] list){
    int[] pairs = new int[list.length * 2];
    int j = 0;

    for (int i = 0; i < pairs.length; i += 2){
        pairs[i] = list[j] / 2;
        pairs[i + 1] = list[j] / 2;
        
        if (list[j] % 2 != 0)
            pairs[i] = list[j] / 2 + 1;
        j++;
    }
    return pairs;
}