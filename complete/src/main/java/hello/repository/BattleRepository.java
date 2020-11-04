package hello.repository;

import hello.model.Battle;
import hello.model.Challenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Repository
public interface BattleRepository extends JpaRepository<Battle, String>, JpaSpecificationExecutor<Challenger> {

    Battle findByName(String btl_name);

    Battle findByDate(Date btl_date);

    Battle findByExp(Integer btl_exp);

    Battle findAllById(String id);

    @Query(value = "SELECT b, r.rcdSite, r.rcdWinner, r.rcdRecord FROM Battle b JOIN Record r ON b.id=r.btlId WHERE b.name = :name")
    Collection<Battle> findAllByNameWithRecord(@Param("name") String name);

    @Query(value = "SELECT b, r.rcdSite, r.rcdWinner, r.rcdRecord FROM Battle b JOIN Record r ON b.id=r.btlId")
    List<Battle> getAllBattleWithRecord();

}
