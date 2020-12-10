package pl.pozadr.datauiapp.models;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Sail {
    @Id
    private Integer id;
    private String model;
    private String mark;
    private String updatedBy;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedOn;

    public Sail() {
    }

    public Sail(Integer id, String model, String mark, String updatedBy, Date updatedOn) {
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

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
