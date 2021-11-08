public class FareCalculator implements DefaultPriceAndDistances {
    int totalFare;
    int totalDistanceTravelled;
    public FareCalculator(int distance){
        totalFare=flatPrice;
        this.totalDistanceTravelled=distance;
    }
    public int calculate(){
        if(totalDistanceTravelled>0 && totalDistanceTravelled<= flatPriceDistance){
            return totalFare;
        }
       if(totalDistanceTravelled<firstBreakUpDistance){
           totalFare+=(firstBreakUpPrice*(firstBreakUpDistance-totalDistanceTravelled));
       }
       if(totalDistanceTravelled>=firstBreakUpDistance){
           int firstBreakToLastPointDistance=(totalDistanceTravelled-firstBreakUpDistance);
           totalFare+=(firstBreakUpPrice*((totalDistanceTravelled- flatPriceDistance)-firstBreakToLastPointDistance));
           totalFare+=firstBreakToLastPointDistance* LastBreakUpPrice;
       }
       return totalFare;
    }

}
