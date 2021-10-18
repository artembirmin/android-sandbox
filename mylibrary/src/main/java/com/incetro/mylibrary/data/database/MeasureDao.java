package com.incetro.mylibrary.data.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.incetro.mylibrary.model.Measure;

import java.util.List;

@Dao
public interface MeasureDao {
 
   @Query("SELECT * FROM measure")
   List<Measure> getAll();
 
   @Query("SELECT * FROM measure WHERE id = :id")
   Measure getById(long id);

   @Insert
   void insert(Measure employee);
 
}