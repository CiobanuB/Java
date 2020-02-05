package ro.sda.webdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.sda.webdata.persistence.car.CarEntity;
import ro.sda.webdata.persistence.service.CarService.CarService;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("car")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("save")
    @ResponseBody
    public String save(@RequestBody CarSaveBody carSaveBody) {
        carService.save(carSaveBody);
        return "OK";
    }
    @GetMapping(value = "all/lite")
    public List<LiteCar> lite(){
        List<LiteCar> cars =  carService.findAll().stream()
                .map( entity -> new LiteCar(entity.getModel(), entity.getHp()) )
               .collect(Collectors.toList());
        return cars;
    }

    @GetMapping(value = "all",produces = { MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<CarEntity> all() {
        return carService.findAll();
    }

    @GetMapping(value = "search/{model}",produces = { MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public List<CarEntity> search(@PathVariable("model") String m){

        return carService.searchByModel(m);
    }
    @ExceptionHandler(java.sql.SQLException.class)
    public ExceptionMessage handleSQLExceptions(SQLException e){
        return new ExceptionMessage("Could not work with the DB");

    }
}
