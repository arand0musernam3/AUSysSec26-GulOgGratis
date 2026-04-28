package qz;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f37401a;

    public y(g gVar) {
        this.f37401a = gVar;
    }

    @Override // qz.b
    public final void a(boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        g gVar = this.f37401a;
        gVar.f37348n.sendMessage(gVar.f37348n.obtainMessage(1, boolValueOf));
    }
}
