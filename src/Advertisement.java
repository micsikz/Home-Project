public class Advertisement {

        private int advertisementPrice;
        private int advertisementNumber;


    public Advertisement(int advertisementPrice, int advertisementNumber) {
        this.advertisementPrice = advertisementPrice;
        this.advertisementNumber = advertisementNumber;
    }


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
