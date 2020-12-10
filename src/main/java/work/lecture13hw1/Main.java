package work.lecture13hw1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        CompanyET companyET = new CompanyET("Svetkavica", "20.02.1999", "1122334455", "Petrov", 5000, 15000, true);
        CompanyET companyET1 = new CompanyET("Gramotevica", "01.11.2020", "99887766555", "Ivanov", 5000, 88000.45, false);

        companyET.companyProfit();
        log.info("The profit of company {} is {}", companyET.getCompanyName(), companyET.companyProfit());

        companyET1.companyProfit();
        log.info("The profit of company {} is {}", companyET1.getCompanyName(), companyET1.companyProfit());

        companyET.supplyGoogs();
        companyET1.supplyGoogs();
        companyET.eTrade();
        companyET1.eTrade();
        companyET.deliveryToCustomer();
        companyET1.deliveryToCustomer();
    }
}
