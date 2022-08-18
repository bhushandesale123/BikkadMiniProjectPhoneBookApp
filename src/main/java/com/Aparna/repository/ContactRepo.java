package com.Aparna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aparna.Entity.Contact;

public interface ContactRepo extends JpaRepository<Contact,Integer> {

}
