package qj;

import android.os.Parcelable;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m implements Parcelable {
    public abstract f70.b a();

    public String b() {
        return null;
    }

    public cv.i c() {
        return cv.i.DEEPLINK_OPENED;
    }

    public dv.b d() {
        if (b() != null) {
            return h0.g.E(new Pair(dv.a.DEEPLINK_TYPE, new dv.c(b())));
        }
        return null;
    }
}
