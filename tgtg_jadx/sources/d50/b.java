package d50;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f14414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Iterator f14415k;
    public d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e90.c f14416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Map f14417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f14418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f14419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f14420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14421r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, z70.c cVar2) {
        super(cVar2);
        this.f14420q = cVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14419p = obj;
        this.f14421r |= Integer.MIN_VALUE;
        return this.f14420q.b(this);
    }
}
