package z1;

import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z70.i implements i80.o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ q f46489k;
    public /* synthetic */ g1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f46490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f46491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f46492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t1.i f46493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f46494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t1.s f46495r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, float f11, t1.i iVar, Ref.FloatRef floatRef, t1.s sVar, x70.c cVar) {
        super(4, cVar);
        this.f46491n = rVar;
        this.f46492o = f11;
        this.f46493p = iVar;
        this.f46494q = floatRef;
        this.f46495r = sVar;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Ref.FloatRef floatRef = this.f46494q;
        t1.s sVar = this.f46495r;
        f fVar = new f(this.f46491n, this.f46492o, this.f46493p, floatRef, sVar, (x70.c) obj4);
        fVar.f46489k = (q) obj;
        fVar.l = (g1) obj2;
        fVar.f46490m = obj3;
        return fVar.invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (t1.j1.d(r15, r4, false, r5, r14) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (z1.k.b(r14.f46491n, r7, r8, r15, r10, r14.f46493p, r14) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        if (z1.k.b(r14.f46491n, r7, r8, r15, r10, r14.f46493p, r14) == r0) goto L43;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
