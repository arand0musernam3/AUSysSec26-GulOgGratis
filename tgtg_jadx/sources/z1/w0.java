package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends z70.h implements Function2 {
    public final /* synthetic */ Function1 A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f46737k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ref.LongRef f46738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Ref.LongRef f46739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.j f46740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w4.v f46741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f46743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f46744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f46745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function0 f46746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f46747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h2 f46748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i80.n f46749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function2 f46750y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Function0 f46751z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Function0 function0, Ref.LongRef longRef, h2 h2Var, i80.n nVar, Function2 function2, Function0 function02, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f46746u = function0;
        this.f46747v = longRef;
        this.f46748w = h2Var;
        this.f46749x = nVar;
        this.f46750y = function2;
        this.f46751z = function02;
        this.A = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        w0 w0Var = new w0(this.f46746u, this.f46747v, this.f46748w, this.f46749x, this.f46750y, this.f46751z, this.A, cVar);
        w0Var.f46745t = obj;
        return w0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x04a4, code lost:
    
        if (r7 == r1) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0506, code lost:
    
        if (h4.b.c(w4.u.h(r8, true)) == 0.0f) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x016e, code lost:
    
        if (r5 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0178, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ce, code lost:
    
        if (r5 == r1) goto L171;
     */
    /* JADX WARN: Path cross not found for [B:44:0x01f6, B:45:0x01fb], limit reached: 212 */
    /* JADX WARN: Path cross not found for [B:48:0x0202, B:44:0x01f6], limit reached: 212 */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fa A[PHI: r2 r3 r4 r5 r6 r8 r9 r11 r14 r16 r18
      0x00fa: PHI (r2v17 float) = (r2v12 float), (r2v25 float) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r3v14 androidx.recyclerview.widget.j) = (r3v8 androidx.recyclerview.widget.j), (r3v21 androidx.recyclerview.widget.j) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r4v9 w4.k0) = (r4v5 w4.k0), (r4v12 w4.k0) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r5v12 w4.k0) = (r5v6 w4.k0), (r5v14 w4.k0) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r6v7 w4.v) = (r6v2 w4.v), (r6v8 w4.v) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r8v9 kotlin.jvm.internal.Ref$LongRef) = (r8v3 kotlin.jvm.internal.Ref$LongRef), (r8v11 kotlin.jvm.internal.Ref$LongRef) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r9v4 kotlin.jvm.internal.Ref$LongRef) = (r9v2 kotlin.jvm.internal.Ref$LongRef), (r9v6 kotlin.jvm.internal.Ref$LongRef) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r11v3 int) = (r11v0 int), (r11v16 int) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r14v4 java.lang.Object) = (r14v2 java.lang.Object), (r14v14 java.lang.Object) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r16v9 long) = (r16v5 long), (r16v10 long) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r18v9 long) = (r18v5 long), (r18v10 long) binds: [B:12:0x00d0, B:33:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x039c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0333 -> B:160:0x043f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x033b -> B:114:0x0352). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0435 -> B:157:0x0436). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x044b -> B:82:0x029b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x04a4 -> B:172:0x04a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0188 -> B:76:0x0288). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x018b -> B:32:0x01a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x027c -> B:73:0x0280). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x02f8 -> B:88:0x02b6). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
