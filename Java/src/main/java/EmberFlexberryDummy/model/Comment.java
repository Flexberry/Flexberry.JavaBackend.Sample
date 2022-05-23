package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import java.util.List;

/**
 * Entity implementation class for Entity: Comment
 */
@Entity(name = "EmberFlexberryDummyComment")
@Table(schema = "public", name = "Comment")
public class Comment {

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

    @Column(name = "Text")
    private String text;

    @Column(name = "Votes")
    private Long votes;

    @Column(name = "Moderated")
    private Boolean moderated;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Author")
    @Convert("Author")
    @Column(name = "Author", length = 16, unique = true, nullable = false)
    private UUID _authorid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Author", insertable = false, updatable = false)
    private ApplicationUser author;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Suggestion")
    @Convert("Suggestion")
    @Column(name = "Suggestion", length = 16, unique = true, nullable = false)
    private UUID _suggestionid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Suggestion", insertable = false, updatable = false)
    private Suggestion suggestion;

    @OneToMany(mappedBy = "comment", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<CommentVote> commentvotes;


    public Comment() {
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

    public String getText() {
      return text;
    }

    public void setText(String text) {
      this.text = text;
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


}