package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import java.util.Date;
import java.util.List;

/**
 * Entity implementation class for Entity: ChildLevel2
 */
@Entity(name = "EmberFlexberryDummyChildLevel2")
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
}