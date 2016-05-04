package titarenko.project.javarestaurant.util.exceptions;

/**
 * Created by MyMac on 4/27/16.
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
