package no;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31185j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31186k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f31188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f31189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f31190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f31191q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Map map, int i11, List list, int i12, g9.d0 d0Var, List list2, x70.c cVar) {
        super(2, cVar);
        this.f31188n = map;
        this.l = i11;
        this.f31189o = list;
        this.f31187m = i12;
        this.f31190p = d0Var;
        this.f31191q = list2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31185j) {
            case 0:
                return new e0((m0) this.f31189o, cVar);
            default:
                return new e0((Map) this.f31188n, this.l, (List) this.f31189o, this.f31187m, (g9.d0) this.f31190p, (List) this.f31191q, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31185j) {
        }
        return ((e0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:
    
        if (r1.f(r12, r11) == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:
    
        if (no.m0.n(r3, r5, r11) != r0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142 A[PHI: r1 r3 r12
      0x0142: PHI (r1v6 int) = (r1v4 int), (r1v7 int) binds: [B:44:0x010c, B:52:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r3v5 no.m0) = (r3v3 no.m0), (r3v6 no.m0) binds: [B:44:0x010c, B:52:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r12v9 java.lang.Object) = (r12v5 java.lang.Object), (r12v11 java.lang.Object) binds: [B:44:0x010c, B:52:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(m0 m0Var, x70.c cVar) {
        super(2, cVar);
        this.f31189o = m0Var;
    }
}
