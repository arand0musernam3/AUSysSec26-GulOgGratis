package x30;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import c50.w;
import d40.c2;
import d40.y0;
import d40.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f43821a = new c();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i11 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = n0.f26529a;
        }
        ArrayList arrayListM = CollectionsKt.M(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i11) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            y0 y0Var = new y0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                w.l("Null processName");
                return null;
            }
            y0Var.f14400a = str2;
            y0Var.f14401b = runningAppProcessInfo.pid;
            byte b8 = (byte) (y0Var.f14404e | 1);
            y0Var.f14402c = runningAppProcessInfo.importance;
            y0Var.f14404e = (byte) (b8 | 2);
            y0Var.f14403d = Intrinsics.areEqual(str2, str);
            y0Var.f14404e = (byte) (y0Var.f14404e | 4);
            arrayList2.add(y0Var.a());
        }
        return arrayList2;
    }

    public final c2 b(Context context) {
        Object next;
        String processName;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((z0) ((c2) next)).f14408b == iMyPid) {
                break;
            }
        }
        c2 c2Var = (c2) next;
        if (c2Var != null) {
            return c2Var;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else if (i11 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        y0 y0Var = new y0();
        y0Var.f14400a = processName;
        y0Var.f14401b = iMyPid;
        byte b8 = (byte) (y0Var.f14404e | 1);
        y0Var.f14402c = 0;
        y0Var.f14403d = false;
        y0Var.f14404e = (byte) (((byte) (b8 | 2)) | 4);
        return y0Var.a();
    }
}
