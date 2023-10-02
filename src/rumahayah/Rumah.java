package rumahayah;
public class Rumah{
    private long price;
    private double tax;
    private int homeType;
    
    Rumah(long price, int homeType){
        this.price = price;
        this.homeType = homeType;
        calculatePBB();
    }

    public int getHomeType(){
        return homeType;
    }
    public double calculatePBB(){
        if(homeType==36){
            tax = price*0.04;
        }else if(homeType==45){
            tax = price*0.06;

        }else if(homeType>45){
            tax = price*0.09;

        }else{
            System.out.println("POOR!!");
        }
        return tax;
    }
    
}