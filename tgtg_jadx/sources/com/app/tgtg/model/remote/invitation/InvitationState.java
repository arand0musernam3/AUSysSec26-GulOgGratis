package com.app.tgtg.model.remote.invitation;

import a80.a;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = InvitationStateSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/app/tgtg/model/remote/invitation/InvitationState;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "DISABLED", "ACCEPTED", "REGRETTED", "FULFILLED", "SYSTEM_DISABLED", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InvitationState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InvitationState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final InvitationState PENDING = new InvitationState("PENDING", 0);
    public static final InvitationState DISABLED = new InvitationState("DISABLED", 1);
    public static final InvitationState ACCEPTED = new InvitationState("ACCEPTED", 2);
    public static final InvitationState REGRETTED = new InvitationState("REGRETTED", 3);
    public static final InvitationState FULFILLED = new InvitationState("FULFILLED", 4);
    public static final InvitationState SYSTEM_DISABLED = new InvitationState("SYSTEM_DISABLED", 5);
    public static final InvitationState UNKNOWN = new InvitationState("UNKNOWN", 6);

    private static final /* synthetic */ InvitationState[] $values() {
        return new InvitationState[]{PENDING, DISABLED, ACCEPTED, REGRETTED, FULFILLED, SYSTEM_DISABLED, UNKNOWN};
    }

    static {
        InvitationState[] invitationStateArr$values = $values();
        $VALUES = invitationStateArr$values;
        $ENTRIES = n.w(invitationStateArr$values);
        INSTANCE = new Companion(null);
    }

    private InvitationState(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static InvitationState valueOf(String str) {
        return (InvitationState) Enum.valueOf(InvitationState.class, str);
    }

    public static InvitationState[] values() {
        return (InvitationState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/invitation/InvitationState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/invitation/InvitationState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return InvitationStateSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
