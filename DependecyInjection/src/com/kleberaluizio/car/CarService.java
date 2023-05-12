package com.kleberaluizio.car;

import com.kleberaluizio.Mot.MOTService;
import com.kleberaluizio.email.EmailService;

//@Component
public class CarService {

    private CarDAO carDAO;
    private EmailService emailService;
    private MOTService motService;

//    @Autowired / @Inject
    public CarService(
            CarDAO carDAO,
            EmailService emailService,
            MOTService motService){
        this.carDAO = carDAO;
        this.emailService = emailService;
        this.motService = motService;
    }
    public int registerNewCar(Car car){
        // check if car is not null
        // check if reg number is valid
        // check if reg number is not taken
        // if price is < 0
        carDAO.saveCar(car);
        return 1;
    }

    public Car[] getCars(){
        return carDAO.selectAllCars();
    }
}
