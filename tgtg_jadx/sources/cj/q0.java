package cj;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8366k;
    public final /* synthetic */ s0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8367m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, z70.c cVar) {
        super(cVar);
        this.l = s0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f8366k = obj;
        this.f8367m |= Integer.MIN_VALUE;
        return this.l.q(null, this);
    }
}
