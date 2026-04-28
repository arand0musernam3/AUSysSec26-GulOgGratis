package et;

import com.app.tgtg.model.remote.order.OrderListResult;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f16390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f16391k;
    public OrderListResult l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f16393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16394o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, z70.c cVar) {
        super(cVar);
        this.f16393n = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16392m = obj;
        this.f16394o |= Integer.MIN_VALUE;
        return this.f16393n.h(this);
    }
}
