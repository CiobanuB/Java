package ro.sda.webdata.persistence.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.sda.webdata.controller.CarSaveBody;
import ro.sda.webdata.persistence.car.CarEntity;
import ro.sda.webdata.persistence.car.CarRepository;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    @Transactional
    public void save(CarSaveBody carSaveBody){
        CarEntity carEntity = new CarEntity();
        carEntity.setModel(carSaveBody.getModel());
        carEntity.setColor(carSaveBody.getColor());
        carEntity.setHp(carSaveBody.getHp());
        carEntity.setKm(carSaveBody.getCarInfo().getKm());
        carEntity.setYear(carSaveBody.getCarInfo().getYear());
        carRepository.save(carEntity);
    }

    @Transactional(readOnly = true)
    public List<CarEntity> findAll(){
        return carRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<CarEntity> searchByModel(String model){
        return carRepository.findByModel(model);
    }
}
