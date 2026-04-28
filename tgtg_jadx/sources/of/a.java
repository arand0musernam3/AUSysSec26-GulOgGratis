package of;

import com.braze.models.FeatureFlag;
import java.util.List;
import java.util.Map;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32482b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f32481a = i11;
        this.f32482b = obj;
    }

    public final void a(Map map, tf.b bVar) {
        boolean z11;
        boolean z12;
        switch (this.f32481a) {
            case 0:
                l lVar = (l) this.f32482b;
                map.getClass();
                bVar.getClass();
                Object obj = map.get(FeatureFlag.ENABLED);
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                Object obj2 = map.get("sampleRate");
                Number number = obj2 instanceof Number ? (Number) obj2 : null;
                Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
                lVar.f32502c.b("DiagnosticsClient: Did fetch remote config with sampleRate: " + dValueOf);
                lVar.f32516r.h(new g(bool, dValueOf));
                break;
            default:
                ye.c cVar = (ye.c) this.f32482b;
                map.getClass();
                bVar.getClass();
                kf.b bVar2 = cVar.f45876a;
                a2 a2Var = cVar.f45878c;
                ye.f fVar = (ye.f) a2Var.getValue();
                Object obj3 = map.get("autocapture");
                Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map2 != null) {
                    boolean z13 = fVar.f45881a;
                    List list = fVar.f45885e;
                    boolean zO0 = na0.a.o0("sessions", map2, z13);
                    boolean zO02 = na0.a.o0("appLifecycles", map2, fVar.f45882b);
                    boolean zO03 = na0.a.o0("pageViews", map2, fVar.f45883c);
                    boolean zO04 = na0.a.o0("deepLinks", map2, fVar.f45884d);
                    v70.e eVarB = c0.b();
                    ye.s sVar = ye.s.f45938a;
                    if (na0.a.o0("elementInteractions", map2, list.contains(sVar))) {
                        eVarB.add(sVar);
                    }
                    Object obj4 = map2.get("frustrationInteractions");
                    Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
                    ye.r rVar = ye.r.f45937a;
                    ye.t tVar = ye.t.f45939a;
                    if (map3 != null) {
                        boolean zContains = list.contains(tVar);
                        boolean zContains2 = list.contains(rVar);
                        z11 = zO0;
                        if (na0.a.o0(FeatureFlag.ENABLED, map3, zContains || zContains2)) {
                            Object obj5 = map3.get("rageClick");
                            z12 = zO02;
                            Map map4 = obj5 instanceof Map ? (Map) obj5 : null;
                            if (map4 != null) {
                                zContains = na0.a.o0(FeatureFlag.ENABLED, map4, zContains);
                            }
                            if (zContains) {
                                eVarB.add(tVar);
                            }
                            Object obj6 = map3.get("deadClick");
                            Map map5 = obj6 instanceof Map ? (Map) obj6 : null;
                            if (map5 != null) {
                                zContains2 = na0.a.o0(FeatureFlag.ENABLED, map5, zContains2);
                            }
                            if (zContains2) {
                                eVarB.add(rVar);
                            }
                        } else {
                            z12 = zO02;
                        }
                    } else {
                        z11 = zO0;
                        z12 = zO02;
                        if (list.contains(tVar)) {
                            eVarB.add(tVar);
                        }
                        if (list.contains(rVar)) {
                            eVarB.add(rVar);
                        }
                    }
                    ye.f fVar2 = new ye.f(z11, z12, zO03, zO04, c0.a(eVarB));
                    if (!Intrinsics.areEqual(fVar2, fVar)) {
                        a2Var.k(null, fVar2);
                        l lVar2 = cVar.f45877b;
                        if (lVar2 != null) {
                            lVar2.h("autocapture.enabled", fVar2.toString());
                        }
                        bVar2.b("AutocaptureManager: Updated state from remote config: " + fVar2);
                    } else {
                        bVar2.b("AutocaptureManager: Remote config unchanged, skipping update");
                    }
                } else {
                    bVar2.b("AutocaptureManager: Missing 'autocapture' root in analytics remote config");
                }
                break;
        }
    }
}
