package com.company.dispatch;

import java.util.concurrent.*;

/**
 * Created by zhouhui on 2018/2/13.
 */
public class Dispatch {

	/*构造一个缓冲功能的线程池，配置corePoolSize=0，maximumPoolSize=Integer.MAX_VALUE，
	 keepAliveTime=60s,以及一个无容量的阻塞队列 SynchronousQueue，因此任务提交之后，
	  将会创建新的线程执行；线程空闲超过60s将会销毁
	*/

	/***
	 *
	 * @return
	 */
	public static ExecutorService newCachedThreadPool() {
		return new ThreadPoolExecutor(0, 10,
				60L, TimeUnit.SECONDS,
				new LinkedBlockingQueue<Runnable>(15));
//		new SynchronousQueue<Runnable>());
	}

	public void test(){
		ExecutorService pool = newCachedThreadPool();
		for(int i=1; i<100; i++) {
			System.out.println("提交第" + i + "个任务!");
			pool.execute(new Runnable() {
				@Override
				public void run() {
					try {

						TimeUnit.SECONDS.sleep(10);
						System.out.println(">>>task is running=====");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

}
