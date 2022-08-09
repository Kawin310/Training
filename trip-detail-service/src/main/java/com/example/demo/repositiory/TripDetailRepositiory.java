package com.example.demo.repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.TripDetail;
@Repository
public interface TripDetailRepositiory extends JpaRepository<TripDetail, Integer> {

	List<TripDetail> findByDriverId(int id);
	
	
}
