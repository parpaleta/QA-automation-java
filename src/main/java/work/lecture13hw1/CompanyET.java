package work.lecture13hw1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompanyET extends Company implements TradeCompanyRole{

    private String ownerName;
    private double primaryCapital;
    private double actualCapital;
    private boolean isTradeCompany;

    public CompanyET(String companyName, String creationDate, String bulstat, String ownerName, double primaryCapital, double actualCapital, boolean isTradeCompany) {
        super(companyName, creationDate, bulstat);
        this.ownerName = ownerName;
        this.primaryCapital = primaryCapital;
        this.actualCapital = actualCapital;
        this.isTradeCompany = isTradeCompany;
    }

    //Getter ownerName
    public String getOwnerName(){
        return ownerName;
    }
    //Setter ownerName
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    //Getter primaryCapital
    public double getPrimaryCapital(){
        return primaryCapital;
    }
    //Setter primaryCapital
    public void setPrimaryCapital(double primaryCapital){
        if(primaryCapital <= 0){
            log.info("The primary capital should be positive number!");
            this.primaryCapital = primaryCapital;
        }
    }

    //Getter actualCapital
    public double getActualCapital(){
        return actualCapital;
    }
    //Setter actualCapital
    public void steActualCapital(double actualCapital){
        if(actualCapital <= 0){
            log.info("The actial capital should be positive number!");
        }
        this.actualCapital = actualCapital;
    }

    protected double companyProfit(){
        return actualCapital - primaryCapital;
    }

    @Override
    public void supplyGoogs() {
        if(isTradeCompany){
            log.info("Company {} does supply goods using contractors.", getCompanyName());
        }else {
            log.info("Company {} has own Supply department.", getCompanyName());
        }
    }

    @Override
    public void eTrade() {
        if(isTradeCompany){
            log.info("Company {} does perform trade.", getCompanyName());
        }else{
            log.info("Company {} isn't a trade company.", getCompanyName());
        }

    }

    @Override
    public void deliveryToCustomer() {
        if(isTradeCompany){
            log.info("Company {} does perform delivery to end customers.", getCompanyName());
        }else{
            log.info("Company {} doesn't perform delivery to end customers.", getCompanyName());
        }
    }

}
