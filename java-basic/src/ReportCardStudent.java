public class ReportCardStudent {

    public static void main(String[] args) {
        int finalAverage = 9;
        if(finalAverage < 6)
            System.out.println("disapproved");
        else if(finalAverage == 6)
            System.out.println("Must take another test");
        else
            System.out.println("Approved");
        
    }
    
}
