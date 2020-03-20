package designpattern.no8_builder.test1.builder;

import designpattern.no8_builder.bean.ExportDataModel;
import designpattern.no8_builder.bean.ExportFooterModel;
import designpattern.no8_builder.bean.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

public class TxtBuilder implements Builder {

    @Override
    public void buildHeader(ExportHeaderModel headerModel) {
        buffer.append(headerModel);
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tblName : mapData.keySet()) {
            buffer.append(tblName).append("\n");
            for (ExportDataModel dataModel : mapData.get(tblName)) {
                buffer.append(dataModel);
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel footerModel) {
        buffer.append(footerModel);
    }
}
