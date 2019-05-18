public class Logic {

    Company company = new Company(1000000);
    Store store = new Store(0, 0, 0, 0);
    Advertisement advertisement = new Advertisement(12345, 0);
    Ingredient ingredient = new Ingredient();
    Workers workers = new Workers(0, 0);



    public void hiringWorkers(int n) {
        if(company.getCompanyMoney() >= (workers.getWage()*n)) {
            workers.setWorkersNumber(workers.getWorkersNumber() + n);
            int a = workers.getWage() * n;
            System.out.println("Felvettél " + n + "új munkást!" + " workers.getWage:" + workers.getWage() + " a:" + a +"workersnumber:" + workers.getWorkersNumber());
        } else {
            System.out.println("Nincs elég pénzed " + n + "munkás felvételéhez!");
        }
    }

    public void dismissWorkers(int n) {
        if(n <= workers.getWorkersNumber()) {
            workers.setWorkersNumber(workers.getWorkersNumber() - n);
            System.out.println("Elbocsátottál " + n + " munkást!");
        } else {
            System.out.println("Nincs " + n + " munkásod, így nem tudsz ennyit elbocsátani!");
        }
    }

    public void production(int n) {
        if(store.getStoreWheel() >= 4*n && store.getStoreChasis() >= n && store.getStoreEngin() >= n) {
            if(workers.getProductionQuantityNumber() >= n) {

                System.out.println("getStoreWheel:" + store.getStoreWheel() + " " +
                        "getStoreChasis:" + store.getStoreChasis() + " " +
                        "getStoreEngin:" + store.getStoreEngin() + " " +
                        "getStoreCar:" + store.getStoreCar() + " " +
                        "production:" + workers.getProductionQuantityNumber());
                store.setStoreWheel(store.getStoreWheel() - (n * 4));
                store.setStoreChasis(store.getStoreChasis() - n);
                store.setStoreEngin(store.getStoreEngin() - n);
                store.setStoreCar(store.getStoreCar() + 1);
                System.out.println("getStoreWheel:" + store.getStoreWheel() + " " +
                        "getStoreChasis:" + store.getStoreChasis() + " " +
                        "getStoreEngin:" + store.getStoreEngin() + " " +
                        "getStoreCar:" + store.getStoreCar() + " " +
                        "production:" + workers.getProductionQuantityNumber());
                System.out.println(n + "db autó összeszerelésre került");
            } else {
                System.out.println("Nincs elég munkásod " + n + "db autó összeszerelésére! " + " workersnumber:" + workers.getWorkersNumber() + "productionQuantityNumber:" + workers.getProductionQuantityNumber());
                System.out.println("getStoreWheel:" + store.getStoreWheel() + " " +
                        "getStoreChasis:" + store.getStoreChasis() + " " +
                        "getStoreEngin:" + store.getStoreEngin() + " " +
                        "getStoreCar:" + store.getStoreCar() + " " +
                        "production:" + workers.getProductionQuantityNumber());
            }
        } else {
            System.out.println("Nincs elég nyersanyagod " + n + "db autó összeszerelésére");
            System.out.println("getStoreWheel:" + store.getStoreWheel() + " " +
                    "getStoreChasis:" + store.getStoreChasis() + " " +
                    "getStoreEngin:" + store.getStoreEngin() + " " +
                    "getStoreCar:" + store.getStoreCar() + " " +
                    "production:" + workers.getProductionQuantityNumber());
        }
    }


    public void buyWheel(int n) {
        if(company.getCompanyMoney() >= (ingredient.getWheel()*n)) {
        company.setCompanyMoney(company.getCompanyMoney() - (ingredient.getWheel()*n)); //A cég vagyonát csökkenti a kerék árával
        store.setStoreWheel(store.getStoreWheel() + n); // a raktárba bekerül eggyel több kerék
        System.out.println("buyWheel getCompanyMoney:" + company.getCompanyMoney() + " " + "storeWheel:" + store.getStoreWheel());
        } else {
            System.out.println("Nincs elég pénzed " + n + "db kerék megvásárlásához");
        }
    }

    public void buyChasis(int n) {
        if(company.getCompanyMoney() >= (ingredient.getChasis())*n) {
            company.setCompanyMoney(company.getCompanyMoney() - (ingredient.getChasis()) * n);
            store.setStoreChasis(store.getStoreChasis() + n);
            System.out.println("buyChasis getCompanyMoney:" + company.getCompanyMoney() + " " + "storeChasis:" + store.getStoreChasis());
        } else {
            System.out.println("Nincs elég pénzed " + n +"db kasztni megvásárlásához");
        }
    }

    public void buyEngin(int n) {
        if (company.getCompanyMoney() >= (ingredient.getEngin()) * n) {
            company.setCompanyMoney(company.getCompanyMoney() - (ingredient.getEngin()) * n);
        store.setStoreEngin(store.getStoreEngin() + n);
        System.out.println("buyEngin getCompanyMoney:" + company.getCompanyMoney() + " " + "storeEngin:" + store.getStoreEngin());
        } else {
        System.out.println("Nincs elég pénzed " + n +"db kasztni megvásárlásához");
        }
    }
}