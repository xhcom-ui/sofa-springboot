package com.citydo.sofaboot_server.service.impl;

import com.citydo.sofaboot_server.model.SampleGenericParamModel;
import com.citydo.sofaboot_server.model.SampleGenericResultModel;
import com.citydo.sofaboot_server.service.SampleGenericService;

public class SampleGenericServiceImpl implements SampleGenericService {


    public SampleGenericResultModel sayGeneric(SampleGenericParamModel sampleGenericParamModel) {
        String name = sampleGenericParamModel.getName();
        SampleGenericResultModel resultModel = new SampleGenericResultModel();
        resultModel.setName(name);
        resultModel.setValue("sample generic value");
        return resultModel;

    }

}
