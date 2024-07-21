package com.neoteric.tsrtc;

import com.neoteric.tsrtc.model.AvailableBus;
import com.neoteric.tsrtc.model.Bus;
import com.neoteric.tsrtc.model.Search;
import com.neoteric.tsrtc.service.SearchService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusTest {


    public static void main(String[] args) {

        AvailableBus availableBus = new AvailableBus();
        //List<Bus> busList=new ArrayList<>();

        Bus b1 = new Bus();
        b1.fromLocation = "hyd";
        b1.toLocation = "AMp";
        b1.type = "amaravathi";
        b1.startDate = new java.sql.Date(20 - 07 - 2024);
        b1.endDate = new java.sql.Date(21 - 07 - 2024);
        b1.noOfSeats = 18;
        b1.price = 999;


        Bus b2 = new Bus();
        b2.fromLocation = "hyd";
        b2.toLocation = "rjy";
        b2.type = "garuda";
        b2.startDate = new java.sql.Date(20 - 07 - 2024);
        b2.endDate = new java.sql.Date(21 - 07 - 2024);
        b2.noOfSeats = 18;
        b2.price = 769;

        Bus b3 = new Bus();
        b3.fromLocation = "hyd";
        b3.toLocation = "rjy";
        b3.type = "morning star";
        b3.startDate = new java.sql.Date(20 - 07 - 2024);
        b3.endDate = new java.sql.Date(21 - 07 - 2024);
        b3.noOfSeats = 18;
        b3.price = 729;

        Bus b4 = new Bus();
        b4.fromLocation = "hyd";
        b4.toLocation = "ongole";
        b4.type = "gotours";
        b4.startDate = new java.sql.Date(20 - 07 - 2024);
        b4.endDate = new java.sql.Date(21 - 07 - 2024);
        b4.noOfSeats = 18;
        b4.price = 899;

        Bus b5 = new Bus();
        b5.fromLocation = "hyd";
        b5.toLocation = "vijayawada";
        b5.type = "orange";
        b5.startDate = new java.sql.Date(20 - 07 - 2024);
        b5.endDate = new java.sql.Date(21 - 07 - 2024);
        b5.noOfSeats = 18;
        b5.price = 799;

        Bus b6 = new Bus();
        b6.fromLocation = "hyd";
        b6.toLocation = "guntur";
        b6.type = "indra";
        b6.startDate = new java.sql.Date(20 - 07 - 2024);
        b6.endDate = new java.sql.Date(21 - 07 - 2024);
        b6.noOfSeats = 18;
        b6.price = 1100;

        List<Bus> busList1 = new ArrayList<>();
        busList1.add(b1);
        busList1.add(b2);
        busList1.add(b3);
        busList1.add(b4);
        busList1.add(b5);
        busList1.add(b6);
        availableBus.availablebusList = busList1;





        /*availableBus.availablebusList.add(b1);
        availableBus.availablebusList.add(b2);
        availableBus.availablebusList.add(b3);
        availableBus.availablebusList.add(b4);
        availableBus.availablebusList.add(b5);
        availableBus.availablebusList.add(b6);*/

        SearchService service = new SearchService(availableBus);
        Search search = new Search();
        search.fromLocation = "hyd";
        search.toLocation = "rjy";
        search.startDate = new Date(20 - 07 - 2024);
        search.endDate = new Date(21 - 07 - 2024);


        service.checkAvailability(search);


    }

    @Test
    public void fortrue() {

        AvailableBus availableBus = new AvailableBus();
        //List<Bus> busList=new ArrayList<>();

        Bus b1 = new Bus();
        b1.fromLocation = "hyd";
        b1.toLocation = "AMp";
        b1.type = "amaravathi";
        b1.startDate = new java.sql.Date(20 - 07 - 2024);
        b1.endDate = new java.sql.Date(21 - 07 - 2024);
        b1.noOfSeats = 18;
        b1.price = 999;


        Bus b2 = new Bus();
        b2.fromLocation = "hyd";
        b2.toLocation = "rjy";
        b2.type = "garuda";
        b2.startDate = new java.sql.Date(20 - 07 - 2024);
        b2.endDate = new java.sql.Date(21 - 07 - 2024);
        b2.noOfSeats = 18;
        b2.price = 769;

        Bus b3 = new Bus();
        b3.fromLocation = "hyd";
        b3.toLocation = "rjy";
        b3.type = "morning star";
        b3.startDate = new java.sql.Date(20 - 07 - 2024);
        b3.endDate = new java.sql.Date(21 - 07 - 2024);
        b3.noOfSeats = 18;
        b3.price = 729;

        Bus b4 = new Bus();
        b4.fromLocation = "hyd";
        b4.toLocation = "ongole";
        b4.type = "gotours";
        b4.startDate = new java.sql.Date(20 - 07 - 2024);
        b4.endDate = new java.sql.Date(21 - 07 - 2024);
        b4.noOfSeats = 18;
        b4.price = 899;

        Bus b5 = new Bus();
        b5.fromLocation = "hyd";
        b5.toLocation = "vijayawada";
        b5.type = "orange";
        b5.startDate = new java.sql.Date(20 - 07 - 2024);
        b5.endDate = new java.sql.Date(21 - 07 - 2024);
        b5.noOfSeats = 18;
        b5.price = 799;

        Bus b6 = new Bus();
        b6.fromLocation = "hyd";
        b6.toLocation = "guntur";
        b6.type = "indra";
        b6.startDate = new java.sql.Date(20 - 07 - 2024);
        b6.endDate = new java.sql.Date(21 - 07 - 2024);
        b6.noOfSeats = 18;
        b6.price = 1100;

        List<Bus> busList1 = new ArrayList<>();
        busList1.add(b1);
        busList1.add(b2);
        busList1.add(b3);
        busList1.add(b4);
        busList1.add(b5);
        busList1.add(b6);
        availableBus.availablebusList = busList1;





        /*availableBus.availablebusList.add(b1);
        availableBus.availablebusList.add(b2);
        availableBus.availablebusList.add(b3);
        availableBus.availablebusList.add(b4);
        availableBus.availablebusList.add(b5);
        availableBus.availablebusList.add(b6);*/

        SearchService service = new SearchService(availableBus);
        Search search = new Search();
        search.fromLocation = "hyd";
        search.toLocation = "rjy";
        search.startDate = new Date(20 - 07 - 2024);
        search.endDate = new Date(21 - 07 - 2024);


        service.checkAvailability(search);

        Assertions.assertEquals("hyd", search.fromLocation);
        Assertions.assertEquals("rjy", search.toLocation);


    }

    @Test
    public void forfalse() {

        AvailableBus availableBus = new AvailableBus();
        //List<Bus> busList=new ArrayList<>();

        Bus b1 = new Bus();
        b1.fromLocation = "hyd";
        b1.toLocation = "AMp";
        b1.type = "amaravathi";
        b1.startDate = new java.sql.Date(20 - 07 - 2024);
        b1.endDate = new java.sql.Date(21 - 07 - 2024);
        b1.noOfSeats = 18;
        b1.price = 999;


        Bus b2 = new Bus();
        b2.fromLocation = "hyd";
        b2.toLocation = "rjy";
        b2.type = "garuda";
        b2.startDate = new java.sql.Date(20 - 07 - 2024);
        b2.endDate = new java.sql.Date(21 - 07 - 2024);
        b2.noOfSeats = 18;
        b2.price = 769;

        Bus b3 = new Bus();
        b3.fromLocation = "hyd";
        b3.toLocation = "rjy";
        b3.type = "morning star";
        b3.startDate = new java.sql.Date(20 - 07 - 2024);
        b3.endDate = new java.sql.Date(21 - 07 - 2024);
        b3.noOfSeats = 18;
        b3.price = 729;

        Bus b4 = new Bus();
        b4.fromLocation = "hyd";
        b4.toLocation = "ongole";
        b4.type = "gotours";
        b4.startDate = new java.sql.Date(20 - 07 - 2024);
        b4.endDate = new java.sql.Date(21 - 07 - 2024);
        b4.noOfSeats = 18;
        b4.price = 899;

        Bus b5 = new Bus();
        b5.fromLocation = "hyd";
        b5.toLocation = "vijayawada";
        b5.type = "orange";
        b5.startDate = new java.sql.Date(20 - 07 - 2024);
        b5.endDate = new java.sql.Date(21 - 07 - 2024);
        b5.noOfSeats = 18;
        b5.price = 799;

        Bus b6 = new Bus();
        b6.fromLocation = "hyd";
        b6.toLocation = "guntur";
        b6.type = "indra";
        b6.startDate = new java.sql.Date(20 - 07 - 2024);
        b6.endDate = new java.sql.Date(21 - 07 - 2024);
        b6.noOfSeats = 18;
        b6.price = 1100;

        List<Bus> busList1 = new ArrayList<>();
        busList1.add(b1);
        busList1.add(b2);
        busList1.add(b3);
        busList1.add(b4);
        busList1.add(b5);
        busList1.add(b6);
        availableBus.availablebusList = busList1;





        /*availableBus.availablebusList.add(b1);
        availableBus.availablebusList.add(b2);
        availableBus.availablebusList.add(b3);
        availableBus.availablebusList.add(b4);
        availableBus.availablebusList.add(b5);
        availableBus.availablebusList.add(b6);*/

        SearchService service = new SearchService(availableBus);
        Search search = new Search();
        search.fromLocation = "hyd";
        search.toLocation = "rjy";
        search.startDate = new Date(20 - 07 - 2024);
        search.endDate = new Date(21 - 07 - 2024);


        service.checkAvailability(search);

        Assertions.assertNotNull("rjy", search.fromLocation);
        Assertions.assertNotEquals("hyd", search.toLocation);

    }
}
