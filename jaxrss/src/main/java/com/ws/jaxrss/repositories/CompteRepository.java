package com.ws.jaxrss.repositories;

import com.ws.jaxrss.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
