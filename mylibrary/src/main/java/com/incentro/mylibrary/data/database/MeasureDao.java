package com.incentro.mylibrary.data.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.incentro.mylibrary.model.Measure;

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