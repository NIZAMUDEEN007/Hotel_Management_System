package com.example.hotel.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="service")
public class Service {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  @Column(name="name", nullable=false, unique=true)
  private String name;
  
  @Column(name="description", nullable=false)
  private String description;
  
  @Column(name="price", nullable=false)
  private Double price;
  

}
