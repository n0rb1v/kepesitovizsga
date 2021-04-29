package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JurassicPark {
    private JdbcTemplate jdbc;

    public JurassicPark(DataSource ds) {
        this.jdbc = new JdbcTemplate(ds);
    }

    public List<String> checkOverpopulation() {
        List<Dino> result = jdbc.query("select * from dinosaur",
                (rs, ix) -> new Dino(
                        rs.getString("breed"),
                        rs.getInt("expected"),
                        rs.getInt("actual")
                ));
        return result.stream()
                .filter(d -> d.getActual() > d.getExpected())
                .map(Dino::getBreed)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
