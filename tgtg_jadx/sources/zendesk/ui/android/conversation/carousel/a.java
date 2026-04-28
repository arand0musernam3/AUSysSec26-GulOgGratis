package zendesk.ui.android.conversation.carousel;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.common.button.ButtonRendering;
import zendesk.ui.android.common.button.ButtonState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselAction f47813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f47816e;

    public /* synthetic */ a(CarouselAction carouselAction, int i11, int i12, boolean z11, int i13) {
        this.f47812a = i13;
        this.f47813b = carouselAction;
        this.f47814c = i11;
        this.f47815d = i12;
        this.f47816e = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47812a) {
            case 0:
                return ArticleCarouselViewHolder.renderButton$lambda$3$lambda$2(this.f47813b, this.f47814c, this.f47815d, this.f47816e, (ButtonState) obj);
            default:
                return ArticleCarouselViewHolder.renderButton$lambda$3(this.f47813b, this.f47814c, this.f47815d, this.f47816e, (ButtonRendering) obj);
        }
    }
}
