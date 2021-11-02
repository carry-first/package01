package com.Enum;

public enum defineEnum02 implements Info {
    //    枚举的参数定义在最上面，
//    标准格式：
//    private static final defineEnum02 spring = new defineEnum02("春天","春暖花开");
    spring("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("春天");
        }
    },
    summer("夏天", "夏季炎热") {
        @Override
        public void show() {
            System.out.println("夏天");
        }
    },
    autumn("秋天", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋天");
        }
    },
    winter("冬天", "冬季寒冷") {
        @Override
        public void show() {
            System.out.println("冬天");
        }
    };
    //    定义标准枚举的变量类型
    private String season;
    private String desribe;

    defineEnum02(String season, String desribe) {
        this.season = season;
        this.desribe = desribe;
    }

    @Override
    public void show() {
        System.out.println("季节");
    }
}

interface Info {
    abstract void show();
}
