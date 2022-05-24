public boolean isPalindrome(String text){
    String result = "";

    for (int i = 0; i < text.length(); i++){
        result = text.charAt(i) + result;
    }

    if (result.toLowerCase().equals(text.toLowerCase()))
        return true;

    return false;
}