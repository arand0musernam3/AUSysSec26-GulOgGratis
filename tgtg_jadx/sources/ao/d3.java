package ao;

import com.app.tgtg.model.remote.UserData;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UserData f4221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4222k;
    public final /* synthetic */ g3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4223m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(g3 g3Var, z70.c cVar) {
        super(cVar);
        this.l = g3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4222k = obj;
        this.f4223m |= Integer.MIN_VALUE;
        Object objF = this.l.F(null, this);
        return objF == y70.a.COROUTINE_SUSPENDED ? objF : new u70.q(objF);
    }
}
