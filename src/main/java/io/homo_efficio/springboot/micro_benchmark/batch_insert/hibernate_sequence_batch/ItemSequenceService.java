package io.homo_efficio.springboot.micro_benchmark.batch_insert.hibernate_sequence_batch;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-01-25
 */
@Profile("sequence")
@Component
@Transactional
@RequiredArgsConstructor
public class ItemSequenceService {

    private final ItemSequenceRepository repository;

    public void saveAll(List<ItemSequence> items) {
        repository.saveAll(items);
    }
}
