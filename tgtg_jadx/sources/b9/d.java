package b9;

import androidx.fragment.app.p1;
import androidx.lifecycle.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class d extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f6069c = new p1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.l1 f6070a = new q1.l1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6071b = false;

    @Override // androidx.lifecycle.l1
    public final void onCleared() {
        super.onCleared();
        q1.l1 l1Var = this.f6070a;
        int iF = l1Var.f();
        for (int i11 = 0; i11 < iF; i11++) {
            ((b) l1Var.h(i11)).l();
        }
        int i12 = l1Var.f35788d;
        Object[] objArr = l1Var.f35787c;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        l1Var.f35788d = 0;
        l1Var.f35785a = false;
    }
}
