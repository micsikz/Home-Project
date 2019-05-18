public class Workers {
    private final int WORKERWAGE = 50000;
    private int workerWage;
    private final int PRODUCTIONSPEED = 5;
    private int productionSpeed;
    private int workersNumber;
    private int productionQuantityNumber;

    public int getProductionQuantityNumber() {
        return productionQuantityNumber;
    }

    public void setProductionQuantityNumber(int productionQuantityNumber) {
        this.productionQuantityNumber = productionQuantityNumber;
    }

    public int productionQuantity() {
        productionQuantityNumber = workersNumber * productionSpeed;
        return productionQuantityNumber;
    }

    public int getWorkersNumber() {
        return workersNumber;
    }

    public void setWorkersNumber(int workersNumber) {
        this.workersNumber = workersNumber;
    }

    public Workers(int workersNumber) {
        this.workersNumber = workersNumber;
        this.workerWage = WORKERWAGE;
        this.productionSpeed = PRODUCTIONSPEED;
    }

    public int getWage() {
        return workerWage;
    }

    public void setWage(int wage) {
        this.workerWage = wage;
    }

    public int getProductionSpeed() {
        return productionSpeed;
    }

    public void setProductionSpeed(int productionSpeed) {
        this.productionSpeed = productionSpeed;
    }


}