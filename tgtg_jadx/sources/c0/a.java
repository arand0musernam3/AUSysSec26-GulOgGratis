package c0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.d0;
import m0.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f6788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f6789b;

    static {
        c0 c0Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f6788a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        f6789b = linkedHashMap2;
        c0 c0Var2 = c0.f28478d;
        linkedHashMap.put(1L, c0Var2);
        linkedHashMap2.put(c0Var2, kotlin.collections.c0.c(1L));
        linkedHashMap.put(2L, c0.f28479e);
        linkedHashMap2.put(linkedHashMap.get(2L), kotlin.collections.c0.c(2L));
        c0 c0Var3 = c0.f28480f;
        linkedHashMap.put(4L, c0Var3);
        linkedHashMap2.put(c0Var3, kotlin.collections.c0.c(4L));
        c0 c0Var4 = c0.f28481g;
        linkedHashMap.put(8L, c0Var4);
        linkedHashMap2.put(c0Var4, kotlin.collections.c0.c(8L));
        List listH = d0.h(64L, 128L, 16L, 32L);
        Iterator it = listH.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0Var = c0.f28482h;
            if (!zHasNext) {
                break;
            }
            f6788a.put(Long.valueOf(((Number) it.next()).longValue()), c0Var);
        }
        f6789b.put(c0Var, listH);
        List listH2 = d0.h(1024L, 2048L, 256L, 512L);
        Iterator it2 = listH2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            c0 c0Var5 = c0.f28483i;
            if (!zHasNext2) {
                f6789b.put(c0Var5, listH2);
                return;
            } else {
                f6788a.put(Long.valueOf(((Number) it2.next()).longValue()), c0Var5);
            }
        }
    }

    public static Long a(c0 c0Var, DynamicRangeProfiles dynamicRangeProfiles) {
        c0Var.getClass();
        dynamicRangeProfiles.getClass();
        List list = (List) f6789b.get(c0Var);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        supportedProfiles.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (supportedProfiles.contains(Long.valueOf(jLongValue))) {
                return Long.valueOf(jLongValue);
            }
        }
        return null;
    }
}
