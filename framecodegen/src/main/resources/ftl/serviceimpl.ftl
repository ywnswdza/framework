package ${packagePrefix}.${projectName}.service.impl;

import org.springframework.stereotype.Service;
import ${packagePrefix}.common.service.CommonServiceImpl;
import ${packagePrefix}.${projectName}.dao.I${table.entitySimpleName}Mapper;
import ${packagePrefix}.${projectName}.entity.${table.entitySimpleName};
import ${packagePrefix}.${projectName}.service.I${table.entitySimpleName}Service;


/**
 * @serviceimpl
 * @table ${table.tableName}
 * @date ${ddate}
 * @author ${author}
 */
@Service("${table.entitySimpleName ? uncap_first}Service")
public class ${table.entitySimpleName}ServiceImpl extends CommonServiceImpl<I${table.entitySimpleName}Mapper,${table.entitySimpleName}> implements I${table.entitySimpleName}Service {

	
<#-- 
	@Resource(name="${table.entitySimpleName ? uncap_first}Dao")
	private I${table.entitySimpleName}Dao ${table.entitySimpleName ? uncap_first}Dao;
	
	public Page<${table.entitySimpleName}> getListByPage(Object parameter, int startPage,
			int pageSize) {
		return ${table.entitySimpleName ? uncap_first}Dao.getListByPage(parameter, startPage, pageSize);
	}

	public ${table.entitySimpleName} getObjectById(Serializable id) {
		return ${table.entitySimpleName ? uncap_first}Dao.getObjectById(id);
	}
	
	/**
	 * 根据主键执行insert或update
	 */
	public ${table.entitySimpleName} save(${table.entitySimpleName} vo) {
<#list table.columns as col>
	<#if col.isId>
		if(vo.get${col.fieldName ? cap_first}() != null) {
			return this.update(vo);
		} 
	</#if>
</#list>
		return this.insert(vo);
	}

	public void removeByIds(String ids) {
		${table.entitySimpleName ? uncap_first}Dao.removeByIds(ids);
	}

	public List<${table.entitySimpleName}> getList(Object parameter) {
		return ${table.entitySimpleName ? uncap_first}Dao.getList(parameter);
	}

	public void removeById(Serializable id) {
		${table.entitySimpleName ? uncap_first}Dao.removeById(id);
	}

	public ${table.entitySimpleName} insert(${table.entitySimpleName} vo) {
		return ${table.entitySimpleName ? uncap_first}Dao.insert(vo);
	}

	public ${table.entitySimpleName} update(${table.entitySimpleName} vo) {
		return ${table.entitySimpleName ? uncap_first}Dao.update(vo);
	}
	
	public List<${table.entitySimpleName}> insertBatch(List<${table.entitySimpleName}> list) {
		return ${table.entitySimpleName ? uncap_first}Dao.insertBatch(list);
	}

	public void removeEntityBatch(List<${table.entitySimpleName}> list) {
		${table.entitySimpleName ? uncap_first}Dao.removeEntityBatch(list);
	}
	
	public List<${table.entitySimpleName}> getListLimit(Object parameter, int offset,
			int limitSize) {
		return ${table.entitySimpleName ? uncap_first}Dao.getListLimit(parameter, offset, limitSize);
	}
-->	
}
