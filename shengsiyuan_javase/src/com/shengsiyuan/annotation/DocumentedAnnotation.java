package com.shengsiyuan.annotation;

import java.lang.annotation.Documented;

@Documented   //表示该注解被使用时会生成到帮助文档
public @interface DocumentedAnnotation {

	String value();
}
