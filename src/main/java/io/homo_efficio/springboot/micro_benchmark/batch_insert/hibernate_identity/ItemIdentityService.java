package io.homo_efficio.springboot.micro_benchmark.batch_insert.hibernate_identity;

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
public class ItemIdentityService {

    private final ItemIdentityRepository repository;

    public void saveAll(List<ItemIdentity> items) {
        repository.saveAll(items);
    }
}
