package com.wilson.springit.repository;

import com.wilson.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository  extends JpaRepository<Link,Long> {


}
