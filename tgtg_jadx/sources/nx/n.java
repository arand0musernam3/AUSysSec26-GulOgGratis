package nx;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31447a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31449c;

    public n(String str, boolean z11) {
        this.f31449c = str;
        this.f31448b = z11;
    }

    public String toString() {
        switch (this.f31447a) {
            case 0:
                String str = this.f31448b ? "Applink" : "Unclassified";
                String str2 = this.f31449c;
                if (str2 == null) {
                    return str;
                }
                return str + '(' + str2 + ')';
            default:
                return super.toString();
        }
    }

    public n(boolean z11, String str) {
        this.f31448b = z11;
        this.f31449c = str;
    }
}
