package v1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f41826k;
    public w4.o l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f41828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f41829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u f41830p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v80.b0 b0Var, u uVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f41826k = i11;
        this.f41829o = b0Var;
        this.f41830p = uVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f41826k) {
            case 0:
                r rVar = new r(this.f41829o, this.f41830p, cVar, 0);
                rVar.f41828n = obj;
                return rVar;
            default:
                r rVar2 = new r(this.f41829o, this.f41830p, cVar, 1);
                rVar2.f41828n = obj;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        w4.k0 k0Var = (w4.k0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f41826k) {
        }
        return ((r) create(k0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed A[LOOP:0: B:48:0x00eb->B:49:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0033 -> B:13:0x0036). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
