package ao;

import com.app.tgtg.model.remote.user.response.StartupResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public StartupResponse f4224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public StartupResponse f4225k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f4227n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f4228o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4229p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, z70.c cVar) {
        super(cVar);
        this.f4228o = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4227n = obj;
        this.f4229p |= Integer.MIN_VALUE;
        Object objB = this.f4228o.b(null, false, this);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : new u70.q(objB);
    }
}
