**项目说明**
- 代码生成器code-generator，可在线生成entity、xml、dao、service、html、js、sql代码，减少70%以上的开发任务
- 基于人人网的代码生成器renren-generator，做了如下修改:
- 1. 修改GenUtil.java, 读取template目录下的所有模板文件
- 2. 去掉原先模板文件的VM扩展名, 以实际文件的扩展名为准
- 3. 根据template目录结构生成代码, 不由GenUtil.java指定
- 4. 将包名, 模块名,表名前缀放到页面上,以便更灵活的生成代码
<br> 


**如何交流、反馈、参与贡献？** 
- Git仓库：https://github.com/sdliang1013/code-generator.git
- 其他项目：https://gitee.com/organizations/sdliang/projects
- QQ号：40485747
- 如需关注项目最新动态，请Watch、Star项目，同时也是对项目最好的支持
<br> 


 **本地部署**
- 通过git下载源码
- 修改application.yml，更新MySQL账号和密码、数据库名称
- Eclipse、IDEA运行RenrenApplication.java，则可启动项目
- 项目访问路径：http://localhost:8080

**演示效果图：**
![输入图片说明](http://cdn.renren.io/img/82b99a1f0f884454ac3fff5e7f658ac8 "在这里输入图片标题")



