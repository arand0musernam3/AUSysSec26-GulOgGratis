package zendesk.conversationkit.android.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.ConversationKitError;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.ConversationKitResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B5\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "", "newAccessLevel", "Lzendesk/conversationkit/android/internal/AccessLevel;", "events", "", "Lzendesk/conversationkit/android/ConversationKitEvent;", "supplementaryActions", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "(Lzendesk/conversationkit/android/internal/AccessLevel;Ljava/util/List;Ljava/util/List;)V", "getNewAccessLevel", "()Lzendesk/conversationkit/android/internal/AccessLevel;", "getEvents", "()Ljava/util/List;", "getSupplementaryActions", "Continues", "Ends", "Lzendesk/conversationkit/android/internal/EffectProcessorResult$Continues;", "Lzendesk/conversationkit/android/internal/EffectProcessorResult$Ends;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class EffectProcessorResult {

    @NotNull
    private final List<ConversationKitEvent> events;

    @Nullable
    private final AccessLevel newAccessLevel;

    @NotNull
    private final List<Action> supplementaryActions;

    public EffectProcessorResult(AccessLevel accessLevel, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : accessLevel, (i11 & 2) != 0 ? n0.f26529a : list, (i11 & 4) != 0 ? n0.f26529a : list2, null);
    }

    @NotNull
    public List<ConversationKitEvent> getEvents() {
        return this.events;
    }

    @Nullable
    public AccessLevel getNewAccessLevel() {
        return this.newAccessLevel;
    }

    @NotNull
    public List<Action> getSupplementaryActions() {
        return this.supplementaryActions;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lzendesk/conversationkit/android/internal/EffectProcessorResult$Continues;", "Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "newAccessLevel", "Lzendesk/conversationkit/android/internal/AccessLevel;", "events", "", "Lzendesk/conversationkit/android/ConversationKitEvent;", "supplementaryActions", "Lzendesk/conversationkit/android/internal/Action;", "followingAction", "<init>", "(Lzendesk/conversationkit/android/internal/AccessLevel;Ljava/util/List;Ljava/util/List;Lzendesk/conversationkit/android/internal/Action;)V", "getNewAccessLevel", "()Lzendesk/conversationkit/android/internal/AccessLevel;", "getEvents", "()Ljava/util/List;", "getSupplementaryActions", "getFollowingAction", "()Lzendesk/conversationkit/android/internal/Action;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Continues extends EffectProcessorResult {

        @NotNull
        private final List<ConversationKitEvent> events;

        @NotNull
        private final Action followingAction;

        @Nullable
        private final AccessLevel newAccessLevel;

        @NotNull
        private final List<Action> supplementaryActions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Continues(@Nullable AccessLevel accessLevel, @NotNull List<? extends ConversationKitEvent> list, @NotNull List<? extends Action> list2, @NotNull Action action) {
            super(accessLevel, list, list2, null);
            list.getClass();
            list2.getClass();
            action.getClass();
            this.newAccessLevel = accessLevel;
            this.events = list;
            this.supplementaryActions = list2;
            this.followingAction = action;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Continues copy$default(Continues continues, AccessLevel accessLevel, List list, List list2, Action action, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                accessLevel = continues.newAccessLevel;
            }
            if ((i11 & 2) != 0) {
                list = continues.events;
            }
            if ((i11 & 4) != 0) {
                list2 = continues.supplementaryActions;
            }
            if ((i11 & 8) != 0) {
                action = continues.followingAction;
            }
            return continues.copy(accessLevel, list, list2, action);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AccessLevel getNewAccessLevel() {
            return this.newAccessLevel;
        }

        @NotNull
        public final List<ConversationKitEvent> component2() {
            return this.events;
        }

        @NotNull
        public final List<Action> component3() {
            return this.supplementaryActions;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Action getFollowingAction() {
            return this.followingAction;
        }

        @NotNull
        public final Continues copy(@Nullable AccessLevel newAccessLevel, @NotNull List<? extends ConversationKitEvent> events, @NotNull List<? extends Action> supplementaryActions, @NotNull Action followingAction) {
            events.getClass();
            supplementaryActions.getClass();
            followingAction.getClass();
            return new Continues(newAccessLevel, events, supplementaryActions, followingAction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Continues)) {
                return false;
            }
            Continues continues = (Continues) other;
            return Intrinsics.areEqual(this.newAccessLevel, continues.newAccessLevel) && Intrinsics.areEqual(this.events, continues.events) && Intrinsics.areEqual(this.supplementaryActions, continues.supplementaryActions) && Intrinsics.areEqual(this.followingAction, continues.followingAction);
        }

        @Override // zendesk.conversationkit.android.internal.EffectProcessorResult
        @NotNull
        public List<ConversationKitEvent> getEvents() {
            return this.events;
        }

        @NotNull
        public final Action getFollowingAction() {
            return this.followingAction;
        }

        @Override // zendesk.conversationkit.android.internal.EffectProcessorResult
        @Nullable
        public AccessLevel getNewAccessLevel() {
            return this.newAccessLevel;
        }

        @Override // zendesk.conversationkit.android.internal.EffectProcessorResult
        @NotNull
        public List<Action> getSupplementaryActions() {
            return this.supplementaryActions;
        }

        public int hashCode() {
            AccessLevel accessLevel = this.newAccessLevel;
            return this.followingAction.hashCode() + e0.f.c(this.supplementaryActions, e0.f.c(this.events, (accessLevel == null ? 0 : accessLevel.hashCode()) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "Continues(newAccessLevel=" + this.newAccessLevel + ", events=" + this.events + ", supplementaryActions=" + this.supplementaryActions + ", followingAction=" + this.followingAction + ")";
        }

        public Continues(AccessLevel accessLevel, List list, List list2, Action action, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : accessLevel, (i11 & 2) != 0 ? n0.f26529a : list, (i11 & 4) != 0 ? n0.f26529a : list2, action);
        }
    }

    public /* synthetic */ EffectProcessorResult(AccessLevel accessLevel, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(accessLevel, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EffectProcessorResult(AccessLevel accessLevel, List<? extends ConversationKitEvent> list, List<? extends Action> list2) {
        this.newAccessLevel = accessLevel;
        this.events = list;
        this.supplementaryActions = list2;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lzendesk/conversationkit/android/internal/EffectProcessorResult$Ends;", "Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "newAccessLevel", "Lzendesk/conversationkit/android/internal/AccessLevel;", "events", "", "Lzendesk/conversationkit/android/ConversationKitEvent;", "supplementaryActions", "Lzendesk/conversationkit/android/internal/Action;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "", "<init>", "(Lzendesk/conversationkit/android/internal/AccessLevel;Ljava/util/List;Ljava/util/List;Lzendesk/conversationkit/android/ConversationKitResult;)V", "getNewAccessLevel", "()Lzendesk/conversationkit/android/internal/AccessLevel;", "getEvents", "()Ljava/util/List;", "getSupplementaryActions", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Ends extends EffectProcessorResult {

        @NotNull
        private final List<ConversationKitEvent> events;

        @Nullable
        private final AccessLevel newAccessLevel;

        @NotNull
        private final ConversationKitResult<Object> result;

        @NotNull
        private final List<Action> supplementaryActions;

        public Ends(AccessLevel accessLevel, List list, List list2, ConversationKitResult conversationKitResult, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : accessLevel, (i11 & 2) != 0 ? n0.f26529a : list, (i11 & 4) != 0 ? n0.f26529a : list2, (i11 & 8) != 0 ? new ConversationKitResult.Failure(ConversationKitError.NoResultReceived.INSTANCE) : conversationKitResult);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ends copy$default(Ends ends, AccessLevel accessLevel, List list, List list2, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                accessLevel = ends.newAccessLevel;
            }
            if ((i11 & 2) != 0) {
                list = ends.events;
            }
            if ((i11 & 4) != 0) {
                list2 = ends.supplementaryActions;
            }
            if ((i11 & 8) != 0) {
                conversationKitResult = ends.result;
            }
            return ends.copy(accessLevel, list, list2, conversationKitResult);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AccessLevel getNewAccessLevel() {
            return this.newAccessLevel;
        }

        @NotNull
        public final List<ConversationKitEvent> component2() {
            return this.events;
        }

        @NotNull
        public final List<Action> component3() {
            return this.supplementaryActions;
        }

        @NotNull
        public final ConversationKitResult<Object> component4() {
            return this.result;
        }

        @NotNull
        public final Ends copy(@Nullable AccessLevel newAccessLevel, @NotNull List<? extends ConversationKitEvent> events, @NotNull List<? extends Action> supplementaryActions, @NotNull ConversationKitResult<? extends Object> result) {
            events.getClass();
            supplementaryActions.getClass();
            result.getClass();
            return new Ends(newAccessLevel, events, supplementaryActions, result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ends)) {
                return false;
            }
            Ends ends = (Ends) other;
            return Intrinsics.areEqual(this.newAccessLevel, ends.newAccessLevel) && Intrinsics.areEqual(this.events, ends.events) && Intrinsics.areEqual(this.supplementaryActions, ends.supplementaryActions) && Intrinsics.areEqual(this.result, ends.result);
        }

        @Override // zendesk.conversationkit.android.internal.EffectProcessorResult
        @NotNull
        public List<ConversationKitEvent> getEvents() {
            return this.events;
        }

        @Override // zendesk.conversationkit.android.internal.EffectProcessorResult
        @Nullable
        public AccessLevel getNewAccessLevel() {
            return this.newAccessLevel;
        }

        @NotNull
        public final ConversationKitResult<Object> getResult() {
            return this.result;
        }

        @Override // zendesk.conversationkit.android.internal.EffectProcessorResult
        @NotNull
        public List<Action> getSupplementaryActions() {
            return this.supplementaryActions;
        }

        public int hashCode() {
            AccessLevel accessLevel = this.newAccessLevel;
            return this.result.hashCode() + e0.f.c(this.supplementaryActions, e0.f.c(this.events, (accessLevel == null ? 0 : accessLevel.hashCode()) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "Ends(newAccessLevel=" + this.newAccessLevel + ", events=" + this.events + ", supplementaryActions=" + this.supplementaryActions + ", result=" + this.result + ")";
        }

        public Ends() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ends(@Nullable AccessLevel accessLevel, @NotNull List<? extends ConversationKitEvent> list, @NotNull List<? extends Action> list2, @NotNull ConversationKitResult<? extends Object> conversationKitResult) {
            super(accessLevel, list, list2, null);
            list.getClass();
            list2.getClass();
            conversationKitResult.getClass();
            this.newAccessLevel = accessLevel;
            this.events = list;
            this.supplementaryActions = list2;
            this.result = conversationKitResult;
        }
    }
}
