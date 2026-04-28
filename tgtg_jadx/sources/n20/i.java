package n20;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends k8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30343a;

    public i(int i11) {
        this.f30343a = i11;
    }

    @Override // k8.h
    public final float a(Object obj) {
        float[] fArr = ((j) obj).C;
        if (fArr != null) {
            return fArr[this.f30343a];
        }
        return 0.0f;
    }

    @Override // k8.h
    public final void b(float f11, Object obj) {
        j jVar = (j) obj;
        float[] fArr = jVar.C;
        if (fArr != null) {
            int i11 = this.f30343a;
            if (fArr[i11] != f11) {
                fArr[i11] = f11;
                w.z zVar = jVar.E;
                if (zVar != null) {
                    MaterialButton.b((MaterialButton) zVar.f42799b, jVar.j());
                }
                jVar.invalidateSelf();
            }
        }
    }
}
