public int learnIndexOf(int num){
    for (int i = 0; i < this.size(); i++){
        if (elementData[i] == num)
            return i;
    }
    return -1;
}

