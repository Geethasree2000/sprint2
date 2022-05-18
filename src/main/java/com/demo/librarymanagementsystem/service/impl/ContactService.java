package com.demo.librarymanagementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.librarymanagementsystem.entity.Contact;
import com.demo.librarymanagementsystem.repository.ContactRepository;
@Service
public class ContactService {
	@Autowired
    private ContactRepository repo;
    public void save(Contact contact) {
        repo.save(contact);
    }
     
}
