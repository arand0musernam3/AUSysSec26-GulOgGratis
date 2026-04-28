package m2;

import a3.l3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29025e;

    public /* synthetic */ n0(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f29021a = i11;
        this.f29022b = obj;
        this.f29023c = obj2;
        this.f29024d = obj3;
        this.f29025e = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(y80.i r9, x70.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof z80.e
            if (r0 == 0) goto L13
            r0 = r10
            z80.e r0 = (z80.e) r0
            int r1 = r0.f47366n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47366n = r1
            goto L18
        L13:
            z80.e r0 = new z80.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f47366n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            y80.i r9 = r0.f47364k
            m2.n0 r0 = r0.f47363j
            ba0.g.M(r10)
        L2a:
            r3 = r9
            goto L5b
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L33:
            ba0.g.M(r10)
            java.lang.Object r10 = r8.f29022b
            v80.i1 r10 = (v80.i1) r10
            if (r10 == 0) goto L48
            boolean r2 = r10.g()
            if (r2 == 0) goto L43
            goto L48
        L43:
            java.util.concurrent.CancellationException r9 = r10.A()
            throw r9
        L48:
            java.lang.Object r10 = r8.f29023c
            e90.i r10 = (e90.i) r10
            r0.f47363j = r8
            r0.f47364k = r9
            r0.f47366n = r3
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            r0 = r8
            goto L2a
        L5b:
            java.lang.Object r9 = r0.f29024d
            x80.u r9 = (x80.u) r9
            z1.d3 r2 = new z1.d3
            java.lang.Object r10 = r0.f29025e
            r4 = r10
            z80.w r4 = (z80.w) r4
            java.lang.Object r10 = r0.f29023c
            r5 = r10
            e90.i r5 = (e90.i) r5
            r7 = 5
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r10 = 3
            v80.f0.B(r9, r6, r6, r2, r10)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.n0.a(y80.i, x70.c):java.lang.Object");
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f29021a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l3 l3Var = (l3) this.f29024d;
                e1 e1Var = (e1) this.f29022b;
                if (zBooleanValue && e1Var.b()) {
                    g0.C((r5.z) this.f29023c, e1Var, l3Var.n(), (r5.m) this.f29025e, l3Var.f449b);
                } else {
                    g0.t(e1Var);
                }
                return Unit.f26487a;
            case 1:
                xl.d dVar = (xl.d) obj;
                if (Intrinsics.areEqual(dVar, xl.a.f44442a)) {
                    ((Function0) this.f29022b).invoke();
                } else if (Intrinsics.areEqual(dVar, xl.b.f44443a)) {
                    ((Function0) this.f29023c).invoke();
                } else {
                    if (!(dVar instanceof xl.c)) {
                        e40.a.f();
                        return null;
                    }
                    xl.c cVar2 = (xl.c) dVar;
                    ((m3.b1) this.f29024d).setValue(new Pair(cVar2.f44444a, cVar2.f44445b));
                    ((m3.b1) this.f29025e).setValue(Boolean.TRUE);
                }
                return Unit.f26487a;
            default:
                return a((y80.i) obj, cVar);
        }
    }
}
