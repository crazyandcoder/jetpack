package com.crazyandcoder.top.jetpackdemojava.utils;

import com.crazyandcoder.top.jetpackdemojava.bean.JetpackItemBean;
import com.crazyandcoder.top.jetpackdemojava.bean.TJetpack;
import com.crazyandcoder.top.jetpackdemojava.jetpack.databinding.DemoDataBindingActivity;
import com.crazyandcoder.top.jetpackdemojava.jetpack.lifecycle.DemoLifeCycleActivity;
import com.crazyandcoder.top.jetpackdemojava.jetpack.viewmodel.DemoViewModelActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataSourceUtils {
    public static List<JetpackItemBean> getJetpackItems() {
        List<JetpackItemBean> list = new ArrayList<>();
        list.add(new JetpackItemBean(TJetpack.LIFECYCLE, "Lifecycle"));
        list.add(new JetpackItemBean(TJetpack.VIEW_MODEL, "ViewModel"));
        list.add(new JetpackItemBean(TJetpack.DATA_BINDING, "DataBinding"));
        return list;
    }

    public static HashMap<Integer, Class> getClsList() {
        HashMap<Integer, Class> clsList = new HashMap<>();
        clsList.put(TJetpack.LIFECYCLE, DemoLifeCycleActivity.class);
        clsList.put(TJetpack.VIEW_MODEL, DemoViewModelActivity.class);
        clsList.put(TJetpack.DATA_BINDING, DemoDataBindingActivity.class);
        return clsList;
    }
}
