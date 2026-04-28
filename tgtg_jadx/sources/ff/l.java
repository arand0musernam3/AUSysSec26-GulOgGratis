package ff;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dn.k f17657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Iterator f17658k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dn.k f17659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17660n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dn.k kVar, z70.c cVar) {
        super(cVar);
        this.f17659m = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f17660n |= Integer.MIN_VALUE;
        return this.f17659m.s(this);
    }
}
