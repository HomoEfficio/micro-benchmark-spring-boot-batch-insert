package io.homo_efficio.springboot.micro_benchmark.batch_insert.jdbc_batch_insert;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-01-25
 */
@Getter
@AllArgsConstructor
public class ItemJdbc {
    private Long id;
    private String name;
    private String description;
}
