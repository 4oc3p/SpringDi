import com.dao.CarDAOInterface;
import com.model.Car;
import com.service.CarServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 4oc3p on 18.05.2017. autoservice
 */
public class CarTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CarServiceInterface carService1 = applicationContext.getBean("carService1", CarServiceInterface.class);
        CarServiceInterface carService2 = applicationContext.getBean("carService2", CarServiceInterface.class);

        carService1.getAllCars().forEach(Car::carMove);
        carService2.getAllCars().forEach(Car::carMove);
    }

}
