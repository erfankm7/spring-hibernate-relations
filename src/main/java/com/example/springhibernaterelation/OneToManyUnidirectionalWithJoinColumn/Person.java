package com.example.springhibernaterelation.OneToManyUnidirectionalWithJoinColumn;

import org.springframework.context.annotation.Profile;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Profile("3")
@Table(name = "person3")
@Entity(name = "person3")
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String name;

  @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
  @JoinColumn(name = "personID")
  private List<Car> carList;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Car> getCarList() {
    return carList;
  }

  public void setCarList(List<Car> carList) {
    this.carList = carList;
  }
}
