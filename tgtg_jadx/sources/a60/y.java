package a60;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f941b;

    public y(int i11) {
        switch (i11) {
            case 1:
                this.f940a = new ArrayList();
                this.f941b = 128;
                break;
            default:
                this.f940a = new ArrayList();
                this.f941b = 0;
                break;
        }
    }

    public void a(Class cls, k kVar) {
        ArrayList arrayList = b0.f841d;
        x xVar = new x(cls, kVar);
        ArrayList arrayList2 = this.f940a;
        int i11 = this.f941b;
        this.f941b = i11 + 1;
        arrayList2.add(i11, xVar);
    }
}
