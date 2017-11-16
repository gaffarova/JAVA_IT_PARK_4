public class CarService {

    private CarsDao carsDao;

    public CarService(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    public void registerCar(Car car) {
        String number = car.getNumber();

        Car existingCar = carsDao.findOneByNumber(number);
        if (existingCar != null) {
            throw new IllegalArgumentException("Already exist");
        }
        carsDao.save(car);
    }
}
