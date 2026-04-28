package zendesk.android.settings.internal;

import kotlin.Metadata;
import n90.c;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.e;
import zendesk.android.internal.di.ZendeskComponentConfig;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzendesk/android/settings/internal/SettingsRestClient;", "", "Lzendesk/android/settings/internal/SettingsApi;", "settingsApi", "Ln90/c;", "json", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "zendeskComponentConfig", "<init>", "(Lzendesk/android/settings/internal/SettingsApi;Ln90/c;Lzendesk/android/internal/di/ZendeskComponentConfig;)V", "Lzendesk/android/settings/internal/model/SettingsDto;", "getSettings", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/settings/internal/SettingsApi;", "Ln90/c;", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SettingsRestClient {

    @NotNull
    private final c json;

    @NotNull
    private final SettingsApi settingsApi;

    @NotNull
    private final ZendeskComponentConfig zendeskComponentConfig;

    /* JADX INFO: renamed from: zendesk.android.settings.internal.SettingsRestClient$getSettings$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.settings.internal.SettingsRestClient", f = "SettingsRestClient.kt", l = {BERTags.DURATION}, m = "getSettings")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsRestClient.this.getSettings(this);
        }
    }

    public SettingsRestClient(@NotNull SettingsApi settingsApi, @NotNull c cVar, @NotNull ZendeskComponentConfig zendeskComponentConfig) {
        settingsApi.getClass();
        cVar.getClass();
        zendeskComponentConfig.getClass();
        this.settingsApi = settingsApi;
        this.json = cVar;
        this.zendeskComponentConfig = zendeskComponentConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSettings(@org.jetbrains.annotations.NotNull x70.c<? super zendesk.android.settings.internal.model.SettingsDto> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.android.settings.internal.SettingsRestClient.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.android.settings.internal.SettingsRestClient$getSettings$1 r0 = (zendesk.android.settings.internal.SettingsRestClient.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.settings.internal.SettingsRestClient$getSettings$1 r0 = new zendesk.android.settings.internal.SettingsRestClient$getSettings$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L4e
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.android.internal.di.ZendeskComponentConfig r5 = r4.zendeskComponentConfig
            zendesk.android.ZendeskCredentials r5 = r5.getChannelKey()
            n90.c r2 = r4.json
            zendesk.android.internal.ChannelKeyFields r5 = zendesk.android.ZendeskCredentialsKt.toChannelKeyFields(r5, r2)
            if (r5 == 0) goto L55
            zendesk.android.settings.internal.SettingsApi r2 = r4.settingsApi
            java.lang.String r5 = r5.getSettingsUrl()
            r0.label = r3
            java.lang.Object r5 = r2.getSettings(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            zendesk.android.settings.internal.model.SettingsResponseDto r5 = (zendesk.android.settings.internal.model.SettingsResponseDto) r5
            zendesk.android.settings.internal.model.SettingsDto r5 = r5.getSettings()
            return r5
        L55:
            zendesk.android.internal.ZendeskError$InvalidChannelKey r5 = zendesk.android.internal.ZendeskError.InvalidChannelKey.INSTANCE
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.settings.internal.SettingsRestClient.getSettings(x70.c):java.lang.Object");
    }
}
