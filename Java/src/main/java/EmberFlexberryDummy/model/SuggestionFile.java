package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: SuggestionFile
 */
@Entity(name = "EmberFlexberryDummySuggestionFile")
@Table(schema = "public", name = "SuggestionFile")
public class SuggestionFile {

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

    @Column(name = "Order")
    private Integer order;

    @Column(name = "File")
    private String file;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Suggestion")
    @Convert("Suggestion")
    @Column(name = "Suggestion", length = 16, unique = true, nullable = false)
    private UUID _suggestionid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Suggestion", insertable = false, updatable = false)
    private Suggestion suggestion;


    public SuggestionFile() {
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

    public Integer getOrder() {
      return order;
    }

    public void setOrder(Integer order) {
      this.order = order;
    }

    public String getFile() {
      return file;
    }

    public void setFile(String file) {
      this.file = file;
    }


}