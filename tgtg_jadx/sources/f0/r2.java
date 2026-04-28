package f0;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f16868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.ObjectRef f16869k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s2 f16870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16871n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(s2 s2Var, z70.c cVar) {
        super(cVar);
        this.f16870m = s2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f16871n |= Integer.MIN_VALUE;
        return s2.i(this.f16870m, this);
    }
}
