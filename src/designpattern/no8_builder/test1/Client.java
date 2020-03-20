package designpattern.no8_builder.test1;

import designpattern.no8_builder.bean.ExportDataModel;
import designpattern.no8_builder.bean.ExportFooterModel;
import designpattern.no8_builder.bean.ExportHeaderModel;
import designpattern.no8_builder.test1.builder.TxtBuilder;
import designpattern.no8_builder.test1.builder.XmlBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        ExportHeaderModel headerModel = generateHeader();
        Map<String, Collection<ExportDataModel>> mapData = generateData();
        ExportFooterModel footerModel = generateFooter();

        TxtBuilder txtBuilder = new TxtBuilder();
        Director director1 = new Director(txtBuilder);
        director1.construct(headerModel, mapData, footerModel);
        System.out.println("输出到文本文件的内容：\n");
        System.out.println(txtBuilder.getResult() + "\n");

        System.out.println("--------------------\n");

        XmlBuilder xmlBuilder = new XmlBuilder();
        Director director2 = new Director(xmlBuilder);
        director2.construct(headerModel, mapData, footerModel);
        System.out.println("输出到XML文件的内容：\n");
        System.out.println(xmlBuilder.getResult() + "\n");

    }

    private static ExportHeaderModel generateHeader() {
        return new ExportHeaderModel("公司名称", "2019-04-11");
    }

    private static Map<String, Collection<ExportDataModel>> generateData() {
        Map<String, Collection<ExportDataModel>> mapData = new HashMap<String, Collection<ExportDataModel>>();
        Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();

        ExportDataModel dataModel1 = new ExportDataModel("产品001号", 100, 80);
        ExportDataModel dataModel2 = new ExportDataModel("产品002号", 90, 50);

        col.add(dataModel1);
        col.add(dataModel2);
        mapData.put("销售记录表", col);
        return mapData;
    }

    private static ExportFooterModel generateFooter() {
        return new ExportFooterModel("张三");
    }
}
