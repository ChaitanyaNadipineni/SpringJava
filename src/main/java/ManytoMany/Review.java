package ManytoMany;

import javax.persistence.*;

@Entity
@Table(name="review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private  int id;

    @Column(name="comment")
    private String commnets;

    public Review() {
    }

    public Review(String commnets) {
        this.commnets = commnets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommnets() {
        return commnets;
    }

    public void setCommnets(String commnets) {
        this.commnets = commnets;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", commnets='" + commnets + '\'' +
                '}';
    }
}
