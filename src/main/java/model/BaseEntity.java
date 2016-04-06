package model;

/**
 * Created by MyMac on 03.04.16.
 */
public class BaseEntity {

    public static final int START_SEQ = 100000;

    protected Integer id;

    public BaseEntity() {
    }

    protected BaseEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return (this.id == null);
    }
}
