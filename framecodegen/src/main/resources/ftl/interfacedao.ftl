package ${packagePrefix}.${projectName}.dao;
import org.springframework.stereotype.Repository;
import ${packagePrefix}.common.dao.ICommonMapper;
import ${packagePrefix}.${projectName}.entity.${table.entitySimpleName};
/**
 * @intefacedao
 * @table ${table.tableName}
 * @date ${ddate}
 * @author ${author}
 */
@Repository("${table.entitySimpleName ? uncap_first}Dao")
public interface I${table.entitySimpleName}Mapper extends ICommonMapper<${table.entitySimpleName}> {

}