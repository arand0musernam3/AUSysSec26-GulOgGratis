package zendesk.messaging.android.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzendesk/messaging/android/internal/model/TypingUser;", "", "<init>", "()V", "User", "None", "Lzendesk/messaging/android/internal/model/TypingUser$None;", "Lzendesk/messaging/android/internal/model/TypingUser$User;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class TypingUser {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/model/TypingUser$None;", "Lzendesk/messaging/android/internal/model/TypingUser;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class None extends TypingUser {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/model/TypingUser$User;", "Lzendesk/messaging/android/internal/model/TypingUser;", "avatarUrl", "", "<init>", "(Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class User extends TypingUser {

        @NotNull
        private final String avatarUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public User(@NotNull String str) {
            super(null);
            str.getClass();
            this.avatarUrl = str;
        }

        public static /* synthetic */ User copy$default(User user, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = user.avatarUrl;
            }
            return user.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        public final User copy(@NotNull String avatarUrl) {
            avatarUrl.getClass();
            return new User(avatarUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof User) && Intrinsics.areEqual(this.avatarUrl, ((User) other).avatarUrl);
        }

        @NotNull
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public int hashCode() {
            return this.avatarUrl.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("User(avatarUrl=", this.avatarUrl, ")");
        }
    }

    public /* synthetic */ TypingUser(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TypingUser() {
    }
}
