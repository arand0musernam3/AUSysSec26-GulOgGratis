package zendesk.conversationkit.android.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.internal.user.UserActionProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/internal/UserAccess;", "Lzendesk/conversationkit/android/internal/AccessLevel;", "userProcessor", "Lzendesk/conversationkit/android/internal/user/UserActionProcessor;", "conversationKitStorage", "Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "<init>", "(Lzendesk/conversationkit/android/internal/user/UserActionProcessor;Lzendesk/conversationkit/android/internal/ConversationKitStorage;)V", "getUserProcessor", "()Lzendesk/conversationkit/android/internal/user/UserActionProcessor;", "getConversationKitStorage", "()Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserAccess extends AccessLevel {

    @NotNull
    private final ConversationKitStorage conversationKitStorage;

    @NotNull
    private final UserActionProcessor userProcessor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccess(@NotNull UserActionProcessor userActionProcessor, @NotNull ConversationKitStorage conversationKitStorage) {
        super("UserAccess", null);
        userActionProcessor.getClass();
        conversationKitStorage.getClass();
        this.userProcessor = userActionProcessor;
        this.conversationKitStorage = conversationKitStorage;
    }

    public static /* synthetic */ UserAccess copy$default(UserAccess userAccess, UserActionProcessor userActionProcessor, ConversationKitStorage conversationKitStorage, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userActionProcessor = userAccess.userProcessor;
        }
        if ((i11 & 2) != 0) {
            conversationKitStorage = userAccess.conversationKitStorage;
        }
        return userAccess.copy(userActionProcessor, conversationKitStorage);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserActionProcessor getUserProcessor() {
        return this.userProcessor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConversationKitStorage getConversationKitStorage() {
        return this.conversationKitStorage;
    }

    @NotNull
    public final UserAccess copy(@NotNull UserActionProcessor userProcessor, @NotNull ConversationKitStorage conversationKitStorage) {
        userProcessor.getClass();
        conversationKitStorage.getClass();
        return new UserAccess(userProcessor, conversationKitStorage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAccess)) {
            return false;
        }
        UserAccess userAccess = (UserAccess) other;
        return Intrinsics.areEqual(this.userProcessor, userAccess.userProcessor) && Intrinsics.areEqual(this.conversationKitStorage, userAccess.conversationKitStorage);
    }

    @NotNull
    public final ConversationKitStorage getConversationKitStorage() {
        return this.conversationKitStorage;
    }

    @NotNull
    public final UserActionProcessor getUserProcessor() {
        return this.userProcessor;
    }

    public int hashCode() {
        return this.conversationKitStorage.hashCode() + (this.userProcessor.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UserAccess(userProcessor=" + this.userProcessor + ", conversationKitStorage=" + this.conversationKitStorage + ")";
    }
}
