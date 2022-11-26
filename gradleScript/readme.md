# 当前目录脚本说明

- **dependencies_config.gradle**  ：主要是依赖库的配置和主APP 版本的配置

- **envFlavors.gradle** ：配置主APP的各种环境，比如uat ,prod ,sit等，不同环境编译的源码也略有不同。

- **lib_or_app_config.gradle**   以module的path为Key，来配置各个module是APP 还是Lib的开关，以及applicationId, versionCode ,versionName 等属性。

- **upload_maven_config.gradle **  以module的path为Key，来配置各个module上传到maven的相关属性。

- **upload_maven.gradle**  依赖脚本【**upload_maven_config.gradle**】配置，用来上传SDK到指定的maven库的。

- **sub_project_proxy.gradle**   依赖脚本【**lib_or_app_config.gradle**】和【**upload_maven.gradle**】，来配置各个module是APP还是Lib模块，如果是Lib模块，就应用【**upload_maven.gradle**】这个脚本；此外还配置了所有subModule公共的配置【比如compileSdkVersion属性等，具体看文件】。

  ## 脚本的使用

  ### **sub_project_proxy.gradle**

  这个脚本主要是给各subProject用的。

  ### root_project_proxy.gradle

  这个脚本是所有模块公用的属性配置，所以放在RootProject的【**build.gradle** 】文件中，这个只是一个代理的持有者。

  

  

  ### 

  