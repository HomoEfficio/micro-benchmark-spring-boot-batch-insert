package io.homo_efficio.springboot.micro_benchmark.batch_insert.hibernate_sequence_batch;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-01-25
 */
@Profile("sequence")
public interface ItemSequenceRepository extends JpaRepository<ItemSequence, Long> {
}
