public void mirror(){
    int j = 1;
    for (int i = size; i < size * 2; i++){
        elementData[i] = elementData[size - j];
        j++;
    }
    size *= 2;
}