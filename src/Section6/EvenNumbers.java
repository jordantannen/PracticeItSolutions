public void evenNumbers(Scanner input){
    int totalNum = 0;
    int sum = 0;
    int even = 0;
    int currentInt = 0;

    while (input.hasNext()){
        if (input.hasNextInt()){
            currentInt = input.nextInt();
            totalNum++;
            sum += currentInt;

            if (currentInt % 2 == 0)
            even++;
        }
        else
            input.next();
    }
    System.out.println(totalNum + " numbers, sum = " + sum);
    System.out.printf("%d evens (%.2f%%)\n", even, 100.0 * even / totalNum);
}