package com.braze.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/braze/events/BrazeUserChangeEvent;", "", "currentUserId", "", "<init>", "(Ljava/lang/String;)V", "getCurrentUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BrazeUserChangeEvent {
    private final String currentUserId;

    public BrazeUserChangeEvent(String str) {
        str.getClass();
        this.currentUserId = str;
    }

    public static /* synthetic */ BrazeUserChangeEvent copy$default(BrazeUserChangeEvent brazeUserChangeEvent, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = brazeUserChangeEvent.currentUserId;
        }
        return brazeUserChangeEvent.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    public final BrazeUserChangeEvent copy(String currentUserId) {
        currentUserId.getClass();
        return new BrazeUserChangeEvent(currentUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BrazeUserChangeEvent) && Intrinsics.areEqual(this.currentUserId, ((BrazeUserChangeEvent) other).currentUserId);
    }

    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    public int hashCode() {
        return this.currentUserId.hashCode();
    }

    public String toString() {
        return a0.p("BrazeUserChangeEvent(currentUserId=", this.currentUserId, ")");
    }
}
