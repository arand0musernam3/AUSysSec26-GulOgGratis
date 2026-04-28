package e6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f15780h;

    public k(l lVar) {
        this.f15780h = lVar;
    }

    @Override // e6.h
    public final String i() {
        i iVar = (i) this.f15780h.f15781a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f15776a + "]";
    }
}
