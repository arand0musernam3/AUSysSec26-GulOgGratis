package cj;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8286k;
    public final /* synthetic */ s0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8287m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s0 s0Var, z70.c cVar) {
        super(cVar);
        this.l = s0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f8286k = obj;
        this.f8287m |= Integer.MIN_VALUE;
        return this.l.m(null, null, this);
    }
}
