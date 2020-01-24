package io.homo_efficio.springboot.micro_benchmark.batch_insert.hibernate_identity;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-01-25
 */
public interface ItemIdentityRepository extends JpaRepository<ItemIdentity, Long> {
}
