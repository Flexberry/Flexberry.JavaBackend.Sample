package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import java.util.Date;
import java.util.List;

/**
 * Entity implementation class for Entity: Suggestion
 */
@Entity(name = "EmberFlexberryDummySuggestion")
@Table(schema = "public", name = "Suggestion")
public class Suggestion {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "CreateTime")
    private Timestamp createTime;

    @Column(name = "Creator")
    private String creator;

    @Column(name = "EditTime")
    private Timestamp editTime;

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


    public Suggestion() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public Timestamp getCreateTime() {
      return createTime;
    }

    public void setCreateTime(Timestamp createtime) {
      this.createTime = createtime;
    }

    public String getCreator() {
      return creator;
    }

    public void setCreator(String creator) {
      this.creator = creator;
    }

    public Timestamp getEditTime() {
      return editTime;
    }

    public void setEditTime(Timestamp edittime) {
      this.editTime = edittime;
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