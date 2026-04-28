package m3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29307k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f29310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f29311p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, x70.c cVar) {
        super(2, cVar);
        this.f29311p = lVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        k kVar = new k(this.f29311p, cVar);
        kVar.f29310o = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((o80.k) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0179  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x016f -> B:31:0x0171). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
