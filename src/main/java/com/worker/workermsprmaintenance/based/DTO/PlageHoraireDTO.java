package com.worker.workermsprmaintenance.based.DTO;

import java.util.Date;

public class PlageHoraireDTO {

    private Date fin;
    private Date debut;


    public PlageHoraireDTO(Date fin, Date debut) {
        this.fin = fin;
        this.debut = debut;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Date getFin() {
        return fin;
    }

    public Date getDebut() {
        return debut;
    }


    public void setDebut(Date debut) {
        this.debut = debut;
    }

    @Override
    public String toString() {
        return "PlageHoraireDTO{" +
                "fin=" + fin +
                ", debut=" + debut +
                '}';
    }
}
