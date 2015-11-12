package org.xiangbalao.fragmentdome;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;


public class MainActivity extends Activity {
	private FrameLayout id_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id_content = (FrameLayout) findViewById(R.id.id_content);
        
        
        
    	// TODO 可变更贷款信息 列表 添加动画
		Fragment1 mBianGengLBFragment = new Fragment1();
		//管理器
		FragmentManager fm = getFragmentManager();
		
		// FragmentTransaction对fragment进行添加,移除,替换,以及执行其他动作。
		FragmentTransaction tx = fm.beginTransaction();
		// 要添加到的容器，fragment 对象、标志位（名字）
		tx.add(R.id.id_content, mBianGengLBFragment,
				Fragment1.class.getSimpleName());
		
		//回退
		tx.addToBackStack(null);
        //提交
		tx.commit();
        
        
    }


	@Override
	public void onBackPressed() {
		if (getFragmentManager().getBackStackEntryCount() == 1) {
			finish();

		} else {

		}

		super.onBackPressed();
	}

}
