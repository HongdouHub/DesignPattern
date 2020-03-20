package designpattern.no8_builder.test1.builder;

import designpattern.no8_builder.bean.ExportDataModel;
import designpattern.no8_builder.bean.ExportFooterModel;
import designpattern.no8_builder.bean.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

public interface Builder {

    /**
     * 用来记录构建的文件的内容
     */
    StringBuffer buffer = new StringBuffer();

    /**
     * 构建输出文件的Header部分
     *
     * @param headerModel
     */
    void buildHeader(ExportHeaderModel headerModel);

    /**
     * 构建输出文件的Body部分
     *
     * @param mapData
     */
    void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    /**
     * 构建输出文件的Footer部分
     *
     * @param footerModel
     */
    void buildFooter(ExportFooterModel footerModel);

    default StringBuffer getResult() {
        return buffer;
    }
}
