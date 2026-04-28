package zendesk.ui.android.conversation.avatar;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JD\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "", "uri", "Landroid/net/Uri;", "shouldAnimate", "", "avatarSize", "", "backgroundColor", "mask", "Lzendesk/ui/android/conversation/avatar/AvatarMask;", "<init>", "(Landroid/net/Uri;ZILjava/lang/Integer;Lzendesk/ui/android/conversation/avatar/AvatarMask;)V", "getUri", "()Landroid/net/Uri;", "getShouldAnimate", "()Z", "getAvatarSize", "()I", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMask", "()Lzendesk/ui/android/conversation/avatar/AvatarMask;", "component1", "component2", "component3", "component4", "component5", "copy", "(Landroid/net/Uri;ZILjava/lang/Integer;Lzendesk/ui/android/conversation/avatar/AvatarMask;)Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "equals", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AvatarImageState {
    public static final int $stable = 8;
    private final int avatarSize;

    @Nullable
    private final Integer backgroundColor;

    @NotNull
    private final AvatarMask mask;
    private final boolean shouldAnimate;

    @Nullable
    private final Uri uri;

    public /* synthetic */ AvatarImageState(Uri uri, boolean z11, int i11, Integer num, AvatarMask avatarMask, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : uri, (i12 & 2) != 0 ? true : z11, (i12 & 4) != 0 ? R.dimen.zuia_avatar_image_size : i11, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? AvatarMask.NONE : avatarMask);
    }

    public static /* synthetic */ AvatarImageState copy$default(AvatarImageState avatarImageState, Uri uri, boolean z11, int i11, Integer num, AvatarMask avatarMask, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = avatarImageState.uri;
        }
        if ((i12 & 2) != 0) {
            z11 = avatarImageState.shouldAnimate;
        }
        if ((i12 & 4) != 0) {
            i11 = avatarImageState.avatarSize;
        }
        if ((i12 & 8) != 0) {
            num = avatarImageState.backgroundColor;
        }
        if ((i12 & 16) != 0) {
            avatarMask = avatarImageState.mask;
        }
        AvatarMask avatarMask2 = avatarMask;
        int i13 = i11;
        return avatarImageState.copy(uri, z11, i13, num, avatarMask2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvatarSize() {
        return this.avatarSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AvatarMask getMask() {
        return this.mask;
    }

    @NotNull
    public final AvatarImageState copy(@Nullable Uri uri, boolean shouldAnimate, int avatarSize, @Nullable Integer backgroundColor, @NotNull AvatarMask mask) {
        mask.getClass();
        return new AvatarImageState(uri, shouldAnimate, avatarSize, backgroundColor, mask);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarImageState)) {
            return false;
        }
        AvatarImageState avatarImageState = (AvatarImageState) other;
        return Intrinsics.areEqual(this.uri, avatarImageState.uri) && this.shouldAnimate == avatarImageState.shouldAnimate && this.avatarSize == avatarImageState.avatarSize && Intrinsics.areEqual(this.backgroundColor, avatarImageState.backgroundColor) && this.mask == avatarImageState.mask;
    }

    public final int getAvatarSize() {
        return this.avatarSize;
    }

    @Nullable
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AvatarMask getMask() {
        return this.mask;
    }

    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        Uri uri = this.uri;
        int iB = k.b(this.avatarSize, k.e((uri == null ? 0 : uri.hashCode()) * 31, 31, this.shouldAnimate), 31);
        Integer num = this.backgroundColor;
        return this.mask.hashCode() + ((iB + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AvatarImageState(uri=" + this.uri + ", shouldAnimate=" + this.shouldAnimate + ", avatarSize=" + this.avatarSize + ", backgroundColor=" + this.backgroundColor + ", mask=" + this.mask + ")";
    }

    public AvatarImageState(@Nullable Uri uri, boolean z11, int i11, @Nullable Integer num, @NotNull AvatarMask avatarMask) {
        avatarMask.getClass();
        this.uri = uri;
        this.shouldAnimate = z11;
        this.avatarSize = i11;
        this.backgroundColor = num;
        this.mask = avatarMask;
    }

    public AvatarImageState() {
        this(null, false, 0, null, null, 31, null);
    }
}
