package com.example.ems.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.Entities.Venue;
import com.example.ems.repository.VenueRepository;

@Service
public class VenueService {

    @Autowired
    private VenueRepository venueRepository;

    public List<Venue> getAllVenues() {
        return venueRepository.findAll();
    }

    public Optional<Venue> getVenueById(Long id) {
        return venueRepository.findById(id);
    }

    public Venue saveVenue(Venue venue) {
        return venueRepository.save(venue);
    }

    public Venue updateVenue(Long id, Venue venueDetails) {
        return venueRepository.findById(id)
            .map(venue -> {
                venue.setName(venueDetails.getName());
                venue.setLocation(venueDetails.getLocation());
                venue.setCapacity(venueDetails.getCapacity());
                return venueRepository.save(venue);
            })
            .orElseThrow(() -> new RuntimeException("Venue not found with id " + id));
    }

    public void deleteVenue(Long id) {
        venueRepository.deleteById(id);
    }
}
