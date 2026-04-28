package z80;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x80.m f47386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f47387k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f47388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f47390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y80.i[] f47391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function0 f47392q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z70.i f47393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y80.j f47394s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(i80.n nVar, Function0 function0, x70.c cVar, y80.j jVar, y80.i[] iVarArr) {
        super(2, cVar);
        this.f47391p = iVarArr;
        this.f47392q = function0;
        this.f47393r = (z70.i) nVar;
        this.f47394s = jVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i80.n, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        o oVar = new o(this.f47393r, this.f47392q, cVar, this.f47394s, this.f47391p);
        oVar.f47390o = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        if (r8 != 0) goto L20;
     */
    /* JADX WARN: Path cross not found for [B:34:0x00c3, B:32:0x00b4], limit reached: 44 */
    /* JADX WARN: Path cross not found for [B:35:0x00c5, B:20:0x0084], limit reached: 44 */
    /* JADX WARN: Path cross not found for [B:37:0x00d3, B:40:0x00e6], limit reached: 44 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[LOOP:0: B:27:0x00a4->B:45:?, LOOP_START, PHI: r8 r12
      0x00a4: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:24:0x009f, B:45:?] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r12v4 kotlin.collections.IndexedValue) = (r12v3 kotlin.collections.IndexedValue), (r12v10 kotlin.collections.IndexedValue) binds: [B:24:0x009f, B:45:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v4, types: [i80.n, z70.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e3 -> B:20:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fb -> B:20:0x0084). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z80.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
