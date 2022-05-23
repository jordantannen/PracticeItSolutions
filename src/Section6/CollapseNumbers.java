public void collapseSpaces(Scanner input){
    while (input.hasNext()){
        Scanner linescan = new Scanner(input.nextLine());
        while (linescan.hasNext()){
            System.out.print(linescan.next() + " ");
            }
        System.out.println();
    }
}