package zendesk.ui.android.conversation.carousel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.ui.android.R;
import zendesk.ui.android.conversation.avatar.AvatarImageRendering;
import zendesk.ui.android.conversation.avatar.AvatarImageState;
import zendesk.ui.android.conversation.avatar.AvatarImageView;
import zendesk.ui.android.conversation.carousel.CarouselCellData;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lzendesk/ui/android/conversation/carousel/AvatarCarouselViewHolder;", "Lzendesk/ui/android/conversation/carousel/CarouselViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "avatarImageView", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "bind", "", "rendering", "Lzendesk/ui/android/conversation/carousel/CarouselRendering;", "cellData", "Lzendesk/ui/android/conversation/carousel/CarouselCellData$Avatar;", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvatarCarouselViewHolder extends CarouselViewHolder {
    private static float borderAlpha;

    @NotNull
    private final AvatarImageView avatarImageView;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private AvatarCarouselViewHolder(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.zuia_carousel_list_item_avatar);
        viewFindViewById.getClass();
        this.avatarImageView = (AvatarImageView) viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvatarImageRendering bind$lambda$1(CarouselCellData.Avatar avatar, AvatarImageRendering avatarImageRendering) {
        avatarImageRendering.getClass();
        return avatarImageRendering.toBuilder().state(new b(avatar, 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvatarImageState bind$lambda$1$lambda$0(CarouselCellData.Avatar avatar, AvatarImageState avatarImageState) {
        avatarImageState.getClass();
        return avatar.getAvatarImageState();
    }

    public final void bind(@NotNull CarouselRendering rendering, @NotNull CarouselCellData.Avatar cellData) {
        rendering.getClass();
        cellData.getClass();
        if (!rendering.getShowAvatar() || cellData.getAvatarImageState() == null) {
            this.avatarImageView.setVisibility(4);
        } else {
            this.avatarImageView.render(new b(cellData, 0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lzendesk/ui/android/conversation/carousel/AvatarCarouselViewHolder$Companion;", "", "<init>", "()V", "borderAlpha", "", "getBorderAlpha", "()F", "setBorderAlpha", "(F)V", "create", "Lzendesk/ui/android/conversation/carousel/AvatarCarouselViewHolder;", "layoutInflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AvatarCarouselViewHolder create(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup parent) {
            layoutInflater.getClass();
            parent.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.zuia_view_carousel_item_avatar, parent, false);
            viewInflate.getClass();
            return new AvatarCarouselViewHolder(viewInflate, null);
        }

        public final float getBorderAlpha() {
            return AvatarCarouselViewHolder.borderAlpha;
        }

        public final void setBorderAlpha(float f11) {
            AvatarCarouselViewHolder.borderAlpha = f11;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AvatarCarouselViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }
}
