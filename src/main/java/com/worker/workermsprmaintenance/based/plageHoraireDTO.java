package com.worker.workermsprmaintenance.based;

import sun.jvm.hotspot.ui.EditableAtEndDocument;

import java.util.Date;

public class plageHoraireDTO {

    private Date fin;
    private Date debut;


    public plageHoraireDTO(Date fin, Date debut) {
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



}
