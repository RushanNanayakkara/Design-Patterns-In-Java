package proxy;

import proxy.models.FullResponse;

public class ServiceImpl implements Service {
    
    @Override
    public FullResponse generatResponse(String type) throws Exception{
        return new FullResponse(100, "This is company secret");
    }
}
