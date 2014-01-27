# devstack已支持的操作系统列表
| OS Name | Vendor | Release | Update | Package | Codename |
|:---:|:---:|:---:|:---:|:---:|:---:|
| Ubuntu 11.10 | Ubuntu | 11.10 | | deb | oneiric |
| Ubuntu 12.04 | Ubuntu | 12.04 | | deb | precise |
| Ubuntu 13.04 | Ubuntu | 13.04 | | deb | raring |
| Ubuntu 13.10 | Ubuntu | 13.10 | | deb | saucy |
| Ubuntu 14.04 | Ubuntu | 14.04 | | deb | trusty |
| Debian 7.0 | Debian | 7.0 | | deb | 7.0 ?? | 
| Debian 7.x | Debian | 7.x | | deb | wheezy |
| Debian unstable | Debian | | | deb | sid |
| Debian testing | Debian | | | deb | testing |
| Debian 8.x | Debian | | | deb | jessie |
| Fedora 18 | Fedora | 18 | | rpm | spherical cow ??| 
| Fedora 19 | Fedora | 19 | | rpm | schrödinger's cat ??|
| Fedora 20 | Fedora | 20 | | rpm | heisenbug ??| 
| openSUSE 12.2 | openSUSE | 12.2 | | rpm | Mantis |
| Red Hat 6.x | Red Hat | 6 | x | rpm | Santiago | 
| CentOS 6.x | CentOS | 6 | x | rpm | Final | 

*以上操作系统发行版本，已经由devstack脚本测试通过。使用其他版本，默认在提示“If you wish to run this script anyway run with FORCE=yes”后脚本退出，如希望脚本继续运行，则需要在localrc设置`FORCE=yes`参数。


