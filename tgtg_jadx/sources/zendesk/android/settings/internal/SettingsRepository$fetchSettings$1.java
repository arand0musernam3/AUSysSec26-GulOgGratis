package zendesk.android.settings.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.settings.internal.SettingsRepository", f = "SettingsRepository.kt", l = {28}, m = "fetchSettings$zendesk_zendesk_android")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class SettingsRepository$fetchSettings$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRepository$fetchSettings$1(SettingsRepository settingsRepository, x70.c<? super SettingsRepository$fetchSettings$1> cVar) {
        super(cVar);
        this.this$0 = settingsRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchSettings$zendesk_zendesk_android(this);
    }
}
