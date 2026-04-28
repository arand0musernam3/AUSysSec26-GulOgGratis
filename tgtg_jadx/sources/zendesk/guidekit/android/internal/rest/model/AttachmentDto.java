package zendesk.guidekit.android.internal.rest.model;

import com.braze.Constants;
import e0.f;
import g60.d;
import i90.a;
import i90.h;
import j4.s;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.m1;
import m90.q0;
import m90.r1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0081\b\u0018\u0000 U2\u00020\u0001:\u0002VUB\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u009c\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u001cJ\u0010\u0010-\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010?\u0012\u0004\bA\u0010>\u001a\u0004\b@\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010?\u0012\u0004\bC\u0010>\u001a\u0004\bB\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010D\u0012\u0004\bF\u0010>\u001a\u0004\bE\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bH\u0010>\u001a\u0004\bG\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bJ\u0010>\u001a\u0004\bI\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bL\u0010>\u001a\u0004\bK\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010D\u0012\u0004\bN\u0010>\u001a\u0004\bM\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bO\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bQ\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bS\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bT\u0010\u001c¨\u0006W"}, d2 = {"Lzendesk/guidekit/android/internal/rest/model/AttachmentDto;", "", "", "articleId", "", "contentType", "contentUrl", "Ljava/util/Date;", "createdAt", "displayFileName", "fileName", "relativePath", "updatedAt", "id", "", "inline", "size", Constants.BRAZE_WEBVIEW_URL_EXTRA, "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;JLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;JLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Lm90/m1;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Date;", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "()Ljava/lang/Long;", "component12", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;JLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)Lzendesk/guidekit/android/internal/rest/model/AttachmentDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_guidekit_guidekit_android", "(Lzendesk/guidekit/android/internal/rest/model/AttachmentDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "J", "getArticleId", "getArticleId$annotations", "()V", "Ljava/lang/String;", "getContentType", "getContentType$annotations", "getContentUrl", "getContentUrl$annotations", "Ljava/util/Date;", "getCreatedAt", "getCreatedAt$annotations", "getDisplayFileName", "getDisplayFileName$annotations", "getFileName", "getFileName$annotations", "getRelativePath", "getRelativePath$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getId", "Ljava/lang/Boolean;", "getInline", "Ljava/lang/Long;", "getSize", "getUrl", "Companion", "$serializer", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AttachmentDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long articleId;

    @Nullable
    private final String contentType;

    @Nullable
    private final String contentUrl;

    @Nullable
    private final Date createdAt;

    @Nullable
    private final String displayFileName;

    @Nullable
    private final String fileName;
    private final long id;

    @Nullable
    private final Boolean inline;

    @Nullable
    private final String relativePath;

    @Nullable
    private final Long size;

    @Nullable
    private final Date updatedAt;

    @Nullable
    private final String url;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, l.a(mVar, new d(14)), null, null, null, l.a(mVar, new d(15)), null, null, null, null};
    }

    public /* synthetic */ AttachmentDto(int i11, long j9, String str, String str2, Date date, String str3, String str4, String str5, Date date2, long j11, Boolean bool, Long l, String str6, m1 m1Var) {
        if (257 != (i11 & 257)) {
            c1.j(i11, 257, AttachmentDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.articleId = j9;
        if ((i11 & 2) == 0) {
            this.contentType = null;
        } else {
            this.contentType = str;
        }
        if ((i11 & 4) == 0) {
            this.contentUrl = null;
        } else {
            this.contentUrl = str2;
        }
        if ((i11 & 8) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = date;
        }
        if ((i11 & 16) == 0) {
            this.displayFileName = null;
        } else {
            this.displayFileName = str3;
        }
        if ((i11 & 32) == 0) {
            this.fileName = null;
        } else {
            this.fileName = str4;
        }
        if ((i11 & 64) == 0) {
            this.relativePath = null;
        } else {
            this.relativePath = str5;
        }
        if ((i11 & 128) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = date2;
        }
        this.id = j11;
        if ((i11 & 512) == 0) {
            this.inline = null;
        } else {
            this.inline = bool;
        }
        if ((i11 & 1024) == 0) {
            this.size = null;
        } else {
            this.size = l;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.url = null;
        } else {
            this.url = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new a(Reflection.getOrCreateKotlinClass(Date.class), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new a(Reflection.getOrCreateKotlinClass(Date.class), new KSerializer[0]);
    }

    public static final /* synthetic */ void write$Self$zendesk_guidekit_guidekit_android(AttachmentDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.B(serialDesc, 0, self.articleId);
        if (output.C(serialDesc) || self.contentType != null) {
            output.r(serialDesc, 1, r1.f29848a, self.contentType);
        }
        if (output.C(serialDesc) || self.contentUrl != null) {
            output.r(serialDesc, 2, r1.f29848a, self.contentUrl);
        }
        if (output.C(serialDesc) || self.createdAt != null) {
            output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.createdAt);
        }
        if (output.C(serialDesc) || self.displayFileName != null) {
            output.r(serialDesc, 4, r1.f29848a, self.displayFileName);
        }
        if (output.C(serialDesc) || self.fileName != null) {
            output.r(serialDesc, 5, r1.f29848a, self.fileName);
        }
        if (output.C(serialDesc) || self.relativePath != null) {
            output.r(serialDesc, 6, r1.f29848a, self.relativePath);
        }
        if (output.C(serialDesc) || self.updatedAt != null) {
            output.r(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.updatedAt);
        }
        output.B(serialDesc, 8, self.id);
        if (output.C(serialDesc) || self.inline != null) {
            output.r(serialDesc, 9, g.f29797a, self.inline);
        }
        if (output.C(serialDesc) || self.size != null) {
            output.r(serialDesc, 10, q0.f29842a, self.size);
        }
        if (!output.C(serialDesc) && self.url == null) {
            return;
        }
        output.r(serialDesc, 11, r1.f29848a, self.url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getArticleId() {
        return this.articleId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getInline() {
        return this.inline;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContentUrl() {
        return this.contentUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayFileName() {
        return this.displayFileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRelativePath() {
        return this.relativePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    public final AttachmentDto copy(long articleId, @Nullable String contentType, @Nullable String contentUrl, @Nullable Date createdAt, @Nullable String displayFileName, @Nullable String fileName, @Nullable String relativePath, @Nullable Date updatedAt, long id2, @Nullable Boolean inline, @Nullable Long size, @Nullable String url) {
        return new AttachmentDto(articleId, contentType, contentUrl, createdAt, displayFileName, fileName, relativePath, updatedAt, id2, inline, size, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentDto)) {
            return false;
        }
        AttachmentDto attachmentDto = (AttachmentDto) other;
        return this.articleId == attachmentDto.articleId && Intrinsics.areEqual(this.contentType, attachmentDto.contentType) && Intrinsics.areEqual(this.contentUrl, attachmentDto.contentUrl) && Intrinsics.areEqual(this.createdAt, attachmentDto.createdAt) && Intrinsics.areEqual(this.displayFileName, attachmentDto.displayFileName) && Intrinsics.areEqual(this.fileName, attachmentDto.fileName) && Intrinsics.areEqual(this.relativePath, attachmentDto.relativePath) && Intrinsics.areEqual(this.updatedAt, attachmentDto.updatedAt) && this.id == attachmentDto.id && Intrinsics.areEqual(this.inline, attachmentDto.inline) && Intrinsics.areEqual(this.size, attachmentDto.size) && Intrinsics.areEqual(this.url, attachmentDto.url);
    }

    public final long getArticleId() {
        return this.articleId;
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getContentUrl() {
        return this.contentUrl;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDisplayFileName() {
        return this.displayFileName;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getInline() {
        return this.inline;
    }

    @Nullable
    public final String getRelativePath() {
        return this.relativePath;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    @Nullable
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.articleId) * 31;
        String str = this.contentType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contentUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.createdAt;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        String str3 = this.displayFileName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.relativePath;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Date date2 = this.updatedAt;
        int iB = f.b((iHashCode7 + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.id);
        Boolean bool = this.inline;
        int iHashCode8 = (iB + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.size;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str6 = this.url;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j9 = this.articleId;
        String str = this.contentType;
        String str2 = this.contentUrl;
        Date date = this.createdAt;
        String str3 = this.displayFileName;
        String str4 = this.fileName;
        String str5 = this.relativePath;
        Date date2 = this.updatedAt;
        long j11 = this.id;
        Boolean bool = this.inline;
        Long l = this.size;
        String str6 = this.url;
        StringBuilder sb2 = new StringBuilder("AttachmentDto(articleId=");
        sb2.append(j9);
        sb2.append(", contentType=");
        sb2.append(str);
        sb2.append(", contentUrl=");
        sb2.append(str2);
        sb2.append(", createdAt=");
        sb2.append(date);
        s.A(sb2, ", displayFileName=", str3, ", fileName=", str4);
        sb2.append(", relativePath=");
        sb2.append(str5);
        sb2.append(", updatedAt=");
        sb2.append(date2);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, ", id=", j11, ", inline=");
        sb2.append(bool);
        sb2.append(", size=");
        sb2.append(l);
        sb2.append(", url=");
        return k.p(sb2, str6, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/guidekit/android/internal/rest/model/AttachmentDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/guidekit/android/internal/rest/model/AttachmentDto;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AttachmentDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @i90.g("article_id")
    public static /* synthetic */ void getArticleId$annotations() {
    }

    @i90.g("content_type")
    public static /* synthetic */ void getContentType$annotations() {
    }

    @i90.g("content_url")
    public static /* synthetic */ void getContentUrl$annotations() {
    }

    @i90.g("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @i90.g("display_file_name")
    public static /* synthetic */ void getDisplayFileName$annotations() {
    }

    @i90.g("file_name")
    public static /* synthetic */ void getFileName$annotations() {
    }

    @i90.g("relative_path")
    public static /* synthetic */ void getRelativePath$annotations() {
    }

    @i90.g("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public AttachmentDto(long j9, @Nullable String str, @Nullable String str2, @Nullable Date date, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Date date2, long j11, @Nullable Boolean bool, @Nullable Long l, @Nullable String str6) {
        this.articleId = j9;
        this.contentType = str;
        this.contentUrl = str2;
        this.createdAt = date;
        this.displayFileName = str3;
        this.fileName = str4;
        this.relativePath = str5;
        this.updatedAt = date2;
        this.id = j11;
        this.inline = bool;
        this.size = l;
        this.url = str6;
    }

    public /* synthetic */ AttachmentDto(long j9, String str, String str2, Date date, String str3, String str4, String str5, Date date2, long j11, Boolean bool, Long l, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : date, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : date2, j11, (i11 & 512) != 0 ? null : bool, (i11 & 1024) != 0 ? null : l, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str6);
    }
}
