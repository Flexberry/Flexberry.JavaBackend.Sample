package EmberFlexberry.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberry.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: StudentRecord
 */
@Entity(name = "EmberFlexberryStudentRecord")
@Table(schema = "public", name = "StudentRecord")
public class StudentRecord {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "SrFIO")
    private String srfio;

    @Column(name = "SrCours")
    private Integer srcours;

    @Column(name = "UniquelD")
    private String uniqueld;

    @Column(name = "ObjectPK")
    private Integer objectpk;

    @Column(name = "ShowName")
    private String showname;


    public StudentRecord() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getSrFIO() {
      return srfio;
    }

    public void setSrFIO(String srfio) {
      this.srfio = srfio;
    }

    public Integer getSrCours() {
      return srcours;
    }

    public void setSrCours(Integer srcours) {
      this.srcours = srcours;
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