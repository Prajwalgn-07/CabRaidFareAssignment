public class FareCalculator implements DefaultPriceAndDistances {
    float totalFare;

    public int calculate(float totalDistanceTravelled){
        totalFare=flatPrice;
        if(totalDistanceTravelled>0 && totalDistanceTravelled<= flatPriceDistance){
            return Math.round(totalFare);
        }
       if(totalDistanceTravelled<firstBreakUpDistance){
           totalFare+=(firstBreakUpPrice*(totalDistanceTravelled-flatPriceDistance));
       }
       if(totalDistanceTravelled>=firstBreakUpDistance){
           int firstBreakToLastPointDistance= (int) (totalDistanceTravelled-firstBreakUpDistance);
           totalFare+=(firstBreakUpPrice*((totalDistanceTravelled- flatPriceDistance)-firstBreakToLastPointDistance));
           totalFare+=firstBreakToLastPointDistance* LastBreakUpPrice;
       }
       return Math.round(totalFare);
    }

}
