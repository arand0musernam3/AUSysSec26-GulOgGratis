package v1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.k2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41694k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k2 f41695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f41696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b2.l f41697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f41698p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k2 k2Var, long j9, b2.l lVar, g gVar, x70.c cVar) {
        super(2, cVar);
        this.f41695m = k2Var;
        this.f41696n = j9;
        this.f41697o = lVar;
        this.f41698p = gVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        c cVar2 = new c(this.f41695m, this.f41696n, this.f41697o, this.f41698p, cVar);
        cVar2.l = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r15.b(r2, r17) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r15.b(r3, r17) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
