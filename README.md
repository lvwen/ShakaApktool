### About
You know and not know are in progress.


It is NOT intended for piracy and other non-legal uses. It could be used for localizing, adding some features or support for custom platforms and other GOOD purposes. Just try to be fair with authors of an app, that you use and probably like.


#### Link
- [Project Page](http://www.rover12421.com/shakaapktool)
- [Apktool Project Page](http://ibotpeaches.github.io/Apktool/)
- [Source (Github)](https://github.com/rover12421/ShakaApktool/)
- [Source (Bitbucket)](https://bitbucket.org/Rover12421/shakaapktool)
- [Source (GitCafe)](https://gitcafe.com/rover12421/ShakaApktool)
- [Source (OsChina)](http://git.oschina.net/rover12421/ShakaApktool)
- [Source (CSDN)](https://code.csdn.net/rover12421/shakaapktool)
- [Source (CODING)](https://coding.net/u/rover12421/p/ShakaApktool)
- [How To Build](https://github.com/rover12421/ShakaApktool/wiki/How-To-Build)
- [Download](http://pan.baidu.com/s/1hqpcJNu)

#### Other
- QQ Group : 198996891

http://bbs.pediy.com/showthread.php?t=202965

最早发现资源混淆的样本,就是QQ.之后对腾讯其它混淆样本也分析过.加固程度也在不断的升级.有些思路还是很好的.也可以看出腾讯在这方面还是下了很大功夫的.

最早的样本是QQ,也就是大家熟知的"res"变成了"R"的明显特征.
这重资源路径的混淆不难,恢复也不难.恢复最大的问题在aapt打包遇到文件名是java关键词抛出异常的问题,其实多种方式可以解决.最开始想用二次混淆的,最终还是采用了修改aapt的方式,简单,方便.正好其它辅助增强也需要修改aapt,就一并改了.

QQ升级了,微信还是用的这一套.QQ又加上了的重复资源来进行干扰.这种干扰要过比前一个更简单.最近好像很多apk都喜欢加这种了,难道是因为简单?

再就是最新的QQ,在重复资源上增加了难度,用了重复资源名称.导致得到的XMl里全是清一色属性名.不得不说,这招还是挺狠的,修复起来也颇为困难.原理很简单,Android查找是通过id查找,名字只是一个表象,但是对反编译工具来说,却是一个很重要的属性.

还有一个QQ浏览器,xml中用了两个"internal"的属性,属性和属性需要的值类型是对应不上的,不知道他的目的是什么.随然可以知道,这样可以让工具无法回编译,但是这两个值真的用上了吗?没有深究,腾讯相关的同学要是愿意告知,我会非常感谢.

只是唠叨下,细节写起来太累,就不说了,有兴趣的可以自己看我的源码提交记录.其实腾讯还可以做的更好的,相信后面的升级也会有新的变化和手段.

重点来了,放工具.相信很多人进来的目的只是为了这最后的工具的吧.
工具名:ShakaApktool
下载:
http://pan.baidu.com/s/1hqpcJNu
源码:
https://github.com/rover12421/ShakaApktool

提示下,针对腾讯的apk,可以加上"-xn"参数 
