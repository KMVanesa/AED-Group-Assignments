/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.Reciever;

/**
 *
 * @author chief_kmv
 */
public class EmergencyReq extends WorkRequest {
    private Reciever organReciever;

    public Reciever getOrganReciever() {
        return organReciever;
    }

    public void setOrganReciever(Reciever reciever) {
        this.organReciever = reciever;
    }
}
