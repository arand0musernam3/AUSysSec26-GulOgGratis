package zendesk.conversationkit.android.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.braze.h2;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.j2;
import v80.x;
import w2.l1;
import y80.a2;
import y80.f1;
import y80.r;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001d\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lv80/x;", "ioDispatcher", "<init>", "(Landroid/net/ConnectivityManager;Lv80/x;)V", "", "refreshNetworkState", "()V", "", "isNetworkAvailable", "()Z", "Ly80/i;", "Lzendesk/conversationkit/android/ConnectionStatus;", "observeNetworkState", "()Ly80/i;", "", "timeoutMs", "awaitConnectionWithTimeout", "(JLx70/c;)Ljava/lang/Object;", "disconnect", "connect", "Landroid/net/ConnectivityManager;", "Lv80/x;", "Ly80/f1;", "connectionState", "Ly80/f1;", "zendesk/conversationkit/android/internal/ConnectivityObserver$networkCallback$1", "networkCallback", "Lzendesk/conversationkit/android/internal/ConnectivityObserver$networkCallback$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered$zendesk_conversationkit_conversationkit_android", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectivityObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectivityObserver.kt\nzendesk/conversationkit/android/internal/ConnectivityObserver\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n230#2,5:143\n230#2,5:148\n1#3:153\n*S KotlinDebug\n*F\n+ 1 ConnectivityObserver.kt\nzendesk/conversationkit/android/internal/ConnectivityObserver\n*L\n56#1:143,5\n60#1:148,5\n*E\n"})
public final class ConnectivityObserver {

    @NotNull
    private static final String LOG_TAG = "ConnectivityObserver";

    @NotNull
    private final f1 connectionState;

    @Nullable
    private final ConnectivityManager connectivityManager;

    @NotNull
    private final x ioDispatcher;

    @NotNull
    private final AtomicBoolean isRegistered;

    @NotNull
    private final ConnectivityObserver$networkCallback$1 networkCallback;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConnectivityObserver$awaitConnectionWithTimeout$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConnectivityObserver$awaitConnectionWithTimeout$2", f = "ConnectivityObserver.kt", l = {99}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ long $timeoutMs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j9, x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$timeoutMs = j9;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConnectivityObserver.this.new AnonymousClass2(this.$timeoutMs, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) throws TimeoutException {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConnectivityObserver.this.connect();
                if (((a2) ConnectivityObserver.this.connectionState).getValue() != ConnectionStatus.CONNECTED) {
                    long j9 = this.$timeoutMs;
                    ConnectivityObserver$awaitConnectionWithTimeout$2$success$1 connectivityObserver$awaitConnectionWithTimeout$2$success$1 = new ConnectivityObserver$awaitConnectionWithTimeout$2$success$1(ConnectivityObserver.this, null);
                    this.label = 1;
                    obj = j2.c(j9, connectivityObserver$awaitConnectionWithTimeout$2$success$1, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f26487a;
            }
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            Boolean bool = (Boolean) obj;
            if (!(bool != null ? bool.booleanValue() : false)) {
                throw new TimeoutException(l1.e("Failed to connect within ", this.$timeoutMs, " ms"));
            }
            return Unit.f26487a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [zendesk.conversationkit.android.internal.ConnectivityObserver$networkCallback$1] */
    public ConnectivityObserver(@Nullable ConnectivityManager connectivityManager, @NotNull x xVar) {
        xVar.getClass();
        this.connectivityManager = connectivityManager;
        this.ioDispatcher = xVar;
        this.connectionState = r.c(ConnectionStatus.DISCONNECTED);
        this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: zendesk.conversationkit.android.internal.ConnectivityObserver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                a2 a2Var;
                Object value;
                network.getClass();
                f1 f1Var = this.this$0.connectionState;
                do {
                    a2Var = (a2) f1Var;
                    value = a2Var.getValue();
                } while (!a2Var.g(value, ConnectionStatus.CONNECTED));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                a2 a2Var;
                Object value;
                network.getClass();
                f1 f1Var = this.this$0.connectionState;
                do {
                    a2Var = (a2) f1Var;
                    value = a2Var.getValue();
                } while (!a2Var.g(value, ConnectionStatus.DISCONNECTED));
            }
        };
        this.isRegistered = new AtomicBoolean(false);
        refreshNetworkState();
    }

    private final boolean isNetworkAvailable() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.connectivityManager;
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = this.connectivityManager.getNetworkCapabilities(activeNetwork)) == null || (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(2))) ? false : true;
    }

    private final void refreshNetworkState() {
        a2 a2Var;
        Object value;
        a2 a2Var2;
        Object value2;
        boolean zIsNetworkAvailable = isNetworkAvailable();
        f1 f1Var = this.connectionState;
        if (zIsNetworkAvailable) {
            do {
                a2Var2 = (a2) f1Var;
                value2 = a2Var2.getValue();
            } while (!a2Var2.g(value2, ConnectionStatus.CONNECTED));
            return;
        }
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, ConnectionStatus.DISCONNECTED));
    }

    @Nullable
    public final Object awaitConnectionWithTimeout(long j9, @NotNull x70.c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.ioDispatcher, new AnonymousClass2(j9, null), cVar);
        return objK == y70.a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    public final void connect() {
        if (this.connectivityManager == null) {
            Logger.e(LOG_TAG, "ConnectivityManager is null, cannot register NetworkCallback", new Object[0]);
        } else {
            if (this.isRegistered.get()) {
                return;
            }
            refreshNetworkState();
            this.isRegistered.set(true);
            this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.networkCallback);
        }
    }

    public final void disconnect() {
        if (this.isRegistered.get()) {
            this.isRegistered.set(false);
            try {
                ConnectivityManager connectivityManager = this.connectivityManager;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(this.networkCallback);
                }
            } catch (IllegalArgumentException e5) {
                Logger.e(LOG_TAG, "Error unregistering network callback", e5, new Object[0]);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: isRegistered$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final AtomicBoolean getIsRegistered() {
        return this.isRegistered;
    }

    @NotNull
    public final y80.i observeNetworkState() {
        return this.connectionState;
    }
}
