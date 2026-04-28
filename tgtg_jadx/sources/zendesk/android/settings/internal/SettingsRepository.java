package zendesk.android.settings.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0080@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lzendesk/android/settings/internal/SettingsRepository;", "", "Lzendesk/android/settings/internal/SettingsRestClient;", "settingsRestClient", "<init>", "(Lzendesk/android/settings/internal/SettingsRestClient;)V", "Lzendesk/android/ZendeskResult;", "Lzendesk/android/settings/internal/model/SettingsDto;", "", "fetchSettings$zendesk_zendesk_android", "(Lx70/c;)Ljava/lang/Object;", "fetchSettings", "Lzendesk/android/settings/internal/SettingsRestClient;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SettingsRepository {

    @NotNull
    private final SettingsRestClient settingsRestClient;

    public SettingsRepository(@NotNull SettingsRestClient settingsRestClient) {
        settingsRestClient.getClass();
        this.settingsRestClient = settingsRestClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSettings$zendesk_zendesk_android(@org.jetbrains.annotations.NotNull x70.c<? super zendesk.android.ZendeskResult<zendesk.android.settings.internal.model.SettingsDto, ? extends java.lang.Throwable>> r7) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zendesk.android.settings.internal.SettingsRepository$fetchSettings$1
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.android.settings.internal.SettingsRepository$fetchSettings$1 r0 = (zendesk.android.settings.internal.SettingsRepository$fetchSettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.settings.internal.SettingsRepository$fetchSettings$1 r0 = new zendesk.android.settings.internal.SettingsRepository$fetchSettings$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "Zendesk"
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2e
            ba0.g.M(r7)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            goto L43
        L2a:
            r7 = move-exception
            goto L49
        L2c:
            r7 = move-exception
            goto L75
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L35:
            ba0.g.M(r7)
            zendesk.android.settings.internal.SettingsRestClient r7 = r6.settingsRestClient     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r0.label = r5     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            java.lang.Object r7 = r7.getSettings(r0)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            if (r7 != r1) goto L43
            return r1
        L43:
            zendesk.android.ZendeskResult$Success r0 = new zendesk.android.ZendeskResult$Success     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r0.<init>(r7)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            return r0
        L49:
            boolean r0 = r7 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L74
            java.lang.String r0 = "Zendesk failed to initialize."
            java.lang.Object[] r1 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r0, r7, r1)
            boolean r0 = r7 instanceof retrofit2.HttpException
            if (r0 == 0) goto L69
            r0 = r7
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            int r0 = r0.f37956a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 != r1) goto L69
            zendesk.android.ZendeskResult$Failure r7 = new zendesk.android.ZendeskResult$Failure
            zendesk.android.internal.ZendeskError$AccountNotFound r0 = zendesk.android.internal.ZendeskError.AccountNotFound.INSTANCE
            r7.<init>(r0)
            goto L87
        L69:
            zendesk.android.ZendeskResult$Failure r0 = new zendesk.android.ZendeskResult$Failure
            zendesk.android.internal.ZendeskError$FailedToInitialize r1 = new zendesk.android.internal.ZendeskError$FailedToInitialize
            r1.<init>(r7)
            r0.<init>(r1)
            goto L86
        L74:
            throw r7
        L75:
            java.lang.String r0 = "GET request for Settings failed to decode malformed JSON response."
            java.lang.Object[] r1 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r0, r7, r1)
            zendesk.android.ZendeskResult$Failure r0 = new zendesk.android.ZendeskResult$Failure
            zendesk.android.internal.ZendeskError$FailedToInitialize r1 = new zendesk.android.internal.ZendeskError$FailedToInitialize
            r1.<init>(r7)
            r0.<init>(r1)
        L86:
            r7 = r0
        L87:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.settings.internal.SettingsRepository.fetchSettings$zendesk_zendesk_android(x70.c):java.lang.Object");
    }
}
