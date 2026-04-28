package le;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f27653k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f27654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ he.k f27655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f27656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f27657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f27658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f27659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b1 f27660s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z11, boolean z12, h hVar, he.k kVar, int i11, boolean z13, float f11, n nVar, b1 b1Var, x70.c cVar) {
        super(2, cVar);
        this.f27653k = z11;
        this.l = z12;
        this.f27654m = hVar;
        this.f27655n = kVar;
        this.f27656o = i11;
        this.f27657p = z13;
        this.f27658q = f11;
        this.f27659r = nVar;
        this.f27660s = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new a(this.f27653k, this.l, this.f27654m, this.f27655n, this.f27656o, this.f27657p, this.f27658q, this.f27659r, this.f27660s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
    
        if (r13 == r0) goto L50;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: le.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
