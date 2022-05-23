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
 * Entity implementation class for Entity: ChildLevel1
 */
@Entity(name = "EmberFlexberryDummyChildLevel1")
@Table(schema = "public", name = "ChildLevel1")
public class ChildLevel1 {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "TextChild1")
    private String textchild1;
	
    public ChildLevel1() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getTextChild1() {
      return textchild1;
    }

    public void setTextChild1(String textchild1) {
      this.textchild1 = textchild1;
    }
}