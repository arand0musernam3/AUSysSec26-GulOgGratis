package pd;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f34680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.ObjectRef f34681k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f34682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f34683n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, x70.c cVar) {
        super(cVar);
        this.f34682m = oVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f34683n |= Integer.MIN_VALUE;
        return o.b(this.f34682m, this);
    }
}
