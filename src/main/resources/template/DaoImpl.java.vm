package ${package}.${moduleName}.dao;

import cn.easybuild.pojo.DataSet;
import ${package}.${moduleName}.${className}QueryParam;
import ${package}.${moduleName}.${className};
import net.sinedu.company.bases.dao.BaseDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * ${comments}
 *
 * @author ${author}
 * @email ${email}
 * @date ${datetime}
 */
@Repository
public class ${className}DaoImpl extends BaseDaoImpl<${className}> implements ${className}Dao{

    @Override
    protected String getTableName() {
        return "${tableName}";
    }

    @Override
    protected Class<${className}> getPojoClass() {
        return ${className}.class;
    }

    public DataSet<${className}> query${className}ByParam(${className}QueryParam queryParam){
        return selectDataSet(getPrefix() + "query${className}ByParam", queryParam);
    }
}
