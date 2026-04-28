package mv;

import androidx.lifecycle.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.l3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f30199j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f30200k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f30201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f30202n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j9, long j11, n1 n1Var, x70.c cVar) {
        super(2, cVar);
        this.f30200k = j9;
        this.f30202n = n1Var;
        this.f30201m = j11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f30199j) {
            case 0:
                return new l0(this.f30200k, this.f30201m, (n1) this.f30202n, cVar);
            default:
                l0 l0Var = new l0((l3) this.f30202n, cVar);
                l0Var.f30201m = ((z5.q) obj).f47292a;
                return l0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30199j) {
            case 0:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                long j9 = ((z5.q) obj).f47292a;
                l0 l0Var = new l0((l3) this.f30202n, (x70.c) obj2);
                l0Var.f30201m = j9;
                return l0Var.invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(l3 l3Var, x70.c cVar) {
        super(2, cVar);
        this.f30202n = l3Var;
    }
}
