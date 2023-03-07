package com.vasudev.springboot.location.interfaces;

import com.vasudev.springboot.location.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location ,Long> {
    @Query("select type, count(type) from location where group by type")
    public List<Object[]> findTypeAndTypeCount();

}
