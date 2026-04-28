package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e90.a f14726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14727k;
    public final /* synthetic */ com.google.firebase.messaging.a0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14728m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.google.firebase.messaging.a0 a0Var, z70.c cVar) {
        super(cVar);
        this.l = a0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14727k = obj;
        this.f14728m |= Integer.MIN_VALUE;
        return this.l.V(this);
    }
}
