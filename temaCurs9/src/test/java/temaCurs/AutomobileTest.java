package temaCurs;

import com.devmind.annotations.temaCurs.AutomobileConfig;
import com.devmind.annotations.temaCurs.AutomobileInterfaceService;
import com.devmind.annotations.temaCurs.AutomobileService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/17/2020
 */

@RunWith(MockitoJUnitRunner.class)
public class AutomobileTest {

    private static AnnotationConfigApplicationContext applicationContext;

    @Mock
    AutomobileService automobileService;

    @BeforeClass
    public static void setup(){
         applicationContext = new AnnotationConfigApplicationContext(AutomobileConfig.class);
    }

    @Test
    public void testApplicationContext(){
        System.out.println("--- testApplicationContext ---");
        AutomobileService automobileServiceBean = applicationContext.getBean("automobileService", AutomobileService.class);

        System.out.println(automobileServiceBean.travelWithBus());
        System.out.println(automobileServiceBean.travelWithCar());
        System.out.println(automobileServiceBean.travelWithMotorcycle());
        System.out.println();

        automobileServiceBean.motorToStringForCar();
        automobileServiceBean.motorToStringForBus();
        automobileServiceBean.motorToStringForMotorcycle();
        System.out.println();
    }

    @Test
    public void testAutomobileService(){
        System.out.println("--- testAutomobileService ---");

        Mockito.when(automobileService.travelWithBus()).thenReturn("[Bus trip] Travel to Bulgaria with bus");
        Mockito.when(automobileService.travelWithCar()).thenReturn("[Car trip] Travel to Grecia with car");
        Mockito.when(automobileService.travelWithMotorcycle()).thenReturn("[Motorcycle trip] Travel to Cluj-Napoca with motorcycle");

        Assert.assertEquals("[Bus trip] Travel to Bulgaria with bus", automobileService.travelWithBus());
        Assert.assertEquals("[Car trip] Travel to Grecia with car", automobileService.travelWithCar());
        Assert.assertEquals("[Motorcycle trip] Travel to Cluj-Napoca with motorcycle", automobileService.travelWithMotorcycle());
    }

    @Test
    public void testAutomobileInterfaceService(){
        System.out.println("--- testAutomobileInterfaceService ---");
        AutomobileInterfaceService automobileInterfaceService = applicationContext.getBean("automobileInterfaceService", AutomobileInterfaceService.class);
        System.out.println(automobileInterfaceService.getMaxSpeedForCar());
        System.out.println(automobileInterfaceService.getMaxSpeedForMotorcycle());
    }
}
