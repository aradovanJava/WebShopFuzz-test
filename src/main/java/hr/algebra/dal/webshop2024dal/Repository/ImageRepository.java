package hr.algebra.dal.webshop2024dal.Repository;

import hr.algebra.dal.webshop2024dal.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long> {
}
