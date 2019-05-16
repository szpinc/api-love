package org.szpinc.api.love.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.szpinc.api.love.entity.MainInfo;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/15 18:24
 */
public interface MainInfoRespository extends JpaRepository<MainInfo, Integer> {
}
