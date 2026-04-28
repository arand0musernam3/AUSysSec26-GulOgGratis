package b0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f5112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r f5113k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r0 f5116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5117p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(r0 r0Var, z70.c cVar) {
        super(cVar);
        this.f5116o = r0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f5115n = obj;
        this.f5117p |= Integer.MIN_VALUE;
        return this.f5116o.j(null, 0, 0, 0, null, this);
    }
}
