package s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements o2, d1, y0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f38285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f38286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f38287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f38288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f38289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f38290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f38291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f38292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f38293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f38294k;
    public static final g l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f38295a;

    static {
        Class cls = Integer.TYPE;
        f38285b = new g("camerax.core.imageCapture.captureMode", cls, null);
        f38286c = new g("camerax.core.imageCapture.flashMode", cls, null);
        f38287d = new g("camerax.core.imageCapture.captureBundle", m0.a0.class, null);
        f38288e = new g("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f38289f = new g("camerax.core.imageCapture.outputFormat", Integer.class, null);
        f38290g = new g("camerax.core.imageCapture.imageReaderProxyProvider", m0.o0.class, null);
        f38291h = new g("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        f38292i = new g("camerax.core.imageCapture.flashType", cls, null);
        f38293j = new g("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        f38294k = new g("camerax.core.imageCapture.screenFlash", y0.f.class, null);
        l = new g("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public b1(l1 l1Var) {
        this.f38295a = l1Var;
    }

    @Override // s0.s1
    public final u0 getConfig() {
        return this.f38295a;
    }

    @Override // s0.c1
    public final int k() {
        return ((Integer) d(c1.f38307w0)).intValue();
    }
}
