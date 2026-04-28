package w9;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
