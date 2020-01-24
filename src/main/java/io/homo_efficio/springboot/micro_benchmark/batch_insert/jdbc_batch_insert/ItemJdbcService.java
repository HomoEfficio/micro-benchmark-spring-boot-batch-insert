package io.homo_efficio.springboot.micro_benchmark.batch_insert.jdbc_batch_insert;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-01-25
 */
@Component
@Transactional
@RequiredArgsConstructor
public class ItemJdbcService {

    private final ItemJdbcRepository repository;

    public void saveAll(List<ItemJdbc> items) {
        repository.saveAll(items);
    }
}
