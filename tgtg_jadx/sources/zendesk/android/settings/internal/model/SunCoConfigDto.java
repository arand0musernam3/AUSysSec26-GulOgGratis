package zendesk.android.settings.internal.model;

import a3.c0;
import e0.f;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b%\u0010&JH\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010&¨\u0006>"}, d2 = {"Lzendesk/android/settings/internal/model/SunCoConfigDto;", "", "Lzendesk/android/settings/internal/model/AppDto;", "app", "Lzendesk/android/settings/internal/model/BaseUrlDto;", "baseUrl", "Lzendesk/android/settings/internal/model/IntegrationDto;", "integration", "Lzendesk/android/settings/internal/model/RestRetryPolicyDto;", "restRetryPolicy", "", "Lzendesk/android/settings/internal/model/ChannelIntegration;", "integrations", "<init>", "(Lzendesk/android/settings/internal/model/AppDto;Lzendesk/android/settings/internal/model/BaseUrlDto;Lzendesk/android/settings/internal/model/IntegrationDto;Lzendesk/android/settings/internal/model/RestRetryPolicyDto;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/android/settings/internal/model/AppDto;Lzendesk/android/settings/internal/model/BaseUrlDto;Lzendesk/android/settings/internal/model/IntegrationDto;Lzendesk/android/settings/internal/model/RestRetryPolicyDto;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/SunCoConfigDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/android/settings/internal/model/AppDto;", "component2", "()Lzendesk/android/settings/internal/model/BaseUrlDto;", "component3", "()Lzendesk/android/settings/internal/model/IntegrationDto;", "component4", "()Lzendesk/android/settings/internal/model/RestRetryPolicyDto;", "component5", "()Ljava/util/List;", "copy", "(Lzendesk/android/settings/internal/model/AppDto;Lzendesk/android/settings/internal/model/BaseUrlDto;Lzendesk/android/settings/internal/model/IntegrationDto;Lzendesk/android/settings/internal/model/RestRetryPolicyDto;Ljava/util/List;)Lzendesk/android/settings/internal/model/SunCoConfigDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/android/settings/internal/model/AppDto;", "getApp", "Lzendesk/android/settings/internal/model/BaseUrlDto;", "getBaseUrl", "Lzendesk/android/settings/internal/model/IntegrationDto;", "getIntegration", "Lzendesk/android/settings/internal/model/RestRetryPolicyDto;", "getRestRetryPolicy", "Ljava/util/List;", "getIntegrations", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SunCoConfigDto {

    @NotNull
    private final AppDto app;

    @NotNull
    private final BaseUrlDto baseUrl;

    @NotNull
    private final IntegrationDto integration;

    @NotNull
    private final List<ChannelIntegration> integrations;

    @NotNull
    private final RestRetryPolicyDto restRetryPolicy;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, l.a(m.PUBLICATION, new c0(6))};

    public /* synthetic */ SunCoConfigDto(int i11, AppDto appDto, BaseUrlDto baseUrlDto, IntegrationDto integrationDto, RestRetryPolicyDto restRetryPolicyDto, List list, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, SunCoConfigDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.app = appDto;
        this.baseUrl = baseUrlDto;
        this.integration = integrationDto;
        this.restRetryPolicy = restRetryPolicyDto;
        this.integrations = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ChannelIntegration$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SunCoConfigDto copy$default(SunCoConfigDto sunCoConfigDto, AppDto appDto, BaseUrlDto baseUrlDto, IntegrationDto integrationDto, RestRetryPolicyDto restRetryPolicyDto, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            appDto = sunCoConfigDto.app;
        }
        if ((i11 & 2) != 0) {
            baseUrlDto = sunCoConfigDto.baseUrl;
        }
        if ((i11 & 4) != 0) {
            integrationDto = sunCoConfigDto.integration;
        }
        if ((i11 & 8) != 0) {
            restRetryPolicyDto = sunCoConfigDto.restRetryPolicy;
        }
        if ((i11 & 16) != 0) {
            list = sunCoConfigDto.integrations;
        }
        List list2 = list;
        IntegrationDto integrationDto2 = integrationDto;
        return sunCoConfigDto.copy(appDto, baseUrlDto, integrationDto2, restRetryPolicyDto, list2);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(SunCoConfigDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, AppDto$$serializer.INSTANCE, self.app);
        output.i(serialDesc, 1, BaseUrlDto$$serializer.INSTANCE, self.baseUrl);
        output.i(serialDesc, 2, IntegrationDto$$serializer.INSTANCE, self.integration);
        output.i(serialDesc, 3, RestRetryPolicyDto$$serializer.INSTANCE, self.restRetryPolicy);
        output.i(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.integrations);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppDto getApp() {
        return this.app;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BaseUrlDto getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IntegrationDto getIntegration() {
        return this.integration;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RestRetryPolicyDto getRestRetryPolicy() {
        return this.restRetryPolicy;
    }

    @NotNull
    public final List<ChannelIntegration> component5() {
        return this.integrations;
    }

    @NotNull
    public final SunCoConfigDto copy(@NotNull AppDto app2, @NotNull BaseUrlDto baseUrl, @NotNull IntegrationDto integration, @NotNull RestRetryPolicyDto restRetryPolicy, @NotNull List<ChannelIntegration> integrations) {
        app2.getClass();
        baseUrl.getClass();
        integration.getClass();
        restRetryPolicy.getClass();
        integrations.getClass();
        return new SunCoConfigDto(app2, baseUrl, integration, restRetryPolicy, integrations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SunCoConfigDto)) {
            return false;
        }
        SunCoConfigDto sunCoConfigDto = (SunCoConfigDto) other;
        return Intrinsics.areEqual(this.app, sunCoConfigDto.app) && Intrinsics.areEqual(this.baseUrl, sunCoConfigDto.baseUrl) && Intrinsics.areEqual(this.integration, sunCoConfigDto.integration) && Intrinsics.areEqual(this.restRetryPolicy, sunCoConfigDto.restRetryPolicy) && Intrinsics.areEqual(this.integrations, sunCoConfigDto.integrations);
    }

    @NotNull
    public final AppDto getApp() {
        return this.app;
    }

    @NotNull
    public final BaseUrlDto getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    public final IntegrationDto getIntegration() {
        return this.integration;
    }

    @NotNull
    public final List<ChannelIntegration> getIntegrations() {
        return this.integrations;
    }

    @NotNull
    public final RestRetryPolicyDto getRestRetryPolicy() {
        return this.restRetryPolicy;
    }

    public int hashCode() {
        return this.integrations.hashCode() + ((this.restRetryPolicy.hashCode() + ((this.integration.hashCode() + ((this.baseUrl.hashCode() + (this.app.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        AppDto appDto = this.app;
        BaseUrlDto baseUrlDto = this.baseUrl;
        IntegrationDto integrationDto = this.integration;
        RestRetryPolicyDto restRetryPolicyDto = this.restRetryPolicy;
        List<ChannelIntegration> list = this.integrations;
        StringBuilder sb2 = new StringBuilder("SunCoConfigDto(app=");
        sb2.append(appDto);
        sb2.append(", baseUrl=");
        sb2.append(baseUrlDto);
        sb2.append(", integration=");
        sb2.append(integrationDto);
        sb2.append(", restRetryPolicy=");
        sb2.append(restRetryPolicyDto);
        sb2.append(", integrations=");
        return f.p(sb2, list, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/SunCoConfigDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/SunCoConfigDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SunCoConfigDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SunCoConfigDto(@NotNull AppDto appDto, @NotNull BaseUrlDto baseUrlDto, @NotNull IntegrationDto integrationDto, @NotNull RestRetryPolicyDto restRetryPolicyDto, @NotNull List<ChannelIntegration> list) {
        appDto.getClass();
        baseUrlDto.getClass();
        integrationDto.getClass();
        restRetryPolicyDto.getClass();
        list.getClass();
        this.app = appDto;
        this.baseUrl = baseUrlDto;
        this.integration = integrationDto;
        this.restRetryPolicy = restRetryPolicyDto;
        this.integrations = list;
    }
}
