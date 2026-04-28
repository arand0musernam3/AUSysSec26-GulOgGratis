package ao;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f4293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m0 f4294k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f4295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f4297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m0 f4298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4299q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, z70.c cVar) {
        super(cVar);
        this.f4298p = m0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4297o = obj;
        this.f4299q |= Integer.MIN_VALUE;
        return this.f4298p.d(null, this);
    }
}
