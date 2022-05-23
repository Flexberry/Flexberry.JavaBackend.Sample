package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: TestPolyBase
 */
@Entity(name = "EmberFlexberryDummyTestPolyBase")
@Table(schema = "public", name = "TestPolyBase")
public class TestPolyBase {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Pole")
    private String pole;


    public TestPolyBase() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getPole() {
      return pole;
    }

    public void setPole(String pole) {
      this.pole = pole;
    }


}