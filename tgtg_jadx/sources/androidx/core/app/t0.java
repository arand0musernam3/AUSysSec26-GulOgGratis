package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f2695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2696c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f2697d = new HashSet();

    public t0(Context context) {
        this.f2694a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f2695b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(s0 s0Var) {
        boolean z11;
        ArrayDeque arrayDeque = s0Var.f2692d;
        ComponentName componentName = s0Var.f2689a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (s0Var.f2690b) {
            z11 = true;
        } else {
            Intent component = new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(componentName);
            Context context = this.f2694a;
            boolean zBindService = context.bindService(component, this, 33);
            s0Var.f2690b = zBindService;
            if (zBindService) {
                s0Var.f2693e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z11 = s0Var.f2690b;
        }
        if (!z11 || s0Var.f2691c == null) {
            b(s0Var);
            return;
        }
        while (true) {
            u0 u0Var = (u0) arrayDeque.peek();
            if (u0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + u0Var);
                }
                ((q0) u0Var).a(s0Var.f2691c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e5) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e5);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(s0Var);
    }

    public final void b(s0 s0Var) {
        ComponentName componentName = s0Var.f2689a;
        ArrayDeque arrayDeque = s0Var.f2692d;
        Handler handler = this.f2695b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i11 = s0Var.f2693e;
        int i12 = i11 + 1;
        s0Var.f2693e = i12;
        if (i12 <= 6) {
            int i13 = (1 << i11) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i13 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i13);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + s0Var.f2693e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        c.c cVar = null;
        Context context = this.f2694a;
        HashMap map = this.f2696c;
        if (i11 == 0) {
            u0 u0Var = (u0) message.obj;
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(context);
            if (!enabledListenerPackages.equals(this.f2697d)) {
                this.f2697d = enabledListenerPackages;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        map.put(componentName2, new s0(componentName2));
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        s0 s0Var = (s0) entry.getValue();
                        if (s0Var.f2690b) {
                            context.unbindService(this);
                            s0Var.f2690b = false;
                        }
                        s0Var.f2691c = null;
                        it.remove();
                    }
                }
            }
            for (s0 s0Var2 : map.values()) {
                s0Var2.f2692d.add(u0Var);
                a(s0Var2);
            }
        } else if (i11 == 1) {
            r0 r0Var = (r0) message.obj;
            ComponentName componentName3 = r0Var.f2662a;
            IBinder iBinder = r0Var.f2663b;
            s0 s0Var3 = (s0) map.get(componentName3);
            if (s0Var3 != null) {
                int i12 = c.b.f6786g;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.c.f6787c);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c.c)) {
                        c.a aVar = new c.a();
                        aVar.f6785g = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (c.c) iInterfaceQueryLocalInterface;
                    }
                }
                s0Var3.f2691c = cVar;
                s0Var3.f2693e = 0;
                a(s0Var3);
                return true;
            }
        } else if (i11 == 2) {
            s0 s0Var4 = (s0) map.get((ComponentName) message.obj);
            if (s0Var4 != null) {
                if (s0Var4.f2690b) {
                    context.unbindService(this);
                    s0Var4.f2690b = false;
                }
                s0Var4.f2691c = null;
                return true;
            }
        } else {
            if (i11 != 3) {
                return false;
            }
            s0 s0Var5 = (s0) map.get((ComponentName) message.obj);
            if (s0Var5 != null) {
                a(s0Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f2695b.obtainMessage(1, new r0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f2695b.obtainMessage(2, componentName).sendToTarget();
    }
}
