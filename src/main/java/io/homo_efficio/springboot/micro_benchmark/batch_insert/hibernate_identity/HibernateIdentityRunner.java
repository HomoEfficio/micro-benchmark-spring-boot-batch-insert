package io.homo_efficio.springboot.micro_benchmark.batch_insert.hibernate_identity;

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
@Profile("identity")
@Component
@Slf4j
public class HibernateIdentityRunner implements CommandLineRunner {

    @Autowired
    private ItemIdentityService itemIdentityService;

    @Value("${rows}")
    private int rows;

    @Override
    public void run(String... args) throws Exception {
        long startTime = System.currentTimeMillis();
        List<ItemIdentity> items = new ArrayList<>();
        int N = rows;
        for (int i = 1; i <= N; i++) {
            items.add(new ItemIdentity(null, "NAME_" + i, "DESC_" + i));
        }
        itemIdentityService.saveAll(items);
        long endTime = System.currentTimeMillis();
        log.info("OOO Elapsed: {} secs", ((endTime - startTime) / 1000.0f));
    }
}
