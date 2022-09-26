

public class Main {
    public static void main(String[] args) {
        Agent observable = new Agent();
        Agency observer = new Agency();

        observable.addObserver(observer);
        observable.setStockExchange(5.5);
        if (observer.getStockExchange()== 5.5){
            System.out.println("se ha actualizado el valor de la bolsa");
        }



    }
}
