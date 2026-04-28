package et;

import com.app.tgtg.model.remote.order.Order;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f16432k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Iterator f16433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Order f16434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f16435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f16440t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16441u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, z70.c cVar) {
        super(cVar);
        this.f16440t = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16439s = obj;
        this.f16441u |= Integer.MIN_VALUE;
        return this.f16440t.q(false, this);
    }
}
