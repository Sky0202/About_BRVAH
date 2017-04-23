package bean;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.sky.checkboxdemo.MyAdapter;

/**
 * Created by SKY on 2017-4-22.
 */

public class LevelOne extends AbstractExpandableItem<LevelTwo> implements MultiItemEntity{

    public String title;

    public LevelOne(String title) {
        this.title = title;
    }

    @Override
    public int getItemType() {
        return 0;
    }

    @Override
    public int getLevel() {
        return MyAdapter.LEVEL_ONE;
    }
}
