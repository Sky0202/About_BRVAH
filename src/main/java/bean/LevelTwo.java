package bean;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.sky.checkboxdemo.MyAdapter;

/**
 * Created by SKY on 2017-4-22.
 */

public class LevelTwo extends AbstractExpandableItem<LevelThree> implements MultiItemEntity{

    public String title;

    public LevelTwo(String title) {
        this.title = title;
    }

    @Override
    public int getItemType() {
        return 1;
    }

    @Override
    public int getLevel() {
        return MyAdapter.LEVEL_TWO;
    }
}
