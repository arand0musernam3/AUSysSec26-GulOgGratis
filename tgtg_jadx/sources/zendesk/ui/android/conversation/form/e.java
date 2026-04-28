package zendesk.ui.android.conversation.form;

import java.util.List;
import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.header.ConversationHeaderRendering;
import zendesk.ui.android.conversation.header.ConversationHeaderView;
import zendesk.ui.android.conversation.imagecell.ImageCellRendering;
import zendesk.ui.android.conversation.imagecell.ImageCellView;
import zendesk.ui.android.conversation.receipt.MessageReceiptRendering;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;
import zendesk.ui.android.conversation.textcell.TextCellRendering;
import zendesk.ui.android.conversations.informationbanner.InformationBannerRendering;
import zendesk.ui.android.conversations.informationbanner.InformationBannerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47852a;

    public /* synthetic */ e(int i11) {
        this.f47852a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47852a) {
            case 0:
                return FormRendering._init_$lambda$1((List) obj);
            case 1:
                return FormRendering._init_$lambda$2(((Boolean) obj).booleanValue());
            case 2:
                return FormResponseView._init_$lambda$0((FormResponseRendering) obj);
            case 3:
                return ConversationHeaderView._init_$lambda$0((ConversationHeaderRendering) obj);
            case 4:
                return ImageCellView._init_$lambda$2((ImageCellRendering) obj);
            case 5:
                return MessageReceiptView._init_$lambda$0((MessageReceiptRendering) obj);
            case 6:
                return TextCellRendering.Builder.onCellClicked$lambda$0((String) obj);
            case 7:
                return TextCellRendering.Builder.onCopyTextMenuItemClicked$lambda$3((String) obj);
            default:
                return InformationBannerView._init_$lambda$1((InformationBannerRendering) obj);
        }
    }
}
