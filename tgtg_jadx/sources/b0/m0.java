package b0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f5306k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r0 f5307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f5309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AutoCloseable f5311q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(List list, x70.c cVar, boolean z11, r0 r0Var, boolean z12, boolean z13, int i11) {
        super(2, cVar);
        this.f5306k = list;
        this.l = z11;
        this.f5307m = r0Var;
        this.f5308n = z12;
        this.f5309o = z13;
        this.f5310p = i11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new m0(this.f5306k, cVar, this.l, this.f5307m, this.f5308n, this.f5309o, this.f5310p);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        if (b0.r0.e(r1, 1000000000, r11) == r0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
