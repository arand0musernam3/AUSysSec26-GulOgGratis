package mv;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f30158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f30159k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f30160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30161n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, z70.c cVar) {
        super(cVar);
        this.f30160m = e0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f30161n |= Integer.MIN_VALUE;
        return e0.a(this.f30160m, null, null, this);
    }
}
