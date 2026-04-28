package a3;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f358k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f361o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g2(CoroutineContext coroutineContext, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f358k = 2;
        this.f360n = coroutineContext;
        this.f361o = (z70.h) function2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function2, z70.h] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f358k) {
            case 0:
                g2 g2Var = new g2((j2) this.f360n, (n0) this.f361o, cVar);
                g2Var.f359m = obj;
                return g2Var;
            case 1:
                g2 g2Var2 = new g2((m2.l1) this.f361o, cVar, 1);
                g2Var2.f359m = obj;
                return g2Var2;
            case 2:
                g2 g2Var3 = new g2((CoroutineContext) this.f360n, (Function2) this.f361o, cVar);
                g2Var3.f359m = obj;
                return g2Var3;
            default:
                g2 g2Var4 = new g2((y.a) this.f361o, cVar, 3);
                g2Var4.f360n = obj;
                return g2Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f358k) {
            case 0:
                return ((g2) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((g2) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((g2) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((g2) create((o80.k) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, w4.k0] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, w4.k0] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23, types: [kotlin.jvm.functions.Function2, z70.h] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:16:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0041 -> B:16:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x009d -> B:28:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00b4 -> B:28:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0108 -> B:68:0x010c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.g2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f358k = i11;
        this.f361o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(j2 j2Var, n0 n0Var, x70.c cVar) {
        super(2, cVar);
        this.f358k = 0;
        this.f360n = j2Var;
        this.f361o = n0Var;
    }
}
