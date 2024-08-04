package com.example.ems.repository;

import com.example.ems.Entities.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Events, Long> {
    List<Events> findByVenueId(Long venueId);
    List<Events> findByOrganizerId(Long organizerId);
}
