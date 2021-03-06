package com.groupone.model;

import javax.persistence.*;

@Entity
@Table(name = "lab", schema = "j2ee")
public class LabEntity {
    private int labId;
    private String labName;
    private int location;
    private int safeLevel;

    @Id
    @Column(name = "labID")
    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    @Basic
    @Column(name = "labName")
    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    @Basic
    @Column(name = "location")
    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Basic
    @Column(name = "safeLevel")
    public int getSafeLevel() {
        return safeLevel;
    }

    public void setSafeLevel(int safeLevel) {
        this.safeLevel = safeLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LabEntity labEntity = (LabEntity) o;

        if (labId != labEntity.labId) return false;
        if (location != labEntity.location) return false;
        if (safeLevel != labEntity.safeLevel) return false;
        if (labName != null ? !labName.equals(labEntity.labName) : labEntity.labName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = labId;
        result = 31 * result + (labName != null ? labName.hashCode() : 0);
        result = 31 * result + location;
        result = 31 * result + safeLevel;
        return result;
    }
}
