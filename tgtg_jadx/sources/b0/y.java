package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f5503k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5507p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(le.n nVar, v80.i1 i1Var, int i11, int i12, le.h hVar, x70.c cVar) {
        super(2, cVar);
        this.f5502j = 2;
        this.f5503k = nVar;
        this.f5504m = i1Var;
        this.f5506o = i11;
        this.f5507p = i12;
        this.f5505n = hVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5502j) {
            case 0:
                return new y((e6.i) this.f5504m, cVar, (r0) this.f5505n, this.f5506o, this.f5507p, 0);
            case 1:
                return new y((e6.i) this.f5504m, cVar, (r0) this.f5505n, this.f5506o, this.f5507p, 1);
            default:
                return new y((le.n) this.f5503k, (v80.i1) this.f5504m, this.f5506o, this.f5507p, (le.h) this.f5505n, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f5502j) {
        }
        return ((y) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(e6.i iVar, x70.c cVar, r0 r0Var, int i11, int i12, int i13) {
        super(2, cVar);
        this.f5502j = i13;
        this.f5504m = iVar;
        this.f5505n = r0Var;
        this.f5506o = i11;
        this.f5507p = i12;
    }
}
