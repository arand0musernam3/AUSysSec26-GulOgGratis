package pz;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.braze.h2;
import com.google.android.gms.common.internal.i0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35640a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f35641b = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        i0.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f35640a) {
            h2.b("Cannot call get on this connection more than once");
            return null;
        }
        this.f35640a = true;
        IBinder iBinder = (IBinder) this.f35641b.poll(ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f35641b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
