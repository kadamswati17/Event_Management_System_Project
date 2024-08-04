package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.ems.Entities.Venue;

public interface VenueRepository extends JpaRepository<Venue,Long> {

}
