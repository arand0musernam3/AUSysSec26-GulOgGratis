package z3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f47016k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f47017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f47019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f47020p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, x70.c cVar) {
        super(2, cVar);
        this.f47020p = kVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        j jVar = new j(this.f47020p, cVar);
        jVar.f47019o = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((o80.k) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (r13.a(r10, r21) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r9.a(r10, r21) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        if (r6.a(r7, r21) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:19:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a4 -> B:32:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a7 -> B:32:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d3 -> B:44:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d6 -> B:43:0x00d7). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
