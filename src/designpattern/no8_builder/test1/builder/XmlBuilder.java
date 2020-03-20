package designpattern.no8_builder.test1.builder;

import designpattern.no8_builder.bean.ExportDataModel;
import designpattern.no8_builder.bean.ExportFooterModel;
import designpattern.no8_builder.bean.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

public class XmlBuilder implements Builder {

    @Override
    public void buildHeader(ExportHeaderModel headerModel) {
        buffer.append("<?xml version='1.0' encoding='utf-8'?\n")
                .append("<Report>\n")
                .append("   <Header>\n")
                .append("       <DepId>").append(headerModel.getDepId()).append("</DepId>\n")
                .append("       <ExportData").append(headerModel.getExportDate()).append("</ExportData>\n")
                .append("   </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        buffer.append("   <Body>\n");
        for (String tblName : mapData.keySet()) {
            buffer.append("   <Datas TableName=\"").append(tblName).append("\">\n");
            for (ExportDataModel dataModel : mapData.get(tblName)) {
                buffer.append("   <Data>\n")
                        .append("       <ProductId>").append(dataModel.getProductId()).append("</ProductId>\n")
                        .append("       <Price>").append(dataModel.getPrice()).append("</Price>\n")
                        .append("       <Amount>").append(dataModel.getAmount()).append("</Amount>\n")
                        .append("   </Data>\n");
            }
            buffer.append("   </Body>\n");
        }
    }

    @Override
    public void buildFooter(ExportFooterModel footerModel) {
        buffer.append("   <Footer>\n")
                .append("   <ExportUser>").append(footerModel.getExportUser()).append("</ExportUser>\n")
                .append("   </Footer>\n")
                .append("</Report>\n");
    }
}