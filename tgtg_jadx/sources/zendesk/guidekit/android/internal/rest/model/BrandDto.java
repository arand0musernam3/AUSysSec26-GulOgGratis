package zendesk.guidekit.android.internal.rest.model;

import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001bR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001b¨\u00062"}, d2 = {"Lzendesk/guidekit/android/internal/rest/model/BrandDto;", "", "", "id", "", "channelId", "subdomain", "hostMapping", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_guidekit_guidekit_android", "(Lzendesk/guidekit/android/internal/rest/model/BrandDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/guidekit/android/internal/rest/model/BrandDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Ljava/lang/String;", "getChannelId", "getChannelId$annotations", "()V", "getSubdomain", "getHostMapping", "getHostMapping$annotations", "Companion", "$serializer", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BrandDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String channelId;

    @NotNull
    private final String hostMapping;
    private final long id;

    @NotNull
    private final String subdomain;

    public /* synthetic */ BrandDto(int i11, long j9, String str, String str2, String str3, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, BrandDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = j9;
        this.channelId = str;
        this.subdomain = str2;
        this.hostMapping = str3;
    }

    public static /* synthetic */ BrandDto copy$default(BrandDto brandDto, long j9, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = brandDto.id;
        }
        long j11 = j9;
        if ((i11 & 2) != 0) {
            str = brandDto.channelId;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = brandDto.subdomain;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = brandDto.hostMapping;
        }
        return brandDto.copy(j11, str4, str5, str3);
    }

    public static final /* synthetic */ void write$Self$zendesk_guidekit_guidekit_android(BrandDto self, b output, SerialDescriptor serialDesc) {
        output.B(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.channelId);
        output.q(serialDesc, 2, self.subdomain);
        output.q(serialDesc, 3, self.hostMapping);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubdomain() {
        return this.subdomain;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHostMapping() {
        return this.hostMapping;
    }

    @NotNull
    public final BrandDto copy(long id2, @NotNull String channelId, @NotNull String subdomain, @NotNull String hostMapping) {
        channelId.getClass();
        subdomain.getClass();
        hostMapping.getClass();
        return new BrandDto(id2, channelId, subdomain, hostMapping);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandDto)) {
            return false;
        }
        BrandDto brandDto = (BrandDto) other;
        return this.id == brandDto.id && Intrinsics.areEqual(this.channelId, brandDto.channelId) && Intrinsics.areEqual(this.subdomain, brandDto.subdomain) && Intrinsics.areEqual(this.hostMapping, brandDto.hostMapping);
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    public final String getHostMapping() {
        return this.hostMapping;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getSubdomain() {
        return this.subdomain;
    }

    public int hashCode() {
        return this.hostMapping.hashCode() + l1.b(l1.b(Long.hashCode(this.id) * 31, 31, this.channelId), 31, this.subdomain);
    }

    @NotNull
    public String toString() {
        long j9 = this.id;
        String str = this.channelId;
        String str2 = this.subdomain;
        String str3 = this.hostMapping;
        StringBuilder sb2 = new StringBuilder("BrandDto(id=");
        sb2.append(j9);
        sb2.append(", channelId=");
        sb2.append(str);
        s.A(sb2, ", subdomain=", str2, ", hostMapping=", str3);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/guidekit/android/internal/rest/model/BrandDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/guidekit/android/internal/rest/model/BrandDto;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return BrandDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("channel_id")
    public static /* synthetic */ void getChannelId$annotations() {
    }

    @g("host_mapping")
    public static /* synthetic */ void getHostMapping$annotations() {
    }

    public BrandDto(long j9, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.id = j9;
        this.channelId = str;
        this.subdomain = str2;
        this.hostMapping = str3;
    }
}
