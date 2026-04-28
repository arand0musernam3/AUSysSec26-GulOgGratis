package w;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import o00.x0;
import s0.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0.a f42747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f42749d;

    public p(Context context, a0.a aVar, Set set) throws InitializationException {
        context.getClass();
        set.getClass();
        this.f42746a = context;
        aVar.getClass();
        this.f42747b = aVar;
        this.f42748c = new Object();
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        this.f42749d = o0Var;
        try {
            a(CollectionsKt.r0(set));
        } catch (CameraUpdateException e5) {
            throw new InitializationException(e5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    @Override // s0.g1
    public final void a(List list) throws CameraUpdateException {
        List<String> listA0;
        o0.b hVar;
        list.getClass();
        synchronized (this.f42748c) {
            listA0 = CollectionsKt.a0(this.f42749d.keySet(), list);
        }
        if (!listA0.isEmpty() && wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Creating new surface combinations for: " + listA0);
        }
        a0.a aVar = this.f42747b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listA0.isEmpty()) {
            try {
                for (String str : listA0) {
                    j0.b bVarA = aVar.a();
                    e0.s.a(str);
                    e0.v vVarB = j0.b.b(bVarA, str);
                    CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                    key.getClass();
                    y.b bVar = new y.b(vVarB, new x.i((StreamConfigurationMap) ((f0.t0) vVarB).c(key), new z.f(vVarB)));
                    Context context = this.f42746a;
                    c0 c0Var = new c0(str, bVar.a());
                    if (Build.VERSION.SDK_INT >= 35) {
                        e0.b0 b0Var = (e0.b0) aVar.f14a.f48335c;
                        x0.o(b0Var);
                        hVar = new a8.h(vVarB, b0Var, bVar, 3);
                    } else {
                        hVar = o0.b.f31617m0;
                    }
                    linkedHashMap.put(str, new q0(context, vVarB, c0Var, hVar));
                }
            } catch (DoNotDisturbException e5) {
                throw new CameraUpdateException("Failed to query camera metadata", e5);
            } catch (Exception e11) {
                throw new CameraUpdateException("Failed to build surface combinations", e11);
            }
        }
        synchronized (this.f42748c) {
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.f42749d.containsKey(str2)) {
                        Object obj = this.f42749d.get(str2);
                        obj.getClass();
                        linkedHashMap2.put(str2, obj);
                    }
                }
                linkedHashMap2.putAll(linkedHashMap);
                this.f42749d = linkedHashMap2;
                if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "Committed new surface combination map. Total cameras: " + linkedHashMap2.size());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
