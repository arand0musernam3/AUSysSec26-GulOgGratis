package c50;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements e50.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f7604b;

    public /* synthetic */ m(n0 n0Var, int i11) {
        this.f7603a = i11;
        this.f7604b = n0Var;
    }

    @Override // t70.a
    public final Object get() {
        int i11 = this.f7603a;
        n0 n0Var = this.f7604b;
        switch (i11) {
            case 0:
                return new l((t40.b) n0Var.f7607b);
            case 1:
                p30.g gVar = (p30.g) n0Var.f7607b;
                gVar.getClass();
                s0 s0Var = s0.f7623a;
                return s0.a(gVar);
            default:
                return new f50.a((Context) n0Var.f7607b);
        }
    }
}
