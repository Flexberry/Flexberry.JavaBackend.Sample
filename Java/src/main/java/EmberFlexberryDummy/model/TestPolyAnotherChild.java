package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: TestPolyAnotherChild
 */
@Entity(name = "EmberFlexberryDummyTestPolyAnotherChild")
@Table(schema = "public", name = "TestPolyAnotherChild")
public class TestPolyAnotherChild {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "ChildAnotherPole")
    private Boolean childanotherpole;

    @Column(name = "Pole")
    private String pole;


    public TestPolyAnotherChild() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public Boolean getChildAnotherPole() {
      return childanotherpole;
    }

    public void setChildAnotherPole(Boolean childanotherpole) {
      this.childanotherpole = childanotherpole;
    }

    public String getPole() {
      return pole;
    }

    public void setPole(String pole) {
      this.pole = pole;
    }


}