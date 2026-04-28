package qj;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f37082j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f37083k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f37084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f37085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f37086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f37087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f37088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f37089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Serializable f37090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f37091t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, String str, String str2, String str3, e eVar, f fVar, x70.c cVar) {
        super(2, cVar);
        this.f37088q = iVar;
        this.f37089r = str;
        this.f37090s = str2;
        this.f37091t = str3;
        this.f37085n = eVar;
        this.f37087p = fVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f37082j) {
            case 0:
                return new g((i) this.f37088q, (String) this.f37089r, (String) this.f37090s, (String) this.f37091t, (e) this.f37085n, (f) this.f37087p, cVar);
            default:
                g gVar = new g((v1.j1) this.f37088q, (v1.l1) this.f37089r, (z70.i) this.f37090s, this.f37091t, cVar);
                gVar.f37087p = obj;
                return gVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f37082j) {
        }
        return ((g) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016c  */
    /* JADX WARN: Type inference failed for: r3v0, types: [e90.a, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.jvm.functions.Function2] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(v1.j1 j1Var, v1.l1 l1Var, Function2 function2, Object obj, x70.c cVar) {
        super(2, cVar);
        this.f37088q = j1Var;
        this.f37089r = l1Var;
        this.f37090s = (z70.i) function2;
        this.f37091t = obj;
    }
}
