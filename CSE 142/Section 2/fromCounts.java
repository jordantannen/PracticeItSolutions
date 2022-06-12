public ArrayIntList fromCounts(){
    ArrayIntList result = new ArrayIntList();
    int resultSize = 0;
    
    for (int i = 1; i < size; i += 2){
        for (int j = 0; j < elementData[i - 1]; j++){
            result.elementData[resultSize] = elementData[i];
            resultSize++;
        }
    }
    result.size = resultSize;
    return result;
}