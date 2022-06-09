public void purpleGold(Scanner input){
    int sumPurple = 0;
    int sumGold = 0;
    int countPurple = 0;
    int countGold = 0;
    boolean isPurple = true;
    
    while (input.hasNext()){
        
        if (input.hasNextInt()){
            if (isPurple == true){
                sumPurple += input.nextInt();
                countPurple++;
                isPurple = false;
            }
            else{
                sumGold += input.nextInt();
                countGold++;
                isPurple = true;
            }
        }
        else
            input.next();
    }
    
    System.out.println(countPurple + " purple, " + countGold + " gold");
    System.out.println("Difference between purple team and gold team sums: " + Math.abs(sumPurple - sumGold));
}