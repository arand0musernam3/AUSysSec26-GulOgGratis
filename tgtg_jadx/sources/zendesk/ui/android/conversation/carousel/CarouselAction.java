package zendesk.ui.android.conversation.carousel;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B7\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselAction;", "", "id", "", TextBundle.TEXT_ENTRY, "clickListener", "Lkotlin/Function1;", "", "isLoading", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Z)V", "getId", "()Ljava/lang/String;", "getText", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "()Z", "Link", "Postback", "WebView", "Unsupported", "Lzendesk/ui/android/conversation/carousel/CarouselAction$Link;", "Lzendesk/ui/android/conversation/carousel/CarouselAction$Postback;", "Lzendesk/ui/android/conversation/carousel/CarouselAction$Unsupported;", "Lzendesk/ui/android/conversation/carousel/CarouselAction$WebView;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CarouselAction {
    public static final int $stable = 0;

    @NotNull
    private final Function1<CarouselAction, Unit> clickListener;

    @NotNull
    private final String id;
    private final boolean isLoading;

    @NotNull
    private final String text;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselAction$Link;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "id", "", TextBundle.TEXT_ENTRY, "clickListener", "Lkotlin/Function1;", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "sourceType", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageSourceType;)V", "getUrl", "()Ljava/lang/String;", "getSourceType", "()Lzendesk/core/ui/android/internal/model/MessageSourceType;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Link extends CarouselAction {
        public static final int $stable = 0;

        @NotNull
        private final MessageSourceType sourceType;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Link(@NotNull String str, @NotNull String str2, @NotNull Function1<? super CarouselAction, Unit> function1, @NotNull String str3, @NotNull MessageSourceType messageSourceType) {
            super(str, str2, function1, false, null);
            str.getClass();
            str2.getClass();
            function1.getClass();
            str3.getClass();
            messageSourceType.getClass();
            this.url = str3;
            this.sourceType = messageSourceType;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselAction$Postback;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "id", "", TextBundle.TEXT_ENTRY, "clickListener", "Lkotlin/Function1;", "", "isLoading", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Z)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Postback extends CarouselAction {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Postback(@NotNull String str, @NotNull String str2, @NotNull Function1<? super CarouselAction, Unit> function1, boolean z11) {
            super(str, str2, function1, z11, null);
            str.getClass();
            str2.getClass();
            function1.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselAction$Unsupported;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "id", "", TextBundle.TEXT_ENTRY, "clickListener", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Unsupported extends CarouselAction {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unsupported(@NotNull String str, @NotNull String str2, @NotNull Function1<? super CarouselAction, Unit> function1) {
            super(str, str2, function1, false, null);
            str.getClass();
            str2.getClass();
            function1.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselAction$WebView;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "id", "", TextBundle.TEXT_ENTRY, "clickListener", "Lkotlin/Function1;", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "size", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "sourceType", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageActionSize;Lzendesk/core/ui/android/internal/model/MessageSourceType;)V", "getUrl", "()Ljava/lang/String;", "getSize", "()Lzendesk/core/ui/android/internal/model/MessageActionSize;", "getSourceType", "()Lzendesk/core/ui/android/internal/model/MessageSourceType;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WebView extends CarouselAction {
        public static final int $stable = 0;

        @NotNull
        private final MessageActionSize size;

        @NotNull
        private final MessageSourceType sourceType;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebView(@NotNull String str, @NotNull String str2, @NotNull Function1<? super CarouselAction, Unit> function1, @NotNull String str3, @NotNull MessageActionSize messageActionSize, @NotNull MessageSourceType messageSourceType) {
            super(str, str2, function1, false, null);
            str.getClass();
            str2.getClass();
            function1.getClass();
            str3.getClass();
            messageActionSize.getClass();
            messageSourceType.getClass();
            this.url = str3;
            this.size = messageActionSize;
            this.sourceType = messageSourceType;
        }

        @NotNull
        public final MessageActionSize getSize() {
            return this.size;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    public /* synthetic */ CarouselAction(String str, String str2, Function1 function1, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(9) : function1, z11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(CarouselAction carouselAction) {
        carouselAction.getClass();
        return Unit.f26487a;
    }

    @NotNull
    public final Function1<CarouselAction, Unit> getClickListener() {
        return this.clickListener;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CarouselAction(String str, String str2, Function1<? super CarouselAction, Unit> function1, boolean z11) {
        this.id = str;
        this.text = str2;
        this.clickListener = function1;
        this.isLoading = z11;
    }

    public /* synthetic */ CarouselAction(String str, String str2, Function1 function1, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, function1, z11);
    }
}
