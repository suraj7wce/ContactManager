package com.suraj.example.contactmanager.controller;


import com.suraj.example.contactmanager.model.Contact;
import com.suraj.example.contactmanager.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/")
    public String showContactList(Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        return "contactList";
    }

    @GetMapping("/addContact")
    public String showAddContactForm(Contact contact) {
        return "contactForm";
    }

    @PostMapping("/addContact")
    public String addContact(Contact contact) {
        contactRepository.save(contact);
        return "redirect:/";
    }
}

