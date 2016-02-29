package com.capgemini.edmund.scheduler;

import com.sun.jersey.spi.container.servlet.ServletContainer;

import java.util.Date;
import java.util.Timer;

import javax.servlet.ServletException;

import javax.ws.rs.core.Application;

public class OfflineEdmund extends ServletContainer {
    
    private final static long ONCE_PER_DAY = 1000*60*60*24;
    private final static int TEN_AM = 10;
    private final static int ZERO_MINUTES = 0;
    
    public OfflineEdmund(Application application) {
        super(application);
    }

    public OfflineEdmund(Class<? extends Application> class1) {
        super(class1);
    }

    public OfflineEdmund() {
        super();
    }
    
    @Override
    public void init() throws ServletException {    
        startOfflineTasks();
        System.out.println("Done building styles");
        super.init();
    }

    private void startOfflineTasks() {
        StoreStyles storeStylesScheduler = new StoreStyles();
        Timer timer = new Timer();  
        timer.schedule(storeStylesScheduler, getTomorrowMorning10AM(), ONCE_PER_DAY); 
    }
    
    private Date getTomorrowMorning10AM(){
        Date date2am = new Date(); 
        date2am.setHours(TEN_AM); 
        date2am.setMinutes(ZERO_MINUTES); 
        return date2am;
    }
}
