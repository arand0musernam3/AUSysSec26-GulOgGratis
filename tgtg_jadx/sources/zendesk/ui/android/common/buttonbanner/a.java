package zendesk.ui.android.common.buttonbanner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ButtonBannerView f47785b;

    public /* synthetic */ a(ButtonBannerView buttonBannerView, int i11) {
        this.f47784a = i11;
        this.f47785b = buttonBannerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47784a) {
            case 0:
                this.f47785b.setVisibility(0);
                break;
            default:
                this.f47785b.setVisibility(8);
                break;
        }
    }
}
