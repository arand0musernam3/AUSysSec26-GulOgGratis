package ao;

import com.app.tgtg.model.remote.item.response.BasicItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BasicItem f4406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4407k;
    public final /* synthetic */ r1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4408m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, z70.c cVar) {
        super(cVar);
        this.l = r1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4407k = obj;
        this.f4408m |= Integer.MIN_VALUE;
        Object objS = this.l.s(null, this);
        return objS == y70.a.COROUTINE_SUSPENDED ? objS : new u70.q(objS);
    }
}
