package ao;

import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p2 implements Function1, q90.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4399c;

    public /* synthetic */ p2(int i11, Object obj, Object obj2) {
        this.f4397a = i11;
        this.f4398b = obj;
        this.f4399c = obj2;
    }

    @Override // q90.i
    public void b(q90.h hVar, q90.p0 p0Var) {
        v80.l lVar = (v80.l) this.f4399c;
        u70.o oVar = u70.q.f40850b;
        lVar.resumeWith(p0Var);
    }

    @Override // q90.i
    public void e(q90.h hVar, IOException iOException) {
        if (((u90.n) hVar).f40938q) {
            return;
        }
        v80.l lVar = (v80.l) this.f4399c;
        u70.o oVar = u70.q.f40850b;
        lVar.resumeWith(new u70.p(iOException));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.p2.invoke(java.lang.Object):java.lang.Object");
    }
}
