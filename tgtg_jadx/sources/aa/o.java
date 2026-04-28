package aa;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements j0, y9.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1149b;

    public /* synthetic */ o(Object obj, int i11) {
        this.f1148a = i11;
        this.f1149b = obj;
    }

    @Override // y9.r
    public final Object b(String str, Function1 function1, z70.c cVar) {
        switch (this.f1148a) {
            case 0:
                return ((u) this.f1149b).b(str, function1, cVar);
            default:
                return ((i0) this.f1149b).b(str, function1, cVar);
        }
    }

    @Override // aa.j0
    public final ha.a c() {
        switch (this.f1148a) {
            case 0:
                return ((u) this.f1149b).f1164b;
            default:
                return ((i0) this.f1149b).f1121b;
        }
    }
}
