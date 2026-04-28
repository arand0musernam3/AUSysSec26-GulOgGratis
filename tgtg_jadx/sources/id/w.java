package id;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e90.i f23817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f23818k;
    public final /* synthetic */ y l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23819m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, z70.c cVar) {
        super(cVar);
        this.l = yVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f23818k = obj;
        this.f23819m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
