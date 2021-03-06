package com.pard.modules.sys.repository;

import com.pard.common.datatables.DataTablesRepository;
import com.pard.modules.sys.entity.Office;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by wawe on 17/5/22.
 */
public interface OfficeRepostiroy extends DataTablesRepository<Office, String> {

    @Query(value = "select a from Office a where a.delFlag = 0 order by a.parentIds, a.sort")
    List<Office> findAllWithTree();
}
