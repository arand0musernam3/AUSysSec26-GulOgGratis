package n8;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends w.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f30697c;

    public g(TextView textView) {
        this.f30697c = new f(textView);
    }

    @Override // w.b
    public final InputFilter[] J(InputFilter[] inputFilterArr) {
        return !l8.j.d() ? inputFilterArr : this.f30697c.J(inputFilterArr);
    }

    @Override // w.b
    public final boolean S() {
        return this.f30697c.f30696e;
    }

    @Override // w.b
    public final void Z(boolean z11) {
        if (l8.j.d()) {
            this.f30697c.Z(z11);
        }
    }

    @Override // w.b
    public final void c0(boolean z11) {
        boolean zD = l8.j.d();
        f fVar = this.f30697c;
        if (zD) {
            fVar.c0(z11);
        } else {
            fVar.f30696e = z11;
        }
    }

    @Override // w.b
    public final TransformationMethod e0(TransformationMethod transformationMethod) {
        return !l8.j.d() ? transformationMethod : this.f30697c.e0(transformationMethod);
    }
}
