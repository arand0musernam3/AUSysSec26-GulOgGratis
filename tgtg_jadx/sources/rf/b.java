package rf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j30.g f37961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public pf.a f37962k;
    public Map l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Iterator f37963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f37964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f37965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j30.g f37966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37967q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j30.g gVar, z70.c cVar) {
        super(cVar);
        this.f37966p = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f37965o = obj;
        this.f37967q |= Integer.MIN_VALUE;
        return this.f37966p.p(this);
    }
}
