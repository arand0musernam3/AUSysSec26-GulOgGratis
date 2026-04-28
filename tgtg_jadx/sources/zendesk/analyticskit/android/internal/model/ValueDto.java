package zendesk.analyticskit.android.internal.model;

import b3.i;
import e0.f;
import i90.g;
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
import m90.r1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0002MLB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B¡\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ¦\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bB\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bC\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bD\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bE\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bF\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\bG\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bH\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bI\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bJ\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bK\u0010\u001a¨\u0006N"}, d2 = {"Lzendesk/analyticskit/android/internal/model/ValueDto;", "", "", "valueType", "operatingSystemVersion", "channelName", "", "multiConvoEnabled", "canUserCreateMoreConversations", "canUserSeeConversationList", "device", "userType", "source", "launchType", "size", "senderType", "elementChanged", "exitAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/analyticskit/android/internal/model/ValueDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_analyticskit_analyticskit_android", "(Lzendesk/analyticskit/android/internal/model/ValueDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getValueType", "getOperatingSystemVersion", "getOperatingSystemVersion$annotations", "()V", "getChannelName", "Z", "getMultiConvoEnabled", "getCanUserCreateMoreConversations", "getCanUserSeeConversationList", "getDevice", "getUserType", "getSource", "getLaunchType", "getSize", "getSenderType", "getElementChanged", "getExitAction", "Companion", "$serializer", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ValueDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean canUserCreateMoreConversations;
    private final boolean canUserSeeConversationList;

    @NotNull
    private final String channelName;

    @NotNull
    private final String device;

    @Nullable
    private final String elementChanged;

    @Nullable
    private final String exitAction;

    @Nullable
    private final String launchType;
    private final boolean multiConvoEnabled;

    @NotNull
    private final String operatingSystemVersion;

    @Nullable
    private final String senderType;

    @Nullable
    private final String size;

    @NotNull
    private final String source;

    @NotNull
    private final String userType;

    @NotNull
    private final String valueType;

    public /* synthetic */ ValueDto(int i11, String str, String str2, String str3, boolean z11, boolean z12, boolean z13, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, m1 m1Var) {
        if (511 != (i11 & 511)) {
            c1.j(i11, 511, ValueDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.valueType = str;
        this.operatingSystemVersion = str2;
        this.channelName = str3;
        this.multiConvoEnabled = z11;
        this.canUserCreateMoreConversations = z12;
        this.canUserSeeConversationList = z13;
        this.device = str4;
        this.userType = str5;
        this.source = str6;
        if ((i11 & 512) == 0) {
            this.launchType = null;
        } else {
            this.launchType = str7;
        }
        if ((i11 & 1024) == 0) {
            this.size = null;
        } else {
            this.size = str8;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.senderType = null;
        } else {
            this.senderType = str9;
        }
        if ((i11 & 4096) == 0) {
            this.elementChanged = null;
        } else {
            this.elementChanged = str10;
        }
        if ((i11 & 8192) == 0) {
            this.exitAction = null;
        } else {
            this.exitAction = str11;
        }
    }

    public static final /* synthetic */ void write$Self$zendesk_analyticskit_analyticskit_android(ValueDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.valueType);
        output.q(serialDesc, 1, self.operatingSystemVersion);
        output.q(serialDesc, 2, self.channelName);
        output.p(serialDesc, 3, self.multiConvoEnabled);
        output.p(serialDesc, 4, self.canUserCreateMoreConversations);
        output.p(serialDesc, 5, self.canUserSeeConversationList);
        output.q(serialDesc, 6, self.device);
        output.q(serialDesc, 7, self.userType);
        output.q(serialDesc, 8, self.source);
        if (output.C(serialDesc) || self.launchType != null) {
            output.r(serialDesc, 9, r1.f29848a, self.launchType);
        }
        if (output.C(serialDesc) || self.size != null) {
            output.r(serialDesc, 10, r1.f29848a, self.size);
        }
        if (output.C(serialDesc) || self.senderType != null) {
            output.r(serialDesc, 11, r1.f29848a, self.senderType);
        }
        if (output.C(serialDesc) || self.elementChanged != null) {
            output.r(serialDesc, 12, r1.f29848a, self.elementChanged);
        }
        if (!output.C(serialDesc) && self.exitAction == null) {
            return;
        }
        output.r(serialDesc, 13, r1.f29848a, self.exitAction);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValueType() {
        return this.valueType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLaunchType() {
        return this.launchType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSenderType() {
        return this.senderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getElementChanged() {
        return this.elementChanged;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getExitAction() {
        return this.exitAction;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getMultiConvoEnabled() {
        return this.multiConvoEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCanUserSeeConversationList() {
        return this.canUserSeeConversationList;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final ValueDto copy(@NotNull String valueType, @NotNull String operatingSystemVersion, @NotNull String channelName, boolean multiConvoEnabled, boolean canUserCreateMoreConversations, boolean canUserSeeConversationList, @NotNull String device, @NotNull String userType, @NotNull String source, @Nullable String launchType, @Nullable String size, @Nullable String senderType, @Nullable String elementChanged, @Nullable String exitAction) {
        i.B(valueType, operatingSystemVersion, channelName, device, userType);
        source.getClass();
        return new ValueDto(valueType, operatingSystemVersion, channelName, multiConvoEnabled, canUserCreateMoreConversations, canUserSeeConversationList, device, userType, source, launchType, size, senderType, elementChanged, exitAction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValueDto)) {
            return false;
        }
        ValueDto valueDto = (ValueDto) other;
        return Intrinsics.areEqual(this.valueType, valueDto.valueType) && Intrinsics.areEqual(this.operatingSystemVersion, valueDto.operatingSystemVersion) && Intrinsics.areEqual(this.channelName, valueDto.channelName) && this.multiConvoEnabled == valueDto.multiConvoEnabled && this.canUserCreateMoreConversations == valueDto.canUserCreateMoreConversations && this.canUserSeeConversationList == valueDto.canUserSeeConversationList && Intrinsics.areEqual(this.device, valueDto.device) && Intrinsics.areEqual(this.userType, valueDto.userType) && Intrinsics.areEqual(this.source, valueDto.source) && Intrinsics.areEqual(this.launchType, valueDto.launchType) && Intrinsics.areEqual(this.size, valueDto.size) && Intrinsics.areEqual(this.senderType, valueDto.senderType) && Intrinsics.areEqual(this.elementChanged, valueDto.elementChanged) && Intrinsics.areEqual(this.exitAction, valueDto.exitAction);
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

    @Nullable
    public final String getElementChanged() {
        return this.elementChanged;
    }

    @Nullable
    public final String getExitAction() {
        return this.exitAction;
    }

    @Nullable
    public final String getLaunchType() {
        return this.launchType;
    }

    public final boolean getMultiConvoEnabled() {
        return this.multiConvoEnabled;
    }

    @NotNull
    public final String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    @Nullable
    public final String getSenderType() {
        return this.senderType;
    }

    @Nullable
    public final String getSize() {
        return this.size;
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
    public final String getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        int iB = l1.b(l1.b(l1.b(k.e(k.e(k.e(l1.b(l1.b(this.valueType.hashCode() * 31, 31, this.operatingSystemVersion), 31, this.channelName), 31, this.multiConvoEnabled), 31, this.canUserCreateMoreConversations), 31, this.canUserSeeConversationList), 31, this.device), 31, this.userType), 31, this.source);
        String str = this.launchType;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.size;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.senderType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.elementChanged;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exitAction;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.valueType;
        String str2 = this.operatingSystemVersion;
        String str3 = this.channelName;
        boolean z11 = this.multiConvoEnabled;
        boolean z12 = this.canUserCreateMoreConversations;
        boolean z13 = this.canUserSeeConversationList;
        String str4 = this.device;
        String str5 = this.userType;
        String str6 = this.source;
        String str7 = this.launchType;
        String str8 = this.size;
        String str9 = this.senderType;
        String str10 = this.elementChanged;
        String str11 = this.exitAction;
        StringBuilder sbT = f.t("ValueDto(valueType=", str, ", operatingSystemVersion=", str2, ", channelName=");
        k.z(sbT, str3, ", multiConvoEnabled=", z11, ", canUserCreateMoreConversations=");
        i.C(sbT, z12, ", canUserSeeConversationList=", z13, ", device=");
        s.A(sbT, str4, ", userType=", str5, ", source=");
        s.A(sbT, str6, ", launchType=", str7, ", size=");
        s.A(sbT, str8, ", senderType=", str9, ", elementChanged=");
        return f.o(sbT, str10, ", exitAction=", str11, ")");
    }

    public ValueDto(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z11, boolean z12, boolean z13, @NotNull String str4, @NotNull String str5, @NotNull String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        i.B(str, str2, str3, str4, str5);
        str6.getClass();
        this.valueType = str;
        this.operatingSystemVersion = str2;
        this.channelName = str3;
        this.multiConvoEnabled = z11;
        this.canUserCreateMoreConversations = z12;
        this.canUserSeeConversationList = z13;
        this.device = str4;
        this.userType = str5;
        this.source = str6;
        this.launchType = str7;
        this.size = str8;
        this.senderType = str9;
        this.elementChanged = str10;
        this.exitAction = str11;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/analyticskit/android/internal/model/ValueDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/analyticskit/android/internal/model/ValueDto;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ValueDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("OSVersion")
    public static /* synthetic */ void getOperatingSystemVersion$annotations() {
    }

    public /* synthetic */ ValueDto(String str, String str2, String str3, boolean z11, boolean z12, boolean z13, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z11, z12, z13, str4, str5, str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str9, (i11 & 4096) != 0 ? null : str10, (i11 & 8192) != 0 ? null : str11);
    }
}
