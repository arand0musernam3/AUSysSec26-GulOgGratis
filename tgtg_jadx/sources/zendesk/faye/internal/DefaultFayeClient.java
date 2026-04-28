package zendesk.faye.internal;

import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import j4.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m90.d;
import n90.b0;
import n90.c;
import n90.n;
import n90.o;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.p0;
import q90.w0;
import q90.x0;
import zendesk.core.android.internal.a;
import zendesk.faye.BayeuxMessage;
import zendesk.faye.ConnectMessage;
import zendesk.faye.DisconnectMessage;
import zendesk.faye.FayeClient;
import zendesk.faye.FayeClientError;
import zendesk.faye.FayeClientListener;
import zendesk.faye.PublishMessage;
import zendesk.faye.SubscribeMessage;
import zendesk.faye.UnsubscribeMessage;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 N2\u00020\u0001:\u0002ONB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010%J\u001f\u0010'\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b'\u0010#J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b(\u0010#J\u001f\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020 H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u001e\u0010;\u001a\u00060:R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010@\u001a\b\u0012\u0004\u0012\u00020,0?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00107R\u0016\u00101\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010J\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u00102\"\u0004\bM\u0010%¨\u0006P"}, d2 = {"Lzendesk/faye/internal/DefaultFayeClient;", "Lzendesk/faye/FayeClient;", "", "serverUrl", "Lzendesk/faye/internal/OkHttpWebSocket;", "webSocket", "Ln90/c;", "json", "<init>", "(Ljava/lang/String;Lzendesk/faye/internal/OkHttpWebSocket;Ln90/c;)V", "Lzendesk/faye/DisconnectMessage;", "disconnectMessage", "", "disconnect", "(Lzendesk/faye/DisconnectMessage;)V", "Lzendesk/faye/SubscribeMessage;", "subscribeMessage", "subscribeTo", "(Lzendesk/faye/SubscribeMessage;)V", "Lzendesk/faye/UnsubscribeMessage;", "unsubscribeMessage", "unsubscribeFrom", "(Lzendesk/faye/UnsubscribeMessage;)V", "Lzendesk/faye/PublishMessage;", "publishMessage", "publish", "(Lzendesk/faye/PublishMessage;)V", InAppMessageBase.MESSAGE, "parseFayeMessage", "(Ljava/lang/String;)V", "Lzendesk/faye/internal/BayeuxResponse;", "fayeMessage", "", "success", "handleHandshakeMessage", "(Lzendesk/faye/internal/BayeuxResponse;Z)V", "handleConnectMessage", "(Z)V", "handleDisconnectMessage", "handleSubscribeMessage", "handleUnsubscribeMessage", "channel", "handleChannelMessage", "(Ljava/lang/String;Lzendesk/faye/internal/BayeuxResponse;)V", "Lzendesk/faye/FayeClientListener;", "listener", "addListener", "(Lzendesk/faye/FayeClientListener;)V", "removeListener", "isConnected", "()Z", "Lzendesk/faye/BayeuxMessage;", "bayeuxMessage", "send", "(Lzendesk/faye/BayeuxMessage;)V", "Ljava/lang/String;", "Lzendesk/faye/internal/OkHttpWebSocket;", "Ln90/c;", "Lzendesk/faye/internal/DefaultFayeClient$OkHttpWebSocketListener;", "okHttpWebSocketListener", "Lzendesk/faye/internal/DefaultFayeClient$OkHttpWebSocketListener;", "getOkHttpWebSocketListener$zendesk_faye_faye", "()Lzendesk/faye/internal/DefaultFayeClient$OkHttpWebSocketListener;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "listeners", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getListeners$zendesk_faye_faye", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "fayeClientId", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lzendesk/faye/ConnectMessage;", "connectMessage", "Lzendesk/faye/ConnectMessage;", "keepConnectionAlive", "Z", "getKeepConnectionAlive", "setKeepConnectionAlive", "Companion", "OkHttpWebSocketListener", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultFayeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultFayeClient.kt\nzendesk/faye/internal/DefaultFayeClient\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,309:1\n222#2:310\n*S KotlinDebug\n*F\n+ 1 DefaultFayeClient.kt\nzendesk/faye/internal/DefaultFayeClient\n*L\n186#1:310\n*E\n"})
public final class DefaultFayeClient implements FayeClient {

    @NotNull
    private static final String LOG_TAG = "DefaultFayeClient";

    @Nullable
    private ConnectMessage connectMessage;

    @Nullable
    private String fayeClientId;

    @NotNull
    private AtomicBoolean isConnected;

    @NotNull
    private final c json;
    private boolean keepConnectionAlive;

    @NotNull
    private final ConcurrentLinkedQueue<FayeClientListener> listeners;

    @NotNull
    private final OkHttpWebSocketListener okHttpWebSocketListener;

    @NotNull
    private final String serverUrl;

    @NotNull
    private final OkHttpWebSocket webSocket;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lzendesk/faye/internal/DefaultFayeClient$OkHttpWebSocketListener;", "Lq90/x0;", "<init>", "(Lzendesk/faye/internal/DefaultFayeClient;)V", "Lq90/w0;", "webSocket", "Lq90/p0;", "response", "", "onOpen", "(Lq90/w0;Lq90/p0;)V", "", TextBundle.TEXT_ENTRY, "onMessage", "(Lq90/w0;Ljava/lang/String;)V", "", "code", "reason", "onClosed", "(Lq90/w0;ILjava/lang/String;)V", "", Constants.BRAZE_PUSH_TITLE_KEY, "onFailure", "(Lq90/w0;Ljava/lang/Throwable;Lq90/p0;)V", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class OkHttpWebSocketListener extends x0 {
        public OkHttpWebSocketListener() {
        }

        @Override // q90.x0
        public void onClosed(@NotNull w0 webSocket, int code, @NotNull String reason) {
            webSocket.getClass();
            reason.getClass();
            DefaultFayeClient.this.isConnected.set(false);
            DefaultFayeClient.this.webSocket.resetSocket();
            Iterator<FayeClientListener> it = DefaultFayeClient.this.getListeners$zendesk_faye_faye().iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().onDisconnectedFromServer();
            }
        }

        @Override // q90.x0
        public void onFailure(@NotNull w0 webSocket, @NotNull Throwable t9, @Nullable p0 response) {
            webSocket.getClass();
            t9.getClass();
            DefaultFayeClient.this.isConnected.set(false);
            DefaultFayeClient.this.webSocket.resetSocket();
            Iterator<FayeClientListener> it = DefaultFayeClient.this.getListeners$zendesk_faye_faye().iterator();
            it.getClass();
            while (it.hasNext()) {
                FayeClientListener next = it.next();
                next.onDisconnectedFromServer();
                next.onClientError(FayeClientError.CLIENT_TRANSPORT_ERROR, t9);
            }
        }

        @Override // q90.x0
        public void onMessage(@NotNull w0 webSocket, @NotNull String text) {
            webSocket.getClass();
            text.getClass();
            Logger.d(DefaultFayeClient.LOG_TAG, "Message received: " + text, new Object[0]);
            DefaultFayeClient.this.parseFayeMessage(text);
        }

        @Override // q90.x0
        public void onOpen(@NotNull w0 webSocket, @NotNull p0 response) {
            webSocket.getClass();
            response.getClass();
            ConnectMessage connectMessage = DefaultFayeClient.this.connectMessage;
            if (connectMessage != null) {
                DefaultFayeClient.this.webSocket.send(Bayeux.INSTANCE.handshake(connectMessage.getSupportedConnectionTypes(), connectMessage.getHandshakeOptionalFields(), DefaultFayeClient.this.json));
            } else {
                Logger.w(DefaultFayeClient.LOG_TAG, "onOpen called but connectMessage was null, closing the socket", new Object[0]);
                DefaultFayeClient.this.webSocket.disconnect();
            }
        }
    }

    public DefaultFayeClient(@NotNull String str, @NotNull OkHttpWebSocket okHttpWebSocket, @NotNull c cVar) {
        str.getClass();
        okHttpWebSocket.getClass();
        cVar.getClass();
        this.serverUrl = str;
        this.webSocket = okHttpWebSocket;
        this.json = cVar;
        this.okHttpWebSocketListener = new OkHttpWebSocketListener();
        this.listeners = new ConcurrentLinkedQueue<>();
        this.isConnected = new AtomicBoolean(false);
        this.keepConnectionAlive = true;
    }

    private final void disconnect(DisconnectMessage disconnectMessage) {
        String str = this.fayeClientId;
        if (str != null) {
            this.webSocket.send(Bayeux.INSTANCE.disconnect(str, disconnectMessage.getOptionalFields(), this.json));
        }
        this.webSocket.disconnect();
        this.isConnected.set(false);
    }

    private final void handleChannelMessage(String channel, BayeuxResponse fayeMessage) {
        n data = fayeMessage.getData();
        if (data != null) {
            try {
                b0 b0VarG = o.g(data);
                Iterator<FayeClientListener> it = this.listeners.iterator();
                it.getClass();
                while (it.hasNext()) {
                    it.next().onMessageReceived(channel, b0VarG.toString());
                }
            } catch (Exception unused) {
                Logger.w(LOG_TAG, "handleChannelMessage - data is not a JSON object", new Object[0]);
            }
        }
    }

    private final void handleConnectMessage(boolean success) {
        String str = this.fayeClientId;
        ConnectMessage connectMessage = this.connectMessage;
        if (success && connectMessage != null && str != null) {
            if (getKeepConnectionAlive()) {
                this.webSocket.send(Bayeux.INSTANCE.connect(str, connectMessage.getConnectOptionalFields(), this.json));
            }
        } else {
            this.webSocket.disconnect();
            Iterator<FayeClientListener> it = this.listeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().onDisconnectedFromServer();
            }
        }
    }

    private final void handleDisconnectMessage(boolean success) {
        if (!success) {
            Logger.w(LOG_TAG, "handleDisconnectMessage called, but success was false", new Object[0]);
            return;
        }
        this.isConnected.set(false);
        this.webSocket.disconnect();
        Iterator<FayeClientListener> it = this.listeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().onDisconnectedFromServer();
        }
    }

    private final void handleHandshakeMessage(BayeuxResponse fayeMessage, boolean success) {
        String clientId = fayeMessage.getClientId();
        ConnectMessage connectMessage = this.connectMessage;
        if (!success || clientId == null || connectMessage == null) {
            this.webSocket.disconnect();
            return;
        }
        this.isConnected.set(true);
        this.fayeClientId = clientId;
        this.webSocket.send(Bayeux.INSTANCE.connect(clientId, connectMessage.getConnectOptionalFields(), this.json));
        Iterator<FayeClientListener> it = this.listeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().onConnectedToServer();
        }
    }

    private final void handleSubscribeMessage(BayeuxResponse fayeMessage, boolean success) {
        ConcurrentLinkedQueue<FayeClientListener> concurrentLinkedQueue = this.listeners;
        if (!success) {
            Iterator<FayeClientListener> it = concurrentLinkedQueue.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().onClientError(FayeClientError.CLIENT_SUBSCRIBE_FAILED_ERROR, new IllegalStateException("CLIENT_SUBSCRIBE_FAILED_ERROR"));
            }
            Logger.w(LOG_TAG, "handleSubscribeMessage called, but success was false", new Object[0]);
            return;
        }
        Iterator<FayeClientListener> it2 = concurrentLinkedQueue.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            FayeClientListener next = it2.next();
            String subscription = fayeMessage.getSubscription();
            if (subscription == null) {
                subscription = "";
            }
            next.onSubscribedToChannel(subscription);
        }
    }

    private final void handleUnsubscribeMessage(BayeuxResponse fayeMessage, boolean success) {
        if (!success) {
            Logger.w(LOG_TAG, "handleUnsubscribeMessage called, but success was false", new Object[0]);
            return;
        }
        Logger.w(LOG_TAG, "handleSubscribeMessage called successfully", new Object[0]);
        Iterator<FayeClientListener> it = this.listeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            FayeClientListener next = it.next();
            String subscription = fayeMessage.getSubscription();
            if (subscription == null) {
                subscription = "";
            }
            next.onUnsubscribedFromChannel(subscription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void parseFayeMessage(String message) {
        try {
            c cVar = this.json;
            cVar.getClass();
            for (BayeuxResponse bayeuxResponse : (List) cVar.b(new d(BayeuxResponse.INSTANCE.serializer(), 0), message)) {
                String channel = bayeuxResponse.getChannel();
                if (channel == null) {
                    channel = "";
                }
                boolean successful = bayeuxResponse.getSuccessful();
                switch (channel.hashCode()) {
                    case -1992173988:
                        if (channel.equals(Bayeux.HANDSHAKE_CHANNEL)) {
                            handleHandshakeMessage(bayeuxResponse, successful);
                        } else {
                            handleChannelMessage(channel, bayeuxResponse);
                        }
                        break;
                    case -1839038474:
                        if (channel.equals(Bayeux.UNSUBSCRIBE_CHANNEL)) {
                            handleUnsubscribeMessage(bayeuxResponse, successful);
                        } else {
                            handleChannelMessage(channel, bayeuxResponse);
                        }
                        break;
                    case -1548011601:
                        if (channel.equals(Bayeux.SUBSCRIBE_CHANNEL)) {
                            handleSubscribeMessage(bayeuxResponse, successful);
                        } else {
                            handleChannelMessage(channel, bayeuxResponse);
                        }
                        break;
                    case -114481009:
                        if (channel.equals(Bayeux.CONNECT_CHANNEL)) {
                            handleConnectMessage(successful);
                        } else {
                            handleChannelMessage(channel, bayeuxResponse);
                        }
                        break;
                    case 1006455511:
                        if (channel.equals(Bayeux.DISCONNECT_CHANNEL)) {
                            handleDisconnectMessage(successful);
                        } else {
                            handleChannelMessage(channel, bayeuxResponse);
                        }
                        break;
                    default:
                        handleChannelMessage(channel, bayeuxResponse);
                        break;
                }
            }
        } catch (Exception e5) {
            Logger.w(LOG_TAG, f.k("parseFayeMessage failed to parse message: ", message), e5, new Object[0]);
        }
    }

    private final void publish(PublishMessage publishMessage) {
        if (!this.isConnected.get()) {
            Iterator<FayeClientListener> it = this.listeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().onClientError(FayeClientError.CLIENT_NOT_CONNECTED_ERROR, null);
            }
            return;
        }
        String strPublish = Bayeux.INSTANCE.publish(publishMessage.getChannel(), publishMessage.getMessage(), this.json, this.fayeClientId, publishMessage.getOptionalFields());
        Logger.d(LOG_TAG, s.k("Publishing to channel ", publishMessage.getChannel(), ", message: ", publishMessage.getMessage()), new Object[0]);
        this.webSocket.send(strPublish);
        Iterator<FayeClientListener> it2 = this.listeners.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            it2.next().onMessagePublished(publishMessage.getChannel(), publishMessage.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeListener$lambda$0(FayeClientListener fayeClientListener, FayeClientListener fayeClientListener2) {
        return Intrinsics.areEqual(fayeClientListener2, fayeClientListener);
    }

    private final void subscribeTo(SubscribeMessage subscribeMessage) {
        String str = this.fayeClientId;
        if (this.isConnected.get() && str != null) {
            this.webSocket.send(Bayeux.INSTANCE.subscribe(str, subscribeMessage.getChannel(), this.json, subscribeMessage.getOptionalFields()));
        } else {
            Iterator<FayeClientListener> it = this.listeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().onClientError(FayeClientError.CLIENT_NOT_CONNECTED_ERROR, null);
            }
        }
    }

    private final void unsubscribeFrom(UnsubscribeMessage unsubscribeMessage) {
        String str = this.fayeClientId;
        if (this.isConnected.get() && str != null) {
            this.webSocket.send(Bayeux.INSTANCE.unsubscribe(str, unsubscribeMessage.getChannel(), this.json, unsubscribeMessage.getOptionalFields()));
        } else {
            Iterator<FayeClientListener> it = this.listeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().onClientError(FayeClientError.CLIENT_NOT_CONNECTED_ERROR, null);
            }
        }
    }

    @Override // zendesk.faye.FayeClient
    public synchronized void addListener(@NotNull FayeClientListener listener) {
        listener.getClass();
        if (!this.listeners.contains(listener)) {
            this.listeners.add(listener);
        }
    }

    @Override // zendesk.faye.FayeClient
    public boolean getKeepConnectionAlive() {
        return this.keepConnectionAlive;
    }

    @NotNull
    public final ConcurrentLinkedQueue<FayeClientListener> getListeners$zendesk_faye_faye() {
        return this.listeners;
    }

    @NotNull
    /* JADX INFO: renamed from: getOkHttpWebSocketListener$zendesk_faye_faye, reason: from getter */
    public final OkHttpWebSocketListener getOkHttpWebSocketListener() {
        return this.okHttpWebSocketListener;
    }

    @Override // zendesk.faye.FayeClient
    public boolean isConnected() {
        return this.isConnected.get();
    }

    @Override // zendesk.faye.FayeClient
    public synchronized void removeListener(@NotNull FayeClientListener listener) {
        listener.getClass();
        ConcurrentLinkedQueue<FayeClientListener> concurrentLinkedQueue = this.listeners;
        a aVar = new a(listener, 1);
        concurrentLinkedQueue.getClass();
        i0.u(concurrentLinkedQueue, aVar, true);
    }

    @Override // zendesk.faye.FayeClient
    public void send(@NotNull BayeuxMessage bayeuxMessage) {
        bayeuxMessage.getClass();
        if (bayeuxMessage instanceof ConnectMessage) {
            if (this.webSocket.connectTo(this.serverUrl, this.okHttpWebSocketListener)) {
                this.connectMessage = (ConnectMessage) bayeuxMessage;
            }
        } else {
            if (bayeuxMessage instanceof DisconnectMessage) {
                disconnect((DisconnectMessage) bayeuxMessage);
                return;
            }
            if (bayeuxMessage instanceof SubscribeMessage) {
                subscribeTo((SubscribeMessage) bayeuxMessage);
                return;
            }
            if (bayeuxMessage instanceof UnsubscribeMessage) {
                unsubscribeFrom((UnsubscribeMessage) bayeuxMessage);
            } else if (bayeuxMessage instanceof PublishMessage) {
                publish((PublishMessage) bayeuxMessage);
            } else {
                e40.a.f();
            }
        }
    }

    @Override // zendesk.faye.FayeClient
    public void setKeepConnectionAlive(boolean z11) {
        this.keepConnectionAlive = z11;
    }
}
