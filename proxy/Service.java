package proxy;

import proxy.models.Response;

public interface Service {
    public Response generatResponse(String type) throws Exception;
}
