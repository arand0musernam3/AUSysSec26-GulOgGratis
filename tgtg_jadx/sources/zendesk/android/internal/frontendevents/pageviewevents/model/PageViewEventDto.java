package zendesk.android.internal.frontendevents.pageviewevents.model;

import b3.i;
import com.braze.Constants;
import e0.f;
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
import w2.l1;
import zendesk.android.internal.frontendevents.FrontendEventsStorage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u0000 >2\u00020\u0001:\u0002?>B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001cR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\u001cR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\u001cR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\b=\u00100\u001a\u0004\b<\u0010#¨\u0006@"}, d2 = {"Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewEventDto;", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "buid", "channel", "version", "timestamp", FrontendEventsStorage.KEY_SUID, "Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewDto;", "pageView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewDto;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewEventDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewDto;)Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewEventDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "()V", "getBuid", "getBuid$annotations", "getChannel", "getChannel$annotations", "getVersion", "getVersion$annotations", "getTimestamp", "getTimestamp$annotations", "getSuid", "getSuid$annotations", "Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewDto;", "getPageView", "getPageView$annotations", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PageViewEventDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String buid;

    @NotNull
    private final String channel;

    @NotNull
    private final PageViewDto pageView;

    @NotNull
    private final String suid;

    @NotNull
    private final String timestamp;

    @NotNull
    private final String url;

    @NotNull
    private final String version;

    public /* synthetic */ PageViewEventDto(int i11, String str, String str2, String str3, String str4, String str5, String str6, PageViewDto pageViewDto, m1 m1Var) {
        if (127 != (i11 & 127)) {
            c1.j(i11, 127, PageViewEventDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.url = str;
        this.buid = str2;
        this.channel = str3;
        this.version = str4;
        this.timestamp = str5;
        this.suid = str6;
        this.pageView = pageViewDto;
    }

    public static /* synthetic */ PageViewEventDto copy$default(PageViewEventDto pageViewEventDto, String str, String str2, String str3, String str4, String str5, String str6, PageViewDto pageViewDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pageViewEventDto.url;
        }
        if ((i11 & 2) != 0) {
            str2 = pageViewEventDto.buid;
        }
        if ((i11 & 4) != 0) {
            str3 = pageViewEventDto.channel;
        }
        if ((i11 & 8) != 0) {
            str4 = pageViewEventDto.version;
        }
        if ((i11 & 16) != 0) {
            str5 = pageViewEventDto.timestamp;
        }
        if ((i11 & 32) != 0) {
            str6 = pageViewEventDto.suid;
        }
        if ((i11 & 64) != 0) {
            pageViewDto = pageViewEventDto.pageView;
        }
        String str7 = str6;
        PageViewDto pageViewDto2 = pageViewDto;
        String str8 = str5;
        String str9 = str3;
        return pageViewEventDto.copy(str, str2, str9, str4, str8, str7, pageViewDto2);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(PageViewEventDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.url);
        output.q(serialDesc, 1, self.buid);
        output.q(serialDesc, 2, self.channel);
        output.q(serialDesc, 3, self.version);
        output.q(serialDesc, 4, self.timestamp);
        output.q(serialDesc, 5, self.suid);
        output.i(serialDesc, 6, PageViewDto$$serializer.INSTANCE, self.pageView);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBuid() {
        return this.buid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSuid() {
        return this.suid;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PageViewDto getPageView() {
        return this.pageView;
    }

    @NotNull
    public final PageViewEventDto copy(@NotNull String url, @NotNull String buid, @NotNull String channel, @NotNull String version, @NotNull String timestamp, @NotNull String suid, @NotNull PageViewDto pageView) {
        i.B(url, buid, channel, version, timestamp);
        suid.getClass();
        pageView.getClass();
        return new PageViewEventDto(url, buid, channel, version, timestamp, suid, pageView);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageViewEventDto)) {
            return false;
        }
        PageViewEventDto pageViewEventDto = (PageViewEventDto) other;
        return Intrinsics.areEqual(this.url, pageViewEventDto.url) && Intrinsics.areEqual(this.buid, pageViewEventDto.buid) && Intrinsics.areEqual(this.channel, pageViewEventDto.channel) && Intrinsics.areEqual(this.version, pageViewEventDto.version) && Intrinsics.areEqual(this.timestamp, pageViewEventDto.timestamp) && Intrinsics.areEqual(this.suid, pageViewEventDto.suid) && Intrinsics.areEqual(this.pageView, pageViewEventDto.pageView);
    }

    @NotNull
    public final String getBuid() {
        return this.buid;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final PageViewDto getPageView() {
        return this.pageView;
    }

    @NotNull
    public final String getSuid() {
        return this.suid;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.pageView.hashCode() + l1.b(l1.b(l1.b(l1.b(l1.b(this.url.hashCode() * 31, 31, this.buid), 31, this.channel), 31, this.version), 31, this.timestamp), 31, this.suid);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.buid;
        String str3 = this.channel;
        String str4 = this.version;
        String str5 = this.timestamp;
        String str6 = this.suid;
        PageViewDto pageViewDto = this.pageView;
        StringBuilder sbT = f.t("PageViewEventDto(url=", str, ", buid=", str2, ", channel=");
        s.A(sbT, str3, ", version=", str4, ", timestamp=");
        s.A(sbT, str5, ", suid=", str6, ", pageView=");
        sbT.append(pageViewDto);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewEventDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewEventDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PageViewEventDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("buid")
    public static /* synthetic */ void getBuid$annotations() {
    }

    @g("channel")
    public static /* synthetic */ void getChannel$annotations() {
    }

    @g("pageView")
    public static /* synthetic */ void getPageView$annotations() {
    }

    @g(FrontendEventsStorage.KEY_SUID)
    public static /* synthetic */ void getSuid$annotations() {
    }

    @g("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @g(Constants.BRAZE_WEBVIEW_URL_EXTRA)
    public static /* synthetic */ void getUrl$annotations() {
    }

    @g("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public PageViewEventDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull PageViewDto pageViewDto) {
        i.B(str, str2, str3, str4, str5);
        str6.getClass();
        pageViewDto.getClass();
        this.url = str;
        this.buid = str2;
        this.channel = str3;
        this.version = str4;
        this.timestamp = str5;
        this.suid = str6;
        this.pageView = pageViewDto;
    }
}
