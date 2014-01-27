devstack中的shell函数
====================

##functions文件
____________________

+ <h3 id="GetOSVersion">GetOSVersion()</h3>

描述：获取运行devstack的操作系统环境参数，包括制造商（Vendor），版本号（Release），更新号（Update）和软件包的后缀名（package）以及代码名（codename）。  
输入：无  
输出：无  
效果：导出如下变量到系统中，以供脚本未来直接使用  

| 变量名 | 描述 |
|:-:|:-:|
| os_VENDOR | 操作系统制造商（如Mac OS X, Debian, Ubuntu等）|
| os_RELEASE | 操作系统的版本号（如 10.9，12.04等）|
| os_UPDATE | 操作系统的更新号（如 10.9.1中的1等）|
| os_PACKAGE | 软件包的后缀名 （如deb或rpm）|
| os_CODENAME | 操作系统的代码名（如snow leopard, tiger, precise等) |

+ ### GetDistro()

描述：不仅获取到[GetOSVersion](#GetOSVersion)能获取到的所有的参数，还获取到了
