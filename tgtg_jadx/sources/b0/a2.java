package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f5045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f5046k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d2 f5047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d2 f5049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o2 f5050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y1 f5051q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(d2 d2Var, o2 o2Var, y1 y1Var, x70.c cVar) {
        super(2, cVar);
        this.f5049o = d2Var;
        this.f5050p = o2Var;
        this.f5051q = y1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new a2(this.f5049o, this.f5050p, this.f5051q, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
