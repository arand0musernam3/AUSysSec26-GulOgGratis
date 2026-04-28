package aa;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function1 f1154k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f1155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1156n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, z70.c cVar) {
        super(cVar);
        this.f1155m = uVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f1156n |= Integer.MIN_VALUE;
        return this.f1155m.b(null, null, this);
    }
}
