public boolean negativeSum(Scanner input){
    int sum = 0;
    int steps = 0;

    while (input.hasNext()){
        steps++;
        sum += input.nextInt();
        if (sum < 0){
            System.out.println(sum + " after " + steps + " steps");
            return true;
        }
    }
    System.out.println("no negative sum");
    return false;
}