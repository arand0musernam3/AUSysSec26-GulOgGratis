package yl;

import com.app.tgtg.feature.logincharity.ui.model.Country;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f46149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f46150k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f46151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f46153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f46154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f46155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f46156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Country f46157s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Country country, x70.c cVar) {
        super(2, cVar);
        this.f46156r = iVar;
        this.f46157s = country;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        h hVar = new h(this.f46156r, this.f46157s, cVar);
        hVar.f46155q = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0174, code lost:
    
        if (r9.emit(r12, r25) == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a6, code lost:
    
        if (r2.emit(r12, r25) == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a9, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c3, code lost:
    
        if (r2.emit(r4, r25) == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01fe, code lost:
    
        if (r2.emit(r1, r25) == r6) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014a A[PHI: r4 r5 r7 r8 r9
      0x014a: PHI (r4v17 int) = (r4v15 int), (r4v15 int), (r4v19 int) binds: [B:30:0x0123, B:32:0x0146, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r5v9 int) = (r5v7 int), (r5v7 int), (r5v13 int) binds: [B:30:0x0123, B:32:0x0146, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r7v13 java.lang.Object) = (r7v8 java.lang.Object), (r7v8 java.lang.Object), (r7v15 java.lang.Object) binds: [B:30:0x0123, B:32:0x0146, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r8v7 yl.i) = (r8v4 yl.i), (r8v4 yl.i), (r8v11 yl.i) binds: [B:30:0x0123, B:32:0x0146, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r9v9 java.lang.Object) = (r9v4 java.lang.Object), (r9v4 java.lang.Object), (r9v12 java.lang.Object) binds: [B:30:0x0123, B:32:0x0146, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cc  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
