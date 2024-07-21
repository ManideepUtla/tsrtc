package com.neoteric.tsrtc.service;

import com.neoteric.tsrtc.model.AvailableBus;
import com.neoteric.tsrtc.model.Bus;
import com.neoteric.tsrtc.model.Search;

import java.util.ArrayList;
import java.util.List;

public class SearchService {
    public AvailableBus availableBus;
    public SearchService(AvailableBus availableBus){
        this.availableBus=availableBus;
    }
    public List<Bus> checkAvailability(Search search) {
        List<Bus> displayBusList = new ArrayList<>();
        int n=availableBus.availablebusList.size();

        for (int i=0; i<n; i++){

            if (availableBus.availablebusList.get(i).fromLocation.equals(search.fromLocation) && availableBus.availablebusList.get(i).toLocation.equals(search.toLocation) &&
                    availableBus.availablebusList.get(i).startDate.equals(search.startDate) &&
                    availableBus.availablebusList.get(i).endDate.equals(search.endDate)){
                displayBusList.add(availableBus.availablebusList.get(i));

            }


        }


        System.out.println("Available bus list"+ availableBus.availablebusList.size());
        System.out.println("check availability "+ displayBusList.size());



    return displayBusList;
    }


}
