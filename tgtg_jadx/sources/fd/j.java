package fd;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17568b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f17567a = i11;
        this.f17568b = obj;
    }

    public String toString() {
        switch (this.f17567a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("[Result: <");
                sb2.append("Value: " + this.f17568b);
                sb2.append(">]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
