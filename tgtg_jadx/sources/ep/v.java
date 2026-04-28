package ep;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f16328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d0 f16329k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d0 f16331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f16332o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d0 d0Var, String str, x70.c cVar) {
        super(2, cVar);
        this.f16331n = d0Var;
        this.f16332o = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new v(this.f16331n, this.f16332o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r10.f16330m
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            ep.d0 r6 = r10.f16331n
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1d
            ep.d0 r0 = r10.f16329k
            hp.g r0 = (hp.g) r0
            java.lang.Object r0 = r10.f16328j
            ba0.g.M(r11)
            goto L87
        L1d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            return r5
        L23:
            int r1 = r10.l
            ep.d0 r3 = r10.f16329k
            java.lang.Object r7 = r10.f16328j
            ba0.g.M(r11)
            goto L63
        L2d:
            ba0.g.M(r11)
            u70.q r11 = (u70.q) r11
            java.lang.Object r11 = r11.f40851a
            goto L45
        L35:
            ba0.g.M(r11)
            jp.q r11 = r6.f16241a
            r10.f16330m = r4
            java.lang.String r1 = r10.f16332o
            java.lang.Object r11 = r11.i(r1, r10)
            if (r11 != r0) goto L45
            goto L85
        L45:
            u70.o r1 = u70.q.f40850b
            boolean r1 = r11 instanceof u70.p
            if (r1 != 0) goto L88
            r1 = r11
            hp.g r1 = (hp.g) r1
            r10.f16328j = r11
            r10.f16329k = r6
            r7 = 0
            r10.l = r7
            r10.f16330m = r3
            java.lang.Object r1 = ep.d0.a(r6, r1, r10)
            if (r1 != r0) goto L5e
            goto L85
        L5e:
            r3 = r7
            r7 = r11
            r11 = r1
            r1 = r3
            r3 = r6
        L63:
            hp.g r11 = (hp.g) r11
            y80.a2 r8 = r3.f16252m
            java.util.List r9 = kotlin.collections.c0.c(r11)
            r8.j(r9)
            y80.a2 r8 = r3.f16258s
            r8.j(r11)
            y80.m1 r11 = r3.f16248h
            hp.t r3 = hp.t.INSTANCE
            r10.f16328j = r7
            r10.f16329k = r5
            r10.l = r1
            r10.f16330m = r2
            java.lang.Object r11 = r11.emit(r3, r10)
            if (r11 != r0) goto L86
        L85:
            return r0
        L86:
            r0 = r7
        L87:
            r11 = r0
        L88:
            java.lang.Throwable r11 = u70.q.a(r11)
            if (r11 == 0) goto L9b
            com.app.tgtg.model.local.GenericErrors$SharedRecipeNotAvailable r11 = new com.app.tgtg.model.local.GenericErrors$SharedRecipeNotAvailable
            ep.i r0 = new ep.i
            r0.<init>(r6, r4)
            r11.<init>(r0)
            r6.h(r11)
        L9b:
            kotlin.Unit r11 = kotlin.Unit.f26487a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
