package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: TestPoly
 */
@Entity(name = "EmberFlexberryDummyTestPoly")
@Table(schema = "public", name = "TestPoly")
public class TestPoly {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "SelfPole")
    private String selfpole;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Relation")
    @Convert("Relation")
    @Column(name = "Relation", length = 16, unique = true, nullable = false)
    private UUID _relationid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Relation", insertable = false, updatable = false)
    private TestPolyBase relation;


    public TestPoly() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getSelfPole() {
      return selfpole;
    }

    public void setSelfPole(String selfpole) {
      this.selfpole = selfpole;
    }


}