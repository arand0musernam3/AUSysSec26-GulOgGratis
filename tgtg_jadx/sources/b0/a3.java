package b0;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f5052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5053k;
    public final /* synthetic */ c3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5054m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(c3 c3Var, z70.c cVar) {
        super(cVar);
        this.l = c3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f5053k = obj;
        this.f5054m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
