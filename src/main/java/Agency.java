public class Agency implements Observer {
    private double stockExchange;

    @Override
    public void update(Object stockExchange) {

        this.setStockExchange((double) stockExchange);
    }

    public double getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(double stockExchange) {
        this.stockExchange = stockExchange;
    }


}

