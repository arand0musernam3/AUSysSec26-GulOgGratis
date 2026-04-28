package qq;

import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f37231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f37232k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, z70.c cVar2) {
        super(cVar2);
        this.f37232k = cVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f37231j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objA = this.f37232k.a(this);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : new q(objA);
    }
}
