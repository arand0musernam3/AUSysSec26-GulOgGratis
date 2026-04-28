package ld;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f27642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f27643k;
    public final /* synthetic */ k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27644m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, z70.c cVar) {
        super(cVar);
        this.l = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f27643k = obj;
        this.f27644m |= Integer.MIN_VALUE;
        return this.l.g(this);
    }
}
