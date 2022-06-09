public void stutter(){
    int[] newArr = new int[this.size * 2];
    int j = 0;

    for (int i = 0; i < this.size; i++){
        newArr[i] = elementData[j];
        if (i % 2 != 0)
            j++;
    }
    elementData = newArr;
    size = size * 2;
}