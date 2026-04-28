package w;

import android.util.Log;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import s0.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.b f42667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0.p0 f42669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.collections.n0 f42670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f42671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42673g;

    public e(e0.b0 b0Var, j0.b bVar) {
        bVar.getClass();
        this.f42667a = bVar;
        this.f42668b = new Object();
        kotlin.collections.o0.f26530a.getClass();
        this.f42670d = kotlin.collections.n0.f26529a;
        this.f42671e = new ArrayList();
    }

    @Override // s0.g1
    public final void a(List list) throws CameraUpdateException {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> setC = j0.b.c(this.f42667a);
            if (setC == null) {
                setC = kotlin.collections.p0.f26531a;
            }
            for (Set set : setC) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e0.s) it.next()).f15403a);
                }
                Set setV0 = CollectionsKt.v0(arrayList);
                if (list.containsAll(setV0)) {
                    List listR0 = CollectionsKt.r0(set);
                    if (listR0.size() >= 2) {
                        String str = ((e0.s) listR0.get(0)).f15403a;
                        String str2 = ((e0.s) listR0.get(1)).f15403a;
                        try {
                            if (pd.g.A(this.f42667a, str) && pd.g.A(this.f42667a, str2)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(str)) {
                                    linkedHashMap.put(str, new ArrayList());
                                }
                                Object obj = linkedHashMap.get(str);
                                obj.getClass();
                                ((List) obj).add(str2);
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new ArrayList());
                                }
                                Object obj2 = linkedHashMap.get(str2);
                                obj2.getClass();
                                ((List) obj2).add(str);
                            }
                        } catch (InitializationException e5) {
                            if (wd.a.B(5, "CXCP")) {
                                Log.w("CXCP", "Skipping incompatible concurrent pair: " + set + " due to " + e5.getMessage());
                            }
                        }
                    }
                } else if (wd.a.B(5, "CXCP")) {
                    Log.w("CXCP", "Failed to retrieve concurrent camera: " + setV0 + " from " + list);
                }
            }
            synchronized (this.f42668b) {
            }
        } catch (Exception e11) {
            throw new CameraUpdateException("Failed to retrieve concurrent camera id info for camera-pipe.", e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [w.e] */
    public final void b(s0.p0 p0Var) throws CameraUpdateException {
        ?? arrayList;
        p0Var.getClass();
        synchronized (this.f42668b) {
            this.f42669c = p0Var;
        }
        ArrayList arrayListA = j0.b.a(this.f42667a);
        if (arrayListA != null) {
            arrayList = new ArrayList(kotlin.collections.e0.o(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((e0.s) it.next()).f15403a);
            }
        } else {
            arrayList = kotlin.collections.n0.f26529a;
        }
        a(arrayList);
    }
}
