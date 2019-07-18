/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginBean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rahul
 */
@Named(value = "loginManagedBean")
@RequestScoped
public class LoginManagedBean {

    /**
     * Creates a new instance of LoginManagedBean
     */
     private String username,password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public String funlogin(){
        HttpServletRequest  request =  (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession(false);
        
        try{
            request.login(username, password);
            
            session.setAttribute("username", username);
            if(request.isUserInRole("Admin"))
                return "/template/admin/dashboard.jsf?faces-redirect=true";
            else if(request.isUserInRole("Seller"))
                return "/template/seller/dashboard.jsf?faces-redirect=true";
            else
                return "/index.jsf?faces-redirect=true";
        }
        catch(ServletException ex){
            System.out.println("Error " + ex.getMessage());
        }
        return null;
    }
    
    public String funlogout(){
         HttpServletRequest  request =  (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession(false);
        
        try{
            request.logout();
            session.invalidate();
            return "/login.jsf?faces-redirect=true";
        }
        catch(ServletException ex){
            System.out.println("Error " + ex.getMessage());
        }
        return null;
    }
    
    public LoginManagedBean() {
    }
    
}
