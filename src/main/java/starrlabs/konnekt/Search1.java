package starrlabs.konnekt;

public class Search1 {
    private String kv;
    private final String username;

    public Search1(String kv, String username) {
        this.kv = kv;
        this.username = username;
    }

    public String getKv() {
        return kv;
    }

    public void setKv(String kv) {
        this.kv = kv;
    }

    public String getUsername() {
        return username;
    }
}
