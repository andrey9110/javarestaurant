package titarenko.project.javarestaurant;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import titarenko.project.javarestaurant.model.Dish;
import titarenko.project.javarestaurant.model.Restaurant;
import titarenko.project.javarestaurant.model.Role;
import titarenko.project.javarestaurant.model.User;
import titarenko.project.javarestaurant.repository.UserRepository;
import titarenko.project.javarestaurant.repository.memory.InMemoryRestaurantRepositoryImpl;
import titarenko.project.javarestaurant.service.UserService;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by MyMac on 4/26/16.
 */
public class Main {
    public static void main(String[] args) {
//
//        InMemoryRestaurantRepositoryImpl i = new InMemoryRestaurantRepositoryImpl();
//
//        Dish dish = new Dish("!!!!!!!!!!!", 150);
//        System.out.println((i.saveDish(2,dish)).getId());
//      i.saveDish(2,new Dish("!sddcs!!!!", 30));
//      i.saveDish(2,new Dish("dcdccscs", 30));
//
//        Dish dish2 = new Dish("!!!!---", 150);
//        dish2.setId(4);
//        i.saveDish(2,dish2);
//        for (Dish d:i.getRestaurantMenu(2)) {
//            System.out.println(d.getId());
//        }
//        System.out.println(i.getRestaurantMenu(2));
//        i.deleteDish(2,100007);
//        System.out.println(i.getRestaurantMenu(2));
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println(Arrays.toString(appCtx.getBeanDefinitionNames()));

//        UserRepository userRepository = (UserRepository) appCtx.getBean("mockUserRepository");
        UserRepository userRepository = appCtx.getBean(UserRepository.class);
        userRepository.getAll();

        UserService userService = appCtx.getBean(UserService.class);
        System.out.println(userService.save(new User(1, "userName", "email", "password", Role.ROLE_ADMIN)));

        appCtx.close();

    }
}
