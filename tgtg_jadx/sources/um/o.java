package um;

import com.app.tgtg.model.local.BasketManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f41408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f41409k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f41411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f41412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BasketManager f41413p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ArrayList arrayList, t tVar, BasketManager basketManager, x70.c cVar) {
        super(2, cVar);
        this.f41411n = arrayList;
        this.f41412o = tVar;
        this.f41413p = basketManager;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new o(this.f41411n, this.f41412o, this.f41413p, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (kotlin.Unit.f26487a == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[PHI: r10
      0x0044: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v17 java.lang.Object) binds: [B:23:0x0093, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9 A[PHI: r1
      0x00d9: PHI (r1v11 java.lang.Object) = (r1v4 java.lang.Object), (r1v8 java.lang.Object), (r1v14 java.lang.Object) binds: [B:39:0x00d8, B:37:0x00d5, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: um.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
