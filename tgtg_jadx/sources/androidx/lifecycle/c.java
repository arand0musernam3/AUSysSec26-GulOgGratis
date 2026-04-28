package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3417a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3418b;

    public c(HashMap map) {
        this.f3418b = map;
        for (Map.Entry entry : map.entrySet()) {
            w wVar = (w) entry.getValue();
            List arrayList = (List) this.f3417a.get(wVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f3417a.put(wVar, arrayList);
            }
            arrayList.add((d) entry.getKey());
        }
    }

    public static void a(List list, LifecycleOwner lifecycleOwner, w wVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                d dVar = (d) list.get(size);
                Method method = dVar.f3422b;
                try {
                    int i11 = dVar.f3421a;
                    if (i11 == 0) {
                        method.invoke(obj, null);
                    } else if (i11 == 1) {
                        method.invoke(obj, lifecycleOwner);
                    } else if (i11 == 2) {
                        method.invoke(obj, lifecycleOwner, wVar);
                    }
                } catch (IllegalAccessException e5) {
                    org.bouncycastle.jce.provider.a.m(e5);
                    return;
                } catch (InvocationTargetException e11) {
                    a40.d0.o("Failed to call observer method", e11.getCause());
                    return;
                }
            }
        }
    }
}
