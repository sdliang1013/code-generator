package ${package}.${moduleName}.model;

import ${package}.${moduleName}.${className};
import net.sinedu.foundation.data.jpa.model.EntityModel;
import java.util.Date;
#if(${hasBigDecimal})
import java.math.BigDecimal;
#end


/**
 * ${comments}
 *
 * @author ${author}
 * @email ${email}
 * @date ${datetime}
 */
public class ${className}Model extends EntityModel<${className}> {

    public ${className}Model() {}

    public ${className}Model(${className} entity) {
        super(entity);
    }

#foreach ($column in $columns)
    /**
    * $column.comments
    */
    private $column.attrType $column.attrname;
#end

#foreach ($column in $columns)
	public void set${column.attrName}($column.attrType $column.attrname) {
		this.$column.attrname = $column.attrname;
	}
	public $column.attrType get${column.attrName}() {
		return $column.attrname;
	}
#end
}
