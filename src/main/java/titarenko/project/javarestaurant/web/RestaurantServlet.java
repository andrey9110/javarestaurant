package titarenko.project.javarestaurant.web;



import titarenko.project.javarestaurant.repository.InMemoryRestaurantRepositoryImpl;
import titarenko.project.javarestaurant.repository.RestaurantRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MyMac on 06.04.16.
 */
public class RestaurantServlet extends HttpServlet {

    private RestaurantRepository repository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        repository = new InMemoryRestaurantRepositoryImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("restaurantList",repository.getAll());
        request.getRequestDispatcher("/restaurantList.jsp").forward(request, response);
    }

}
