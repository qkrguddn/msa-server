package sg.feedServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sg.feedServer.domain.FeedEntity;

@Repository
public interface FeedRepository extends JpaRepository<FeedEntity, Long> {
}
