package org.xiangbalao.fragmentdome;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Fragment2 extends Fragment {
	private Button button1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment2, container, false);
		initView(view);
		return view;

	}

	private void initView(View view) {
		button1 = (Button) view.findViewById(R.id.button1);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Fragment1 mBianGengFragment1 = new Fragment1();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction tx = fm.beginTransaction();
				//替换
				tx.replace(R.id.id_content, mBianGengFragment1,
						Fragment1.class.getSimpleName());
				//回退的
				tx.addToBackStack(Fragment1.class.getSimpleName());
				tx.commit();

			}
		});

	}

}
