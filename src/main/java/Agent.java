import java.util.ArrayList;
import java.util.List;

public class Agent {
    private double stockExchange;
    private List<Agency> observers = new ArrayList<>();

    public void addObserver(Agency observer) {
        this.observers.add(observer);
    }

    public void setStockExchange(double stockExchange) {
        this.stockExchange = stockExchange;
        for (Agency agency : this.observers) {
            agency.update(this.stockExchange);
        }
    }
}