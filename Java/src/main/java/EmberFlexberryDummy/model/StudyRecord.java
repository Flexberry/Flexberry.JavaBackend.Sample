package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: StudyRecord
 */
@Entity(name = "EmberFlexberryDummyStudyRecord")
@Table(schema = "public", name = "StudyRecord")
public class StudyRecord {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "UniquelD")
    private String uniqueld;

    @Column(name = "ObjectPK")
    private Integer objectpk;

    @Column(name = "ShowName")
    private String showname;


    public StudyRecord() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
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