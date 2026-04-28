package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.h1;
import t1.b;
import v80.b0;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22562k;
    public final /* synthetic */ b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f22563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function0 f22564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h1 f22565o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, Function1 function1, Function0 function0, h1 h1Var, c cVar) {
        super(2, cVar);
        this.l = bVar;
        this.f22563m = function1;
        this.f22564n = function0;
        this.f22565o = h1Var;
    }

    @Override // z70.a
    public final c create(Object obj, c cVar) {
        return new i(this.l, this.f22563m, this.f22564n, this.f22565o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b0) obj, (c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r8.f(r0, r14) == r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            y70.a r6 = y70.a.COROUTINE_SUSPENDED
            int r0 = r14.f22562k
            r7 = 0
            t1.b r8 = r14.l
            r9 = 3
            m3.h1 r10 = r14.f22565o
            r11 = 2
            r12 = 1
            if (r0 == 0) goto L24
            if (r0 == r12) goto L1e
            if (r0 != r11) goto L17
            ba0.g.M(r15)
            goto L93
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L1e:
            float r0 = r14.f22561j
            ba0.g.M(r15)
            goto L69
        L24:
            ba0.g.M(r15)
            int r0 = r10.h()
            if (r0 < r9) goto L30
            kotlin.Unit r0 = kotlin.Unit.f26487a
            return r0
        L30:
            java.lang.Object r0 = r8.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r13 = r1 - r0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 <= 0) goto L6a
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r1 = 7000(0x1b58, float:9.809E-42)
            float r1 = (float) r1
            float r1 = r1 * r13
            int r1 = j80.c.b(r1)
            r2 = 0
            no.g r3 = t1.w.f39596d
            t1.u1 r2 = t1.c.k(r1, r2, r3, r11)
            r14.f22561j = r13
            r14.f22562k = r12
            r1 = r0
            t1.b r0 = r14.l
            r3 = 0
            r5 = 12
            r4 = r14
            java.lang.Object r0 = t1.b.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L68
            goto L8d
        L68:
            r0 = r13
        L69:
            r13 = r0
        L6a:
            int r0 = r10.h()
            int r0 = r0 + r12
            if (r0 >= r9) goto L8e
            r10.i(r0)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            kotlin.jvm.functions.Function1 r0 = r14.f22563m
            r0.invoke(r1)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r7)
            r14.f22561j = r13
            r14.f22562k = r11
            java.lang.Object r0 = r8.f(r0, r14)
            if (r0 != r6) goto L93
        L8d:
            return r6
        L8e:
            kotlin.jvm.functions.Function0 r0 = r14.f22564n
            r0.invoke()
        L93:
            kotlin.Unit r0 = kotlin.Unit.f26487a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
