package pd;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ia0.g f34690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f34691k;
    public final /* synthetic */ o l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f34692m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, z70.c cVar) {
        super(cVar);
        this.l = oVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f34691k = obj;
        this.f34692m |= Integer.MIN_VALUE;
        return o.c(this.l, null, this);
    }
}
