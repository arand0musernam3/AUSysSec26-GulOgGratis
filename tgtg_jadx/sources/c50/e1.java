package c50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b1 f7523k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f1 f7524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7525n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, x70.c cVar) {
        super(cVar);
        this.f7524m = f1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f7525n |= Integer.MIN_VALUE;
        return f1.a(this.f7524m, null, null, this);
    }
}
