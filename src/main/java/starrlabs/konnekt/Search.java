package starrlabs.konnekt;

public class Search {
    private int found;
    private int kv;
    private final String username;
    private final String repairstatus;


    public Search(int found , int kv, String username, String repairstatus) {
        this.kv = kv;
        this.username = username;
        this.repairstatus = repairstatus;
        this.found = found;
    }

    public int getKv() {
        return kv;
    }

    public String getUsername() {
        return username;
    }

    public int getFound() {
        return found;
    }

    public String getRepairstatus() {
        return repairstatus;
    }
}

