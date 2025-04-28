package ch.fhnw.car_rental.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


import ch.fhnw.car_rental.service.AdminService;
import ch.fhnw.car_rental.data.domain.Admin;
import ch.fhnw.car_rental.data.repository.AdminRepository;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(path = "/api")
public class AdminController {

    @Autowired
    private AdminService adminService;
    
        // GET: Hole einen Admin anhand der ID
        @GetMapping(path = "/admin/{id}", produces = "application/json")
        public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
            try {
                Admin admin = adminService.findAdminById(id);
                if (admin == null) {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Admin not found");
                }
                return ResponseEntity.ok(admin);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            }
        }
    
        // GET: Hole alle Admins
        @GetMapping(path = "/adminlist", produces = "application/json")
        public ResponseEntity<List<Admin>> getAllAdmins() {
            try {
                List<Admin> admins = adminService.getAllAdmins();
                if (admins.isEmpty()) {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No admins found");
                }
                return ResponseEntity.ok(admins);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            }
        }
    
        // POST: Füge einen neuen Admin hinzu
        @PostMapping(path="/admin", consumes="application/json", produces = "application/json")
        public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
            try {
                Admin savedAdmin = adminService.addAdmin(admin);
                return ResponseEntity.status(HttpStatus.CREATED).body(savedAdmin);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
            }
        }
    

        // PUT: Aktualisiere einen bestehenden Admin
        @PutMapping(path = "/admin/{id}", consumes = "application/json", produces = "application/json")
public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin admin) {
    try {
        Admin existingAdmin = adminService.findAdminById(id);
        if (existingAdmin == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Admin not found");
        }

        // Aktualisiere die Felder des bestehenden Admins
        existingAdmin.setUsername(admin.getUsername());
        existingAdmin.setPassword(admin.getPassword());

        Admin updatedAdmin = adminService.updateAdmin(existingAdmin);
        return ResponseEntity.ok(updatedAdmin);
    } catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
}
    
        // DELETE: Lösche einen Admin anhand der ID
        @DeleteMapping(path = "admin/{id}")
        public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
            try {
                Admin deletedAdmin = adminService.deleteAdmin(id);
                if (deletedAdmin == null) {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Admin not found");
                }
                return ResponseEntity.noContent().build();
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            }
        }
    }
