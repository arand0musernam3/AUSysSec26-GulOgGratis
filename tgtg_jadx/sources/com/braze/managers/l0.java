package com.braze.managers;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f10049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.j f10051d;

    public l0(Context context, q0 q0Var) {
        context.getClass();
        q0Var.getClass();
        this.f10048a = context;
        this.f10049b = q0Var;
        this.f10050c = u70.l.b(new zv.f(29));
        this.f10051d = u70.l.b(new zv.l(0));
    }

    public static final String b(String str) {
        return e0.f.k("Automatically obtained Firebase Cloud Messaging push token: ", str);
    }

    public static final boolean d() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.messaging.FirebaseMessaging", "getToken", new Class[0]);
    }

    public static final String e() {
        return "Failed to register for Firebase Cloud Messaging";
    }

    public static final String f() {
        return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
    }

    public static final String g() {
        return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String h() {
        return "Could not invoke 'getToken()' Not registering for Firebase Cloud Messaging.";
    }

    public static final String i() {
        return "Failed to get push token via instance id";
    }

    public static final String j() {
        return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String k() {
        return "Could not call 'getInstance' method. Not registering for Firebase Cloud Messaging.";
    }

    public final void a(String str) {
        str.getClass();
        try {
            if (((Boolean) this.f10051d.getValue()).booleanValue()) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new mp.a(this, 28));
            } else if (((Boolean) this.f10050c.getValue()).booleanValue()) {
                c(str);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.f(28), 4, (Object) null);
        }
    }

    public final void c(String str) {
        l0 l0Var;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new xv.a(str, 15), 6, (Object) null);
        try {
            Method methodQuietly = ReflectionUtils.getMethodQuietly("com.google.firebase.iid.FirebaseInstanceId", "getInstance", (Class<?>[]) new Class[0]);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(2), 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> pairInvokeMethodQuietly = ReflectionUtils.invokeMethodQuietly(null, methodQuietly, new Object[0]);
            if (!((Boolean) pairInvokeMethodQuietly.f26485a).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(3), 7, (Object) null);
                return;
            }
            Object obj = pairInvokeMethodQuietly.f26486b;
            if (obj == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(4), 7, (Object) null);
                return;
            }
            Method methodQuietly2 = ReflectionUtils.getMethodQuietly(obj.getClass(), "getToken", (Class<?>[]) new Class[]{String.class, String.class});
            if (methodQuietly2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(5), 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> pairInvokeMethodQuietly2 = ReflectionUtils.invokeMethodQuietly(obj, methodQuietly2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (!((Boolean) pairInvokeMethodQuietly2.f26485a).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(6), 7, (Object) null);
                return;
            }
            Object obj2 = pairInvokeMethodQuietly2.f26486b;
            if (obj2 instanceof String) {
                l0Var = this;
                try {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) l0Var, priority, (Throwable) null, false, (Function0) new hw.b(obj2, 7), 6, (Object) null);
                    ((z0) l0Var.f10049b).a((String) obj2);
                } catch (Exception e5) {
                    e = e5;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) l0Var, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new zv.f(27), 4, (Object) null);
                }
            }
        } catch (Exception e11) {
            e = e11;
            l0Var = this;
        }
    }

    public static final String b() {
        return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
    }

    public static final String d(String str) {
        return e0.f.k("Registering for Firebase Cloud Messaging token using sender id: ", str);
    }

    public static final void a(l0 l0Var, Task task) {
        task.getClass();
        if (!task.isSuccessful()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) l0Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(task, 11), 6, (Object) null);
            return;
        }
        String str = (String) task.getResult();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) l0Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new xv.a(str, 14), 6, (Object) null);
        ((z0) l0Var.f10049b).a(str);
    }

    public static final String a(Task task) {
        return b3.i.l("Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception ", task.getException());
    }

    public final boolean a() {
        if (com.braze.support.p.b(this.f10048a)) {
            return ((Boolean) this.f10051d.getValue()).booleanValue() || ((Boolean) this.f10050c.getValue()).booleanValue();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.l(1), 6, (Object) null);
        return false;
    }

    public static final String a(Object obj) {
        return j4.s.j(obj, "Automatically obtained Firebase Cloud Messaging token: ");
    }

    public static final boolean c() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.iid.FirebaseInstanceId", "getToken", String.class, String.class);
    }
}
