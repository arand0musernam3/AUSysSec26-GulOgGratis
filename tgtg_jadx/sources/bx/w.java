package bx;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6753a;

    public w(HashMap map) {
        map.getClass();
        HashMap map2 = new HashMap();
        this.f6753a = map2;
        map2.putAll(map);
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            return new v(this.f6753a);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final void a(b bVar, List list) {
        HashMap map = this.f6753a;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            list.getClass();
            if (!map.containsKey(bVar)) {
                map.put(bVar, new ArrayList(list));
                return;
            }
            List list2 = (List) map.get(bVar);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public w() {
        this.f6753a = new HashMap();
    }
}
