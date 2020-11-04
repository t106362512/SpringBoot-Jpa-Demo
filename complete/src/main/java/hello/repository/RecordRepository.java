package hello.repository;

import hello.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RecordRepository extends JpaRepository<Record, String>, JpaSpecificationExecutor<Record> {

}