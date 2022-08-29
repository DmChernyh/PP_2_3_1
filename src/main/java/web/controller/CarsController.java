package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCarsByCount(@RequestParam(value = "count", defaultValue = "5") int i, Model model) {
        model.addAttribute("cars",carService.getCarsByCount(i));
        return "cars";

    }
}
