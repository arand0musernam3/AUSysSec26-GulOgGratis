package zendesk.guidekit.android.internal.rest.model;

import com.braze.Constants;
import g60.d;
import i90.a;
import i90.h;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.l0;
import m90.m1;
import m90.q0;
import m90.r1;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b3\b\u0001\u0018\u0000 X2\u00020\u0001:\u0002YXBõ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001dBç\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b7\u0010/\u001a\u0004\b5\u00106R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b;\u0010/\u001a\u0004\b9\u0010:R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\b?\u0010/\u001a\u0004\b=\u0010>R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010+\u0012\u0004\bA\u0010/\u001a\u0004\b@\u0010-R\"\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\bC\u0010/\u001a\u0004\bB\u0010:R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00104\u0012\u0004\bE\u0010/\u001a\u0004\bD\u00106R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010F\u0012\u0004\bI\u0010/\u001a\u0004\bG\u0010HR\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010F\u0012\u0004\bK\u0010/\u001a\u0004\bJ\u0010HR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bL\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\bM\u00102R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\bQ\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\bR\u0010:R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\bS\u00102R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bT\u0010HR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\bU\u00102R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\bV\u0010:R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\bW\u0010:¨\u0006Z"}, d2 = {"Lzendesk/guidekit/android/internal/rest/model/ArticleDto;", "", "", "authorId", "", "commentsDisabled", "Ljava/util/Date;", "createdAt", "", "htmlUrl", "", "labelNames", "sectionId", "sourceLocale", "updatedAt", "", "voteCount", "voteSum", "body", "draft", "id", "locale", "name", "outdated", "position", "promoted", MessageBundle.TITLE_ENTRY, Constants.BRAZE_WEBVIEW_URL_EXTRA, "<init>", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_guidekit_guidekit_android", "(Lzendesk/guidekit/android/internal/rest/model/ArticleDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Long;", "getAuthorId", "()Ljava/lang/Long;", "getAuthorId$annotations", "()V", "Ljava/lang/Boolean;", "getCommentsDisabled", "()Ljava/lang/Boolean;", "getCommentsDisabled$annotations", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "getCreatedAt$annotations", "Ljava/lang/String;", "getHtmlUrl", "()Ljava/lang/String;", "getHtmlUrl$annotations", "Ljava/util/List;", "getLabelNames", "()Ljava/util/List;", "getLabelNames$annotations", "getSectionId", "getSectionId$annotations", "getSourceLocale", "getSourceLocale$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Ljava/lang/Integer;", "getVoteCount", "()Ljava/lang/Integer;", "getVoteCount$annotations", "getVoteSum", "getVoteSum$annotations", "getBody", "getDraft", "J", "getId", "()J", "getLocale", "getName", "getOutdated", "getPosition", "getPromoted", "getTitle", "getUrl", "Companion", "$serializer", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArticleDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long authorId;

    @Nullable
    private final String body;

    @Nullable
    private final Boolean commentsDisabled;

    @Nullable
    private final Date createdAt;

    @Nullable
    private final Boolean draft;

    @Nullable
    private final String htmlUrl;
    private final long id;

    @Nullable
    private final List<String> labelNames;

    @NotNull
    private final String locale;

    @Nullable
    private final String name;

    @Nullable
    private final Boolean outdated;

    @Nullable
    private final Integer position;

    @Nullable
    private final Boolean promoted;

    @Nullable
    private final Long sectionId;

    @Nullable
    private final String sourceLocale;

    @Nullable
    private final String title;

    @Nullable
    private final Date updatedAt;

    @Nullable
    private final String url;

    @Nullable
    private final Integer voteCount;

    @Nullable
    private final Integer voteSum;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, l.a(mVar, new d(11)), null, l.a(mVar, new d(12)), null, null, l.a(mVar, new d(13)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ ArticleDto(int i11, Long l, Boolean bool, Date date, String str, List list, Long l7, String str2, Date date2, Integer num, Integer num2, String str3, Boolean bool2, long j9, String str4, String str5, Boolean bool3, Integer num3, Boolean bool4, String str6, String str7, m1 m1Var) {
        if (12288 != (i11 & 12288)) {
            c1.j(i11, 12288, ArticleDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.authorId = null;
        } else {
            this.authorId = l;
        }
        if ((i11 & 2) == 0) {
            this.commentsDisabled = null;
        } else {
            this.commentsDisabled = bool;
        }
        if ((i11 & 4) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = date;
        }
        if ((i11 & 8) == 0) {
            this.htmlUrl = null;
        } else {
            this.htmlUrl = str;
        }
        if ((i11 & 16) == 0) {
            this.labelNames = null;
        } else {
            this.labelNames = list;
        }
        if ((i11 & 32) == 0) {
            this.sectionId = null;
        } else {
            this.sectionId = l7;
        }
        if ((i11 & 64) == 0) {
            this.sourceLocale = null;
        } else {
            this.sourceLocale = str2;
        }
        if ((i11 & 128) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = date2;
        }
        if ((i11 & 256) == 0) {
            this.voteCount = null;
        } else {
            this.voteCount = num;
        }
        if ((i11 & 512) == 0) {
            this.voteSum = null;
        } else {
            this.voteSum = num2;
        }
        if ((i11 & 1024) == 0) {
            this.body = null;
        } else {
            this.body = str3;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.draft = null;
        } else {
            this.draft = bool2;
        }
        this.id = j9;
        this.locale = str4;
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.name = null;
        } else {
            this.name = str5;
        }
        if ((32768 & i11) == 0) {
            this.outdated = null;
        } else {
            this.outdated = bool3;
        }
        if ((65536 & i11) == 0) {
            this.position = null;
        } else {
            this.position = num3;
        }
        if ((131072 & i11) == 0) {
            this.promoted = null;
        } else {
            this.promoted = bool4;
        }
        if ((262144 & i11) == 0) {
            this.title = null;
        } else {
            this.title = str6;
        }
        if ((i11 & 524288) == 0) {
            this.url = null;
        } else {
            this.url = str7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new a(Reflection.getOrCreateKotlinClass(Date.class), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new m90.d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new a(Reflection.getOrCreateKotlinClass(Date.class), new KSerializer[0]);
    }

    public static final /* synthetic */ void write$Self$zendesk_guidekit_guidekit_android(ArticleDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.authorId != null) {
            output.r(serialDesc, 0, q0.f29842a, self.authorId);
        }
        if (output.C(serialDesc) || self.commentsDisabled != null) {
            output.r(serialDesc, 1, g.f29797a, self.commentsDisabled);
        }
        if (output.C(serialDesc) || self.createdAt != null) {
            output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.createdAt);
        }
        if (output.C(serialDesc) || self.htmlUrl != null) {
            output.r(serialDesc, 3, r1.f29848a, self.htmlUrl);
        }
        if (output.C(serialDesc) || self.labelNames != null) {
            output.r(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.labelNames);
        }
        if (output.C(serialDesc) || self.sectionId != null) {
            output.r(serialDesc, 5, q0.f29842a, self.sectionId);
        }
        if (output.C(serialDesc) || self.sourceLocale != null) {
            output.r(serialDesc, 6, r1.f29848a, self.sourceLocale);
        }
        if (output.C(serialDesc) || self.updatedAt != null) {
            output.r(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.updatedAt);
        }
        if (output.C(serialDesc) || self.voteCount != null) {
            output.r(serialDesc, 8, l0.f29821a, self.voteCount);
        }
        if (output.C(serialDesc) || self.voteSum != null) {
            output.r(serialDesc, 9, l0.f29821a, self.voteSum);
        }
        if (output.C(serialDesc) || self.body != null) {
            output.r(serialDesc, 10, r1.f29848a, self.body);
        }
        if (output.C(serialDesc) || self.draft != null) {
            output.r(serialDesc, 11, g.f29797a, self.draft);
        }
        output.B(serialDesc, 12, self.id);
        output.q(serialDesc, 13, self.locale);
        if (output.C(serialDesc) || self.name != null) {
            output.r(serialDesc, 14, r1.f29848a, self.name);
        }
        if (output.C(serialDesc) || self.outdated != null) {
            output.r(serialDesc, 15, g.f29797a, self.outdated);
        }
        if (output.C(serialDesc) || self.position != null) {
            output.r(serialDesc, 16, l0.f29821a, self.position);
        }
        if (output.C(serialDesc) || self.promoted != null) {
            output.r(serialDesc, 17, g.f29797a, self.promoted);
        }
        if (output.C(serialDesc) || self.title != null) {
            output.r(serialDesc, 18, r1.f29848a, self.title);
        }
        if (!output.C(serialDesc) && self.url == null) {
            return;
        }
        output.r(serialDesc, 19, r1.f29848a, self.url);
    }

    @Nullable
    public final Long getAuthorId() {
        return this.authorId;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final Boolean getCommentsDisabled() {
        return this.commentsDisabled;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Boolean getDraft() {
        return this.draft;
    }

    @Nullable
    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getLabelNames() {
        return this.labelNames;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getOutdated() {
        return this.outdated;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    public final Boolean getPromoted() {
        return this.promoted;
    }

    @Nullable
    public final Long getSectionId() {
        return this.sectionId;
    }

    @Nullable
    public final String getSourceLocale() {
        return this.sourceLocale;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getVoteCount() {
        return this.voteCount;
    }

    @Nullable
    public final Integer getVoteSum() {
        return this.voteSum;
    }

    public ArticleDto(@Nullable Long l, @Nullable Boolean bool, @Nullable Date date, @Nullable String str, @Nullable List<String> list, @Nullable Long l7, @Nullable String str2, @Nullable Date date2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable Boolean bool2, long j9, @NotNull String str4, @Nullable String str5, @Nullable Boolean bool3, @Nullable Integer num3, @Nullable Boolean bool4, @Nullable String str6, @Nullable String str7) {
        str4.getClass();
        this.authorId = l;
        this.commentsDisabled = bool;
        this.createdAt = date;
        this.htmlUrl = str;
        this.labelNames = list;
        this.sectionId = l7;
        this.sourceLocale = str2;
        this.updatedAt = date2;
        this.voteCount = num;
        this.voteSum = num2;
        this.body = str3;
        this.draft = bool2;
        this.id = j9;
        this.locale = str4;
        this.name = str5;
        this.outdated = bool3;
        this.position = num3;
        this.promoted = bool4;
        this.title = str6;
        this.url = str7;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/guidekit/android/internal/rest/model/ArticleDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/guidekit/android/internal/rest/model/ArticleDto;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ArticleDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @i90.g("author_id")
    public static /* synthetic */ void getAuthorId$annotations() {
    }

    @i90.g("comments_disabled")
    public static /* synthetic */ void getCommentsDisabled$annotations() {
    }

    @i90.g("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @i90.g("html_url")
    public static /* synthetic */ void getHtmlUrl$annotations() {
    }

    @i90.g("label_names")
    public static /* synthetic */ void getLabelNames$annotations() {
    }

    @i90.g("section_id")
    public static /* synthetic */ void getSectionId$annotations() {
    }

    @i90.g("source_locale")
    public static /* synthetic */ void getSourceLocale$annotations() {
    }

    @i90.g("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @i90.g("vote_count")
    public static /* synthetic */ void getVoteCount$annotations() {
    }

    @i90.g("vote_sum")
    public static /* synthetic */ void getVoteSum$annotations() {
    }

    public /* synthetic */ ArticleDto(Long l, Boolean bool, Date date, String str, List list, Long l7, String str2, Date date2, Integer num, Integer num2, String str3, Boolean bool2, long j9, String str4, String str5, Boolean bool3, Integer num3, Boolean bool4, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : date, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : l7, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : date2, (i11 & 256) != 0 ? null : num, (i11 & 512) != 0 ? null : num2, (i11 & 1024) != 0 ? null : str3, (i11 & NewHope.SENDB_BYTES) != 0 ? null : bool2, j9, str4, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : str5, (32768 & i11) != 0 ? null : bool3, (65536 & i11) != 0 ? null : num3, (131072 & i11) != 0 ? null : bool4, (262144 & i11) != 0 ? null : str6, (i11 & 524288) != 0 ? null : str7);
    }
}
