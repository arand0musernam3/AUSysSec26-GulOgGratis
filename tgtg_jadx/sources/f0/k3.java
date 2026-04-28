package f0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f16748k;
    public v80.b0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q3 f16750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16751o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(q3 q3Var, z70.c cVar) {
        super(cVar);
        this.f16750n = q3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16749m = obj;
        this.f16751o |= Integer.MIN_VALUE;
        return this.f16750n.d(null, null, null, null, this);
    }
}
