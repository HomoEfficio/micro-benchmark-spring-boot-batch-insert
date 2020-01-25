package io.homo_efficio.springboot.micro_benchmark.batch_insert.hibernate_sequence_batch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.context.annotation.Profile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-01-25
 */
@Profile("sequence")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ItemSequence {

    @Id
    @GenericGenerator(
            name = "SequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "hibernate_sequence"),
                    @Parameter(name = "optimizer", value = "pooled"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "500")
            }
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SequenceGenerator"
    )
    private Long id;
    private String name;
    private String description;
}
