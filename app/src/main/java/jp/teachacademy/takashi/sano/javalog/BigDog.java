package jp.teachacademy.takashi.sano.javalog;

/**
 * Created by 307156 on 2016/12/07.
 */

import android.util.Log;

class BigDog extends Dog {

    static String to_jp = "大型犬";

    public BigDog(String name, int age){
        super(name, age);
    }


    public static void introduce(){
        Log.d("javatest", "これは大型犬クラスです。");
    }
}


