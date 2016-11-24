package com.courses.spalah.service;

import com.courses.spalah.domain.*;
import com.courses.spalah.persistence.Dao;
import com.courses.spalah.persistence.DaoForFlight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ievgen Tararaka
 */
@Configuration
public class ServiceConfiguration {
    @Bean
    PersonService personService(Dao<Person, Long> personDao) {
        return new PersonServiceImpl(personDao);
    }

    @Bean
    PlaneService planeService(Dao<Plane, Long> planeDao) {
        return new PlaneServiceImpl(planeDao);
    }

    @Bean
    SeatService seatService(Dao<Seat, Long> seatDao) {
        return new SeatServiceImpl(seatDao);
    }

    @Bean
    LocationService locationService(Dao<Location, Long> locationDao) {
        return new LocationServiceImpl(locationDao);
    }

    @Bean
    TicketService ticketService(Dao<Ticket, Long> ticketDao) {
        return new TicketServiceImpl(ticketDao);
    }
    @Bean
    FlightService flightService(DaoForFlight<Flight, Long, RawFlight> flightDao) {
        return new FlightServiceImpl(flightDao);
    }
}
