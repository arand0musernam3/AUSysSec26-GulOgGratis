package f0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f16623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.ObjectRef f16624k;
    public Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ref.ObjectRef f16625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f16627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f2 f16628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f16629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f16630r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, String str, h hVar, x70.c cVar) {
        super(2, cVar);
        this.f16628p = f2Var;
        this.f16629q = str;
        this.f16630r = hVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        e2 e2Var = new e2(this.f16628p, this.f16629q, this.f16630r, cVar);
        e2Var.f16627o = obj;
        return e2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x001e, B:32:0x0131, B:34:0x0135, B:36:0x014f, B:37:0x0155, B:39:0x015b, B:40:0x0161, B:42:0x0167, B:44:0x016d, B:46:0x0173, B:15:0x008c, B:17:0x009b, B:18:0x00a7, B:20:0x00ad, B:21:0x00b9, B:24:0x00c2, B:26:0x00f0, B:28:0x00f6, B:29:0x011d), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x001e, B:32:0x0131, B:34:0x0135, B:36:0x014f, B:37:0x0155, B:39:0x015b, B:40:0x0161, B:42:0x0167, B:44:0x016d, B:46:0x0173, B:15:0x008c, B:17:0x009b, B:18:0x00a7, B:20:0x00ad, B:21:0x00b9, B:24:0x00c2, B:26:0x00f0, B:28:0x00f6, B:29:0x011d), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, v80.j0] */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, v80.b2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, v80.j0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, v80.b2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x012e -> B:32:0x0131). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.e2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
