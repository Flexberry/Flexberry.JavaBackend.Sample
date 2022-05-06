package EmberFlexberry.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberry.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;
import java.util.Date;


/**
 * Entity implementation class for Entity: SuccessorSocialNetwork
 */
@Entity(name = "EmberFlexberrySuccessorSocialNetwork")
@Table(schema = "public", name = "SuccessorSocialNetwork")
public class SuccessorSocialNetwork {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "VK")
    private String vk;

    @Column(name = "Facebook")
    private String facebook;

    @Column(name = "Twitter")
    private String twitter;

    @Column(name = "Name")
    private String name;

    @Column(name = "EMail")
    private String email;

    @Column(name = "Birthday")
    private Date birthday;


    public SuccessorSocialNetwork() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getVK() {
      return vk;
    }

    public void setVK(String vk) {
      this.vk = vk;
    }

    public String getFacebook() {
      return facebook;
    }

    public void setFacebook(String facebook) {
      this.facebook = facebook;
    }

    public String getTwitter() {
      return twitter;
    }

    public void setTwitter(String twitter) {
      this.twitter = twitter;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getEMail() {
      return email;
    }

    public void setEMail(String email) {
      this.email = email;
    }

    public Date getBirthday() {
      return birthday;
    }

    public void setBirthday(Date birthday) {
      this.birthday = birthday;
    }


}