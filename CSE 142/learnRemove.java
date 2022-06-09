public void learnRemove(int index){
    int[] newArr = new int[size - 1];
    int j = 0;

    for (int i = 0; i < size; i++){
        if (i != index){
            newArr[j] = elementData[i];
            j++;
        }
    }
    elementData = newArr;
    size--;
}