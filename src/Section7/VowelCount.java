public static int[] vowelCount(String phrase){
    int[] vowels = new int[5];
    for (int i = 0; i < phrase.length(); i++){
        if (phrase.charAt(i) == 'a')
            vowels[0]++;
        else if (phrase.charAt(i) == 'e')
            vowels[1]++;
        else if (phrase.charAt(i) == 'i')
            vowels[2]++;
        else if (phrase.charAt(i) == 'o')
            vowels[3]++;
        else if (phrase.charAt(i) == 'u')
            vowels[4]++;
    }
    return vowels;
}