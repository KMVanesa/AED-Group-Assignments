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
    private Reciever reciever;

    public Reciever getReciever() {
        return reciever;
    }

    public void setReciever(Reciever reciever) {
        this.reciever = reciever;
    }
    
    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }
    
    
    
}
