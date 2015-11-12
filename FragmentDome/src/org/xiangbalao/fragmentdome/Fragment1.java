package org.xiangbalao.fragmentdome;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment {
	private Button button1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment1, container, false);
		initView(view);
		return view;

	}

	private void initView(View view) {
		button1 = (Button) view.findViewById(R.id.button1);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Fragment2 mBianGengFragment2 = new Fragment2();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction tx = fm.beginTransaction();
				//替换
				tx.replace(R.id.id_content, mBianGengFragment2,
						Fragment2.class.getSimpleName());
				//回退的
				//tx.addToBackStack(Fragment1.class.getSimpleName());
				tx.addToBackStack(null);
				
				tx.commit();

			}
		});

	}

}
