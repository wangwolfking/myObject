package com.wolverine.thread;
import static java.lang.System.out;

import java.util.concurrent.CyclicBarrier;
public class TestSyncMethods {
    
    public static void test(int round,int threadNum,CyclicBarrier cyclicBarrier){
        new SyncTest("Sync",round,threadNum,cyclicBarrier).testTime();
        new LockTest("Lock",round,threadNum,cyclicBarrier).testTime();
        new AtomicTest("Atom",round,threadNum,cyclicBarrier).testTime();
    }
 
    public static void main(String args[]){
         
        for(int i=0;i<5;i++){
            int round=100000*(i+1);
            int threadNum=5*(i+1);
            CyclicBarrier cb=new CyclicBarrier(threadNum*2+1);
            out.println("==========================");
            out.println("round:"+round+" thread:"+threadNum);
            test(round,threadNum,cb);
             
        }
    }
}
 
