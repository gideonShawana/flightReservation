package com.gideonshawana.spring.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/show-reservation")
    public String showReservations(Model model) {
    	List<Reservation> reservations = (List<Reservation>) reservationRepository.findAll();
        model.addAttribute("reservations", reservations);
        return "show-reservation";
    }
}