package i0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f22714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f22715k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f22717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f22718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22719p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, x70.c cVar) {
        super(cVar);
        this.f22718o = uVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f22717n = obj;
        this.f22719p |= Integer.MIN_VALUE;
        return this.f22718o.u(null, this);
    }
}
