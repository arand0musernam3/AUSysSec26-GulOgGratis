package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f46626k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f46627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w4.v f46628n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(w4.v vVar, x70.c cVar) {
        super(2, cVar);
        this.f46628n = vVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        o3 o3Var = new o3(this.f46628n, cVar);
        o3Var.f46627m = obj;
        return o3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o3) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.l
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L13
            long r3 = r7.f46626k
            java.lang.Object r1 = r7.f46627m
            w4.k0 r1 = (w4.k0) r1
            ba0.g.M(r8)
            goto L40
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L1a:
            ba0.g.M(r8)
            java.lang.Object r8 = r7.f46627m
            w4.k0 r8 = (w4.k0) r8
            w4.v r1 = r7.f46628n
            long r3 = r1.f43179b
            c5.u3 r1 = r8.e()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L31:
            r7.f46627m = r1
            r7.f46626k = r3
            r7.l = r2
            r8 = 0
            r5 = 3
            java.lang.Object r8 = z1.y3.c(r1, r8, r7, r5)
            if (r8 != r0) goto L40
            return r0
        L40:
            w4.v r8 = (w4.v) r8
            long r5 = r8.f43179b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L31
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.o3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
