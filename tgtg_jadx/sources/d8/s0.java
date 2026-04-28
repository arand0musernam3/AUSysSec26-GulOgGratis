package d8;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements v80.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14702c;

    public /* synthetic */ s0(int i11, Object obj, Object obj2) {
        this.f14700a = i11;
        this.f14701b = obj;
        this.f14702c = obj2;
    }

    @Override // v80.r0
    public final void a() {
        switch (this.f14700a) {
            case 0:
                String str = (String) this.f14701b;
                a3.p pVar = (a3.p) this.f14702c;
                synchronized (t0.f14708b) {
                    LinkedHashMap linkedHashMap = t0.f14709c;
                    t0 t0Var = (t0) linkedHashMap.get(str);
                    if (t0Var != null) {
                        t0Var.f14710a.remove(pVar);
                        if (t0Var.f14710a.isEmpty()) {
                            linkedHashMap.remove(str);
                            t0Var.stopWatching();
                        }
                    }
                    break;
                }
                return;
            default:
                w80.c cVar = (w80.c) this.f14701b;
                cVar.f43292b.removeCallbacks((Runnable) this.f14702c);
                return;
        }
    }
}
