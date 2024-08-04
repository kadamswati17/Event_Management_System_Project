package com.example.ems.Service;

import com.example.ems.Entities.Events;
import com.example.ems.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // Create a new event
    public Events createEvent(Events event) {
        return eventRepository.save(event);
    }

    // Get all events
    public List<Events> getAllEvents() {
        return eventRepository.findAll();
    }

    // Get event by ID
    public Optional<Events> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    // Update event
    public Events updateEvent(Long id, Events eventDetails) {
        return eventRepository.findById(id)
            .map(event -> {
                event.setEventName(eventDetails.getEventName());
                event.setEventDate(eventDetails.getEventDate());
                event.setDescription(eventDetails.getDescription());
                event.setVenue(eventDetails.getVenue());
                event.setOrganizer(eventDetails.getOrganizer());
                return eventRepository.save(event);
            })
            .orElseThrow(() -> new RuntimeException("Event not found with id " + id));
    }

    // Delete event
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    // Get events by venue ID
    public List<Events> getEventsByVenue(Long venueId) {
        return eventRepository.findByVenueId(venueId);
    }

    // Get events by organizer ID
    public List<Events> getEventsByOrganizer(Long organizerId) {
        return eventRepository.findByOrganizerId(organizerId);
    }
}
