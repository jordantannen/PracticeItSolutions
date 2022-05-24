public static void rotateRight(int[] list){
    int[] placeholder = new int[list.length];

    placeholder[0] = list[list.length - 1];

    for (int i = 0; i < list.length - 1; i++){
        placeholder[i + 1] += list[i];
    }
    for (int i = 0; i < list.length; i++){
        list[i] = placeholder[i];
    }
}