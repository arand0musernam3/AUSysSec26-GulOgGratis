package com.braze.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/braze/events/SessionStateChangedEvent;", "", "sessionId", "", "eventType", "Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "<init>", "(Ljava/lang/String;Lcom/braze/events/SessionStateChangedEvent$ChangeType;)V", "getSessionId", "()Ljava/lang/String;", "getEventType", "()Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "ChangeType", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionStateChangedEvent {
    private final ChangeType eventType;
    private final String sessionId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "", "<init>", "(Ljava/lang/String;I)V", "SESSION_STARTED", "SESSION_ENDED", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChangeType {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ ChangeType[] $VALUES;
        public static final ChangeType SESSION_STARTED = new ChangeType("SESSION_STARTED", 0);
        public static final ChangeType SESSION_ENDED = new ChangeType("SESSION_ENDED", 1);

        private static final /* synthetic */ ChangeType[] $values() {
            return new ChangeType[]{SESSION_STARTED, SESSION_ENDED};
        }

        static {
            ChangeType[] changeTypeArr$values = $values();
            $VALUES = changeTypeArr$values;
            $ENTRIES = n.w(changeTypeArr$values);
        }

        private ChangeType(String str, int i11) {
        }

        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static ChangeType valueOf(String str) {
            return (ChangeType) Enum.valueOf(ChangeType.class, str);
        }

        public static ChangeType[] values() {
            return (ChangeType[]) $VALUES.clone();
        }
    }

    public SessionStateChangedEvent(String str, ChangeType changeType) {
        str.getClass();
        changeType.getClass();
        this.sessionId = str;
        this.eventType = changeType;
    }

    public static /* synthetic */ SessionStateChangedEvent copy$default(SessionStateChangedEvent sessionStateChangedEvent, String str, ChangeType changeType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionStateChangedEvent.sessionId;
        }
        if ((i11 & 2) != 0) {
            changeType = sessionStateChangedEvent.eventType;
        }
        return sessionStateChangedEvent.copy(str, changeType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChangeType getEventType() {
        return this.eventType;
    }

    public final SessionStateChangedEvent copy(String sessionId, ChangeType eventType) {
        sessionId.getClass();
        eventType.getClass();
        return new SessionStateChangedEvent(sessionId, eventType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionStateChangedEvent)) {
            return false;
        }
        SessionStateChangedEvent sessionStateChangedEvent = (SessionStateChangedEvent) other;
        return Intrinsics.areEqual(this.sessionId, sessionStateChangedEvent.sessionId) && this.eventType == sessionStateChangedEvent.eventType;
    }

    public final ChangeType getEventType() {
        return this.eventType;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.eventType.hashCode() + (this.sessionId.hashCode() * 31);
    }

    public String toString() {
        return "SessionStateChangedEvent{sessionId='" + this.sessionId + "', eventType='" + this.eventType + "'}'";
    }
}
