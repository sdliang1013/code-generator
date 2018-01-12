package ${packagePath}.${moduleName}.dao;

import ${packagePath}.${moduleName}.entity.${className}Entity;
import ${mainPath}.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * ${comments}
 * 
 * @author ${author}
 * @email ${email}
 * @date ${datetime}
 */
@Mapper
public interface ${className}Dao extends BaseDao<${className}Entity> {
	
}
