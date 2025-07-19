import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "professor")
public class Professor extends Entidade {

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(length = 14, nullable = false, unique = true)
    private String cpf;

    @Column(columnDefinition = "DATE")
    private LocalDate nascimento;

}
