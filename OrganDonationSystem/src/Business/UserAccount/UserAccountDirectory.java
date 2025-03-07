/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;
import Business.Employee.Employee;
import Business.LabTest.LabTest;
import Business.PatientInfo.PatientInfo;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author chief_kmv
 */
public class UserAccountDirectory {
     private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password,Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createRecieverAccount(String username,String password,PatientInfo patient ,LabTest test, Role role,String OrganReq){
        Reciever reciever = new Reciever();
        reciever.setUsername(username);
        reciever.setInfo(patient);
        reciever.setLabTest(test);
        reciever.setPassword(password);
        reciever.setRole(role);
        reciever.setOrganReq(OrganReq);
        userAccountList.add(reciever);
        return reciever;
    }
     public UserAccount createDonorAccount(String username,String password,PatientInfo patient ,LabTest test, Role role,String message){
        Donor donor = new Donor();
        donor.setUsername(username);
        donor.setInfo(patient);
        donor.setLabTest(test);
        donor.setPassword(password);
        donor.setRole(role);
        donor.setMessage(message);
        userAccountList.add(donor);
        return donor;
    }
    
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
