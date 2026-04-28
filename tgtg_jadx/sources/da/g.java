package da;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y9.d0;
import y9.e0;
import y9.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14818j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d0 f14819k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f14821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f14822o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(v vVar, x70.c cVar, Function1 function1, int i11) {
        super(2, cVar);
        this.f14818j = i11;
        this.f14821n = vVar;
        this.f14822o = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14818j) {
            case 0:
                g gVar = new g(this.f14821n, cVar, this.f14822o, 0);
                gVar.f14820m = obj;
                return gVar;
            default:
                g gVar2 = new g(this.f14821n, cVar, this.f14822o, 1);
                gVar2.f14820m = obj;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f14818j) {
        }
        return ((g) create(e0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[PHI: r1 r11
      0x009b: PHI (r1v21 y9.e0) = (r1v18 y9.e0), (r1v27 y9.e0) binds: [B:31:0x0098, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r11v35 java.lang.Object) = (r11v33 java.lang.Object), (r11v0 java.lang.Object) binds: [B:31:0x0098, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156 A[PHI: r1 r11
      0x0156: PHI (r1v7 y9.e0) = (r1v4 y9.e0), (r1v13 y9.e0) binds: [B:68:0x0153, B:52:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r11v13 java.lang.Object) = (r11v11 java.lang.Object), (r11v0 java.lang.Object) binds: [B:68:0x0153, B:52:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: da.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
