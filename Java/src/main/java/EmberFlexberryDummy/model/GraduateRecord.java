package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: GraduateRecord
 */
@Entity(name = "EmberFlexberryDummyGraduateRecord")
@Table(schema = "public", name = "GraduateRecord")
public class GraduateRecord {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "GrFIO")
    private String grfio;

    @Column(name = "GrYearGrad")
    private Integer gryeargrad;

    @Column(name = "UniquelD")
    private String uniqueld;

    @Column(name = "ObjectPK")
    private Integer objectpk;

    @Column(name = "ShowName")
    private String showname;


    public GraduateRecord() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getGrFIO() {
      return grfio;
    }

    public void setGrFIO(String grfio) {
      this.grfio = grfio;
    }

    public Integer getGrYearGrad() {
      return gryeargrad;
    }

    public void setGrYearGrad(Integer gryeargrad) {
      this.gryeargrad = gryeargrad;
    }

    public String getUniquelD() {
      return uniqueld;
    }

    public void setUniquelD(String uniqueld) {
      this.uniqueld = uniqueld;
    }

    public Integer getObjectPK() {
      return objectpk;
    }

    public void setObjectPK(Integer objectpk) {
      this.objectpk = objectpk;
    }

    public String getShowName() {
      return showname;
    }

    public void setShowName(String showname) {
      this.showname = showname;
    }


}