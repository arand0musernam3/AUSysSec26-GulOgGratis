package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.mapper;

import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import zendesk.guidekit.android.model.GuideAttachment;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¨\u0006\n"}, d2 = {"toArticleAttachmentList", "", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "Lzendesk/guidekit/android/model/GuideAttachment;", "hasFileExtension", "", "fileName", "", "getFileExtension", "contentType", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArticleAttachmentItemMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleAttachmentItemMapper.kt\nzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/mapper/ArticleAttachmentItemMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n774#2:46\n865#2,2:47\n1563#2:49\n1634#2,3:50\n*S KotlinDebug\n*F\n+ 1 ArticleAttachmentItemMapper.kt\nzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/mapper/ArticleAttachmentItemMapperKt\n*L\n20#1:46\n20#1:47,2\n21#1:49\n21#1:50,3\n*E\n"})
public final class ArticleAttachmentItemMapperKt {
    @NotNull
    public static final String getFileExtension(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        if (hasFileExtension(str)) {
            return StringsKt.W('.', str, "");
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
        return extensionFromMimeType == null ? "" : extensionFromMimeType;
    }

    public static final boolean hasFileExtension(@NotNull String str) {
        str.getClass();
        int iJ = StringsKt.J(str, '.', 0, 6);
        return (iJ == -1 || iJ == 0 || iJ == str.length() - 1) ? false : true;
    }

    @NotNull
    public static final List<ArticleAttachmentItem> toArticleAttachmentList(@NotNull List<GuideAttachment> list) {
        list.getClass();
        ArrayList<GuideAttachment> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((GuideAttachment) obj).getContentUrl().length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
        for (GuideAttachment guideAttachment : arrayList) {
            long id2 = guideAttachment.getId();
            String fileName = guideAttachment.getFileName();
            String fileExtension = getFileExtension(guideAttachment.getFileName(), guideAttachment.getContentType());
            Long size = guideAttachment.getSize();
            arrayList2.add(new ArticleAttachmentItem(id2, fileName, fileExtension, size != null ? size.longValue() : 0L, guideAttachment.getContentUrl()));
        }
        return arrayList2;
    }
}
