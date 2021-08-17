package MyGroup.Places.models;

import javax.persistence.*;

@Entity
@Table(name = "samara")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String type_of;
    @Column
    private String title;
    @Column
    private String full_text;
    @Column
    private String mapCode;

    public Post() {
    }

    public Post(Long id, String type_of, String title, String full_text, String mapCode) {
        this.type_of = type_of;
        this.id = id;
        this.title = title;
        this.full_text = full_text;
        this.mapCode = mapCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public String getMapCode() {
        return mapCode;
    }

    public void setMapCode(String mapCode) {
        this.mapCode = mapCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getType_of() {
        return type_of;
    }

    public void setType_of(String typeOf) {
        this.type_of = typeOf;
    }
}
