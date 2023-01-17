package sg.feedServer.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-server")
public interface FeignClientCommunicator {
    @RequestMapping(method= RequestMethod.GET, value="user-server/{name}")
    String printName(@PathVariable("name") String name);
}
