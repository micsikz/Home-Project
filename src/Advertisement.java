public class Advertisement {

        private int advertisementPrice;
        private int advertisementNumber;


    public Advertisement(int advertisementPrice, int advertisementNumber) {
        this.advertisementPrice = advertisementPrice;
        this.advertisementNumber = advertisementNumber;
    }


/*
    public void buyAdvertisement() {
        company.setCompanyMoney(company.getCompanyMoney() - advertisementPrice);
        advertisementNumber ++;
        System.out.println("Advertisement: getCompanyMoney:" + company.getCompanyMoney() + " " + "AdvertisementPrice:" + advertisementPrice + " " + "Advertisementdb:" + advertisementNumber);
    }*/

    public int getAdvertisementPrice() {
        return advertisementPrice;
    }

    public void setAdvertisementPrice(int advertisementPrice) {
        this.advertisementPrice = advertisementPrice;
    }

    public int getAdvertisementNumber() {
        return advertisementNumber;
    }

    public void setAdvertisementNumber(int advertisementNumber) {
        this.advertisementNumber = advertisementNumber;
    }
}
