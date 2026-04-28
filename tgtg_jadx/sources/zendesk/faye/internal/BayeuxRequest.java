package zendesk.faye.internal;

import i90.f;
import i90.h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import n90.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \f2\u00020\u0001:\u0001\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lzendesk/faye/internal/BayeuxRequest;", "", "", "getChannel", "()Ljava/lang/String;", "channel", "getId", "id", "Ln90/n;", "getExt", "()Ln90/n;", "ext", "Companion", "Lzendesk/faye/internal/ConnectRequest;", "Lzendesk/faye/internal/DisconnectRequest;", "Lzendesk/faye/internal/HandshakeRequest;", "Lzendesk/faye/internal/PublishRequest;", "Lzendesk/faye/internal/SubscribeRequest;", "Lzendesk/faye/internal/UnsubscribeRequest;", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BayeuxRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/faye/internal/BayeuxRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/faye/internal/BayeuxRequest;", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return new f("zendesk.faye.internal.BayeuxRequest", Reflection.getOrCreateKotlinClass(BayeuxRequest.class), new KClass[]{Reflection.getOrCreateKotlinClass(ConnectRequest.class), Reflection.getOrCreateKotlinClass(DisconnectRequest.class), Reflection.getOrCreateKotlinClass(HandshakeRequest.class), Reflection.getOrCreateKotlinClass(PublishRequest.class), Reflection.getOrCreateKotlinClass(SubscribeRequest.class), Reflection.getOrCreateKotlinClass(UnsubscribeRequest.class)}, new KSerializer[]{ConnectRequest$$serializer.INSTANCE, DisconnectRequest$$serializer.INSTANCE, HandshakeRequest$$serializer.INSTANCE, PublishRequest$$serializer.INSTANCE, SubscribeRequest$$serializer.INSTANCE, UnsubscribeRequest$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @NotNull
    String getChannel();

    @Nullable
    n getExt();

    @Nullable
    String getId();
}
