package dk.ajh.si.myassignments.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ASSIGNMENTS")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aid;
    private String aname;
    private String adescription;
    private String ahandindate;
    private Long id;

    public Assignment() {
        super();
    }

}
