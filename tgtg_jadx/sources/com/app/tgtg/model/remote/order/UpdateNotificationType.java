package com.app.tgtg.model.remote.order;

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
@h(with = UpdateNotificationTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/order/UpdateNotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "INVENTORY_CHANGED", "PICKUP_WINDOW_CHANGED", "CANCELLED_BY_CHARITY", "CANCELLED_BY_STORE", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UpdateNotificationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UpdateNotificationType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final UpdateNotificationType INVENTORY_CHANGED = new UpdateNotificationType("INVENTORY_CHANGED", 0);
    public static final UpdateNotificationType PICKUP_WINDOW_CHANGED = new UpdateNotificationType("PICKUP_WINDOW_CHANGED", 1);
    public static final UpdateNotificationType CANCELLED_BY_CHARITY = new UpdateNotificationType("CANCELLED_BY_CHARITY", 2);
    public static final UpdateNotificationType CANCELLED_BY_STORE = new UpdateNotificationType("CANCELLED_BY_STORE", 3);
    public static final UpdateNotificationType UNKNOWN = new UpdateNotificationType("UNKNOWN", 4);

    private static final /* synthetic */ UpdateNotificationType[] $values() {
        return new UpdateNotificationType[]{INVENTORY_CHANGED, PICKUP_WINDOW_CHANGED, CANCELLED_BY_CHARITY, CANCELLED_BY_STORE, UNKNOWN};
    }

    static {
        UpdateNotificationType[] updateNotificationTypeArr$values = $values();
        $VALUES = updateNotificationTypeArr$values;
        $ENTRIES = n.w(updateNotificationTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private UpdateNotificationType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static UpdateNotificationType valueOf(String str) {
        return (UpdateNotificationType) Enum.valueOf(UpdateNotificationType.class, str);
    }

    public static UpdateNotificationType[] values() {
        return (UpdateNotificationType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/UpdateNotificationType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/UpdateNotificationType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UpdateNotificationTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
