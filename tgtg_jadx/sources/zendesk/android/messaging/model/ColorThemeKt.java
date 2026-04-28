package zendesk.android.messaging.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.android.settings.internal.model.ColorThemeDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toColorTheme", "Lzendesk/android/messaging/model/ColorTheme;", "Lzendesk/android/settings/internal/model/ColorThemeDto;", "zendesk_zendesk-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ColorThemeKt {
    @NotNull
    public static final ColorTheme toColorTheme(@NotNull ColorThemeDto colorThemeDto) {
        colorThemeDto.getClass();
        return new ColorTheme(colorThemeDto.getPrimaryColor(), colorThemeDto.getOnPrimaryColor(), colorThemeDto.getMessageColor(), colorThemeDto.getOnMessageColor(), colorThemeDto.getActionColor(), colorThemeDto.getOnActionColor(), colorThemeDto.getInboundMessageColor(), colorThemeDto.getSystemMessageColor(), colorThemeDto.getBackgroundColor(), colorThemeDto.getOnBackgroundColor(), colorThemeDto.getElevatedColor(), colorThemeDto.getNotifyColor(), colorThemeDto.getSuccessColor(), colorThemeDto.getDangerColor(), colorThemeDto.getOnDangerColor(), colorThemeDto.getDisabledColor(), colorThemeDto.getIconColor(), colorThemeDto.getOnActionBackgroundColor());
    }
}
