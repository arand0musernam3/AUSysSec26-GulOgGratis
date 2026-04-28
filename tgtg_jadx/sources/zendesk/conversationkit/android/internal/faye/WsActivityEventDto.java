package zendesk.conversationkit.android.internal.faye;

import e0.f;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002.-B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;", "", "", "role", "type", "appUserId", "Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;", Bayeux.KEY_DATA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;)Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRole", "getType", "getAppUserId", "Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;", "getData", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WsActivityEventDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String appUserId;

    @NotNull
    private final WsActivityEventDataDto data;

    @NotNull
    private final String role;

    @NotNull
    private final String type;

    public /* synthetic */ WsActivityEventDto(int i11, String str, String str2, String str3, WsActivityEventDataDto wsActivityEventDataDto, m1 m1Var) {
        if (11 != (i11 & 11)) {
            c1.j(i11, 11, WsActivityEventDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.role = str;
        this.type = str2;
        if ((i11 & 4) == 0) {
            this.appUserId = null;
        } else {
            this.appUserId = str3;
        }
        this.data = wsActivityEventDataDto;
    }

    public static /* synthetic */ WsActivityEventDto copy$default(WsActivityEventDto wsActivityEventDto, String str, String str2, String str3, WsActivityEventDataDto wsActivityEventDataDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsActivityEventDto.role;
        }
        if ((i11 & 2) != 0) {
            str2 = wsActivityEventDto.type;
        }
        if ((i11 & 4) != 0) {
            str3 = wsActivityEventDto.appUserId;
        }
        if ((i11 & 8) != 0) {
            wsActivityEventDataDto = wsActivityEventDto.data;
        }
        return wsActivityEventDto.copy(str, str2, str3, wsActivityEventDataDto);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(WsActivityEventDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.role);
        output.q(serialDesc, 1, self.type);
        if (output.C(serialDesc) || self.appUserId != null) {
            output.r(serialDesc, 2, r1.f29848a, self.appUserId);
        }
        output.i(serialDesc, 3, WsActivityEventDataDto$$serializer.INSTANCE, self.data);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppUserId() {
        return this.appUserId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WsActivityEventDataDto getData() {
        return this.data;
    }

    @NotNull
    public final WsActivityEventDto copy(@NotNull String role, @NotNull String type, @Nullable String appUserId, @NotNull WsActivityEventDataDto data) {
        role.getClass();
        type.getClass();
        data.getClass();
        return new WsActivityEventDto(role, type, appUserId, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsActivityEventDto)) {
            return false;
        }
        WsActivityEventDto wsActivityEventDto = (WsActivityEventDto) other;
        return Intrinsics.areEqual(this.role, wsActivityEventDto.role) && Intrinsics.areEqual(this.type, wsActivityEventDto.type) && Intrinsics.areEqual(this.appUserId, wsActivityEventDto.appUserId) && Intrinsics.areEqual(this.data, wsActivityEventDto.data);
    }

    @Nullable
    public final String getAppUserId() {
        return this.appUserId;
    }

    @NotNull
    public final WsActivityEventDataDto getData() {
        return this.data;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iB = l1.b(this.role.hashCode() * 31, 31, this.type);
        String str = this.appUserId;
        return this.data.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.role;
        String str2 = this.type;
        String str3 = this.appUserId;
        WsActivityEventDataDto wsActivityEventDataDto = this.data;
        StringBuilder sbT = f.t("WsActivityEventDto(role=", str, ", type=", str2, ", appUserId=");
        sbT.append(str3);
        sbT.append(", data=");
        sbT.append(wsActivityEventDataDto);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return WsActivityEventDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WsActivityEventDto(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull WsActivityEventDataDto wsActivityEventDataDto) {
        str.getClass();
        str2.getClass();
        wsActivityEventDataDto.getClass();
        this.role = str;
        this.type = str2;
        this.appUserId = str3;
        this.data = wsActivityEventDataDto;
    }

    public /* synthetic */ WsActivityEventDto(String str, String str2, String str3, WsActivityEventDataDto wsActivityEventDataDto, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, wsActivityEventDataDto);
    }
}
