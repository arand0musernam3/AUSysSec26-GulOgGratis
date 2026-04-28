package aa;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha.b f1169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FunctionReferenceImpl f1171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f1172d = u70.l.b(new e(this, 1));

    /* JADX WARN: Multi-variable type inference failed */
    public w(ha.b bVar, String str, Function2 function2) {
        this.f1169a = bVar;
        this.f1170b = str;
        this.f1171c = (FunctionReferenceImpl) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // aa.b
    public final Object T(boolean z11, Function2 function2, z70.c cVar) {
        v vVar = (v) cVar.getContext().get(v.f1167b);
        u uVar = vVar != null ? vVar.f1168a : null;
        if (uVar != null) {
            return function2.invoke(uVar, cVar);
        }
        u uVar2 = new u(this.f1171c, (ha.a) this.f1172d.getValue());
        return v80.f0.K(new v(uVar2), new a3.x(function2, uVar2, (x70.c) null), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        u70.t tVar = this.f1172d;
        if (tVar.a()) {
            ((ha.a) tVar.getValue()).close();
        }
    }
}
