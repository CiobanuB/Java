package ro.sda.webdata.persistence.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarEntity,Long> {

        List<CarEntity> findByModel(String m);
}
