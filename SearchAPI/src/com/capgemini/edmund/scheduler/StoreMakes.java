package com.capgemini.edmund.scheduler;

import com.capgemini.edmund.search.StoredMakes;

import java.util.TimerTask;

public class StoreMakes extends TimerTask {
    public StoreMakes() {
        super();
    }

    @Override
    public void run() {
        StoredMakes.getInstance().getMakes();
        System.out.println("Done building styles");
    }
}
