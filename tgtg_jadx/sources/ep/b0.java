package ep;

import ib.h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f16221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16222k;
    public final /* synthetic */ androidx.lifecycle.m l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16223m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.lifecycle.m mVar, x70.c cVar) {
        super(cVar);
        this.l = mVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16222k = obj;
        this.f16223m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
