public static int[] sum5(int[] list){
    int[] sums = new int[5];

    for (int i = 0; i < 5; i++){
        for (int j = i; j < list.length; j += 5){
            sums[i] += list[j];
        }
    }

    return sums;
}