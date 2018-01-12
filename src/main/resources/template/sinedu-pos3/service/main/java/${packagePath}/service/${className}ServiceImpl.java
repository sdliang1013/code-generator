package ${packagePath}.service;

import javax.inject.Inject;
import javax.inject.Named;

import cn.easybuild.pojo.DataSet;
import ${packagePath}.${className}QueryParam;
import cn.easybuild.core.dao.AppBaseDao;
import ${packagePath}.dao.${className}Dao;
import ${packagePath}.${className};
import net.sinedu.company.bases.service.AbstractBaseServiceImpl;


@Named
public class ${className}ServiceImpl extends AbstractBaseServiceImpl<${className}> implements ${className}Service {

	private ${className}Dao ${classname}Dao;

    @Inject
    public void set${className}Dao(${className}Dao ${classname}Dao) {
        this.${classname}Dao = ${classname}Dao;
    }

    @Override
    protected AppBaseDao<${className}, String> getDao() {
        return ${classname}Dao;
    }

    public DataSet<${className}> query${className}ByParam(${className}QueryParam queryParam){
        return ${classname}Dao.query${className}ByParam(queryParam);
    }
}
