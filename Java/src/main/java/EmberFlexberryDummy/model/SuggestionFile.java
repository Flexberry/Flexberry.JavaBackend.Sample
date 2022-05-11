package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
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
    private String createtime;

    @Column(name = "Creator")
    private String creator;

    @Column(name = "EditTime")
    private String edittime;

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