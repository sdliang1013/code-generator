package ${packagePath}.service;

import cn.easybuild.pojo.DataSet;
import ${packagePath}.${className}QueryParam;
import ${packagePath}.${className};

import cn.easybuild.core.service.StringPojoAppBaseService;

/**
 * ${comments}
 * 
 * @author ${author}
 * @email ${email}
 * @date ${datetime}
 */
public interface ${className}Service extends StringPojoAppBaseService<${className}>{

    DataSet<${className}> query${className}ByParam(${className}QueryParam queryParam);
}
