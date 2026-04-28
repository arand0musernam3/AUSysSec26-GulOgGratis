package zendesk.ui.android.common.connectionbanner;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0017J\u000e\u0010\u0018\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001bJ;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006$"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState;", "", "connectionState", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "labelColor", "", "backgroundColor", "successBackgroundColor", "onSuccessColor", "<init>", "(Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;IIII)V", "getConnectionState$zendesk_ui_ui_android", "()Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "getLabelColor$zendesk_ui_ui_android", "()I", "getBackgroundColor$zendesk_ui_ui_android", "getSuccessBackgroundColor$zendesk_ui_ui_android", "getOnSuccessColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "", "ConnectionState", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConnectionBannerState {
    public static final int $stable = 0;
    private final int backgroundColor;

    @NotNull
    private final ConnectionState connectionState;
    private final int labelColor;
    private final int onSuccessColor;
    private final int successBackgroundColor;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ConnectionBannerState(zendesk.ui.android.common.connectionbanner.ConnectionBannerState.ConnectionState r2, int r3, int r4, int r5, int r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            zendesk.ui.android.common.connectionbanner.ConnectionBannerState$ConnectionState$Connected r2 = zendesk.ui.android.common.connectionbanner.ConnectionBannerState.ConnectionState.Connected.INSTANCE
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.common.connectionbanner.ConnectionBannerState.<init>(zendesk.ui.android.common.connectionbanner.ConnectionBannerState$ConnectionState, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ ConnectionBannerState copy$default(ConnectionBannerState connectionBannerState, ConnectionState connectionState, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            connectionState = connectionBannerState.connectionState;
        }
        if ((i15 & 2) != 0) {
            i11 = connectionBannerState.labelColor;
        }
        if ((i15 & 4) != 0) {
            i12 = connectionBannerState.backgroundColor;
        }
        if ((i15 & 8) != 0) {
            i13 = connectionBannerState.successBackgroundColor;
        }
        if ((i15 & 16) != 0) {
            i14 = connectionBannerState.onSuccessColor;
        }
        int i16 = i14;
        int i17 = i12;
        return connectionBannerState.copy(connectionState, i11, i17, i13, i16);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final ConnectionState getConnectionState() {
        return this.connectionState;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getSuccessBackgroundColor() {
        return this.successBackgroundColor;
    }

    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final int getOnSuccessColor() {
        return this.onSuccessColor;
    }

    @NotNull
    public final ConnectionBannerState copy(@NotNull ConnectionState connectionState, int labelColor, int backgroundColor, int successBackgroundColor, int onSuccessColor) {
        connectionState.getClass();
        return new ConnectionBannerState(connectionState, labelColor, backgroundColor, successBackgroundColor, onSuccessColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionBannerState)) {
            return false;
        }
        ConnectionBannerState connectionBannerState = (ConnectionBannerState) other;
        return Intrinsics.areEqual(this.connectionState, connectionBannerState.connectionState) && this.labelColor == connectionBannerState.labelColor && this.backgroundColor == connectionBannerState.backgroundColor && this.successBackgroundColor == connectionBannerState.successBackgroundColor && this.onSuccessColor == connectionBannerState.onSuccessColor;
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    @NotNull
    public final ConnectionState getConnectionState$zendesk_ui_ui_android() {
        return this.connectionState;
    }

    public final int getLabelColor$zendesk_ui_ui_android() {
        return this.labelColor;
    }

    public final int getOnSuccessColor$zendesk_ui_ui_android() {
        return this.onSuccessColor;
    }

    public final int getSuccessBackgroundColor$zendesk_ui_ui_android() {
        return this.successBackgroundColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.onSuccessColor) + k.b(this.successBackgroundColor, k.b(this.backgroundColor, k.b(this.labelColor, this.connectionState.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        ConnectionState connectionState = this.connectionState;
        int i11 = this.labelColor;
        int i12 = this.backgroundColor;
        int i13 = this.successBackgroundColor;
        int i14 = this.onSuccessColor;
        StringBuilder sb2 = new StringBuilder("ConnectionBannerState(connectionState=");
        sb2.append(connectionState);
        sb2.append(", labelColor=");
        sb2.append(i11);
        sb2.append(", backgroundColor=");
        f.C(sb2, i12, ", successBackgroundColor=", i13, ", onSuccessColor=");
        return k.i(i14, ")", sb2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "", "stateValue", "", "<init>", "(Ljava/lang/String;)V", "getStateValue", "()Ljava/lang/String;", "Reconnecting", "Reconnected", "Disconnected", "Connected", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState$Connected;", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState$Disconnected;", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState$Reconnected;", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState$Reconnecting;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ConnectionState {
        public static final int $stable = 0;

        @NotNull
        private final String stateValue;

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState$Connected;", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "<init>", "()V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Connected extends ConnectionState {
            public static final int $stable = 0;

            @NotNull
            public static final Connected INSTANCE = new Connected();

            private Connected() {
                super("Connected", null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState$Disconnected;", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "<init>", "()V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Disconnected extends ConnectionState {
            public static final int $stable = 0;

            @NotNull
            public static final Disconnected INSTANCE = new Disconnected();

            private Disconnected() {
                super("Disconnected", null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState$Reconnected;", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "<init>", "()V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Reconnected extends ConnectionState {
            public static final int $stable = 0;

            @NotNull
            public static final Reconnected INSTANCE = new Reconnected();

            private Reconnected() {
                super("Reconnected", null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState$Reconnecting;", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "<init>", "()V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Reconnecting extends ConnectionState {
            public static final int $stable = 0;

            @NotNull
            public static final Reconnecting INSTANCE = new Reconnecting();

            private Reconnecting() {
                super("Reconnecting", null);
            }
        }

        private ConnectionState(String str) {
            this.stateValue = str;
        }

        @NotNull
        public final String getStateValue() {
            return this.stateValue;
        }

        public /* synthetic */ ConnectionState(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    public ConnectionBannerState(@NotNull ConnectionState connectionState, int i11, int i12, int i13, int i14) {
        connectionState.getClass();
        this.connectionState = connectionState;
        this.labelColor = i11;
        this.backgroundColor = i12;
        this.successBackgroundColor = i13;
        this.onSuccessColor = i14;
    }

    public ConnectionBannerState() {
        this(null, 0, 0, 0, 0, 31, null);
    }
}
