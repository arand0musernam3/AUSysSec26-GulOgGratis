package zendesk.android.settings.internal.model;

import e0.f;
import i90.g;
import i90.h;
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
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, d2 = {"Lzendesk/android/settings/internal/model/AppDto;", "", "", "id", "status", "name", "Lzendesk/android/settings/internal/model/AppSettingsDto;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/settings/internal/model/AppSettingsDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/settings/internal/model/AppSettingsDto;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/AppDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lzendesk/android/settings/internal/model/AppSettingsDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/settings/internal/model/AppSettingsDto;)Lzendesk/android/settings/internal/model/AppDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getStatus", "getName", "Lzendesk/android/settings/internal/model/AppSettingsDto;", "getSettings", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AppDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @NotNull
    private final AppSettingsDto settings;

    @NotNull
    private final String status;

    public /* synthetic */ AppDto(int i11, String str, String str2, String str3, AppSettingsDto appSettingsDto, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, AppDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.status = str2;
        this.name = str3;
        this.settings = appSettingsDto;
    }

    public static /* synthetic */ AppDto copy$default(AppDto appDto, String str, String str2, String str3, AppSettingsDto appSettingsDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appDto.id;
        }
        if ((i11 & 2) != 0) {
            str2 = appDto.status;
        }
        if ((i11 & 4) != 0) {
            str3 = appDto.name;
        }
        if ((i11 & 8) != 0) {
            appSettingsDto = appDto.settings;
        }
        return appDto.copy(str, str2, str3, appSettingsDto);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(AppDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.status);
        output.q(serialDesc, 2, self.name);
        output.i(serialDesc, 3, AppSettingsDto$$serializer.INSTANCE, self.settings);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AppSettingsDto getSettings() {
        return this.settings;
    }

    @NotNull
    public final AppDto copy(@NotNull String id2, @NotNull String status, @NotNull String name, @NotNull AppSettingsDto settings) {
        id2.getClass();
        status.getClass();
        name.getClass();
        settings.getClass();
        return new AppDto(id2, status, name, settings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppDto)) {
            return false;
        }
        AppDto appDto = (AppDto) other;
        return Intrinsics.areEqual(this.id, appDto.id) && Intrinsics.areEqual(this.status, appDto.status) && Intrinsics.areEqual(this.name, appDto.name) && Intrinsics.areEqual(this.settings, appDto.settings);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final AppSettingsDto getSettings() {
        return this.settings;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.settings.hashCode() + l1.b(l1.b(this.id.hashCode() * 31, 31, this.status), 31, this.name);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.status;
        String str3 = this.name;
        AppSettingsDto appSettingsDto = this.settings;
        StringBuilder sbT = f.t("AppDto(id=", str, ", status=", str2, ", name=");
        sbT.append(str3);
        sbT.append(", settings=");
        sbT.append(appSettingsDto);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/AppDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/AppDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AppDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("_id")
    public static /* synthetic */ void getId$annotations() {
    }

    public AppDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull AppSettingsDto appSettingsDto) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        appSettingsDto.getClass();
        this.id = str;
        this.status = str2;
        this.name = str3;
        this.settings = appSettingsDto;
    }
}
