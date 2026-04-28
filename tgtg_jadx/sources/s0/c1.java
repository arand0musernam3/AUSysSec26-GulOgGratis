package s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface c1 extends s1 {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final g f38307w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final g f38308x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final g f38309y0;

    static {
        Class cls = Integer.TYPE;
        f38307w0 = new g("camerax.core.imageInput.inputFormat", cls, null);
        f38308x0 = new g("camerax.core.imageInput.secondaryInputFormat", cls, null);
        f38309y0 = new g("camerax.core.imageInput.inputDynamicRange", m0.c0.class, null);
    }

    default int k() {
        return ((Integer) d(f38307w0)).intValue();
    }
}
