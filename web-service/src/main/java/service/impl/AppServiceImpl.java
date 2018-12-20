package service.impl;

import service.IAppService;

/**
 * @authar nieChenLiang
 * @date 2018-12-19 16:39
 */
public class AppServiceImpl implements IAppService {
    public void print() {
        System.out.println("调用Dao层返回数据");
        System.out.println("this is a Service");
    }
}
