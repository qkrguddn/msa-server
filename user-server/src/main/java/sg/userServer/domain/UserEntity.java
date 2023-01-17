package sg.userServer.domain;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;



@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String userFeild1;

    private String userFeild2;

    public UserEntity(String userFeild1, String userFeild2){
        this.userFeild1 = userFeild1;
        this.userFeild2 = userFeild2;
    }

}
