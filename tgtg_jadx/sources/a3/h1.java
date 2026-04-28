package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f369k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f371n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(int i11, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f369k = i11;
        this.f371n = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f369k) {
            case 0:
                h1 h1Var = new h1(0, this.f371n, cVar);
                h1Var.f370m = obj;
                return h1Var;
            default:
                h1 h1Var2 = new h1(1, this.f371n, cVar);
                h1Var2.f370m = obj;
                return h1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        w4.k0 k0Var = (w4.k0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f369k) {
        }
        return ((h1) create(k0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:32:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f369k
            kotlin.jvm.functions.Function1 r1 = r9.f371n
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L62;
                default: goto Lb;
            }
        Lb:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r5 = r9.l
            r6 = 2
            if (r5 == 0) goto L26
            if (r5 == r3) goto L1e
            if (r5 != r6) goto L1a
            ba0.g.M(r10)
            goto L58
        L1a:
            com.braze.h2.b(r2)
            goto L61
        L1e:
            java.lang.Object r2 = r9.f370m
            w4.k0 r2 = (w4.k0) r2
            ba0.g.M(r10)
            goto L39
        L26:
            ba0.g.M(r10)
            java.lang.Object r10 = r9.f370m
            r2 = r10
            w4.k0 r2 = (w4.k0) r2
            r9.f370m = r2
            r9.l = r3
            java.lang.Object r10 = jb.u.v(r2, r9)
            if (r10 != r0) goto L39
            goto L56
        L39:
            w4.v r10 = (w4.v) r10
            r10.a()
            long r7 = r10.f43180c
            h4.b r10 = new h4.b
            r10.<init>(r7)
            r1.invoke(r10)
            r9.f370m = r4
            r9.l = r6
            le.v r10 = z1.y3.f46778a
            w4.o r10 = w4.o.Main
            java.lang.Object r10 = z1.y3.j(r2, r10, r9)
            if (r10 != r0) goto L58
        L56:
            r4 = r0
            goto L61
        L58:
            w4.v r10 = (w4.v) r10
            if (r10 == 0) goto L5f
            r10.a()
        L5f:
            kotlin.Unit r4 = kotlin.Unit.f26487a
        L61:
            return r4
        L62:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r5 = r9.l
            if (r5 == 0) goto L76
            if (r5 != r3) goto L72
            java.lang.Object r2 = r9.f370m
            w4.k0 r2 = (w4.k0) r2
            ba0.g.M(r10)
            goto L8c
        L72:
            com.braze.h2.b(r2)
            goto L8b
        L76:
            ba0.g.M(r10)
            java.lang.Object r10 = r9.f370m
            w4.k0 r10 = (w4.k0) r10
            r2 = r10
        L7e:
            w4.o r10 = w4.o.Initial
            r9.f370m = r2
            r9.l = r3
            java.lang.Object r10 = r2.b(r10, r9)
            if (r10 != r0) goto L8c
            r4 = r0
        L8b:
            return r4
        L8c:
            w4.n r10 = (w4.n) r10
            boolean r10 = h0.g.x(r10)
            r10 = r10 ^ r3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r1.invoke(r10)
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.h1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
