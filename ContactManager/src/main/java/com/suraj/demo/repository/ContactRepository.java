package com.suraj.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.demo.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}

