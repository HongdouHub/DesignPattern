package designpattern.no8_builder.bean;

public class ExportFooterModel {

    /**
     * 输出人
     */
    private String exportUser;

    public String getExportUser() {
        return exportUser;
    }

    public void setExportUser(String exportUser) {
        this.exportUser = exportUser;
    }

    public ExportFooterModel() {
        //
    }

    public ExportFooterModel(String exportUser) {
        this.exportUser = exportUser;
    }

    @Override
    public String toString() {
        return exportUser;
    }
}
