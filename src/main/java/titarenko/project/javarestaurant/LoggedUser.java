import model.BaseEntity;

/**
 * GKislin
 * 06.03.2015.
 */
public class LoggedUser {
    private static int id = BaseEntity.START_SEQ;

    private LoggedUser() {
    }

    public static int id() {
        return id;
    }

    public static void setId(int id) {
        LoggedUser.id = id;
    }

}
