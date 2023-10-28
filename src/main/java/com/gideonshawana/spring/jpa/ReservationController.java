package com.gideonshawana.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/reservation")
    public String reservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation";
    }
   
    @PostMapping("/bookReservation")
    public String bookReservation(@ModelAttribute Reservation reservation) {
        reservationRepository.save(reservation);
        return "redirect:/show-reservation";
    }
}
