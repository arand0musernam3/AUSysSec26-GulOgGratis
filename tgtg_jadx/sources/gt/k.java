package gt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f20855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f20856k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f20858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20859o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, z70.c cVar) {
        super(cVar);
        this.f20858n = nVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f20857m = obj;
        this.f20859o |= Integer.MIN_VALUE;
        return n.a(this.f20858n, 0, this);
    }
}
