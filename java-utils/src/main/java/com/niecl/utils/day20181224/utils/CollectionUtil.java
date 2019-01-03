package com.niecl.utils.day20181224.utils;

import com.niecl.utils.day20181224.pojo.Todo;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @authar nieChenLiang
 * @date 2018-12-24 15:03
 * 集合操作类
 */
public class CollectionUtil {

    /**
     * 并集
     * description:两个集合中的元素合在一起(去重)
     * @param listA
     * @param listB
     * @return
     */
    public  List<String> Union(List<Todo> listA, List<Todo> listB) {
        List<String> strA=new ArrayList<String>();
        List<String> strB=new ArrayList<String>();
        initCodeList(listA,listB,strA,strB);
        List<String> unionList = (List<String>) CollectionUtils.union(strA, strB);
        return unionList;
    }

    /**
     * 交集
     * description:两个集合中相同的数据(去重)
     * @param listA
     * @param listB
     * @return
     */
    public  List<String> Intersection(List<Todo> listA, List<Todo> listB) {
        List<String> strA=new ArrayList<String>();
        List<String> strB=new ArrayList<String>();
        initCodeList(listA,listB,strA,strB);
        List<String> unionList = (List<String>) CollectionUtils.intersection(strA, strB);
        return unionList;
    }

    /**
     * 交集的补集
     * description:与交集相反，两个集合中不同的数据
     * @param listA
     * @param listB
     * @return
     */
    public  List<String> Disjunction(List<Todo> listA, List<Todo> listB) {
        List<String> strA=new ArrayList<String>();
        List<String> strB=new ArrayList<String>();
        initCodeList(listA,listB,strA,strB);
        List<String> unionList = (List<String>) CollectionUtils.disjunction(strA, strB);
        return unionList;
    }


    /**
     * 差集
     * description:集合A 扣除 集合B 里面剩余的数据
     * @param listA
     * @param listB
     * @return
     */
    public  List<String> Subtract(List<Todo> listA, List<Todo> listB) {
        List<String> strA=new ArrayList<String>();
        List<String> strB=new ArrayList<String>();
        initCodeList(listA,listB,strA,strB);
        List<String> unionList = (List<String>) CollectionUtils.subtract(strA, strB);//a 扣除 b
        return unionList;
    }

    /**
     * 判断集合是否为空
     * @param listA
     * @return
     */
    public  boolean WhetherNull(List<Todo> listA){
        if(listA.isEmpty()|| listA.size()==0){
            return  false;
        }
        return  true;
    }

    /**
     * 判断两个集合是否相等
     * @param listA
     * @param listB
     * @return
     */
    public  boolean EqualsList(List<Todo> listA, List<Todo> listB){
        if(listA.size()==listB.size() && listA.containsAll(listB)){
            return  true;
        }
        return false;
    }

//    public void testUnmodifiableCollection(){
//        Collection<String> c = new ArrayList<>();
//        Collection<String> s = CollectionUtils.unmodifiableCollection(c);
//        c.add("boy");
//        c.add("love");
//        c.add("girl");
//        //! s.add("have a error");
//        System.out.println(s);
//        s.remove("boy");
//        System.out.println(c);
//        System.out.println(s);
//    }

    /**
     * 将实体集合中的主键 添加到主键集合
     * @param listA
     * @param listB
     * @param strA
     * @param strB
     */
    public void initCodeList(List<Todo> listA, List<Todo> listB, List<String> strA, List<String> strB){
        for (int i = 0; i <listA.size() ; i++) {
            strA.add(listA.get(i).getTodoId());
        }
        for (int i = 0; i <listB.size() ; i++) {
            strB.add(listB.get(i).getTodoId());
        }
    }

}
