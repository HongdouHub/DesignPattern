package designpattern.no8_builder.test1;

import designpattern.no8_builder.bean.ExportDataModel;
import designpattern.no8_builder.bean.ExportFooterModel;
import designpattern.no8_builder.bean.ExportHeaderModel;
import designpattern.no8_builder.test1.builder.Builder;

import java.util.Collection;
import java.util.Map;

public class Director {

    /**
     * 持有当前需要使用的生成器对象
     */
    private Builder builder;

    /**
     * 构造方法，传入生成器对象
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指导生成器构建最终的产品对象
     */
    public void construct(ExportHeaderModel headerModel, Map<String, Collection<ExportDataModel>> mapData,
                          ExportFooterModel footerModel) {

        // 通过使用生成器接口来构建最终的产品对象
        builder.buildHeader(headerModel);
        builder.buildBody(mapData);
        builder.buildFooter(footerModel);
    }
}
