package i6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f23407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double[] f23408e;

    @Override // xz.b
    public final double u(double d3) {
        return this.f23408e[0];
    }

    @Override // xz.b
    public final void v(double d3, double[] dArr) {
        double[] dArr2 = this.f23408e;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // xz.b
    public final void w(double d3, float[] fArr) {
        int i11 = 0;
        while (true) {
            double[] dArr = this.f23408e;
            if (i11 >= dArr.length) {
                return;
            }
            fArr[i11] = (float) dArr[i11];
            i11++;
        }
    }

    @Override // xz.b
    public final void x(double d3, double[] dArr) {
        for (int i11 = 0; i11 < this.f23408e.length; i11++) {
            dArr[i11] = 0.0d;
        }
    }

    @Override // xz.b
    public final double[] z() {
        return new double[]{this.f23407d};
    }
}
