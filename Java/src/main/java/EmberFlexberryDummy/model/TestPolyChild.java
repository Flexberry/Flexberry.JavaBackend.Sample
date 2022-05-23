package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: TestPolyChild
 */
@Entity(name = "EmberFlexberryDummyTestPolyChild")
@Table(schema = "public", name = "TestPolyChild")
public class TestPolyChild {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "ChildPole")
    private Integer childpole;

    @Column(name = "Pole")
    private String pole;


    public TestPolyChild() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public Integer getChildPole() {
      return childpole;
    }

    public void setChildPole(Integer childpole) {
      this.childpole = childpole;
    }

    public String getPole() {
      return pole;
    }

    public void setPole(String pole) {
      this.pole = pole;
    }


}