package d8;

import java.io.Serializable;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f14712k;
    public Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Serializable f14713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14714n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f14715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y f14716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14717q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, z70.c cVar) {
        super(cVar);
        this.f14716p = yVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14715o = obj;
        this.f14717q |= Integer.MIN_VALUE;
        return y.g(this.f14716p, false, this);
    }
}
