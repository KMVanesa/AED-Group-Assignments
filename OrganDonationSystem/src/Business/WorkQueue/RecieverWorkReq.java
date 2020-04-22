/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.Donor;
import Business.UserAccount.Reciever;

/**
 *
 * @author chief_kmv
 */
public class RecieverWorkReq extends WorkRequest {
    private Donor donor;
    private Reciever OrganReciever;

    public Reciever getOrganReciever() {
        return OrganReciever;
    }

    public void setOrganReciever(Reciever OrganReciever) {
        this.OrganReciever = OrganReciever;
    }

    
    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }
    
    
    
}
