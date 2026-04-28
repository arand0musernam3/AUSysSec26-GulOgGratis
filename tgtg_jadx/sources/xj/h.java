package xj;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f44388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f44389k;
    public vj.c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f44392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f44393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f44394q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, boolean z11, String str, x70.c cVar) {
        super(2, cVar);
        this.f44392o = kVar;
        this.f44393p = z11;
        this.f44394q = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new h(this.f44392o, this.f44393p, this.f44394q, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[PHI: r12
      0x00ab: PHI (r12v7 java.lang.Object) = (r12v5 java.lang.Object), (r12v9 java.lang.Object) binds: [B:23:0x0077, B:32:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
