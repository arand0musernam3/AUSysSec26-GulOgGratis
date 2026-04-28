package rt;

import kotlin.jvm.functions.Function0;
import om.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements t00.a, t00.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f38230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f38231b;

    public /* synthetic */ b(Function0 function0, d dVar) {
        this.f38230a = function0;
        this.f38231b = dVar;
    }

    @Override // t00.b
    public void a(int i11) {
        if (i11 == 1) {
            this.f38230a.invoke();
            n nVar = this.f38231b.f38236d;
            if (nVar == null || nVar.f32690a) {
                return;
            }
            nVar.f32690a = true;
            nVar.b();
        }
    }

    @Override // t00.a
    public void b() {
        this.f38230a.invoke();
        d dVar = this.f38231b;
        dVar.f38237e = dVar.f38233a.q().f12142b;
        n nVar = dVar.f38236d;
        if (nVar == null || !nVar.f32690a) {
            return;
        }
        nVar.f32690a = false;
        nVar.a();
    }
}
