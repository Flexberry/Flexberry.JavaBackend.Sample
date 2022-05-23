package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: MasterLookupDropdown
 */
@Entity(name = "EmberFlexberryDummyMasterLookupDropdown")
@Table(schema = "public", name = "MasterLookupDropdown")
public class MasterLookupDropdown {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Text")
    private String text;


    public MasterLookupDropdown() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getText() {
      return text;
    }

    public void setText(String text) {
      this.text = text;
    }


}