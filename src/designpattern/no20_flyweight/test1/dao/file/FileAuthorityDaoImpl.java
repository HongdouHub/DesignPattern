package designpattern.no20_flyweight.test1.dao.file;

import com.google.gson.reflect.TypeToken;
import designpattern.no20_flyweight.test1.bean.AuthorityBean;
import designpattern.no20_flyweight.test1.dao.AbsAuthorityDao;
import utils.FileOpenUtils;
import utils.GsonUtil;
import utils.TextUtils;

import java.util.List;

public class FileAuthorityDaoImpl extends AbsAuthorityDao {

    public FileAuthorityDaoImpl() {
        initFromFile();
    }

    private void initFromFile() {
        String data = FileOpenUtils.readFile(getFileName());

        List<AuthorityBean> list = null;
        if (!TextUtils.isEmpty(data)) {
            list = GsonUtil.json2Array(data, new TypeToken<List<AuthorityBean>>() {
            });
        } else {
            authorityList.addAll(raw);
            save();
        }
        if (list != null) {
            authorityList.addAll(list);
        }
    }

    @Override
    protected void save() {
        String json = GsonUtil.array2Json(authorityList);
        FileOpenUtils.writeFile(getFileName(), json);
    }

    private String getFileName() {
        return "D:\\Java\\workspace_intellij\\Test2019\\src\\designpattern\\no20_flyweight\\test1\\dao\\file\\file.txt";
    }
}
