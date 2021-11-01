package proxy.models;

public class FullResponse extends Response {
    public int notASecret;
    public String companySecret;

    public FullResponse(int notASecret, String compSecret){
        this.notASecret = notASecret;
        this.companySecret = compSecret;
    }

}
