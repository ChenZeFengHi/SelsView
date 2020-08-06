package com.zack.selsview.itf;

import java.util.ArrayList;

/**
 * Description DataProvider
 */
public interface DataProvider {
    void provideData(int position, ISelect model, DataReceiver receiver);

    /**
     * 回调接口，根据选择深度，按顺序返回选择的对象。
     */
    void onAddressSelected(ArrayList<ISelect> models);

    /**
     * Description DataReceiver
     */
    interface DataReceiver {
        void send(ArrayList<ISelect> models);
    }
}
