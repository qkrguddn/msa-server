package sg.feedServer.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity
public class FeedEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String feedFeild1;

    private String feedFeild2;

    public FeedEntity(String feedFeild1, String feedFeild2){
        this.feedFeild1 = feedFeild1;
        this.feedFeild2 = feedFeild2;
    }

}
