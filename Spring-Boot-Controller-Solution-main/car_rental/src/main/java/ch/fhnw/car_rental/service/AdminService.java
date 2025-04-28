package ch.fhnw.car_rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch.fhnw.car_rental.data.domain.Admin;
import ch.fhnw.car_rental.data.repository.AdminRepository;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin findAdminById(Long adminId) {
        return adminRepository.findById(adminId).orElse(null);
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin findAdminByAdminId(Long adminId) {
        return adminRepository.findByAdminId(adminId); // Methodennamen geändert
    }

    public Admin addAdmin(Admin admin) throws Exception {
        if (admin.getUsername() == null || admin.getUsername().isEmpty()) {
            throw new Exception("Username cannot be null or empty");
        }
        if (admin.getPassword() == null || admin.getPassword().isEmpty()) {
            throw new Exception("Password cannot be null or empty");
        }
        return adminRepository.save(admin);
    }

    public Admin deleteAdmin(Long adminId) {
        Admin admin = findAdminById(adminId);
        if (admin != null) {
            adminRepository.delete(admin);
        }
        return admin;
    }

    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
