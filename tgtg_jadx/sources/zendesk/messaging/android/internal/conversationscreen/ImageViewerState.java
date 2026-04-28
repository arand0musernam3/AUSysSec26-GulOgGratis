package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ImageViewerState;", "", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "authorizationToken", "", "<init>", "(Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;)V", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "getAuthorizationToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageViewerState {

    @Nullable
    private final String authorizationToken;

    @NotNull
    private final MessagingTheme messagingTheme;

    public /* synthetic */ ImageViewerState(MessagingTheme messagingTheme, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MessagingTheme.INSTANCE.getDEFAULT() : messagingTheme, (i11 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ ImageViewerState copy$default(ImageViewerState imageViewerState, MessagingTheme messagingTheme, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            messagingTheme = imageViewerState.messagingTheme;
        }
        if ((i11 & 2) != 0) {
            str = imageViewerState.authorizationToken;
        }
        return imageViewerState.copy(messagingTheme, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorizationToken() {
        return this.authorizationToken;
    }

    @NotNull
    public final ImageViewerState copy(@NotNull MessagingTheme messagingTheme, @Nullable String authorizationToken) {
        messagingTheme.getClass();
        return new ImageViewerState(messagingTheme, authorizationToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageViewerState)) {
            return false;
        }
        ImageViewerState imageViewerState = (ImageViewerState) other;
        return Intrinsics.areEqual(this.messagingTheme, imageViewerState.messagingTheme) && Intrinsics.areEqual(this.authorizationToken, imageViewerState.authorizationToken);
    }

    @Nullable
    public final String getAuthorizationToken() {
        return this.authorizationToken;
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    public int hashCode() {
        int iHashCode = this.messagingTheme.hashCode() * 31;
        String str = this.authorizationToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ImageViewerState(messagingTheme=" + this.messagingTheme + ", authorizationToken=" + this.authorizationToken + ")";
    }

    public ImageViewerState(@NotNull MessagingTheme messagingTheme, @Nullable String str) {
        messagingTheme.getClass();
        this.messagingTheme = messagingTheme;
        this.authorizationToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageViewerState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
