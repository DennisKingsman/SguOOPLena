package entity;

import java.util.List;

public class MarketingStorage {

    private List<Advertising> advertisingStorage;
    private List<Agent> agents;

    public List<Advertising> getAdvertisingStorage() {
        return advertisingStorage;
    }

    public MarketingStorage() {
    }

    public MarketingStorage(List<Advertising> advertisingStorage, List<Agent> agents) {
        this.advertisingStorage = advertisingStorage;
        this.agents = agents;
    }

    public void setAdvertisingStorage(List<Advertising> advertisingStorage) {
        this.advertisingStorage = advertisingStorage;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

}
