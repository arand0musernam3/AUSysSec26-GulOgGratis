package z1;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.FloatRef f46578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f46579k;
    public final /* synthetic */ n l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46580m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, z70.c cVar) {
        super(cVar);
        this.l = nVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46579k = obj;
        this.f46580m |= Integer.MIN_VALUE;
        return n.g1(this.l, 0.0f, this);
    }
}
