package uc;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import zc.k;
import zc.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f41035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f41036k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f41039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f41040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a f41041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f41042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f41043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ pc.b f41044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f41045u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a aVar, n nVar, List list, pc.b bVar, k kVar, x70.c cVar) {
        super(2, cVar);
        this.f41040p = hVar;
        this.f41041q = aVar;
        this.f41042r = nVar;
        this.f41043s = list;
        this.f41044t = bVar;
        this.f41045u = kVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        g gVar = new g(this.f41040p, this.f41041q, this.f41042r, this.f41043s, this.f41044t, this.f41045u, cVar);
        gVar.f41039o = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0140  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x012e -> B:33:0x0131). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
