package io.homo_efficio.springboot.micro_benchmark.batch_insert.jdbc_batch_insert;

import java.util.List;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-01-25
 */
public interface ItemJdbcRepository {

    void saveAll(List<ItemJdbc> items);
}
