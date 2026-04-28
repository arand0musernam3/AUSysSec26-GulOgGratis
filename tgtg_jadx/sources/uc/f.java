package uc;

import ld.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f41031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f41032k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f41033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41034n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, z70.c cVar) {
        super(cVar);
        this.f41033m = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f41034n |= Integer.MIN_VALUE;
        return this.f41033m.d(null, this);
    }
}
