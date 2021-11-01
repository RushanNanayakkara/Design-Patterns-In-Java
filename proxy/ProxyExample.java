package proxy;

import proxy.models.FilteredResponse;
import proxy.models.FullResponse;
import proxy.models.Response;
import proxy.service_proxy.Proxy;

public class ProxyExample {
    public static void main(String[] args) {
        Service service = new Proxy();
        try {
            FullResponse adminResponse = (FullResponse)service.generatResponse("ADMIN");
            System.out.println(String.format("Admin response : %s",adminResponse.getClass().toString()));

            FilteredResponse userResponse = (FilteredResponse)service.generatResponse("USER");
            System.out.println(String.format("User response : %s",userResponse.getClass().toString()));

            Response otherResponse = service.generatResponse("OTHER");
            System.out.println(String.format("Other response : %s",otherResponse.getClass().toString())); // this won't get printed 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
