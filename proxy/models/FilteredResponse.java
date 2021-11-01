package proxy.models;

public class FilteredResponse extends Response {
    public int notASecret;

    public FilteredResponse(FullResponse res){
        this.notASecret = res.notASecret;
    }
}
