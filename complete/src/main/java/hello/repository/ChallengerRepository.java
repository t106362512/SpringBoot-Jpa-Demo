package hello.repository;

import hello.model.Challenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengerRepository extends JpaRepository<Challenger, String>, JpaSpecificationExecutor<Challenger> {
    List<Challenger> findByCgrName(String name);
}