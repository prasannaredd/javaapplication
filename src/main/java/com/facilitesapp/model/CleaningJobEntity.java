
        package com.facilitesapp.model;
import com.facilitesapp.model.BlockEntity;
import com.facilitesapp.model.FloorEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cleaning_job")
public class CleaningJobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "time")
    private LocalTime time;
    @ManyToOne
    private BlockEntity blockEntity;
    @ManyToOne
    private FloorEntity floorEntity;
    @Column(name = "cleaner_name")
    private String cleanerName;
    @Column(name = "area")
    private String area;
    @Column(name = "notes")
    private String notes;
}

