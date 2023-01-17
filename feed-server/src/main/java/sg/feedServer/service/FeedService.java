package sg.feedServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sg.feedServer.domain.FeedEntity;
import sg.feedServer.feign.FeignClientCommunicator;
import sg.feedServer.repository.FeedRepository;

@Service
public class FeedService {
    @Autowired
    FeedRepository feedRepository;
    @Autowired
    FeignClientCommunicator feignClientCommunicator;
    public String getName(String id) {
        switch (id) {
            case "1":
                return "user1";
            case "2":
                return "user2";
            default:
                return "UnKnown";
        }
    }
    public void addFeed(String feed){
        FeedEntity feedEntity = new FeedEntity(feed + "1", feed + "2");
        feedRepository.save(feedEntity);
    }
    public String getUser(String name){
        return feignClientCommunicator.printName(name);
    }
}
