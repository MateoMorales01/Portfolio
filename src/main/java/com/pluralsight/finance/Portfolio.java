package com.pluralsight.finance;

import java.util.ArrayList;

public abstract class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner, ArrayList<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }
    public abstract double getValue();
}
