package al;

import c50.q0;
import c50.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1547j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1548k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f1549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f1550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f1553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1555s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, String str, String str2, String str3, a3.p pVar2, x70.c cVar) {
        super(2, cVar);
        this.f1550n = pVar;
        this.f1553q = str;
        this.f1554r = str2;
        this.f1555s = str3;
        this.f1552p = pVar2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f1547j) {
            case 0:
                return new k((p) this.f1550n, (String) this.f1553q, (String) this.f1554r, (String) this.f1555s, (a3.p) this.f1552p, cVar);
            case 1:
                return new k((u0) this.f1554r, (q0) this.f1555s, cVar);
            default:
                return new k((qj.i) this.f1551o, (String) this.f1553q, (String) this.f1554r, (qj.e) this.f1552p, (qj.f) this.f1555s, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f1547j) {
        }
        return ((k) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025d  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: al.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u0 u0Var, q0 q0Var, x70.c cVar) {
        super(2, cVar);
        this.f1554r = u0Var;
        this.f1555s = q0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qj.i iVar, String str, String str2, qj.e eVar, qj.f fVar, x70.c cVar) {
        super(2, cVar);
        this.f1551o = iVar;
        this.f1553q = str;
        this.f1554r = str2;
        this.f1552p = eVar;
        this.f1555s = fVar;
    }
}
