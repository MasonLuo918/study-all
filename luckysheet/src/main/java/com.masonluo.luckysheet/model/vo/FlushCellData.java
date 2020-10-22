package com.masonluo.luckysheet.model.vo;


import com.masonluo.luckysheet.model.Cell;

import java.util.ArrayList;

/**
 * 用来进行单元格刷新的对象，传递单元格参数
 * <p>
 * 只需要传递已经刷新的参数，无需全部传递，开发者根据是否为空来决定
 * 是否要修改原始数据
 *
 * @author Masonluo
 * @date 2020-10-21 14:24
 */
public class FlushCellData extends ArrayList<Cell> {
}
