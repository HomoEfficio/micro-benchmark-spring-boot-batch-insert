package io.homo_efficio.springboot.micro_benchmark.batch_insert.hibernate_sequence_batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-01-25
 */
@Profile("sequence")
@Component
@Slf4j
public class HibernateSequenceRunner implements CommandLineRunner {

    @Autowired
    private ItemSequenceService itemSequenceService;

    @Value("${rows}")
    private int rows;

    @Override
    public void run(String... args) throws Exception {
        long startTime = System.currentTimeMillis();
        List<ItemSequence> items = new ArrayList<>();
        int N = rows;
        for (int i = 1; i <= N; i++) {
            items.add(new ItemSequence(null, "NAME_" + i, "DESC_" + i));
        }
        itemSequenceService.saveAll(items);
        long endTime = System.currentTimeMillis();
        log.info("OOO Elapsed: {} secs", ((endTime - startTime) / 1000.0f));
    }
}
