package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import java.util.Date;


/**
 * Entity implementation class for Entity: SuccessorPhone
 */
@Entity(name = "EmberFlexberryDummySuccessorPhone")
@Table(schema = "public", name = "SuccessorPhone")
public class SuccessorPhone {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Phone1")
    private String phone1;

    @Column(name = "Phone2")
    private String phone2;

    @Column(name = "Phone3")
    private String phone3;

    @Column(name = "Name")
    private String name;

    @Column(name = "EMail")
    private String email;

    @Column(name = "Birthday")
    private Date birthday;


    public SuccessorPhone() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getPhone1() {
      return phone1;
    }

    public void setPhone1(String phone1) {
      this.phone1 = phone1;
    }

    public String getPhone2() {
      return phone2;
    }

    public void setPhone2(String phone2) {
      this.phone2 = phone2;
    }

    public String getPhone3() {
      return phone3;
    }

    public void setPhone3(String phone3) {
      this.phone3 = phone3;
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