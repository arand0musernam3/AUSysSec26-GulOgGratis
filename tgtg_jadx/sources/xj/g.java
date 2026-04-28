package xj;

import com.app.tgtg.model.remote.favorites.response.FavoritesResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f44379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f44380k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public FavoritesResponse f44381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f44385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f44386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f44387s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z11, k kVar, x70.c cVar) {
        super(2, cVar);
        this.f44386r = z11;
        this.f44387s = kVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        g gVar = new g(this.f44386r, this.f44387s, cVar);
        gVar.f44385q = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x04c1, code lost:
    
        if (kotlin.Unit.f26487a != r6) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ae, code lost:
    
        if (kotlin.Unit.f26487a == r6) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x045d A[PHI: r2 r4 r5
      0x045d: PHI (r2v14 int) = (r2v5 int), (r2v16 int) binds: [B:45:0x0182, B:144:0x045a] A[DONT_GENERATE, DONT_INLINE]
      0x045d: PHI (r4v9 java.lang.Object) = (r4v3 java.lang.Object), (r4v12 java.lang.Object) binds: [B:45:0x0182, B:144:0x045a] A[DONT_GENERATE, DONT_INLINE]
      0x045d: PHI (r5v12 xj.k) = (r5v6 xj.k), (r5v14 xj.k) binds: [B:45:0x0182, B:144:0x045a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0221 A[PHI: r1 r2 r3 r4 r5 r17
      0x0221: PHI (r1v11 int) = (r1v10 int), (r1v31 int) binds: [B:67:0x021d, B:12:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r2v7 int) = (r2v6 int), (r2v27 int) binds: [B:67:0x021d, B:12:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r3v9 com.app.tgtg.model.remote.favorites.response.FavoritesResponse) = 
      (r3v8 com.app.tgtg.model.remote.favorites.response.FavoritesResponse)
      (r3v35 com.app.tgtg.model.remote.favorites.response.FavoritesResponse)
     binds: [B:67:0x021d, B:12:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r4v5 java.lang.Object) = (r4v4 java.lang.Object), (r4v23 java.lang.Object) binds: [B:67:0x021d, B:12:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r5v8 xj.k) = (r5v7 xj.k), (r5v34 xj.k) binds: [B:67:0x021d, B:12:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r17v2 boolean) = (r17v0 boolean), (r17v6 boolean) binds: [B:67:0x021d, B:12:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e7  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
