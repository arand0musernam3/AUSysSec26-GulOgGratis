package mp;

import androidx.lifecycle.LifecycleOwner;
import i1.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LifecycleOwner f30062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f30063k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f30064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30065n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, z70.c cVar2) {
        super(cVar2);
        this.f30064m = cVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f30065n |= Integer.MIN_VALUE;
        return this.f30064m.a(null, this);
    }
}
