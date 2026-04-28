package zendesk.ui.android.conversation.conversationextension;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/WebViewJavaScriptApi;", "", "Lkotlin/Function0;", "", "onWebSdkClose", "Lkotlin/Function1;", "", "onWebSdkUpdateTitle", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", MessageBundle.TITLE_ENTRY, "setTitle", "(Ljava/lang/String;)V", "close", "()V", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebViewJavaScriptApi {
    public static final int $stable = 0;

    @NotNull
    private final Function0<Unit> onWebSdkClose;

    @NotNull
    private final Function1<String, Unit> onWebSdkUpdateTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewJavaScriptApi(@NotNull Function0<Unit> function0, @NotNull Function1<? super String, Unit> function1) {
        function0.getClass();
        function1.getClass();
        this.onWebSdkClose = function0;
        this.onWebSdkUpdateTitle = function1;
    }

    @JavascriptInterface
    public final void close() {
        this.onWebSdkClose.invoke();
    }

    @JavascriptInterface
    public final void setTitle(@Nullable String title) {
        this.onWebSdkUpdateTitle.invoke(title);
    }
}
