package y80;

import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f45553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.LongRef f45554k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f45555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f45556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ cg.k f45557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f45558p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cg.k kVar, i iVar, x70.c cVar) {
        super(3, cVar);
        this.f45557o = kVar;
        this.f45558p = iVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q qVar = new q(this.f45557o, this.f45558p, (x70.c) obj3);
        qVar.f45555m = (v80.b0) obj;
        qVar.f45556n = (j) obj2;
        return qVar.invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r9.emit(r11, r19) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:16:0x0079, B:26:0x00a9], limit reached: 35 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, x80.w] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0107 -> B:12:0x0069). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
