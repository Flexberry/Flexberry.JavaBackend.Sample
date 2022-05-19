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
 * Entity implementation class for Entity: SuggestionType
 */
@Entity(name = "EmberFlexberryDummySuggestionType")
@Table(schema = "public", name = "SuggestionType")
public class SuggestionType {

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

    @Column(name = "Name")
    private String name;

    @Column(name = "Moderated")
    private Boolean moderated;

    @Column(name = "ComputedField")
    private String computedfield;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Parent")
    @Convert("Parent")
    @Column(name = "Parent", length = 16, unique = true, nullable = false)
    private UUID _parentid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Parent", insertable = false, updatable = false)
    private SuggestionType parent;

    @OneToMany(mappedBy = "suggestiontype", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<LocalizedSuggestionType> localizedsuggestiontypes;


    public SuggestionType() {
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

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Boolean getModerated() {
      return moderated;
    }

    public void setModerated(Boolean moderated) {
      this.moderated = moderated;
    }

    public String getComputedField() {
      return computedfield;
    }

    public void setComputedField(String computedfield) {
      this.computedfield = computedfield;
    }


}