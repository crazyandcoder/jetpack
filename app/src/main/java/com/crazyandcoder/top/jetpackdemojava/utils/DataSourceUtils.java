package com.crazyandcoder.top.jetpackdemojava.utils;

import com.crazyandcoder.top.jetpackdemojava.bean.JetpackItemBean;
import com.crazyandcoder.top.jetpackdemojava.bean.TJetpack;
import com.crazyandcoder.top.jetpackdemojava.jetpack.lifecycle.LifeCycleActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataSourceUtils {
    public static List<JetpackItemBean> getJetpackItems() {
        List<JetpackItemBean> list = new ArrayList<>();
        list.add(new JetpackItemBean(TJetpack.LIFECYCLE, "LIFECYCLE"));
        return list;
    }

    public static HashMap<Integer, Class> getClsList() {
        HashMap<Integer, Class> clsList = new HashMap<>();
        clsList.put(TJetpack.LIFECYCLE, LifeCycleActivity.class);
        return clsList;
    }
}
