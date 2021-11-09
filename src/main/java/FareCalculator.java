public class FareCalculator implements DefaultPriceAndDistances {
    float totalFare;
    public FareCalculator(){
        totalFare=flatPrice;
    }
    public int calculate(float totalDistanceTravelled){
        if(totalDistanceTravelled<=0){
           System.exit(0);
        }
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
