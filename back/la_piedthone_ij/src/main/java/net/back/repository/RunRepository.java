package net.back.repository;

import net.back.model.Run;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunRepository  extends JpaRepository<Run, Integer> {

}
