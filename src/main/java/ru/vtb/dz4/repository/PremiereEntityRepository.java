package ru.vtb.dz4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.vtb.dz4.entity.PremiereEntity;

public interface PremiereEntityRepository extends JpaRepository<PremiereEntity, Long> {

    @Query("from PremiereEntity p where p.name = :name")
    PremiereEntity findByName(@Param("name") String name);

}
