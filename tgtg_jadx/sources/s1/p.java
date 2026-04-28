package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m3.c3;
import t1.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f38656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f38657c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, long j9, int i11) {
        super(1);
        this.f38655a = i11;
        this.f38656b = qVar;
        this.f38657c = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j9;
        t1.x xVar;
        long j11;
        switch (this.f38655a) {
            case 0:
                n1 n1Var = (n1) obj;
                Object objA = n1Var.a();
                q qVar = this.f38656b;
                if (Intrinsics.areEqual(objA, qVar.f38662r.a())) {
                    j9 = z5.l.a(qVar.f38663s, i.f38613a) ? this.f38657c : qVar.f38663s;
                } else {
                    c3 c3Var = (c3) qVar.f38662r.f38677e.d(n1Var.a());
                    j9 = c3Var != null ? ((z5.l) c3Var.getValue()).f47286a : 0L;
                }
                c3 c3Var2 = (c3) qVar.f38662r.f38677e.d(n1Var.c());
                long j12 = c3Var2 != null ? ((z5.l) c3Var2.getValue()).f47286a : 0L;
                i1 i1Var = (i1) qVar.f38661q.getValue();
                return (i1Var == null || (xVar = (t1.x) i1Var.f38623a.invoke(new z5.l(j9), new z5.l(j12))) == null) ? t1.c.j(0.0f, 400.0f, null, 5) : xVar;
            default:
                q qVar2 = this.f38656b;
                if (Intrinsics.areEqual(obj, qVar2.f38662r.a())) {
                    j11 = z5.l.a(qVar2.f38663s, i.f38613a) ? this.f38657c : qVar2.f38663s;
                } else {
                    c3 c3Var3 = (c3) qVar2.f38662r.f38677e.d(obj);
                    j11 = c3Var3 != null ? ((z5.l) c3Var3.getValue()).f47286a : 0L;
                }
                return new z5.l(j11);
        }
    }
}
