//
//package com.example.ems.repository;
//
//import java.util.List;
//import java.util.Optional;
//
//import com.example.ems.Entities.Organizer;
//
//public class OrganizerRepository {
//
//	public Organizer save(Organizer organizer) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Optional<Organizer> findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<Organizer> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void deleteById(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}



package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ems.Entities.Organizer;

public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {
}
