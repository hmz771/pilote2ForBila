package com.pilote2.demo.entities.Identity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Table(name = "users")
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_id")
    private Long id;
    private String userName;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean isEnabled;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "user_roles", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
@JsonIgnore
    private Set<Role> roles = new HashSet<>();
    public User(String username, String email, String password) {
        this.userName = username;
        this.email = email;
        this.password = password;
    }

//    @JsonIgnore
//    public Set<Role> getRoles()
//    {
//        return roles;
//    }
//
//    @JsonIgnore
//    public Set<Long> getRoleIds()
//    {
//        Set<Long> stringRoles = new HashSet<>();
//        for(Role role:this.roles)
//        {
//            stringRoles.add(role.getId());
//        }
//        return stringRoles;
//    }
//
//    public void setRoles(Set<Role> roles)
//    {
//        this.roles = roles;
//    }
    //private Collection<Role> roles;

//    @JsonIgnore
//    public Set<Long> getRoleIds()
//    {
//        Set<Long> stringRoles = new HashSet<>();
//        for(Role role:this.roles)
//        {
//            stringRoles.add(role.getId());
//        }
//        return stringRoles;
//    }
//
//    public void setRoles(Set<Role> roles)
//    {
//        this.roles = roles;
//    }

//    public Long getId()
//    {
//        return id;
//    }
//
//    public void setId(Long id)
//    {
//        this.id = id;
//    }
//
//    public String getUsername()
//    {
//        return userName;
//    }
//
//    public void setUsername(String username)
//    {
//        this.userName = username;
//    }
//
//    public String getFirstName()
//    {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName)
//    {
//        this.firstName = firstName;
//    }
//
//    public String getLastName()
//    {
//        return lastName;
//    }
//
//    public void setLastName(String lastName)
//    {
//        this.lastName = lastName;
//    }
//
//    public String getEmail()
//    {
//        return email;
//    }
//
//    public void setEmail(String email)
//    {
//        this.email = email;
//    }
//
//    public Boolean getActive()
//    {
//        return isEnabled;
//    }
//
//    public void setActive(Boolean active)
//    {
//        this.isEnabled = active;
//    }
//
//    public String toString()
//    {
//        ObjectMapper objectMapper = new ObjectMapper();
//        try
//        {
//            return objectMapper.writeValueAsString(this);
//        }
//        catch(JsonProcessingException jpe)
//        {
//            throw new RuntimeException(jpe);
//        }
//    }
//
//    public String getPassword()
//    {
//        return password;
//    }
//
//    public void setPassword(String password)
//    {
//        this.password = password;
//    }
//
    public void hashPassword()
    {
        this.password = hashPassword( this.password );
    }

    @JsonIgnore
    public static String hashPassword(String password)
    {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            throw new RuntimeException("It should not happend because MD5 is a valid algorithm", e);
        }
    }


}
