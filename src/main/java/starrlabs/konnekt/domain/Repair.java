package starrlabs.konnekt.domain;
        import javax.persistence.*;
        import java.time.LocalDate;
        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Entity
public class Repair {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
  //  @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer kv;
    private String username;
    private String device;
    private String failure;
    private String acceptdate;
    private String readydate;
    private String repairstatus;

    public Repair() {

    }

    public Repair(String username, String device, String failure) {
        this.username = username;

        int max = 100000;
        int min = 3000;
        int range = max - min + 1;

        this.kv = (int)(Math.random() * range) + min;
        this.device = device;
        this.failure = failure;
        this.acceptdate="Unknown";
        this.readydate="Unknown";
        this.repairstatus="Status";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKv() {
        return kv;
    }

    public void setKv(Integer kv) {
        this.kv = kv;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public String getAcceptdate() {
        return acceptdate;
    }

    public void setAcceptdate(String acceptdate) {
        this.acceptdate = acceptdate;
    }

    public String getReadydate() {
        return readydate;
    }

    public void setReadydate(String readydate) {
        this.readydate = readydate;
    }

    public String getRepairstatus() {
        return repairstatus;
    }

    public void setRepairstatus(String repairstatus) {
        this.repairstatus = repairstatus;
    }
}