package sg.userServer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("feed-server")
public interface FeignClientCommunicator {
    @RequestMapping(method= RequestMethod.GET, value="feed-server/name/{id}")
    String getName(@PathVariable("id") String id);
}
