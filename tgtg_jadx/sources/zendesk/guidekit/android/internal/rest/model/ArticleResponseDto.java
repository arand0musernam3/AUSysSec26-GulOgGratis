package zendesk.guidekit.android.internal.rest.model;

import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"Lzendesk/guidekit/android/internal/rest/model/ArticleResponseDto;", "", "Lzendesk/guidekit/android/internal/rest/model/ArticleDto;", "article", "<init>", "(Lzendesk/guidekit/android/internal/rest/model/ArticleDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/guidekit/android/internal/rest/model/ArticleDto;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_guidekit_guidekit_android", "(Lzendesk/guidekit/android/internal/rest/model/ArticleResponseDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/guidekit/android/internal/rest/model/ArticleDto;", "copy", "(Lzendesk/guidekit/android/internal/rest/model/ArticleDto;)Lzendesk/guidekit/android/internal/rest/model/ArticleResponseDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/guidekit/android/internal/rest/model/ArticleDto;", "getArticle", "Companion", "$serializer", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArticleResponseDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ArticleDto article;

    public /* synthetic */ ArticleResponseDto(int i11, ArticleDto articleDto, m1 m1Var) {
        if (1 == (i11 & 1)) {
            this.article = articleDto;
        } else {
            c1.j(i11, 1, ArticleResponseDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ArticleResponseDto copy$default(ArticleResponseDto articleResponseDto, ArticleDto articleDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            articleDto = articleResponseDto.article;
        }
        return articleResponseDto.copy(articleDto);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ArticleDto getArticle() {
        return this.article;
    }

    @NotNull
    public final ArticleResponseDto copy(@NotNull ArticleDto article) {
        article.getClass();
        return new ArticleResponseDto(article);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ArticleResponseDto) && Intrinsics.areEqual(this.article, ((ArticleResponseDto) other).article);
    }

    @NotNull
    public final ArticleDto getArticle() {
        return this.article;
    }

    public int hashCode() {
        return this.article.hashCode();
    }

    @NotNull
    public String toString() {
        return "ArticleResponseDto(article=" + this.article + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/guidekit/android/internal/rest/model/ArticleResponseDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/guidekit/android/internal/rest/model/ArticleResponseDto;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ArticleResponseDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ArticleResponseDto(@NotNull ArticleDto articleDto) {
        articleDto.getClass();
        this.article = articleDto;
    }
}
