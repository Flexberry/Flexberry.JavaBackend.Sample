package EmberFlexberryDummy.model;

import org.apache.olingo.commons.core.edm.primitivetype.EdmDateTimeOffset;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import java.util.Date;


/**
 * Entity implementation class for Entity: ApplicationUser
 */
@Entity(name = "EmberFlexberryDummyApplicationUser")
@Table(schema = "public", name = "ApplicationUser")
public class ApplicationUser {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "CreateTime")
    private EdmDateTimeOffset createtime;

    @Column(name = "Creator")
    private String creator;

    @Column(name = "EditTime")
    private EdmDateTimeOffset edittime;

    @Column(name = "Editor")
    private String editor;

    @Column(name = "Name")
    private String name;

    @Column(name = "EMail")
    private String email;

    @Column(name = "Phone1")
    private String phone1;

    @Column(name = "Phone2")
    private String phone2;

    @Column(name = "Phone3")
    private String phone3;

    @Column(name = "Activated")
    private Boolean activated;

    @Column(name = "VK")
    private String vk;

    @Column(name = "Facebook")
    private String facebook;

    @Column(name = "Twitter")
    private String twitter;

    @Column(name = "Birthday")
    private Date birthday;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Vip")
    private Boolean vip;

    @Column(name = "Karma")
    private Double karma = 100.00;


    public ApplicationUser() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public EdmDateTimeOffset getCreateTime() {
        return createtime;
    }

    public void setCreateTime(EdmDateTimeOffset createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public EdmDateTimeOffset getEditTime() {
        return edittime;
    }

    public void setEditTime(EdmDateTimeOffset edittime) {
        this.edittime = edittime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
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

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Double getKarma() {
        return karma;
    }

    public void setKarma(Double karma) {
        this.karma = karma;
    }


}