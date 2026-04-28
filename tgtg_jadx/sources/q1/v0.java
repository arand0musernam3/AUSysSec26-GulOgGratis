package q1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r0 f35839k;
    public w0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f35840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f35845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f35847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w0 f35848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r0 f35849v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, r0 r0Var, x70.c cVar) {
        super(2, cVar);
        this.f35848u = w0Var;
        this.f35849v = r0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        v0 v0Var = new v0(this.f35848u, this.f35849v, cVar);
        v0Var.f35847t = obj;
        return v0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((o80.k) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:23:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0096). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f35846s
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2d
            if (r2 != r5) goto L26
            int r2 = r0.f35844q
            int r6 = r0.f35843p
            long r7 = r0.f35845r
            int r9 = r0.f35842o
            int r10 = r0.f35841n
            long[] r11 = r0.f35840m
            q1.w0 r12 = r0.l
            q1.r0 r13 = r0.f35839k
            java.lang.Object r14 = r0.f35847t
            o80.k r14 = (o80.k) r14
            ba0.g.M(r22)
            goto L96
        L26:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L2d:
            ba0.g.M(r22)
            java.lang.Object r2 = r0.f35847t
            o80.k r2 = (o80.k) r2
            q1.w0 r6 = r0.f35848u
            q1.u0 r7 = r6.f35852b
            long[] r7 = r7.f35768a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            q1.r0 r9 = r0.f35849v
            r10 = 0
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La1
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r2 >= r6) goto L99
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L96
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.f35819b = r15
            q1.u0 r3 = r12.f35852b
            java.lang.Object[] r3 = r3.f35769b
            r3 = r3[r15]
            r0.f35847t = r14
            r0.f35839k = r13
            r0.l = r12
            r0.f35840m = r11
            r0.f35841n = r10
            r0.f35842o = r9
            r0.f35845r = r7
            r0.f35843p = r6
            r0.f35844q = r2
            r0.f35846s = r5
            y70.a r3 = r14.a(r3, r0)
            if (r3 != r1) goto L96
            return r1
        L96:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L65
        L99:
            if (r6 != r4) goto La6
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La1:
            if (r10 == r8) goto La6
            int r10 = r10 + 1
            goto L42
        La6:
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
