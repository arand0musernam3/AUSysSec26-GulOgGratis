package h3;

import al.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f21362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21363k;
    public final /* synthetic */ z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z zVar, x70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f21362j = obj;
        this.f21363k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
