package ye;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f45950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f45951k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f45952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f45953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b0 f45954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45955p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, z70.c cVar) {
        super(cVar);
        this.f45954o = b0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45953n = obj;
        this.f45955p |= Integer.MIN_VALUE;
        return this.f45954o.i(0L, this);
    }
}
