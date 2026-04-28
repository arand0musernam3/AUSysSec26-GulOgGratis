package c6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f7691k;
    public final /* synthetic */ j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f7692m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z11, j jVar, long j9, x70.c cVar) {
        super(2, cVar);
        this.f7691k = z11;
        this.l = jVar;
        this.f7692m = j9;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g(this.f7691k, this.l, this.f7692m, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r10.f7690j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            ba0.g.M(r11)
            goto L49
        L10:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L17:
            ba0.g.M(r11)
            r9 = r10
            goto L35
        L1c:
            ba0.g.M(r11)
            c6.j r11 = r10.l
            v4.d r4 = r11.f7699a
            boolean r11 = r10.f7691k
            if (r11 != 0) goto L3b
            r10.f7690j = r3
            r5 = 0
            long r7 = r10.f7692m
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r0) goto L35
            goto L48
        L35:
            z5.q r11 = (z5.q) r11
            r11.getClass()
            goto L4e
        L3b:
            r9 = r10
            r9.f7690j = r2
            long r5 = r9.f7692m
            r7 = 0
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r0) goto L49
        L48:
            return r0
        L49:
            z5.q r11 = (z5.q) r11
            r11.getClass()
        L4e:
            kotlin.Unit r11 = kotlin.Unit.f26487a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
