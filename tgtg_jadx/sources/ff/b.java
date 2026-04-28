package ff;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a8.h f17616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Iterator f17617k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f17618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Iterator f17619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public pf.a f17620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f17622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a8.h f17623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17624s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a8.h hVar, z70.c cVar) {
        super(cVar);
        this.f17623r = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f17622q = obj;
        this.f17624s |= Integer.MIN_VALUE;
        return this.f17623r.t(this);
    }
}
