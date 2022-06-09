public void learnAdd(int index, int num){
    int[] newArr = new int[size + 1];
    int j = 0;

    for (int i = 0; i < size + 1; i++){
        if (i != index){
            newArr[i] = elementData[j];
            j++;
        }
        else{
            newArr[i] = num;
        }
    }
    elementData = newArr;
    size++;
}