package zendesk.ui.android.conversation.receipt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessageReceiptView f47883b;

    public /* synthetic */ a(MessageReceiptView messageReceiptView, int i11) {
        this.f47882a = i11;
        this.f47883b = messageReceiptView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47882a) {
            case 0:
                MessageReceiptView.announceFailedStatusForAccessibility$lambda$14(this.f47883b);
                break;
            case 1:
                MessageReceiptView.animateIconScaleDown$lambda$8$lambda$7(this.f47883b);
                break;
            default:
                MessageReceiptView.animateIconScaleUp$lambda$6$lambda$5(this.f47883b);
                break;
        }
    }
}
