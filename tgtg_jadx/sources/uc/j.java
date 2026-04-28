package uc;

import ld.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f41051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f41052k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f41053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41054n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, z70.c cVar) {
        super(cVar);
        this.f41053m = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f41054n |= Integer.MIN_VALUE;
        return this.f41053m.h(null, this);
    }
}
