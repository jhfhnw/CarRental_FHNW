package ch.fhnw.car_rental.data.repository;

import ch.fhnw.car_rental.data.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByAdminId(Long adminId);
}