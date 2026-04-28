package um;

import com.app.tgtg.model.local.BasketManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f41414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f41415k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f41417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f41418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BasketManager f41419p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ArrayList arrayList, t tVar, BasketManager basketManager, x70.c cVar) {
        super(2, cVar);
        this.f41417n = arrayList;
        this.f41418o = tVar;
        this.f41419p = basketManager;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new p(this.f41417n, this.f41418o, this.f41419p, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (kotlin.Unit.f26487a == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ff, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[PHI: r10
      0x0098: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v11 java.lang.Object) binds: [B:22:0x0094, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[PHI: r1
      0x00cf: PHI (r1v14 java.lang.Object) = (r1v6 java.lang.Object), (r1v11 java.lang.Object), (r1v17 java.lang.Object) binds: [B:33:0x00ce, B:31:0x00cb, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: um.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
