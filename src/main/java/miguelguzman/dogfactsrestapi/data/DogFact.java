package miguelguzman.dogfactsrestapi.data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="dog_facts")

public class DogFact {
    private String fact;
}
