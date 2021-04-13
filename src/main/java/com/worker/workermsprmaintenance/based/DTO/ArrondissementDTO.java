package com.worker.workermsprmaintenance.based.DTO;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="arrondissement")
public class ArrondissementDTO {

    private int id;

    public ArrondissementDTO(int id) {
        this.id = id;
    }

    public ArrondissementDTO() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ArrondissementDTO{" +
                "id=" + id +
                '}';
    }
}
