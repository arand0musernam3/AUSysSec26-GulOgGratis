package zendesk.core.ui.android.internal.xml;

import android.text.Html;
import android.text.Spanned;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.ui.android.internal.InternalZendeskUIApi;
import zendesk.core.ui.android.internal.xml.richtext.HtmlTagHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"toHtmlFormatted", "Landroid/text/Spanned;", "", "codeBlockTextColor", "", "codeBlockBackgroundColor", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/text/Spanned;", "zendesk.core.ui_core-ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RichTextHtmlExtensionsKt {
    @InternalZendeskUIApi
    @Nullable
    public static final Spanned toHtmlFormatted(@NotNull String str, @Nullable Integer num, @Nullable Integer num2) {
        str.getClass();
        try {
            HtmlTagHandler.Companion companion = HtmlTagHandler.INSTANCE;
            return Html.fromHtml(companion.formatCodeBlockContent$zendesk_core_ui_core_ui(companion.replaceListTags$zendesk_core_ui_core_ui(str)), 0, null, new HtmlTagHandler(num, num2));
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Spanned toHtmlFormatted$default(String str, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        return toHtmlFormatted(str, num, num2);
    }
}
