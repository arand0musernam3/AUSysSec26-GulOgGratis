package il;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import ni.e;
import v1.y1;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24055j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f24056k;
    public final /* synthetic */ b1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f24057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f24058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f24059o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z11, ry.c cVar, e eVar, b1 b1Var, b1 b1Var2, x70.c cVar2) {
        super(2, cVar2);
        this.f24056k = z11;
        this.f24057m = cVar;
        this.f24058n = eVar;
        this.l = b1Var;
        this.f24059o = b1Var2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f24055j) {
            case 0:
                return new b(this.f24056k, (b0) this.f24057m, (y1) this.f24058n, (Function0) this.f24059o, this.l, cVar);
            default:
                return new b(this.f24056k, (ry.c) this.f24057m, (e) this.f24058n, this.l, (b1) this.f24059o, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f24055j) {
        }
        return ((b) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f24055j
            java.lang.Object r1 = r12.f24059o
            r2 = 3
            java.lang.Object r3 = r12.f24058n
            boolean r4 = r12.f24056k
            java.lang.Object r5 = r12.f24057m
            switch(r0) {
                case 0: goto L74;
                default: goto Le;
            }
        Le:
            ry.c r5 = (ry.c) r5
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            ba0.g.M(r13)
            r13 = 0
            ry.e r0 = ry.e.f38275a
            if (r4 == 0) goto L42
            ry.f r4 = r5.c()
            r4.getClass()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r4 == 0) goto L42
            m3.b1 r0 = r12.l
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            ni.e r3 = (ni.e) r3
            r3.getClass()
            a9.a r0 = androidx.lifecycle.m1.d(r3)
            a3.y r1 = new a3.y
            r4 = 18
            r1.<init>(r3, r13, r4)
            v80.f0.B(r0, r13, r13, r1, r2)
            goto L71
        L42:
            ry.f r2 = r5.c()
            boolean r2 = r2 instanceof ry.d
            if (r2 == 0) goto L71
            m3.b1 r1 = (m3.b1) r1
            ry.f r2 = r5.c()
            r2.getClass()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L5b
            r13 = 0
            goto L63
        L5b:
            boolean r0 = r2 instanceof ry.d
            if (r0 == 0) goto L6d
            ry.d r2 = (ry.d) r2
            boolean r13 = r2.f38274a
        L63:
            r13 = r13 ^ 1
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r1.setValue(r13)
            goto L71
        L6d:
            e40.a.f()
            goto L73
        L71:
            kotlin.Unit r13 = kotlin.Unit.f26487a
        L73:
            return r13
        L74:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            ba0.g.M(r13)
            if (r4 == 0) goto L90
            v80.b0 r5 = (v80.b0) r5
            h2.a0 r6 = new h2.a0
            r7 = r3
            v1.y1 r7 = (v1.y1) r7
            r8 = r1
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            m3.b1 r9 = r12.l
            r11 = 11
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            v80.f0.B(r5, r10, r10, r6, r2)
        L90:
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: il.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z11, b0 b0Var, y1 y1Var, Function0 function0, b1 b1Var, x70.c cVar) {
        super(2, cVar);
        this.f24056k = z11;
        this.f24057m = b0Var;
        this.f24058n = y1Var;
        this.f24059o = function0;
        this.l = b1Var;
    }
}
