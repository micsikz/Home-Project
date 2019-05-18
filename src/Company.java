import java.util.concurrent.ThreadLocalRandom;

public class Company {
    private int companyMoney;
    private int sellingRandomNumber;



    public Company(int companyMoney) {
        this.companyMoney = companyMoney;
        this.sellingRandomNumber = ThreadLocalRandom.current().nextInt(100);
    }

    public int getCompanyMoney() {
        return companyMoney;
    }

    public void setCompanyMoney(int money) {
        this.companyMoney = money;
    }


    public int getSellingRandomNumber() {
        return sellingRandomNumber;
    }

    public void setSellingRandomNumber(int sellingRandomNumber) {
        this.sellingRandomNumber = sellingRandomNumber;
    }
}
