package a2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function1 f199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f200k;
    public final /* synthetic */ j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f201m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, z70.c cVar) {
        super(cVar);
        this.l = jVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f200k = obj;
        this.f201m |= Integer.MIN_VALUE;
        return this.l.c(null, 0.0f, null, this);
    }
}
