package e0;

import android.util.Log;
import android.view.Surface;
import b0.i3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r80.b f15344d = w.b.q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15345a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f15346b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f15347c = new LinkedHashSet();

    public final g0 a(Surface surface) {
        g0 g0Var;
        List listR0;
        surface.getClass();
        if (!surface.isValid()) {
            Log.w("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.f15345a) {
            try {
                g0Var = new g0(this, surface);
                Integer num = (Integer) this.f15346b.get(surface);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.f15346b.put(surface, Integer.valueOf(iIntValue));
                listR0 = iIntValue == 1 ? CollectionsKt.r0(this.f15347c) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (listR0 != null) {
            Iterator it = listR0.iterator();
            while (it.hasNext()) {
                ((i3) it.next()).d(surface);
            }
        }
        return g0Var;
    }
}
