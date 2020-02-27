package com.design.pattern.study.builderpattern;

import sun.security.tools.keytool.Resources;

/**
 * @author a small asshole
 * @version 1.0
 * @description 建造者模式
 * 在下面的 ConstructorArg 类中，当 isRef 为 true 的时候，
 * arg 表示 String 类型的 refBeanId，type 不需要设置；
 * 当 isRef 为 false 的时候，arg、type 都需要设置。
 * 请根据这个需求，完善 ConstructorArg 类。
 * @date in 15:10 2020/2/27
 * @since 1.0
 */
public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    public boolean isRef() {
        return isRef;
    }

    public Class getType() {
        return type;
    }

    public Object getArg() {
        return arg;
    }

    private ConstructorArg(Builder builder){
        this.arg = builder.arg;
        this.type = builder.type;
        this.isRef = builder.isRef;
    }

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private boolean isRef;
        private Class type;
        private Object arg;

        public Builder isRef(boolean isRef) {
            this.isRef = isRef;
            return this;
        }

        public Builder type(Class type) {
            this.type = type;
            return this;
        }

        public Builder arg(Object arg) {
            this.arg = arg;
            return this;
        }

        public ConstructorArg build() {
            if (!isRef) {
                if (arg == null || type == null) {
                    throw new IllegalArgumentException("属性设置不正确，请检查设置的属性");
                }
            }
            if(!(arg instanceof String) || "".equalsIgnoreCase((String)arg)){
                throw new IllegalArgumentException("属性设置不正确，请检查设置的属性");
            }

            return new ConstructorArg(this);
        }


    }

    public static void main(String[] args) {
        ConstructorArg constructorArg = ConstructorArg.builder()
                .isRef(true)
                .arg(123)
                .type(Resources.class)
                .build();
    }
}
