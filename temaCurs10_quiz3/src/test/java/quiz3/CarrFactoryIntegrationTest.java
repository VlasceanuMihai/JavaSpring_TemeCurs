package quiz3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/19/2020
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ConfigQuiz3.class, loader = AnnotationConfigContextLoader.class)
class CarrFactoryIntegrationTest {

    @Autowired
    CarFactory carFactory;

    @Test
    void createCar_electric() {
        Car electricCar = this.carFactory.createCar("Opel", "electric");
        Assertions.assertEquals(PolutionCategory.LOW.toString(), electricCar.getPolutionCategory().toString());
    }

    @Test
    void createCar_diesel(){
        Car dieselCar = this.carFactory.createCar("Audi", "diesel");
        Assertions.assertEquals(PolutionCategory.HIGH.toString(), dieselCar.getPolutionCategory().toString());
    }

    @Test
    void createCar_petrol(){
        Car petrolCar = this.carFactory.createCar("Bmw", "petrol");
        Assertions.assertEquals(PolutionCategory.MEDIUM.toString(), petrolCar.getPolutionCategory().toString());
    }

    @Test
    void createCar_nonExisted(){
        try{
            Car car = this.carFactory.createCar("Volvo", "carbuni");
            Assertions.fail();
        }catch (IllegalArgumentException e){
            Assertions.assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }
}
