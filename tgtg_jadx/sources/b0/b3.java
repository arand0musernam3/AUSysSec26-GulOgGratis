package b0;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f5073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5074k;
    public final /* synthetic */ c3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5075m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(c3 c3Var, z70.c cVar) {
        super(cVar);
        this.l = c3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f5074k = obj;
        this.f5075m |= Integer.MIN_VALUE;
        return this.l.c(null, null, null, null, null, this);
    }
}
