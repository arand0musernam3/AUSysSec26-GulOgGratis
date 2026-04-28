package com.app.tgtg.model.remote.badge;

import a80.a;
import com.adyen.checkout.googlepay.AllowedCardNetworks;
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
@h(with = BadgeCTADestinationSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/badge/BadgeCTADestination;", "", "<init>", "(Ljava/lang/String;I)V", AllowedCardNetworks.DISCOVER, "NOTIFICATION_SETTINGS", "ORDER_LIST", "ADD_TO_FAVORITES", "MAGIC_PARCEL", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadgeCTADestination {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BadgeCTADestination[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final BadgeCTADestination DISCOVER = new BadgeCTADestination(AllowedCardNetworks.DISCOVER, 0);
    public static final BadgeCTADestination NOTIFICATION_SETTINGS = new BadgeCTADestination("NOTIFICATION_SETTINGS", 1);
    public static final BadgeCTADestination ORDER_LIST = new BadgeCTADestination("ORDER_LIST", 2);
    public static final BadgeCTADestination ADD_TO_FAVORITES = new BadgeCTADestination("ADD_TO_FAVORITES", 3);
    public static final BadgeCTADestination MAGIC_PARCEL = new BadgeCTADestination("MAGIC_PARCEL", 4);
    public static final BadgeCTADestination UNKNOWN = new BadgeCTADestination("UNKNOWN", 5);

    private static final /* synthetic */ BadgeCTADestination[] $values() {
        return new BadgeCTADestination[]{DISCOVER, NOTIFICATION_SETTINGS, ORDER_LIST, ADD_TO_FAVORITES, MAGIC_PARCEL, UNKNOWN};
    }

    static {
        BadgeCTADestination[] badgeCTADestinationArr$values = $values();
        $VALUES = badgeCTADestinationArr$values;
        $ENTRIES = n.w(badgeCTADestinationArr$values);
        INSTANCE = new Companion(null);
    }

    private BadgeCTADestination(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static BadgeCTADestination valueOf(String str) {
        return (BadgeCTADestination) Enum.valueOf(BadgeCTADestination.class, str);
    }

    public static BadgeCTADestination[] values() {
        return (BadgeCTADestination[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/badge/BadgeCTADestination$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/badge/BadgeCTADestination;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BadgeCTADestinationSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
