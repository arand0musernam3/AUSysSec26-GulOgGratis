package j0;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f24278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24279b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f24280c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0.e f24281d;

    public a(String str, Map map, Context context, h0.n nVar, h hVar) {
        this.f24278a = map;
        hVar.a(e.CAMERA, new d1.e(this, 24));
        e0.e eVarA = a(str);
        if (eVarA != null) {
            this.f24281d = eVarA;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Failed to load the default backend for ");
        sb2.append((Object) e0.g.a(str));
        hv.k.a(sb2, "! Available backends are ", map.keySet());
        throw null;
    }

    public final e0.e a(String str) {
        str.getClass();
        synchronized (this.f24279b) {
            try {
                e0.e eVar = (e0.e) this.f24280c.get(new e0.g(str));
                if (eVar != null) {
                    return eVar;
                }
                g0.a aVar = (g0.a) this.f24278a.get(new e0.g(str));
                e0.e eVar2 = aVar != null ? aVar.f17997a : null;
                if (eVar2 != null) {
                    if (!Intrinsics.areEqual(str, "CXCP-Camera2")) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) e0.g.a(str)) + " but it was actually " + ((Object) e0.g.a("CXCP-Camera2"))).toString());
                    }
                    this.f24280c.put(new e0.g(str), eVar2);
                }
                return eVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
