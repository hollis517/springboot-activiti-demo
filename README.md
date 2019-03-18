#  SpringBoot2 集成 Activiti5.22 实现在线设计器功能

SpringBoot 2.1.2.RELEASE  
activiti 5.22.0

步骤：
下载源码
修改application.yml中的数据库连接配置
项目访问路径为localhost:8080/, 也可以自己去配置，自己配置需要修改applica.yml，pom.xml，webapp\scripts\app-cfg.js这三个对应的地方
mvn clean install -Dmaven.test.skip=true
启动main方法
