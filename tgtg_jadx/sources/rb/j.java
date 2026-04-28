package rb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import ib.w;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import jb.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37844a = w.f("ProcessUtils");

    public static final boolean a(Context context, ib.b bVar) {
        String strB;
        Object next;
        Object objInvoke;
        context.getClass();
        bVar.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strB = a.b();
        } else {
            strB = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, s.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
            } catch (Throwable th2) {
                if (w.d().f23766a <= 3) {
                    Log.d(f37844a, "Unable to check ActivityThread for processName", th2);
                }
            }
            if (objInvoke instanceof String) {
                strB = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                systemService.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strB = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return Intrinsics.areEqual(strB, context.getApplicationInfo().processName);
    }
}
