package zendesk.android.internal.proactivemessaging.model;

import a80.a;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import i90.g;
import i90.h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import u70.j;
import u70.l;
import u70.m;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/IntegrationType;", "", "<init>", "(Ljava/lang/String;I)V", "ANDROID", "IOS", "WEB", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntegrationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IntegrationType[] $VALUES;

    @NotNull
    private static final j $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g(AnalyticsPlatformParams.channel)
    public static final IntegrationType ANDROID = new IntegrationType("ANDROID", 0);

    @g("ios")
    public static final IntegrationType IOS = new IntegrationType("IOS", 1);

    @g("web")
    public static final IntegrationType WEB = new IntegrationType("WEB", 2);

    private static final /* synthetic */ IntegrationType[] $values() {
        return new IntegrationType[]{ANDROID, IOS, WEB};
    }

    static {
        IntegrationType[] integrationTypeArr$values = $values();
        $VALUES = integrationTypeArr$values;
        $ENTRIES = n.w(integrationTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = l.a(m.PUBLICATION, new xw.a(21));
    }

    private IntegrationType(String str, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return c1.e("zendesk.android.internal.proactivemessaging.model.IntegrationType", values(), new String[]{AnalyticsPlatformParams.channel, "ios", "web"}, new Annotation[][]{null, null, null});
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static IntegrationType valueOf(String str) {
        return (IntegrationType) Enum.valueOf(IntegrationType.class, str);
    }

    public static IntegrationType[] values() {
        return (IntegrationType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/IntegrationType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/IntegrationType;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) IntegrationType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
