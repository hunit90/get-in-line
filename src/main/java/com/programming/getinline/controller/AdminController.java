package com.programming.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/places")
    public String places() { return "admin/places"; }

    @GetMapping("/places/{placeId}")
    public String adminPlaceDetail(@PathVariable Integer placeId) { return "admin/place-detail"; }

    @GetMapping("/events")
    public String events() { return "admin/events"; }

    @GetMapping("/events/{eventId}")
    public String adminEventDetail(@PathVariable Integer eventId) { return "admin/event-detail"; }
}
