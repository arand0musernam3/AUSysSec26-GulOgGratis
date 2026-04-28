package no;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f31234k;
    public m0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m0 f31236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f31237o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(m0 m0Var, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31233j = i11;
        this.f31236n = m0Var;
        this.f31237o = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31233j) {
            case 0:
                return new k0(this.f31236n, this.f31237o, cVar, 0);
            default:
                return new k0(this.f31236n, this.f31237o, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31233j) {
        }
        return ((k0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0197, code lost:
    
        if (kotlin.Unit.f26487a == r9) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187 A[Catch: all -> 0x0128, TRY_LEAVE, TryCatch #0 {all -> 0x0128, blocks: (B:38:0x0123, B:44:0x0134, B:57:0x0171, B:58:0x0181, B:60:0x0187, B:45:0x0138, B:51:0x0154, B:53:0x015a, B:48:0x0149), top: B:67:0x0117 }] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
