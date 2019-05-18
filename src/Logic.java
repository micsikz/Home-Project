public class Logic {

    Company company = new Company(1000000);
    Store store = new Store(0, 0, 0, 0);
    Advertisement advertisement = new Advertisement(12345, 0);
    Ingredient ingredient = new Ingredient();
    Workers workers = new Workers(1);
    int productionQuantityNumber = workers.getWorkersNumber() * workers.getProductionSpeed();



    public void production(int n) {
        if(store.getStoreWheel() >= 4*n && store.getStoreChasis() >= n && store.getStoreEngin() >= n) {
            if(productionQuantityNumber >= n) {
                System.out.println("getStoreWheel:" + store.getStoreWheel() + " " +
                        "getStoreChasis:" + store.getStoreChasis() + " " +
                        "getStoreEngin:" + store.getStoreEngin() + " " +
                        "getStoreCar:" + store.getStoreCar() + " " +
                        "production:" + productionQuantityNumber);
                store.setStoreWheel(store.getStoreWheel() - (n * 4));
                store.setStoreChasis(store.getStoreChasis() - n);
                store.setStoreEngin(store.getStoreEngin() - n);
                store.setStoreCar(store.getStoreCar() + 1);
                System.out.println("getStoreWheel:" + store.getStoreWheel() + " " +
                        "getStoreChasis:" + store.getStoreChasis() + " " +
                        "getStoreEngin:" + store.getStoreEngin() + " " +
                        "getStoreCar:" + store.getStoreCar() + " " +
                        "production:" + productionQuantityNumber);
                System.out.println(n + "db autó összeszerelésre került");
            } else {
                System.out.println("Nincs elég munkásod " + n + "db autó összeszerelésére");
                System.out.println("getStoreWheel:" + store.getStoreWheel() + " " +
                        "getStoreChasis:" + store.getStoreChasis() + " " +
                        "getStoreEngin:" + store.getStoreEngin() + " " +
                        "getStoreCar:" + store.getStoreCar() + " " +
                        "production:" + productionQuantityNumber);
            }
        } else {
            System.out.println("Nincs elég nyersanyagod " + n + "db autó összeszerelésére");
            System.out.println("getStoreWheel:" + store.getStoreWheel() + " " +
                    "getStoreChasis:" + store.getStoreChasis() + " " +
                    "getStoreEngin:" + store.getStoreEngin() + " " +
                    "getStoreCar:" + store.getStoreCar() + " " +
                    "production:" + productionQuantityNumber);
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