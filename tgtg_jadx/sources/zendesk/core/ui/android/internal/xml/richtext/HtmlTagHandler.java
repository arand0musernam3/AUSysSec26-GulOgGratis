package zendesk.core.ui.android.internal.xml.richtext;

import android.text.Editable;
import android.text.Html;
import cp.i;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.q;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.XMLReader;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;
import zendesk.core.ui.android.internal.xml.richtext.lists.ListTag;
import zendesk.core.ui.android.internal.xml.richtext.lists.Ol;
import zendesk.core.ui.android.internal.xml.richtext.lists.Ul;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ/\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/HtmlTagHandler;", "Landroid/text/Html$TagHandler;", "", "codeBlockTextColor", "codeBlockBackgroundColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "opening", "", "tag", "Landroid/text/Editable;", "output", "", "handleLists", "(ZLjava/lang/String;Landroid/text/Editable;)V", "handleCodeBlock", "handleQuotes", "Lorg/xml/sax/XMLReader;", "xmlReader", "handleTag", "(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V", "Ljava/lang/Integer;", "Lkotlin/collections/t;", "Lzendesk/core/ui/android/internal/xml/richtext/lists/ListTag;", "listTags", "Lkotlin/collections/t;", "Companion", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HtmlTagHandler implements Html.TagHandler {

    @NotNull
    private static final String CODE_BLOCK_REGEX = "(?<=<code>)(.*?)(?=</code>)";

    @NotNull
    private static final String CODE_ESCAPED_NEWLINE = "\\n";

    @NotNull
    private static final String CODE_NEWLINE = "\n";

    @NotNull
    private static final String CODE_TAG = "code";

    @NotNull
    private static final String LI_TAG = "listitem";

    @NotNull
    private static final String NBSP = "&nbsp;";

    @NotNull
    private static final String OL_TAG = "ordered";

    @NotNull
    private static final String QUOTE_TAG = "q";

    @NotNull
    private static final String SPACE = " ";

    @NotNull
    private static final String UL_TAG = "unordered";

    @Nullable
    private final Integer codeBlockBackgroundColor;

    @Nullable
    private final Integer codeBlockTextColor;

    @NotNull
    private final t listTags = new t();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public HtmlTagHandler(@Nullable Integer num, @Nullable Integer num2) {
        this.codeBlockTextColor = num;
        this.codeBlockBackgroundColor = num2;
    }

    private final void handleCodeBlock(boolean opening, String tag, Editable output) {
        if (y.k(tag, CODE_TAG, true)) {
            new CodeBlockHandler(this.codeBlockTextColor, this.codeBlockBackgroundColor).handle(opening, output, output.length());
        }
    }

    private final void handleLists(boolean opening, String tag, Editable output) {
        int iHashCode = tag.hashCode();
        if (iHashCode == -1207109523) {
            if (tag.equals(OL_TAG)) {
                t tVar = this.listTags;
                if (opening) {
                    tVar.addLast(new Ol());
                    return;
                } else {
                    tVar.removeLast();
                    return;
                }
            }
            return;
        }
        if (iHashCode == 504691636) {
            if (tag.equals(UL_TAG)) {
                t tVar2 = this.listTags;
                if (opening) {
                    tVar2.addLast(new Ul());
                    return;
                } else {
                    tVar2.removeLast();
                    return;
                }
            }
            return;
        }
        if (iHashCode == 1346284721 && tag.equals(LI_TAG)) {
            t tVar3 = this.listTags;
            if (opening) {
                ((ListTag) tVar3.last()).openItem(output);
            } else {
                ((ListTag) tVar3.last()).closeItem(output, this.listTags.f26542c - 1);
            }
        }
    }

    private final void handleQuotes(boolean opening, String tag, Editable output) {
        if (y.k(tag, QUOTE_TAG, true)) {
            if (opening) {
                output.append("“");
            } else {
                output.append("”");
            }
        }
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean opening, @NotNull String tag, @NotNull Editable output, @NotNull XMLReader xmlReader) {
        tag.getClass();
        output.getClass();
        xmlReader.getClass();
        handleLists(opening, tag, output);
        handleCodeBlock(opening, tag, output);
        handleQuotes(opening, tag, output);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u000f\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0002\b\u0010J\u0011\u0010\u0011\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/HtmlTagHandler$Companion;", "", "<init>", "()V", "OL_TAG", "", "UL_TAG", "LI_TAG", "QUOTE_TAG", "CODE_TAG", "CODE_BLOCK_REGEX", "SPACE", "NBSP", "CODE_NEWLINE", "CODE_ESCAPED_NEWLINE", "replaceListTags", "replaceListTags$zendesk_core_ui_core_ui", "formatCodeBlockContent", "formatCodeBlockContent$zendesk_core_ui_core_ui", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence formatCodeBlockContent$lambda$0(MatchResult matchResult) {
            matchResult.getClass();
            return y.n(y.n(matchResult.getValue(), HtmlTagHandler.CODE_NEWLINE, "\\n", false), HtmlTagHandler.SPACE, HtmlTagHandler.NBSP, false);
        }

        @NotNull
        public final String formatCodeBlockContent$zendesk_core_ui_core_ui(@NotNull String str) {
            str.getClass();
            return new Regex(HtmlTagHandler.CODE_BLOCK_REGEX, q.DOT_MATCHES_ALL).f(str, new i(20));
        }

        @NotNull
        public final String replaceListTags$zendesk_core_ui_core_ui(@NotNull String str) {
            str.getClass();
            return new Regex("(?i)</li>").replace(new Regex("(?i)<li[^>]*>").replace(new Regex("(?i)</ol>").replace(new Regex("(?i)<ol[^>]*>").replace(new Regex("(?i)</ul>").replace(new Regex("(?i)<ul[^>]*>").replace(str, "<unordered>"), "</unordered>"), "<ordered>"), "</ordered>"), "<listitem>"), "</listitem>");
        }

        private Companion() {
        }
    }
}
