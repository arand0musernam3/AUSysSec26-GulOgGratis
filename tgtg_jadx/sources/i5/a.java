package i5;

import z5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f23356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f23357k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f23359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f23360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23361p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, z70.c cVar) {
        super(cVar);
        this.f23360o = dVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f23359n = obj;
        this.f23361p |= Integer.MIN_VALUE;
        return d.a(this.f23360o, null, null, this);
    }
}
