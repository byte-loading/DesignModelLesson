package top.learningwang.singleton;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import top.learningwang.singleton.lazy.LazySingleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author wangjingbiao
 * @date 2020/11/09 20:54
 * 多线程调试单例线程安全性问题
 */
public class LazySingletonThreadSafeTest {
    private CountDownLatch countDownLatch;

    @Before
    public void init() {
        countDownLatch = new CountDownLatch(2);
    }

    @After
    public void destory() {
        if (countDownLatch != null) {
            countDownLatch = null;
        }
    }

    /**
     * 单线程创建单例对象，无安全性问题
     */
    @Test
    public void testNewLazySingleton() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);
    }

    /**
     * 调试多线程下单例懒汉模式的安全性问题
     */
    @Test
    public void testNewLazySingletonManyThread() throws InterruptedException {
        Thread t1 = new Thread(new TestSingletonRunnable(countDownLatch));
        Thread t2 = new Thread(new TestSingletonRunnable(countDownLatch));
        t1.start();
        t2.start();
        countDownLatch.await();
    }

    /**
     * 测试线程用于创建单例对象
     */
    class TestSingletonRunnable implements Runnable {
        private CountDownLatch countDownLatch;
        public TestSingletonRunnable(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            LazySingleton lazySingleton = LazySingleton.getInstance();
            System.out.println("thread: " + Thread.currentThread() + " : " + lazySingleton);
            countDownLatch.countDown();
        }
    }
}