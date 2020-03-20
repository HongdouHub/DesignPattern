package designpattern.no8_builder.bean;

public class ExportHeaderModel {

    /**
     * 分公司或门市点编号
     */
    private String depId;

    /**
     * 导出数据的日期
     */
    private String exportDate;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }

    public ExportHeaderModel() {
        //
    }

    public ExportHeaderModel(String depId, String exportDate) {
        this.depId = depId;
        this.exportDate = exportDate;
    }

    @Override
    public String toString() {
        return depId + "," + exportDate + "\n";
    }
}
