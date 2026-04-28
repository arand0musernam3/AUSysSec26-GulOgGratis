package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class w5 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(Looper looper, int i11) {
        super(looper);
        switch (i11) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
            case 4:
            default:
                Looper.getMainLooper();
                break;
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            case 5:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }
}
