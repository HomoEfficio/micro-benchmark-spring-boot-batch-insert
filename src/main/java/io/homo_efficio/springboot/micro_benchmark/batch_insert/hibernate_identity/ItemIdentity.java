package io.homo_efficio.springboot.micro_benchmark.batch_insert.hibernate_identity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Profile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-01-25
 */
@Profile("identity")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ItemIdentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
