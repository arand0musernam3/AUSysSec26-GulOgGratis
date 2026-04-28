package al;

import b0.i3;
import cj.s0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.h1;
import no.m0;
import w.l0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f1541k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f1543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1546q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f2.c0 c0Var, h1 h1Var, h1 h1Var2, h1 h1Var3, h1 h1Var4, h1 h1Var5, x70.c cVar) {
        super(2, cVar);
        this.f1540j = 6;
        this.f1541k = c0Var;
        this.l = h1Var;
        this.f1543n = h1Var2;
        this.f1544o = h1Var3;
        this.f1545p = h1Var4;
        this.f1546q = h1Var5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d4, code lost:
    
        if (r7.b(r0, r17) == r2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[Catch: all -> 0x0032, PHI: r0 r7 r8 r10 r11 r12
      0x00bc: PHI (r0v31 x80.b) = (r0v34 x80.b), (r0v40 x80.b) binds: [B:35:0x00b8, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r7v24 int) = (r7v25 int), (r7v0 int) binds: [B:35:0x00b8, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r8v13 int) = (r8v14 int), (r8v0 int) binds: [B:35:0x00b8, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r10v10 qf.a) = (r10v12 qf.a), (r10v18 qf.a) binds: [B:35:0x00b8, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r11v8 java.lang.Object) = (r11v14 java.lang.Object), (r11v16 java.lang.Object) binds: [B:35:0x00b8, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r12v8 x80.w) = (r12v9 x80.w), (r12v13 x80.w) binds: [B:35:0x00b8, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0032, blocks: (B:10:0x002d, B:34:0x00a8, B:37:0x00bc, B:39:0x00c4, B:43:0x00ed, B:45:0x00f5, B:49:0x0132, B:53:0x0147, B:54:0x015d, B:55:0x016a, B:57:0x0170, B:58:0x0174, B:61:0x0191, B:64:0x019a, B:67:0x01be, B:71:0x01da, B:73:0x01e2, B:74:0x01ef, B:76:0x01f5, B:21:0x0055, B:24:0x0069, B:27:0x007f, B:30:0x0090, B:33:0x009f), top: B:85:0x000d, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:10:0x002d, B:34:0x00a8, B:37:0x00bc, B:39:0x00c4, B:43:0x00ed, B:45:0x00f5, B:49:0x0132, B:53:0x0147, B:54:0x015d, B:55:0x016a, B:57:0x0170, B:58:0x0174, B:61:0x0191, B:64:0x019a, B:67:0x01be, B:71:0x01da, B:73:0x01e2, B:74:0x01ef, B:76:0x01f5, B:21:0x0055, B:24:0x0069, B:27:0x007f, B:30:0x0090, B:33:0x009f), top: B:85:0x000d, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:10:0x002d, B:34:0x00a8, B:37:0x00bc, B:39:0x00c4, B:43:0x00ed, B:45:0x00f5, B:49:0x0132, B:53:0x0147, B:54:0x015d, B:55:0x016a, B:57:0x0170, B:58:0x0174, B:61:0x0191, B:64:0x019a, B:67:0x01be, B:71:0x01da, B:73:0x01e2, B:74:0x01ef, B:76:0x01f5, B:21:0x0055, B:24:0x0069, B:27:0x007f, B:30:0x0090, B:33:0x009f), top: B:85:0x000d, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:10:0x002d, B:34:0x00a8, B:37:0x00bc, B:39:0x00c4, B:43:0x00ed, B:45:0x00f5, B:49:0x0132, B:53:0x0147, B:54:0x015d, B:55:0x016a, B:57:0x0170, B:58:0x0174, B:61:0x0191, B:64:0x019a, B:67:0x01be, B:71:0x01da, B:73:0x01e2, B:74:0x01ef, B:76:0x01f5, B:21:0x0055, B:24:0x0069, B:27:0x007f, B:30:0x0090, B:33:0x009f), top: B:85:0x000d, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019a A[Catch: all -> 0x0032, Exception -> 0x0036, FileNotFoundException -> 0x0039, TRY_LEAVE, TryCatch #1 {FileNotFoundException -> 0x0039, blocks: (B:10:0x002d, B:58:0x0174, B:61:0x0191, B:64:0x019a, B:67:0x01be, B:71:0x01da, B:21:0x0055), top: B:85:0x000d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0215  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x016e -> B:70:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0199 -> B:55:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01d4 -> B:70:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01da -> B:55:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01e2 -> B:55:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01f3 -> B:55:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01f5 -> B:55:0x016a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: al.j.a(java.lang.Object):java.lang.Object");
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f1540j) {
            case 0:
                return new j((p) this.f1543n, (String) this.f1544o, (String) this.f1545p, (String) this.f1546q, cVar, 0);
            case 1:
                return new j((p) this.f1543n, (cl.f) this.f1546q, (String) this.f1544o, cVar);
            case 2:
                j jVar = new j((l0) this.l, (i3) this.f1543n, (List) this.f1544o, (Map) this.f1545p, (i0.b) this.f1546q, cVar, 2);
                jVar.f1541k = obj;
                return jVar;
            case 3:
                return new j((s0) this.f1543n, (String) this.f1545p, (ArrayList) this.f1546q, cVar);
            case 4:
                j jVar2 = new j((List) this.f1545p, (ArrayList) this.f1546q, cVar);
                jVar2.f1544o = obj;
                return jVar2;
            case 5:
                return new j((fn.c) this.f1544o, (mq.a) this.f1545p, (pt.b) this.f1546q, cVar);
            case 6:
                return new j((f2.c0) this.f1541k, (h1) this.l, (h1) this.f1543n, (h1) this.f1544o, (h1) this.f1545p, (h1) this.f1546q, cVar);
            case 7:
                return new j((m0) this.f1546q, (String) this.f1545p, cVar);
            case 8:
                return new j((qf.a) this.f1546q, cVar);
            case 9:
                j jVar3 = new j((x80.m) this.f1543n, (t1.b) this.f1544o, (b1) this.f1545p, (b1) this.f1546q, cVar, 9);
                jVar3.f1541k = obj;
                return jVar3;
            default:
                j jVar4 = new j((w4.y) this.l, (i80.n) this.f1543n, (Function1) this.f1544o, (Function1) this.f1545p, (Function1) this.f1546q, cVar, 10);
                jVar4.f1541k = obj;
                return jVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1540j) {
        }
        return ((j) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:339:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f4, code lost:
    
        if (r0.f(r3, r4, r18) == r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020d, code lost:
    
        if (r0.f(r3, r4, r18) == r2) goto L86;
     */
    /* JADX WARN: Path cross not found for [B:136:0x0343, B:143:0x0368], limit reached: 343 */
    /* JADX WARN: Path cross not found for [B:143:0x0368, B:136:0x0343], limit reached: 343 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a5 A[Catch: all -> 0x0238, TryCatch #2 {all -> 0x0238, blocks: (B:94:0x0230, B:114:0x02a1, B:116:0x02a5, B:118:0x02a9, B:119:0x02b0, B:120:0x02b5, B:122:0x02be, B:123:0x02ed, B:99:0x0242, B:105:0x025e, B:107:0x0268, B:109:0x0295, B:102:0x024f), top: B:323:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02be A[Catch: all -> 0x0238, TryCatch #2 {all -> 0x0238, blocks: (B:94:0x0230, B:114:0x02a1, B:116:0x02a5, B:118:0x02a9, B:119:0x02b0, B:120:0x02b5, B:122:0x02be, B:123:0x02ed, B:99:0x0242, B:105:0x025e, B:107:0x0268, B:109:0x0295, B:102:0x024f), top: B:323:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ad  */
    /* JADX WARN: Type inference failed for: r10v28, types: [i80.n, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x0366 -> B:136:0x0343). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x038f -> B:136:0x0343). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0098 -> B:23:0x009c). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: al.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s0 s0Var, String str, ArrayList arrayList, x70.c cVar) {
        super(2, cVar);
        this.f1540j = 3;
        this.f1543n = s0Var;
        this.f1545p = str;
        this.f1546q = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, cl.f fVar, String str, x70.c cVar) {
        super(2, cVar);
        this.f1540j = 1;
        this.f1543n = pVar;
        this.f1546q = fVar;
        this.f1544o = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fn.c cVar, mq.a aVar, pt.b bVar, x70.c cVar2) {
        super(2, cVar2);
        this.f1540j = 5;
        this.f1544o = cVar;
        this.f1545p = aVar;
        this.f1546q = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1540j = i11;
        this.l = obj;
        this.f1543n = obj2;
        this.f1544o = obj3;
        this.f1545p = obj4;
        this.f1546q = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1540j = i11;
        this.f1543n = obj;
        this.f1544o = obj2;
        this.f1545p = obj3;
        this.f1546q = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, ArrayList arrayList, x70.c cVar) {
        super(2, cVar);
        this.f1540j = 4;
        this.f1545p = list;
        this.f1546q = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m0 m0Var, String str, x70.c cVar) {
        super(2, cVar);
        this.f1540j = 7;
        this.f1546q = m0Var;
        this.f1545p = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qf.a aVar, x70.c cVar) {
        super(2, cVar);
        this.f1540j = 8;
        this.f1546q = aVar;
    }
}
