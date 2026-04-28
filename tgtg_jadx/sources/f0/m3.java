package f0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s3 f16774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Iterator f16775k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q3 f16776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16777n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(q3 q3Var, z70.c cVar) {
        super(cVar);
        this.f16776m = q3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f16777n |= Integer.MIN_VALUE;
        return this.f16776m.f(null, this);
    }
}
