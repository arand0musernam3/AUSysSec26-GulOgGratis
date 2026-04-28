package tx;

import android.content.Intent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements ax.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ky.p f40519b = new ky.p(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f40520c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40521a = new HashMap();

    public final boolean a(int i11, int i12, Intent intent) {
        g gVar;
        g gVar2 = (g) this.f40521a.get(Integer.valueOf(i11));
        if (gVar2 != null) {
            gVar2.a(i12, intent);
            return true;
        }
        synchronized (f40519b) {
            gVar = (g) f40520c.get(Integer.valueOf(i11));
        }
        if (gVar == null) {
            return false;
        }
        gVar.a(i12, intent);
        return true;
    }
}
