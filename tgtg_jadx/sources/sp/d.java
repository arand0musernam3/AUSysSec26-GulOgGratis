package sp;

import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f39086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f39087k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, z70.c cVar) {
        super(cVar);
        this.f39087k = fVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f39086j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objD = this.f39087k.d(null, this);
        return objD == y70.a.COROUTINE_SUSPENDED ? objD : new q(objD);
    }
}
