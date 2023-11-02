package kg.megalab.finalprojectformegalab.repositories;

import kg.megalab.finalprojectformegalab.models.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepo extends JpaRepository <Admin,Long> {
    Optional<Admin>findByAdminName(String adminName);

}
