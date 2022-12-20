package com.taskmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="Tarefas")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="presentationOrder", nullable = false)
    private long presentationOrder;
    @Column(name="name", nullable = false, unique = true)
    private String name;
    @Column(name="value", nullable = false)
    private double value;

    @Column
    private LocalDate date;

    public Task() {

    }
    public Task(long id, String name, int presentationOrder, double value, LocalDate date) {
        this.name = name;
        this.id = id;
        this.presentationOrder = presentationOrder;
        this.value = value;
        this.date = date;
    }

    @Override
    public String toString() {
        return this.presentationOrder + " - " + this.name + " - " + this.value;
    }
}
