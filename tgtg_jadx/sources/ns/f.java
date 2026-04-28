package ns;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f31379k;
    public g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31381n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f31382o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31378j = i11;
        this.f31382o = gVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31378j) {
            case 0:
                return new f(this.f31382o, cVar, 0);
            default:
                return new f(this.f31382o, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31378j) {
        }
        return ((f) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (kotlin.Unit.f26487a == r10) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0172, code lost:
    
        if (kotlin.Unit.f26487a != r10) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018e, code lost:
    
        if (kotlin.Unit.f26487a == r10) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[PHI: r13
      0x00c2: PHI (r13v21 java.lang.Object) = (r13v19 java.lang.Object), (r13v24 java.lang.Object) binds: [B:27:0x0080, B:36:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0176 A[PHI: r13
      0x0176: PHI (r13v9 java.lang.Object) = (r13v5 java.lang.Object), (r13v11 java.lang.Object) binds: [B:64:0x0145, B:72:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
