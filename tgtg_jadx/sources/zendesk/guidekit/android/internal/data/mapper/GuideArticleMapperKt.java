package zendesk.guidekit.android.internal.data.mapper;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.guidekit.android.internal.rest.model.ArticleDto;
import zendesk.guidekit.android.internal.rest.model.ArticleResponseDto;
import zendesk.guidekit.android.internal.rest.model.AttachmentDto;
import zendesk.guidekit.android.internal.rest.model.AttachmentResponseDto;
import zendesk.guidekit.android.model.GuideArticle;
import zendesk.guidekit.android.model.GuideAttachment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\b"}, d2 = {"toGuideAttachment", "", "Lzendesk/guidekit/android/model/GuideAttachment;", "Lzendesk/guidekit/android/internal/rest/model/AttachmentResponseDto;", "toGuideArticle", "Lzendesk/guidekit/android/model/GuideArticle;", "Lzendesk/guidekit/android/internal/rest/model/ArticleResponseDto;", "attachments", "zendesk.guidekit_guidekit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuideArticleMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideArticleMapper.kt\nzendesk/guidekit/android/internal/data/mapper/GuideArticleMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1563#2:47\n1634#2,3:48\n*S KotlinDebug\n*F\n+ 1 GuideArticleMapper.kt\nzendesk/guidekit/android/internal/data/mapper/GuideArticleMapperKt\n*L\n15#1:47\n15#1:48,3\n*E\n"})
public final class GuideArticleMapperKt {
    @NotNull
    public static final GuideArticle toGuideArticle(@NotNull ArticleResponseDto articleResponseDto, @NotNull List<GuideAttachment> list) {
        articleResponseDto.getClass();
        list.getClass();
        ArticleDto article = articleResponseDto.getArticle();
        return new GuideArticle(article.getId(), article.getLocale(), article.getHtmlUrl(), article.getTitle(), article.getBody(), list);
    }

    @NotNull
    public static final List<GuideAttachment> toGuideAttachment(@NotNull AttachmentResponseDto attachmentResponseDto) {
        String str;
        String str2;
        attachmentResponseDto.getClass();
        List<AttachmentDto> articleAttachments = attachmentResponseDto.getArticleAttachments();
        if (articleAttachments == null) {
            return n0.f26529a;
        }
        ArrayList arrayList = new ArrayList(e0.o(articleAttachments, 10));
        for (AttachmentDto attachmentDto : articleAttachments) {
            long id2 = attachmentDto.getId();
            Long size = attachmentDto.getSize();
            String fileName = attachmentDto.getFileName();
            if (fileName == null) {
                fileName = "";
            }
            String contentType = attachmentDto.getContentType();
            if (contentType == null) {
                contentType = "";
            }
            String contentUrl = attachmentDto.getContentUrl();
            if (contentUrl == null) {
                String str3 = contentType;
                str2 = "";
                str = str3;
            } else {
                str = contentType;
                str2 = contentUrl;
            }
            arrayList.add(new GuideAttachment(id2, size, fileName, str, str2));
        }
        return arrayList;
    }
}
