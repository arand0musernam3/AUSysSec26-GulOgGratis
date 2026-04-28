package zendesk.ui.android.conversation.carousel;

import e0.f;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.conversation.avatar.AvatarImageState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselCellData;", "", "carouselViewType", "Lzendesk/ui/android/conversation/carousel/CarouselViewType;", "<init>", "(Lzendesk/ui/android/conversation/carousel/CarouselViewType;)V", "getCarouselViewType", "()Lzendesk/ui/android/conversation/carousel/CarouselViewType;", "Item", "Avatar", "Lzendesk/ui/android/conversation/carousel/CarouselCellData$Avatar;", "Lzendesk/ui/android/conversation/carousel/CarouselCellData$Item;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CarouselCellData {
    public static final int $stable = 0;

    @NotNull
    private final CarouselViewType carouselViewType;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselCellData$Avatar;", "Lzendesk/ui/android/conversation/carousel/CarouselCellData;", "avatarImageState", "Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "<init>", "(Lzendesk/ui/android/conversation/avatar/AvatarImageState;)V", "getAvatarImageState", "()Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Avatar extends CarouselCellData {
        public static final int $stable = 8;

        @Nullable
        private final AvatarImageState avatarImageState;

        public Avatar(@Nullable AvatarImageState avatarImageState) {
            super(CarouselViewType.AVATAR, null);
            this.avatarImageState = avatarImageState;
        }

        public static /* synthetic */ Avatar copy$default(Avatar avatar, AvatarImageState avatarImageState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                avatarImageState = avatar.avatarImageState;
            }
            return avatar.copy(avatarImageState);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AvatarImageState getAvatarImageState() {
            return this.avatarImageState;
        }

        @NotNull
        public final Avatar copy(@Nullable AvatarImageState avatarImageState) {
            return new Avatar(avatarImageState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Avatar) && Intrinsics.areEqual(this.avatarImageState, ((Avatar) other).avatarImageState);
        }

        @Nullable
        public final AvatarImageState getAvatarImageState() {
            return this.avatarImageState;
        }

        public int hashCode() {
            AvatarImageState avatarImageState = this.avatarImageState;
            if (avatarImageState == null) {
                return 0;
            }
            return avatarImageState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Avatar(avatarImageState=" + this.avatarImageState + ")";
        }
    }

    private CarouselCellData(CarouselViewType carouselViewType) {
        this.carouselViewType = carouselViewType;
    }

    @NotNull
    public final CarouselViewType getCarouselViewType() {
        return this.carouselViewType;
    }

    public /* synthetic */ CarouselCellData(CarouselViewType carouselViewType, DefaultConstructorMarker defaultConstructorMarker) {
        this(carouselViewType);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselCellData$Item;", "Lzendesk/ui/android/conversation/carousel/CarouselCellData;", MessageBundle.TITLE_ENTRY, "", "description", "mediaUrl", "mediaType", "actions", "", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getMediaUrl", "getMediaType", "getActions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item extends CarouselCellData {
        public static final int $stable = 8;

        @NotNull
        private final List<CarouselAction> actions;

        @Nullable
        private final String description;

        @Nullable
        private final String mediaType;

        @Nullable
        private final String mediaUrl;

        @NotNull
        private final String title;

        public Item(String str, String str2, String str3, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? n0.f26529a : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = item.title;
            }
            if ((i11 & 2) != 0) {
                str2 = item.description;
            }
            if ((i11 & 4) != 0) {
                str3 = item.mediaUrl;
            }
            if ((i11 & 8) != 0) {
                str4 = item.mediaType;
            }
            if ((i11 & 16) != 0) {
                list = item.actions;
            }
            List list2 = list;
            String str5 = str3;
            return item.copy(str, str2, str5, str4, list2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMediaUrl() {
            return this.mediaUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMediaType() {
            return this.mediaType;
        }

        @NotNull
        public final List<CarouselAction> component5() {
            return this.actions;
        }

        @NotNull
        public final Item copy(@NotNull String title, @Nullable String description, @Nullable String mediaUrl, @Nullable String mediaType, @NotNull List<? extends CarouselAction> actions) {
            title.getClass();
            actions.getClass();
            return new Item(title, description, mediaUrl, mediaType, actions);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.title, item.title) && Intrinsics.areEqual(this.description, item.description) && Intrinsics.areEqual(this.mediaUrl, item.mediaUrl) && Intrinsics.areEqual(this.mediaType, item.mediaType) && Intrinsics.areEqual(this.actions, item.actions);
        }

        @NotNull
        public final List<CarouselAction> getActions() {
            return this.actions;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getMediaType() {
            return this.mediaType;
        }

        @Nullable
        public final String getMediaUrl() {
            return this.mediaUrl;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.mediaUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.mediaType;
            return this.actions.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.description;
            String str3 = this.mediaUrl;
            String str4 = this.mediaType;
            List<CarouselAction> list = this.actions;
            StringBuilder sbT = f.t("Item(title=", str, ", description=", str2, ", mediaUrl=");
            s.A(sbT, str3, ", mediaType=", str4, ", actions=");
            return f.p(sbT, list, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Item(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<? extends CarouselAction> list) {
            super(CarouselViewType.ITEM, null);
            str.getClass();
            list.getClass();
            this.title = str;
            this.description = str2;
            this.mediaUrl = str3;
            this.mediaType = str4;
            this.actions = list;
        }
    }
}
