package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.RegionNode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<RegionNode, Integer> {
    RegionNode findByName(String name);
}
