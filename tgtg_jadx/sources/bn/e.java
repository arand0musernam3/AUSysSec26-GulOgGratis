package bn;

import android.content.Context;
import androidx.lifecycle.l1;
import com.app.tgtg.model.remote.invitation.Invitation;
import com.app.tgtg.model.remote.item.response.CategoryNavigationCard;
import ii.j0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import no.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6430k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f6431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f6432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f6433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f6434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f6435q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Map map, int i11, List list, Function2 function2, CategoryNavigationCard categoryNavigationCard, List list2, x70.c cVar) {
        super(2, cVar);
        this.f6429j = 0;
        this.f6431m = map;
        this.l = i11;
        this.f6432n = list;
        this.f6434p = function2;
        this.f6435q = categoryNavigationCard;
        this.f6433o = list2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f6429j) {
            case 0:
                return new e((Map) this.f6431m, this.l, (List) this.f6432n, (Function2) this.f6434p, (CategoryNavigationCard) this.f6435q, (List) this.f6433o, cVar);
            case 1:
                return new e((cj.e0) this.f6434p, (String) this.f6435q, cVar, 1);
            case 2:
                return new e((j0) this.f6435q, cVar);
            case 3:
                return new e((le.v) this.f6432n, (Context) this.f6433o, (le.s) this.f6434p, (b1) this.f6435q, cVar);
            case 4:
                return new e((li.g) this.f6434p, (mi.b) this.f6435q, cVar, 4);
            default:
                return new e((m0) this.f6434p, (Invitation) this.f6435q, cVar, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f6429j) {
        }
        return ((e) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0298, code lost:
    
        if (r2 == r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02a1, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x05eb, code lost:
    
        if (kotlin.Unit.f26487a != r2) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0715, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0121, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0141, code lost:
    
        if (kotlin.Unit.f26487a != r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0227, code lost:
    
        if (li.g.a(r13, false) == r14) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x062b A[PHI: r2 r3 r4 r5
      0x062b: PHI (r2v21 int) = (r2v19 int), (r2v23 int) binds: [B:278:0x06de, B:254:0x061c] A[DONT_GENERATE, DONT_INLINE]
      0x062b: PHI (r3v13 com.app.tgtg.model.remote.manufacturer.response.AddressSearchFetchResponse) = 
      (r3v10 com.app.tgtg.model.remote.manufacturer.response.AddressSearchFetchResponse)
      (r3v18 com.app.tgtg.model.remote.manufacturer.response.AddressSearchFetchResponse)
     binds: [B:278:0x06de, B:254:0x061c] A[DONT_GENERATE, DONT_INLINE]
      0x062b: PHI (r4v11 cj.e0) = (r4v8 cj.e0), (r4v15 cj.e0) binds: [B:278:0x06de, B:254:0x061c] A[DONT_GENERATE, DONT_INLINE]
      0x062b: PHI (r5v6 java.lang.Object) = (r5v4 java.lang.Object), (r5v9 java.lang.Object) binds: [B:278:0x06de, B:254:0x061c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0689 A[PHI: r2
      0x0689: PHI (r2v12 java.lang.Object) = (r2v11 java.lang.Object), (r2v16 java.lang.Object) binds: [B:264:0x0685, B:258:0x0655] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06fa A[PHI: r2
      0x06fa: PHI (r2v24 java.lang.Object) = (r2v12 java.lang.Object), (r2v22 java.lang.Object), (r2v29 java.lang.Object) binds: [B:267:0x068d, B:281:0x06f7, B:253:0x060f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0300 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0353 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3 A[PHI: r5
      0x00f3: PHI (r5v28 java.lang.Object) = (r5v27 java.lang.Object), (r5v35 java.lang.Object) binds: [B:25:0x0096, B:30:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213 A[PHI: r0 r1 r13
      0x0213: PHI (r0v75 int) = (r0v74 int), (r0v77 int) binds: [B:66:0x01da, B:75:0x0212] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r1v56 java.lang.Object) = (r1v55 java.lang.Object), (r1v57 java.lang.Object) binds: [B:66:0x01da, B:75:0x0212] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r13v24 li.g) = (r13v23 li.g), (r13v25 li.g) binds: [B:66:0x01da, B:75:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027e  */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x02f2 -> B:123:0x02f3). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j0 j0Var, x70.c cVar) {
        super(2, cVar);
        this.f6429j = 2;
        this.f6435q = j0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l1 l1Var, Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f6429j = i11;
        this.f6434p = l1Var;
        this.f6435q = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(le.v vVar, Context context, le.s sVar, b1 b1Var, x70.c cVar) {
        super(2, cVar);
        this.f6429j = 3;
        this.f6432n = vVar;
        this.f6433o = context;
        this.f6434p = sVar;
        this.f6435q = b1Var;
    }
}
