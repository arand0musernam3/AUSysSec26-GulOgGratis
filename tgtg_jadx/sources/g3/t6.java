package g3;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t6 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.FloatRef f19528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f19529k;
    public final /* synthetic */ w6 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19530m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(w6 w6Var, z70.c cVar) {
        super(cVar);
        this.l = w6Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f19529k = obj;
        this.f19530m |= Integer.MIN_VALUE;
        return this.l.a(null, 0.0f, this);
    }
}
