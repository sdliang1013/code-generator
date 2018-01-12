package ${packagePath}.dao;

import cn.easybuild.pojo.DataSet;
import ${packagePath}.${className}QueryParam;
import ${packagePath}.${className};
import cn.easybuild.core.dao.StringPojoAppBaseDao;

/**
 * ${comments}
 * 
 * @author ${author}
 * @email ${email}
 * @date ${datetime}
 */
public interface ${className}Dao extends StringPojoAppBaseDao<${className}> {

    DataSet<${className}> query${className}ByParam(${className}QueryParam queryParam);
}
