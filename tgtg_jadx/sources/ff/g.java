package ff;

import oz.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o f17637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ye.g f17638k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f17639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17640n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, z70.c cVar) {
        super(cVar);
        this.f17639m = oVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f17640n |= Integer.MIN_VALUE;
        return this.f17639m.b(this);
    }
}
