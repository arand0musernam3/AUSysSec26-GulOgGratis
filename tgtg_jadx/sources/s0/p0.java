package s0;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import com.google.android.gms.internal.measurement.te;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38424a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f38425b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f38426c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListenableFuture f38427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e6.i f38428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public te f38429f;

    @Override // s0.g1
    public final void a(List list) {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f38424a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f38425b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f38429f.i(str));
            }
            synchronized (this.f38424a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f38425b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<i0> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((i0) this.f38425b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.f38425b.containsKey(str2)) {
                            linkedHashMap.put(str2, (i0) this.f38425b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (i0) map.get(str2));
                        }
                    }
                    this.f38425b.clear();
                    this.f38425b.putAll(linkedHashMap);
                    for (i0 i0Var : arrayList) {
                        if (i0Var != null) {
                            i0Var.n();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (CameraUnavailableException e5) {
            throw new CameraUpdateException("Failed to create CameraInternal", e5);
        }
    }

    public final i0 b(String str) {
        i0 i0Var;
        synchronized (this.f38424a) {
            try {
                i0Var = (i0) this.f38425b.get(str);
                if (i0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i0Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f38424a) {
            linkedHashSet = new LinkedHashSet(this.f38425b.values());
        }
        return linkedHashSet;
    }

    public final void d(te teVar) {
        this.f38429f = teVar;
        synchronized (this.f38424a) {
            try {
                for (String str : teVar.h()) {
                    wd.a.p("CameraRepository", "Added camera: " + str);
                    i0 i0Var = (i0) this.f38425b.put(str, teVar.i(str));
                    if (i0Var != null) {
                        i0Var.a();
                    }
                }
            } catch (CameraUnavailableException e5) {
                throw new InitializationException(e5);
            }
        }
    }
}
