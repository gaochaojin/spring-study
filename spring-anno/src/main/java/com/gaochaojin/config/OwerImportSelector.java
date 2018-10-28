package com.gaochaojin.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:28 2018/10/28
 */
public class OwerImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.gaochaojin.bean.Fish","com.gaochaojin.bean.Tiger"};
    }
}
