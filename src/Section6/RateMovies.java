public void rateMovies(Scanner ratings){
    while (ratings.hasNext()){
        Scanner linescan = new Scanner(ratings.nextLine());
        int totalRatings = linescan.nextInt();
        double score = 0;
        String title = "";

        for (int i = 0; i < totalRatings; i++){
        score += linescan.nextDouble();
        }
        
        while (linescan.hasNext()){
            title += linescan.next();
            if (linescan.hasNext())
                title += " ";
        }
    System.out.println("title = " + title + ", ratings = " + totalRatings + ", score = " + (score / totalRatings));
    }
}