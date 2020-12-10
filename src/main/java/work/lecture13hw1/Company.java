package work.lecture13hw1;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class Company {
    private String companyName;
    private String creationDate;
    private String bulstat;

    public Company(String companyName, String creationDate, String bulstat){
        setCompanyName(companyName);
        setCreationDate(creationDate);
        setBulstat(bulstat);
    }
    // Getter companyName
    public String getCompanyName() {
        return companyName;
    }
    // Setter companyName
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //Getter creationDate
    public String getCreationDate(){
       return creationDate;
    }
    //Setter creationDate
    public void setCreationDate(String creationDate){
        this.creationDate = creationDate;
    }

    //Getter bulstat
    public String getBulstat(){
        return bulstat;
    }
    //Setter bulstat
    public void setBulstat(String bulstat) {
        if(bulstat.length() !=10){
            log.info("Bulstat of company {} should contain 10 digits! The length of the bulstat you entered is {}. Please correct!", companyName, bulstat.length());
        }
        this.bulstat = bulstat;
    }
}
