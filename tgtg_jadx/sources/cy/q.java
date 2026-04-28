package cy;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum q {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);

    private final boolean allowsCustomTabAuth;
    private final boolean allowsDeviceAuth;
    private final boolean allowsFacebookLiteAuth;
    private final boolean allowsGetTokenAuth;
    private final boolean allowsInstagramAppAuth;
    private final boolean allowsKatanaAuth;
    private final boolean allowsWebViewAuth;

    q(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.allowsGetTokenAuth = z11;
        this.allowsKatanaAuth = z12;
        this.allowsWebViewAuth = z13;
        this.allowsDeviceAuth = z14;
        this.allowsCustomTabAuth = z15;
        this.allowsFacebookLiteAuth = z16;
        this.allowsInstagramAppAuth = z17;
    }

    public final boolean a() {
        return this.allowsCustomTabAuth;
    }

    public final boolean c() {
        return this.allowsDeviceAuth;
    }

    public final boolean d() {
        return this.allowsGetTokenAuth;
    }

    public final boolean e() {
        return this.allowsInstagramAppAuth;
    }

    public final boolean f() {
        return this.allowsKatanaAuth;
    }

    public final boolean g() {
        return this.allowsWebViewAuth;
    }
}
