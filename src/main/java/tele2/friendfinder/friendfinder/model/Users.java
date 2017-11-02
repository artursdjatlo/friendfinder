package tele2.friendfinder.friendfinder.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ugisorni
 */

@Entity
public class Users implements Serializable{
    @Id // required to mark a field as primary key
    @GeneratedValue // primary key is autoincrement
    private Long user_id;
    
    @Column
    @NotEmpty
    private String username;
    
    @Column
    @NotEmpty
    private String email;
    
    @Column
    @NotEmpty
    private String password;
    
    @Column
    @NotEmpty
    private String image_url;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", username=" + username + ", email=" + email + ", image_url=" + image_url + "}";
    }    
}
