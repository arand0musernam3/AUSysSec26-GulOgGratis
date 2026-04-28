package et;

import com.app.tgtg.model.remote.order.Order;
import java.util.Iterator;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.BooleanRef f16414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Iterator f16415k;
    public Order l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f16416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f16419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z f16420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16421r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, z70.c cVar) {
        super(cVar);
        this.f16420q = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16419p = obj;
        this.f16421r |= Integer.MIN_VALUE;
        return this.f16420q.n(this);
    }
}
