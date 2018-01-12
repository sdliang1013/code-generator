package ${packagePath}.resource;

import cn.easybuild.pojo.DataSet;
import net.sinedu.company.bases.PagingAdapter;
import net.sinedu.company.bases.ResponseObject;
import net.sinedu.company.bases.ResponseObjectUtil;
import net.sinedu.foundation.data.jpa.model.EntityModel;
import net.sinedu.company.bases.rs.AdminBaseResource;

import ${packagePath}.${className};
import ${packagePath}.${className}QueryParam;
import ${packagePath}.model.${className}Model;
import ${packagePath}.service.${className}Service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * ${comments}
 *
 * @author ${author}
 * @email ${email}
 * @date ${datetime}
 */
@Named
@Produces(MediaType.APPLICATION_JSON)
@Path(${className}SpResource.MODULE_NAME)
public class ${className}SpResource extends AdminBaseResource{

    public static final String MODULE_NAME = BASE_URI_ADMIN + "/${classname}";

    private ${className}Service ${classname}Service;

    @Inject
    public void set${className}Service(${className}Service ${classname}Service) {
        this.${classname}Service = ${classname}Service;
    }

    /**
	 * 列表
	 */
    @GET
    @Path("/list")
    public ResponseObject list(@BeanParam PagingAdapter pagingAdapter) {
        ${className}QueryParam queryParam = new ${className}QueryParam(pagingAdapter);
        //TODO:设置查询条件

        //查询列表数据
        DataSet<${className}> dataSet = ${classname}Service.query${className}ByParam(queryParam);
        List<${className}Model> entityModels = EntityModel.listOf(dataSet.getData(), ${className}Model.class);
        return ResponseObjectUtil.responseWithRecordSet(entityModels, dataSet.getPaging());
    }

    /**
     * 保存
     *
     * @param entity
     * @return
     */
    @POST
    @Path("/save")
    public ResponseObject save(${className} entity) {
        ${classname}Service.save(entity);
        return ResponseObjectUtil.responseWithStandardStatus();
    }

    /**
     * 更新
     *
     * @param entity
     * @return
     */
    @POST
    @Path("/update")
    public ResponseObject update(${className} entity) {
        ${classname}Service.update(entity);
        return ResponseObjectUtil.responseWithStandardStatus();
    }

    /**
     * 获取单个详情
     */
    @GET
    @Path("/detail/{id}")
    public ResponseObject detail(@PathParam("id") String id) {
        ${className}Model entityModel = null;
        ${className} entity = ${classname}Service.getById(id);
        if (entity != null) {
            entityModel = EntityModel.of(entity,${className}Model.class);
        }
        return ResponseObjectUtil.responseWithRecord(entityModel);
    }

    /**
     * 删除
     */
    @DELETE
    @Path("/delete/{id}")
    public ResponseObject delete(@PathParam("id") String id) {
        ${classname}Service.deleteById(id);
        return ResponseObjectUtil.responseWithStandardStatus();
    }

    @Override
    protected boolean isSp() {
        return true;
    }
}
