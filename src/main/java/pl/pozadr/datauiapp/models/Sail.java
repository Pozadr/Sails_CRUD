package pl.pozadr.datauiapp.models;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDate;


@Entity
public class Sail {
    @Id
    @NotNull(message = "ID cannot be null.")
    @Min(value = 1, message = "ID must be greater than 1.")
    private Integer id;

    @NotNull(message = "Mark cannot be null.")
    @NotBlank(message = "Mark cannot be blank.")
    private String mark;

    @NotNull(message = "Model cannot be null.")
    @NotBlank(message = "Model cannot be blank.")
    private String model;

    @NotNull(message = "Updated by cannot be null.")
    @NotBlank(message = "Updated by cannot be blank.")
    private String updatedBy;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate updatedOn;

    public Sail() {
    }

    public Sail(Integer id, String mark, String model, String updatedBy, LocalDate updatedOn) {
        this.id = id;
        this.model = model;
        this.mark = mark;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDate getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "Sail{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
