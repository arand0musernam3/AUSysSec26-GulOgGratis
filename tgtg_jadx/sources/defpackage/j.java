package defpackage;

import androidx.lifecycle.l1;
import ao.r1;
import cj.q;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.order.Order;
import f2.c0;
import i80.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lo.m;
import m3.b1;
import m3.c3;
import m3.h1;
import m3.i1;
import qo.h;
import t1.b;
import v80.b0;
import x70.c;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24248k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f24249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f24250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f24251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f24252p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i11, Function1 function1, b bVar, Function0 function0, h1 h1Var, c cVar) {
        super(2, cVar);
        this.f24247j = 0;
        this.l = i11;
        this.f24249m = function1;
        this.f24250n = bVar;
        this.f24251o = function0;
        this.f24252p = h1Var;
    }

    @Override // z70.a
    public final c create(Object obj, c cVar) {
        switch (this.f24247j) {
            case 0:
                return new j(this.l, (Function1) this.f24249m, (b) this.f24250n, (Function0) this.f24251o, (h1) this.f24252p, cVar);
            case 1:
                return new j((r1) this.f24250n, (List) this.f24251o, (List) this.f24252p, cVar);
            case 2:
                return new j((q) this.f24251o, (String) this.f24252p, cVar, 2);
            case 3:
                return new j((c0) this.f24250n, this.l, (h1) this.f24252p, (Function1) this.f24249m, (c3) this.f24251o, cVar);
            case 4:
                return new j((m) this.f24251o, (Order) this.f24252p, cVar, 4);
            case 5:
                return new j((m) this.f24251o, (String) this.f24252p, cVar, 5);
            case 6:
                return new j((h) this.f24252p, cVar);
            default:
                return new j((b1) this.f24249m, (n) this.f24250n, (BasketItem) this.f24251o, this.l, (i1) this.f24252p, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        c cVar = (c) obj2;
        switch (this.f24247j) {
        }
        return ((j) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c9, code lost:
    
        if (r14.emit(r2, r26) == r15) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0422, code lost:
    
        if (kotlin.Unit.f26487a == r15) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x050b, code lost:
    
        if (r5.u(r26) == r2) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0572, code lost:
    
        if (kotlin.Unit.f26487a != r2) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (r1.emit(null, r26) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (r1.emit(null, r26) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        if (r1.emit(null, r26) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ee, code lost:
    
        if (kotlin.Unit.f26487a != r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021e, code lost:
    
        if (kotlin.Unit.f26487a != r2) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a3 A[PHI: r5
      0x02a3: PHI (r5v37 java.lang.Object) = (r5v36 java.lang.Object), (r5v43 java.lang.Object) binds: [B:113:0x029f, B:107:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108 A[PHI: r3 r6 r9
      0x0108: PHI (r3v55 java.lang.Object) = (r3v54 java.lang.Object), (r3v56 java.lang.Object) binds: [B:43:0x00ec, B:48:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r6v17 int) = (r6v16 int), (r6v18 int) binds: [B:43:0x00ec, B:48:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r9v53 qo.h) = (r9v52 qo.h), (r9v54 qo.h) binds: [B:43:0x00ec, B:48:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bd A[PHI: r7
      0x01bd: PHI (r7v26 java.lang.Object) = (r7v25 java.lang.Object), (r7v29 java.lang.Object) binds: [B:76:0x01ba, B:70:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f8  */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.util.ArrayList] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l1 l1Var, Object obj, c cVar, int i11) {
        super(2, cVar);
        this.f24247j = i11;
        this.f24251o = l1Var;
        this.f24252p = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r1 r1Var, List list, List list2, c cVar) {
        super(2, cVar);
        this.f24247j = 1;
        this.f24250n = r1Var;
        this.f24251o = list;
        this.f24252p = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c0 c0Var, int i11, h1 h1Var, Function1 function1, c3 c3Var, c cVar) {
        super(2, cVar);
        this.f24247j = 3;
        this.f24250n = c0Var;
        this.l = i11;
        this.f24252p = h1Var;
        this.f24249m = function1;
        this.f24251o = c3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b1 b1Var, n nVar, BasketItem basketItem, int i11, i1 i1Var, c cVar) {
        super(2, cVar);
        this.f24247j = 7;
        this.f24249m = b1Var;
        this.f24250n = nVar;
        this.f24251o = basketItem;
        this.l = i11;
        this.f24252p = i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, c cVar) {
        super(2, cVar);
        this.f24247j = 6;
        this.f24252p = hVar;
    }
}
