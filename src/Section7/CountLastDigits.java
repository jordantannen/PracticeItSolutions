public static int[] countLastDigits(int[] list){
    int[] digits = new int[10];

    for (int i = 0; i < list.length; i++){
        digits[list[i] % 10]++;
    }

    return digits;
}