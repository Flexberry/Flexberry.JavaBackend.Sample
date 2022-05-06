package EmberFlexberry.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberry.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import java.util.Date;
import java.util.List;

/**
 * Entity implementation class for Entity: ChildLevel2
 */
@Entity(name = "EmberFlexberryChildLevel2")
@Table(schema = "public", name = "ChildLevel2")
public class ChildLevel2 {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "TextChild2")
    private String textchild2;

    @Column(name = "obj")
    private String obj;

    @Column(name = "TextChild1")
    private String textchild1;

    @Column(name = "CreateTime")
    private String createtime;

    @Column(name = "Creator")
    private String creator;

    @Column(name = "EditTime")
    private String edittime;

    @Column(name = "Editor")
    private String editor;

    @Column(name = "Address")
    private String address;

    @Column(name = "Text")
    private String text;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Votes")
    private Long votes;

    @Column(name = "Moderated")
    private Boolean moderated;

    @Column(name = "CommentsCount")
    private Integer commentscount;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Type")
    @Convert("Type")
    @Column(name = "Type", length = 16, unique = true, nullable = false)
    private UUID _typeid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Type", insertable = false, updatable = false)
    private SuggestionType type;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Author")
    @Convert("Author")
    @Column(name = "Author", length = 16, unique = true, nullable = false)
    private UUID _authorid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Author", insertable = false, updatable = false)
    private ApplicationUser author;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Editor1")
    @Convert("Editor1")
    @Column(name = "Editor1", length = 16, unique = true, nullable = false)
    private UUID _editor1id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Editor1", insertable = false, updatable = false)
    private ApplicationUser editor1;

    @OneToMany(mappedBy = "suggestion", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Comment> comments;

    @OneToMany(mappedBy = "suggestion", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<SuggestionFile> suggestionfiles;

    @OneToMany(mappedBy = "suggestion", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Vote> userVotes;


    public ChildLevel2() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getTextChild2() {
      return textchild2;
    }

    public void setTextChild2(String textchild2) {
      this.textchild2 = textchild2;
    }

    public String getobj() {
      return obj;
    }

    public void setobj(String obj) {
      this.obj = obj;
    }

    public String getTextChild1() {
      return textchild1;
    }

    public void setTextChild1(String textchild1) {
      this.textchild1 = textchild1;
    }

    public String getCreateTime() {
      return createtime;
    }

    public void setCreateTime(String createtime) {
      this.createtime = createtime;
    }

    public String getCreator() {
      return creator;
    }

    public void setCreator(String creator) {
      this.creator = creator;
    }

    public String getEditTime() {
      return edittime;
    }

    public void setEditTime(String edittime) {
      this.edittime = edittime;
    }

    public String getEditor() {
      return editor;
    }

    public void setEditor(String editor) {
      this.editor = editor;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public String getText() {
      return text;
    }

    public void setText(String text) {
      this.text = text;
    }

    public Date getDate() {
      return date;
    }

    public void setDate(Date date) {
      this.date = date;
    }

    public Long getVotes() {
      return votes;
    }

    public void setVotes(Long votes) {
      this.votes = votes;
    }

    public Boolean getModerated() {
      return moderated;
    }

    public void setModerated(Boolean moderated) {
      this.moderated = moderated;
    }

    public Integer getCommentsCount() {
      return commentscount;
    }

    public void setCommentsCount(Integer commentscount) {
      this.commentscount = commentscount;
    }


}