public boolean isPairwiseSorted(){
    boolean sorted = true;
    for (int i = 1; i < size; i += 2){
        if (elementData[i - 1] > elementData[i])
            return false;
    }
    return true;
}