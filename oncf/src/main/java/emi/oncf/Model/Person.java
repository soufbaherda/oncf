package emi.oncf.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Controller;

import java.util.Objects;

@Document(collection="compte")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    private String id;
    private String nom,email,mdp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getId(), person.getId()) && Objects.equals(getNom(), person.getNom()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getMdp(), person.getMdp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getEmail(), getMdp());
    }
}
