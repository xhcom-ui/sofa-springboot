package com.citydo.sofaboot_server.service.impl;

public class CallbackImpl implements SofaResponseCallback {


    public void onAppResponse(Object appResponse, String methodName, RequestBase request) {
        System.out.println("callback client process:" + appResponse);
    }


    public void onAppException(Throwable throwable, String methodName, RequestBase request) {
    }

    public void onSofaException(SofaRpcException sofaException, String methodName, RequestBase request) {
    }

}
