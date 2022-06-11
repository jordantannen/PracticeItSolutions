public void learnAdd(int index, int num){
    for (int i = size; i > index; i--) 
        elementData[i] = elementData[i - 1];
    elementDate[index] = value;
    size++;
}
