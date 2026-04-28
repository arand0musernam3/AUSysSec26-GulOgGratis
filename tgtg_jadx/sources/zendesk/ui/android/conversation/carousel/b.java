package zendesk.ui.android.conversation.carousel;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.avatar.AvatarImageRendering;
import zendesk.ui.android.conversation.avatar.AvatarImageState;
import zendesk.ui.android.conversation.carousel.CarouselCellData;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselCellData.Avatar f47818b;

    public /* synthetic */ b(CarouselCellData.Avatar avatar, int i11) {
        this.f47817a = i11;
        this.f47818b = avatar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47817a) {
            case 0:
                return AvatarCarouselViewHolder.bind$lambda$1(this.f47818b, (AvatarImageRendering) obj);
            default:
                return AvatarCarouselViewHolder.bind$lambda$1$lambda$0(this.f47818b, (AvatarImageState) obj);
        }
    }
}
