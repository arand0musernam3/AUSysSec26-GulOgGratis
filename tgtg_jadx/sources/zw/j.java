package zw;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48249a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zw.h
    public final boolean a(n1 n1Var) {
        switch (this.f48249a) {
            case 0:
                if (!(n1Var instanceof l1) || ((l1) n1Var).getChildren().size() == 0) {
                }
                break;
            case 1:
                if (n1Var.f48324b == null) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.f48249a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
