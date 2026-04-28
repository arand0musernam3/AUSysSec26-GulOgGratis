package zendesk.analyticskit.android.model;

import b3.i;
import e0.f;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;
import yu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jj\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b7\u0010\"R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b8\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b:\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010)¨\u0006@"}, d2 = {"Lzendesk/analyticskit/android/model/Value;", "", "", "operatingSystemVersion", "channelName", "", "multiConvoEnabled", "canUserCreateMoreConversations", "canUserSeeConversationList", "device", "userType", "source", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "valueType", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/model/AnalyticsValueType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/model/AnalyticsValueType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_analyticskit_analyticskit_android", "(Lzendesk/analyticskit/android/model/Value;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "component9", "()Lzendesk/analyticskit/android/model/AnalyticsValueType;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/model/AnalyticsValueType;)Lzendesk/analyticskit/android/model/Value;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOperatingSystemVersion", "getChannelName", "Z", "getMultiConvoEnabled", "getCanUserCreateMoreConversations", "getCanUserSeeConversationList", "getDevice", "getUserType", "getSource", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "getValueType", "Companion", "$serializer", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Value {
    private final boolean canUserCreateMoreConversations;
    private final boolean canUserSeeConversationList;

    @NotNull
    private final String channelName;

    @NotNull
    private final String device;
    private final boolean multiConvoEnabled;

    @NotNull
    private final String operatingSystemVersion;

    @NotNull
    private final String source;

    @NotNull
    private final String userType;

    @NotNull
    private final AnalyticsValueType valueType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new a(16))};

    public /* synthetic */ Value(int i11, String str, String str2, boolean z11, boolean z12, boolean z13, String str3, String str4, String str5, AnalyticsValueType analyticsValueType, m1 m1Var) {
        if (511 != (i11 & 511)) {
            c1.j(i11, 511, Value$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.operatingSystemVersion = str;
        this.channelName = str2;
        this.multiConvoEnabled = z11;
        this.canUserCreateMoreConversations = z12;
        this.canUserSeeConversationList = z13;
        this.device = str3;
        this.userType = str4;
        this.source = str5;
        this.valueType = analyticsValueType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AnalyticsValueType.INSTANCE.serializer();
    }

    public static /* synthetic */ Value copy$default(Value value, String str, String str2, boolean z11, boolean z12, boolean z13, String str3, String str4, String str5, AnalyticsValueType analyticsValueType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = value.operatingSystemVersion;
        }
        if ((i11 & 2) != 0) {
            str2 = value.channelName;
        }
        if ((i11 & 4) != 0) {
            z11 = value.multiConvoEnabled;
        }
        if ((i11 & 8) != 0) {
            z12 = value.canUserCreateMoreConversations;
        }
        if ((i11 & 16) != 0) {
            z13 = value.canUserSeeConversationList;
        }
        if ((i11 & 32) != 0) {
            str3 = value.device;
        }
        if ((i11 & 64) != 0) {
            str4 = value.userType;
        }
        if ((i11 & 128) != 0) {
            str5 = value.source;
        }
        if ((i11 & 256) != 0) {
            analyticsValueType = value.valueType;
        }
        String str6 = str5;
        AnalyticsValueType analyticsValueType2 = analyticsValueType;
        String str7 = str3;
        String str8 = str4;
        boolean z14 = z13;
        boolean z15 = z11;
        return value.copy(str, str2, z15, z12, z14, str7, str8, str6, analyticsValueType2);
    }

    public static final /* synthetic */ void write$Self$zendesk_analyticskit_analyticskit_android(Value self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.operatingSystemVersion);
        output.q(serialDesc, 1, self.channelName);
        output.p(serialDesc, 2, self.multiConvoEnabled);
        output.p(serialDesc, 3, self.canUserCreateMoreConversations);
        output.p(serialDesc, 4, self.canUserSeeConversationList);
        output.q(serialDesc, 5, self.device);
        output.q(serialDesc, 6, self.userType);
        output.q(serialDesc, 7, self.source);
        output.i(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.valueType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMultiConvoEnabled() {
        return this.multiConvoEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCanUserSeeConversationList() {
        return this.canUserSeeConversationList;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AnalyticsValueType getValueType() {
        return this.valueType;
    }

    @NotNull
    public final Value copy(@NotNull String operatingSystemVersion, @NotNull String channelName, boolean multiConvoEnabled, boolean canUserCreateMoreConversations, boolean canUserSeeConversationList, @NotNull String device, @NotNull String userType, @NotNull String source, @NotNull AnalyticsValueType valueType) {
        i.B(operatingSystemVersion, channelName, device, userType, source);
        valueType.getClass();
        return new Value(operatingSystemVersion, channelName, multiConvoEnabled, canUserCreateMoreConversations, canUserSeeConversationList, device, userType, source, valueType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Value)) {
            return false;
        }
        Value value = (Value) other;
        return Intrinsics.areEqual(this.operatingSystemVersion, value.operatingSystemVersion) && Intrinsics.areEqual(this.channelName, value.channelName) && this.multiConvoEnabled == value.multiConvoEnabled && this.canUserCreateMoreConversations == value.canUserCreateMoreConversations && this.canUserSeeConversationList == value.canUserSeeConversationList && Intrinsics.areEqual(this.device, value.device) && Intrinsics.areEqual(this.userType, value.userType) && Intrinsics.areEqual(this.source, value.source) && Intrinsics.areEqual(this.valueType, value.valueType);
    }

    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    public final boolean getCanUserSeeConversationList() {
        return this.canUserSeeConversationList;
    }

    @NotNull
    public final String getChannelName() {
        return this.channelName;
    }

    @NotNull
    public final String getDevice() {
        return this.device;
    }

    public final boolean getMultiConvoEnabled() {
        return this.multiConvoEnabled;
    }

    @NotNull
    public final String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getUserType() {
        return this.userType;
    }

    @NotNull
    public final AnalyticsValueType getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        return this.valueType.hashCode() + l1.b(l1.b(l1.b(k.e(k.e(k.e(l1.b(this.operatingSystemVersion.hashCode() * 31, 31, this.channelName), 31, this.multiConvoEnabled), 31, this.canUserCreateMoreConversations), 31, this.canUserSeeConversationList), 31, this.device), 31, this.userType), 31, this.source);
    }

    @NotNull
    public String toString() {
        String str = this.operatingSystemVersion;
        String str2 = this.channelName;
        boolean z11 = this.multiConvoEnabled;
        boolean z12 = this.canUserCreateMoreConversations;
        boolean z13 = this.canUserSeeConversationList;
        String str3 = this.device;
        String str4 = this.userType;
        String str5 = this.source;
        AnalyticsValueType analyticsValueType = this.valueType;
        StringBuilder sbT = f.t("Value(operatingSystemVersion=", str, ", channelName=", str2, ", multiConvoEnabled=");
        i.C(sbT, z11, ", canUserCreateMoreConversations=", z12, ", canUserSeeConversationList=");
        sbT.append(z13);
        sbT.append(", device=");
        sbT.append(str3);
        sbT.append(", userType=");
        s.A(sbT, str4, ", source=", str5, ", valueType=");
        sbT.append(analyticsValueType);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/analyticskit/android/model/Value$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/analyticskit/android/model/Value;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Value$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Value(@NotNull String str, @NotNull String str2, boolean z11, boolean z12, boolean z13, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull AnalyticsValueType analyticsValueType) {
        i.B(str, str2, str3, str4, str5);
        analyticsValueType.getClass();
        this.operatingSystemVersion = str;
        this.channelName = str2;
        this.multiConvoEnabled = z11;
        this.canUserCreateMoreConversations = z12;
        this.canUserSeeConversationList = z13;
        this.device = str3;
        this.userType = str4;
        this.source = str5;
        this.valueType = analyticsValueType;
    }
}
