package proxy.service_proxy;

import proxy.Service;
import proxy.ServiceImpl;
import proxy.models.FilteredResponse;
import proxy.models.FullResponse;
import proxy.models.Response;

public class Proxy implements Service {

    private Service service;

    public Proxy(){
        this.service = new ServiceImpl();
    }

    @Override
    public Response generatResponse(String type) throws Exception{
        if(type=="ADMIN"){
            return service.generatResponse(type);
        }
        if(type=="USER"){
            FullResponse res = (FullResponse)service.generatResponse(type);
            return new FilteredResponse(res);
        }
        throw new Exception("Unauthorized user type!");
    }
}
