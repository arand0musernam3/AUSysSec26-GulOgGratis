package b0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f5429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f5430k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r0 f5432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5433o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r0 r0Var, z70.c cVar) {
        super(cVar);
        this.f5432n = r0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f5431m = obj;
        this.f5433o |= Integer.MIN_VALUE;
        return this.f5432n.g(null, 0, 0, null, this);
    }
}
