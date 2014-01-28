# devstack中的shell函数
====================

## functions文件
____________________

### GetOSVersion()

描述：获取操作系统环境参数，包括供应商（Vendor），版本号（Release），更新号（Update）和软件包的后缀名（package）以及代码名（codename）。  
输入：无  
输出：无  
效果：导出如下环境变量到系统中，以供脚本未来直接使用  

| 变量名 | 描述 |
|:-:|:-:|
| os_VENDOR | 操作系统供应商（如Mac OS X, Debian, Ubuntu等）|
| os_RELEASE | 操作系统的版本号（如 10.9，12.04等）|
| os_UPDATE | 操作系统的更新号（如 10.9.1中的1等）|
| os_PACKAGE | 软件包的后缀名 （如deb或rpm）|
| os_CODENAME | 操作系统的代码名（如snow leopard, tiger, precise等) |

+ <h3 id="getdistro">GetDistro()</h3>

描述：不仅获取到[GetOSVersion](#getosversion)函数能获取到的所有的参数，还获取到了系统的发行名简称（Distro）。  
输入：无  
输出：无  
效果：导出环境变量DISTRO到系统中，以便于接下来确定系统适合运行devstack（适合运行devstack脚本的操作系统类型请参考[列表](/Test-OS-List.md)）。

+ <h3 id="issuse">is_suse()</h3>

描述：判断操作系统是否是属于SUSE发行版。  
输入：无
输出：如果操作系统是SUSE版本（即变量os_VENDOR等于“openSUSE”或“SUSE LINUX”，则返回真，否则返回假。
效果：导出环境变量DISTRO到系统中。
