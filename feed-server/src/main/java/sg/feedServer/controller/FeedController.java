package sg.feedServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sg.feedServer.service.FeedService;

@RestController
@RequestMapping("/feed-server")
public class FeedController {

    @Autowired
    FeedService feedService;

    @GetMapping("")
    public String feedServer() {
        return  "feed server ok";
    }

    @GetMapping("name/{id}")
    public String name(@PathVariable("id") String id) {
        return feedService.getName(id);
    }
    @GetMapping("/{feed}")
    public void addfeed(@PathVariable("feed")String feed){
        feedService.addFeed(feed);
    }
    @GetMapping("/feign/{name}")
    public String userName(@PathVariable("name")String name){
         return feedService.getUser(name);
    }
}
