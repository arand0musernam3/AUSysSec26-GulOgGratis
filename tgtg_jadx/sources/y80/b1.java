package y80;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c1 f45444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.ObjectRef f45445k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c1 f45446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45447n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, x70.c cVar) {
        super(cVar);
        this.f45446m = c1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f45447n |= Integer.MIN_VALUE;
        return this.f45446m.emit(null, this);
    }
}
