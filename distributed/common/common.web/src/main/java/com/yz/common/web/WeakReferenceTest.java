package com.yz.common.web;

import java.lang.ref.WeakReference;

/**
 * 弱引用测试
 * @author YanZhen
 * @date 2021/05/11 13:16
 */
public class WeakReferenceTest {
    public static void main(String[] args) {
        // 强引用
        Object a = new Object();
        // 弱引用
        WeakReference<Object> reference = new WeakReference<>(a);
        // 链接地址
        System.out.println("强引用：" + a);
        System.out.println("弱引用：" + reference.get());

        // 取消强引用
        a = null;
        System.out.println("强引用取消：" + a);

        // 弱引用是否有变化
        System.out.println("GC前弱引用：" + reference.get());

        // 垃圾回收
        System.gc();

        // 回收后是否有变化
        System.out.println("GC后弱引用：" + reference.get());

    }
}
