package uq;

import com.app.tgtg.model.remote.user.response.Co2eSavedResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f41495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f41496k;
    public Co2eSavedResponse l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f41499o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, x70.c cVar) {
        super(2, cVar);
        this.f41499o = eVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d(this.f41499o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0136, code lost:
    
        if (kotlin.Unit.f26487a != r2) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[PHI: r10
      0x0054: PHI (r10v5 java.lang.Object) = (r10v4 java.lang.Object), (r10v14 java.lang.Object) binds: [B:18:0x0079, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc A[PHI: r3
      0x00fc: PHI (r3v16 java.lang.Object) = (r3v3 java.lang.Object), (r3v12 java.lang.Object), (r3v19 java.lang.Object) binds: [B:37:0x00fb, B:35:0x00f8, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uq.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
