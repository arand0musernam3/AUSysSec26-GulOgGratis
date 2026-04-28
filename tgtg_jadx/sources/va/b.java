package va;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList f42200a;

    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
    }
}
