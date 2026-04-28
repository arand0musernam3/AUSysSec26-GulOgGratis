package x2;

import kotlin.Unit;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f43770b;

    public /* synthetic */ r(w wVar, int i11) {
        this.f43769a = i11;
        this.f43770b = wVar;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        b2 b2Var;
        int i11 = this.f43769a;
        w wVar = this.f43770b;
        switch (i11) {
            case 0:
                wVar.v(false);
                wVar.w(b0.None);
                break;
            default:
                if (((h4.c) obj) == null) {
                    s2.j jVar = wVar.f43785e.f38778a;
                    if (jVar != null && (b2Var = jVar.f38775u) != null) {
                        b2Var.a(null);
                        jVar.f38775u = null;
                    }
                } else {
                    wVar.f43785e.a();
                    Unit unit = Unit.f26487a;
                    y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                }
                break;
        }
        return Unit.f26487a;
    }
}
