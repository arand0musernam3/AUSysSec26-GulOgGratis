package zendesk.ui.android.conversation.waittimebanner;

import kotlin.jvm.functions.Function2;
import m3.n;
import zendesk.ui.android.conversations.cell.EndedLabelKt;
import zendesk.ui.android.conversations.informationbanner.InformationBannerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47917b;

    public /* synthetic */ f(int i11, int i12) {
        this.f47916a = i12;
        this.f47917b = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f47916a;
        n nVar = (n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                return WaitTimeBannerKt.PreviewBanner$lambda$15(this.f47917b, nVar, iIntValue);
            case 1:
                return WaitTimeBannerKt.PreviewClearedBanner$lambda$16(this.f47917b, nVar, iIntValue);
            case 2:
                return EndedLabelKt.EndedLabelPreview$lambda$1(this.f47917b, nVar, iIntValue);
            default:
                return InformationBannerKt.InformationBannerPreview$lambda$1(this.f47917b, nVar, iIntValue);
        }
    }
}
