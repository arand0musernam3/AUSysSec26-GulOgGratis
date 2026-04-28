package q6;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f36332a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f36333b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36334c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36335d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f36336e;

    public x(MotionLayout motionLayout) {
        this.f36336e = motionLayout;
    }

    public final void a() {
        int i11 = this.f36334c;
        MotionLayout motionLayout = this.f36336e;
        if (i11 != -1 || this.f36335d != -1) {
            int i12 = this.f36335d;
            if (i11 == -1) {
                motionLayout.B(i12);
            } else if (i12 == -1) {
                motionLayout.setState(i11, -1, -1);
            } else {
                motionLayout.setTransition(i11, i12);
            }
            motionLayout.setState(z.SETUP);
        }
        boolean zIsNaN = Float.isNaN(this.f36333b);
        float f11 = this.f36332a;
        if (zIsNaN) {
            if (Float.isNaN(f11)) {
                return;
            }
            motionLayout.setProgress(this.f36332a);
        } else {
            motionLayout.setProgress(f11, this.f36333b);
            this.f36332a = Float.NaN;
            this.f36333b = Float.NaN;
            this.f36334c = -1;
            this.f36335d = -1;
        }
    }
}
