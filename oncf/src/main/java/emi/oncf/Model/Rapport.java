package emi.oncf.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection="rapport")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rapport {
    @Id
    private String id;
    private String gravite, type, localisation, descAccidant,descEvent, Condition;
    private String dateAccident , dateEvent;
    private Person Superviseur;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rapport)) return false;
        Rapport rapport = (Rapport) o;
        return Objects.equals(getId(), rapport.getId()) && Objects.equals(getGravite(), rapport.getGravite()) && Objects.equals(getType(), rapport.getType()) && Objects.equals(getLocalisation(), rapport.getLocalisation()) && Objects.equals(getDescAccidant(), rapport.getDescAccidant()) && Objects.equals(getDescEvent(), rapport.getDescEvent()) && Objects.equals(getCondition(), rapport.getCondition()) && Objects.equals(getDateAccident(), rapport.getDateAccident()) && Objects.equals(getDateEvent(), rapport.getDateEvent()) && Objects.equals(getSuperviseur(), rapport.getSuperviseur());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getGravite(), getType(), getLocalisation(), getDescAccidant(), getDescEvent(), getCondition(), getDateAccident(), getDateEvent(), getSuperviseur());
    }
}
