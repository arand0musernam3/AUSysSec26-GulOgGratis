package zendesk.conversationkit.android.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.internal.app.AppActionProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/internal/AppAccess;", "Lzendesk/conversationkit/android/internal/AccessLevel;", "appProcessor", "Lzendesk/conversationkit/android/internal/app/AppActionProcessor;", "conversationKitStorage", "Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "<init>", "(Lzendesk/conversationkit/android/internal/app/AppActionProcessor;Lzendesk/conversationkit/android/internal/ConversationKitStorage;)V", "getAppProcessor", "()Lzendesk/conversationkit/android/internal/app/AppActionProcessor;", "getConversationKitStorage", "()Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AppAccess extends AccessLevel {

    @NotNull
    private final AppActionProcessor appProcessor;

    @NotNull
    private final ConversationKitStorage conversationKitStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAccess(@NotNull AppActionProcessor appActionProcessor, @NotNull ConversationKitStorage conversationKitStorage) {
        super("AppAccess", null);
        appActionProcessor.getClass();
        conversationKitStorage.getClass();
        this.appProcessor = appActionProcessor;
        this.conversationKitStorage = conversationKitStorage;
    }

    public static /* synthetic */ AppAccess copy$default(AppAccess appAccess, AppActionProcessor appActionProcessor, ConversationKitStorage conversationKitStorage, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            appActionProcessor = appAccess.appProcessor;
        }
        if ((i11 & 2) != 0) {
            conversationKitStorage = appAccess.conversationKitStorage;
        }
        return appAccess.copy(appActionProcessor, conversationKitStorage);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppActionProcessor getAppProcessor() {
        return this.appProcessor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConversationKitStorage getConversationKitStorage() {
        return this.conversationKitStorage;
    }

    @NotNull
    public final AppAccess copy(@NotNull AppActionProcessor appProcessor, @NotNull ConversationKitStorage conversationKitStorage) {
        appProcessor.getClass();
        conversationKitStorage.getClass();
        return new AppAccess(appProcessor, conversationKitStorage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppAccess)) {
            return false;
        }
        AppAccess appAccess = (AppAccess) other;
        return Intrinsics.areEqual(this.appProcessor, appAccess.appProcessor) && Intrinsics.areEqual(this.conversationKitStorage, appAccess.conversationKitStorage);
    }

    @NotNull
    public final AppActionProcessor getAppProcessor() {
        return this.appProcessor;
    }

    @NotNull
    public final ConversationKitStorage getConversationKitStorage() {
        return this.conversationKitStorage;
    }

    public int hashCode() {
        return this.conversationKitStorage.hashCode() + (this.appProcessor.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AppAccess(appProcessor=" + this.appProcessor + ", conversationKitStorage=" + this.conversationKitStorage + ")";
    }
}
