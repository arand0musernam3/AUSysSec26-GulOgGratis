package m2;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f29044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f29045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r5.y f29046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r5.s f29047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z5.c f29048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f29049f;

    public o0(e1 e1Var, Function1 function1, r5.y yVar, r5.s sVar, z5.c cVar, int i11) {
        this.f29044a = e1Var;
        this.f29045b = function1;
        this.f29046c = yVar;
        this.f29047d = sVar;
        this.f29048e = cVar;
        this.f29049f = i11;
    }

    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        e1 e1Var = this.f29044a;
        e1Var.f28818a.a(uVar.getLayoutDirection());
        androidx.lifecycle.n1 n1Var = e1Var.f28818a.f28963j;
        if (n1Var != null) {
            return g0.r(n1Var.c());
        }
        com.braze.h2.b("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    @Override // z4.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z4.v0 c(z4.w0 r30, java.util.List r31, long r32) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.o0.c(z4.w0, java.util.List, long):z4.v0");
    }
}
