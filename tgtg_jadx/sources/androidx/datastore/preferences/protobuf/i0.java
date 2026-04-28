package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f2989b = new v(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2990a;

    public i0() {
        o0 o0Var;
        x0 x0Var = x0.f3059c;
        try {
            o0Var = (o0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o0Var = f2989b;
        }
        o0[] o0VarArr = {v.f3055b, o0Var};
        h0 h0Var = new h0();
        h0Var.f2980a = o0VarArr;
        Charset charset = b0.f2930a;
        this.f2990a = h0Var;
    }

    public void a(int i11, f fVar) {
        ((l) this.f2990a).p(i11, fVar);
    }

    public void b(int i11, Object obj, a1 a1Var) {
        l lVar = (l) this.f2990a;
        lVar.B(i11, 3);
        a1Var.b((a) obj, lVar.f3003a);
        lVar.B(i11, 4);
    }

    public i0(l lVar) {
        b0.a(lVar, "output");
        this.f2990a = lVar;
        lVar.f3003a = this;
    }
}
