package com.suraj.example.contactmanager.repository;


import com.suraj.example.contactmanager.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
