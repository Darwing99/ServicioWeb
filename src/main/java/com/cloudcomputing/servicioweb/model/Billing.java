package com.cloudcomputing.servicioweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="billing")
public class Billing {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
        private int id;
        private String descripcion;
        private int id_user;
        private double debit;
        private double credit;
        public Billing(int id, String descripcion, int id_user, double debit, double credit) {
            this.id = id;
            this.descripcion = descripcion;
            this.id_user = id_user;
            this.debit = debit;
            this.credit = credit;
        }
        
        public Billing() {
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        public int getId_user() {
            return id_user;
        }
        public void setId_user(int id_user) {
            this.id_user = id_user;
        }
        public double getDebit() {
            return debit;
        }
        public void setDebit(double debit) {
            this.debit = debit;
        }
        public double getCredit() {
            return credit;
        }
        public void setCredit(double credit) {
            this.credit = credit;
        }
        


    
}
