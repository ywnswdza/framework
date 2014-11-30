package ${packagePrefix}.${projectName}.service;

import ${packagePrefix}.common.service.ICommonService;
import ${packagePrefix}.${projectName}.entity.${table.entitySimpleName};
/**
 * @interfaceservice
 * @table ${table.tableName}
 * @date ${ddate}
 * @author ${author}
 */
public interface I${table.entitySimpleName}Service extends ICommonService<${table.entitySimpleName}> {

}
