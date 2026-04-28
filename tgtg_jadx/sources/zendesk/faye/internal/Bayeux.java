package zendesk.faye.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import n90.c;
import n90.n;
import n90.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.faye.BayeuxOptionalFields;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b \bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0013J/\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0017J;\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lzendesk/faye/internal/Bayeux;", "", "<init>", "()V", "", "value", "Ln90/c;", "json", "Ln90/n;", "parseJsonElement", "(Ljava/lang/String;Ln90/c;)Ln90/n;", "", "supportedConnTypes", "Lzendesk/faye/BayeuxOptionalFields;", "bayeuxOptionalFields", "handshake", "(Ljava/util/List;Lzendesk/faye/BayeuxOptionalFields;Ln90/c;)Ljava/lang/String;", Bayeux.KEY_CLIENT_ID, "connect", "(Ljava/lang/String;Lzendesk/faye/BayeuxOptionalFields;Ln90/c;)Ljava/lang/String;", "disconnect", "channel", "subscribe", "(Ljava/lang/String;Ljava/lang/String;Ln90/c;Lzendesk/faye/BayeuxOptionalFields;)Ljava/lang/String;", "unsubscribe", Bayeux.KEY_DATA, "publish", "(Ljava/lang/String;Ljava/lang/String;Ln90/c;Ljava/lang/String;Lzendesk/faye/BayeuxOptionalFields;)Ljava/lang/String;", "LOG_TAG", "Ljava/lang/String;", "KEY_CHANNEL", "KEY_CLIENT_ID", "KEY_SUBSCRIPTION", "KEY_DATA", "KEY_SUCCESS", "HANDSHAKE_CHANNEL", "CONNECT_CHANNEL", "DISCONNECT_CHANNEL", "SUBSCRIBE_CHANNEL", "UNSUBSCRIBE_CHANNEL", "VALUE_VERSION", "VALUE_MIN_VERSION", "VALUE_CONN_TYPE", "defaultConnectionTypes", "Ljava/util/List;", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBayeux.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bayeux.kt\nzendesk/faye/internal/Bayeux\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,236:1\n1#2:237\n205#3:238\n205#3:239\n205#3:240\n205#3:241\n205#3:242\n205#3:243\n*S KotlinDebug\n*F\n+ 1 Bayeux.kt\nzendesk/faye/internal/Bayeux\n*L\n67#1:238\n93#1:239\n118#1:240\n145#1:241\n172#1:242\n201#1:243\n*E\n"})
public final class Bayeux {

    @NotNull
    public static final String CONNECT_CHANNEL = "/meta/connect";

    @NotNull
    public static final String DISCONNECT_CHANNEL = "/meta/disconnect";

    @NotNull
    public static final String HANDSHAKE_CHANNEL = "/meta/handshake";

    @NotNull
    public static final String KEY_CHANNEL = "channel";

    @NotNull
    public static final String KEY_CLIENT_ID = "clientId";

    @NotNull
    public static final String KEY_DATA = "data";

    @NotNull
    public static final String KEY_SUBSCRIPTION = "subscription";

    @NotNull
    public static final String KEY_SUCCESS = "successful";

    @NotNull
    private static final String LOG_TAG = "Bayeux";

    @NotNull
    public static final String SUBSCRIBE_CHANNEL = "/meta/subscribe";

    @NotNull
    public static final String UNSUBSCRIBE_CHANNEL = "/meta/unsubscribe";

    @NotNull
    private static final String VALUE_MIN_VERSION = "1.0beta";

    @NotNull
    private static final String VALUE_VERSION = "1.0";

    @NotNull
    public static final Bayeux INSTANCE = new Bayeux();

    @NotNull
    private static final String VALUE_CONN_TYPE = "websocket";

    @NotNull
    private static final List<String> defaultConnectionTypes = d0.h("long-polling", "callback-polling", "iframe", VALUE_CONN_TYPE);

    private Bayeux() {
    }

    public static /* synthetic */ String connect$default(Bayeux bayeux, String str, BayeuxOptionalFields bayeuxOptionalFields, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bayeuxOptionalFields = new BayeuxOptionalFields(null, null, 3, null);
        }
        return bayeux.connect(str, bayeuxOptionalFields, cVar);
    }

    public static /* synthetic */ String disconnect$default(Bayeux bayeux, String str, BayeuxOptionalFields bayeuxOptionalFields, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bayeuxOptionalFields = new BayeuxOptionalFields(null, null, 3, null);
        }
        return bayeux.disconnect(str, bayeuxOptionalFields, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String handshake$default(Bayeux bayeux, List list, BayeuxOptionalFields bayeuxOptionalFields, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = defaultConnectionTypes;
        }
        if ((i11 & 2) != 0) {
            bayeuxOptionalFields = new BayeuxOptionalFields(null, null, 3, null);
        }
        return bayeux.handshake(list, bayeuxOptionalFields, cVar);
    }

    private final n parseJsonElement(String value, c json) {
        if (value == null) {
            return null;
        }
        try {
            if (!y.p(value, "{", false) && !y.p(value, "[", false)) {
                Logger.w(LOG_TAG, "parseJsonElement - Received value is not valid JSON: ".concat(value), new Object[0]);
                return null;
            }
            json.getClass();
            return (n) json.b(q.f30781a, value);
        } catch (Exception unused) {
            Logger.w(LOG_TAG, "parseJsonElement - Invalid JSON received: ".concat(value), new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ String publish$default(Bayeux bayeux, String str, String str2, c cVar, String str3, BayeuxOptionalFields bayeuxOptionalFields, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            bayeuxOptionalFields = new BayeuxOptionalFields(null, null, 3, null);
        }
        return bayeux.publish(str, str2, cVar, str3, bayeuxOptionalFields);
    }

    public static /* synthetic */ String subscribe$default(Bayeux bayeux, String str, String str2, c cVar, BayeuxOptionalFields bayeuxOptionalFields, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            bayeuxOptionalFields = new BayeuxOptionalFields(null, null, 3, null);
        }
        return bayeux.subscribe(str, str2, cVar, bayeuxOptionalFields);
    }

    public static /* synthetic */ String unsubscribe$default(Bayeux bayeux, String str, String str2, c cVar, BayeuxOptionalFields bayeuxOptionalFields, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            bayeuxOptionalFields = new BayeuxOptionalFields(null, null, 3, null);
        }
        return bayeux.unsubscribe(str, str2, cVar, bayeuxOptionalFields);
    }

    @NotNull
    public final String connect(@NotNull String clientId, @NotNull BayeuxOptionalFields bayeuxOptionalFields, @NotNull c json) {
        clientId.getClass();
        bayeuxOptionalFields.getClass();
        json.getClass();
        try {
            ConnectRequest connectRequest = new ConnectRequest(CONNECT_CHANNEL, clientId, VALUE_CONN_TYPE, parseJsonElement(bayeuxOptionalFields.getExt(), json), bayeuxOptionalFields.getId());
            json.getClass();
            return json.c(ConnectRequest.INSTANCE.serializer(), connectRequest);
        } catch (Exception unused) {
            Logger.w(LOG_TAG, "connect - malformed json", new Object[0]);
            return "";
        }
    }

    @NotNull
    public final String disconnect(@NotNull String clientId, @NotNull BayeuxOptionalFields bayeuxOptionalFields, @NotNull c json) {
        clientId.getClass();
        bayeuxOptionalFields.getClass();
        json.getClass();
        try {
            DisconnectRequest disconnectRequest = new DisconnectRequest(DISCONNECT_CHANNEL, clientId, parseJsonElement(bayeuxOptionalFields.getExt(), json), bayeuxOptionalFields.getId());
            json.getClass();
            return json.c(DisconnectRequest.INSTANCE.serializer(), disconnectRequest);
        } catch (Exception unused) {
            Logger.w(LOG_TAG, "disconnect - malformed json", new Object[0]);
            return "";
        }
    }

    @NotNull
    public final String handshake(@NotNull List<String> supportedConnTypes, @NotNull BayeuxOptionalFields bayeuxOptionalFields, @NotNull c json) {
        supportedConnTypes.getClass();
        bayeuxOptionalFields.getClass();
        json.getClass();
        try {
            if (supportedConnTypes.isEmpty()) {
                supportedConnTypes = null;
            }
            if (supportedConnTypes == null) {
                supportedConnTypes = defaultConnectionTypes;
            }
            HandshakeRequest handshakeRequest = new HandshakeRequest(HANDSHAKE_CHANNEL, VALUE_VERSION, VALUE_MIN_VERSION, supportedConnTypes, parseJsonElement(bayeuxOptionalFields.getExt(), json), bayeuxOptionalFields.getId());
            json.getClass();
            return json.c(HandshakeRequest.INSTANCE.serializer(), handshakeRequest);
        } catch (Exception unused) {
            Logger.w(LOG_TAG, "handshake - malformed json", new Object[0]);
            return "";
        }
    }

    @NotNull
    public final String publish(@NotNull String channel, @NotNull String data, @NotNull c json, @Nullable String clientId, @NotNull BayeuxOptionalFields bayeuxOptionalFields) {
        channel.getClass();
        data.getClass();
        json.getClass();
        bayeuxOptionalFields.getClass();
        try {
            PublishRequest publishRequest = new PublishRequest(channel, clientId, parseJsonElement(data, json), parseJsonElement(bayeuxOptionalFields.getExt(), json), bayeuxOptionalFields.getId());
            json.getClass();
            return json.c(PublishRequest.INSTANCE.serializer(), publishRequest);
        } catch (Exception unused) {
            Logger.w(LOG_TAG, "publish - malformed json", new Object[0]);
            return "";
        }
    }

    @NotNull
    public final String subscribe(@NotNull String clientId, @NotNull String channel, @NotNull c json, @NotNull BayeuxOptionalFields bayeuxOptionalFields) {
        clientId.getClass();
        channel.getClass();
        json.getClass();
        bayeuxOptionalFields.getClass();
        try {
            SubscribeRequest subscribeRequest = new SubscribeRequest(SUBSCRIBE_CHANNEL, clientId, channel, parseJsonElement(bayeuxOptionalFields.getExt(), json), bayeuxOptionalFields.getId());
            json.getClass();
            return json.c(SubscribeRequest.INSTANCE.serializer(), subscribeRequest);
        } catch (Exception unused) {
            Logger.w(LOG_TAG, "subscribe - malformed json", new Object[0]);
            return "";
        }
    }

    @NotNull
    public final String unsubscribe(@NotNull String clientId, @NotNull String channel, @NotNull c json, @NotNull BayeuxOptionalFields bayeuxOptionalFields) {
        clientId.getClass();
        channel.getClass();
        json.getClass();
        bayeuxOptionalFields.getClass();
        try {
            UnsubscribeRequest unsubscribeRequest = new UnsubscribeRequest(UNSUBSCRIBE_CHANNEL, clientId, channel, parseJsonElement(bayeuxOptionalFields.getExt(), json), bayeuxOptionalFields.getId());
            json.getClass();
            return json.c(UnsubscribeRequest.INSTANCE.serializer(), unsubscribeRequest);
        } catch (Exception unused) {
            Logger.w(LOG_TAG, "unsubscribe - malformed json", new Object[0]);
            return "";
        }
    }
}
