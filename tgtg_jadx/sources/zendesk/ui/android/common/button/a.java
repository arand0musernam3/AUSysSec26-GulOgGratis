package zendesk.ui.android.common.button;

import com.google.android.material.button.MaterialButton;
import zendesk.ui.android.conversation.actionbutton.ActionButtonView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f47782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f47783d;

    public /* synthetic */ a(MaterialButton materialButton, int i11, float f11, int i12) {
        this.f47780a = i12;
        this.f47783d = materialButton;
        this.f47781b = i11;
        this.f47782c = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47780a) {
            case 0:
                ButtonView.render$lambda$6((ButtonView) this.f47783d, this.f47781b, this.f47782c);
                break;
            default:
                ActionButtonView.render$lambda$7((ActionButtonView) this.f47783d, this.f47781b, this.f47782c);
                break;
        }
    }
}
