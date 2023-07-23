package asdf.test.search.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name="food_main")
public class Food {

    @Id
    private Long foodId;

    private Long reportNo;
    private String foodName;
    private String foodImage;
    private Integer barcodeNo;
    private String purchaseLink;
    private String foodType;
    private int haccpStatus;
    private LocalDateTime createDate;
    private LocalDateTime editDate;

}
