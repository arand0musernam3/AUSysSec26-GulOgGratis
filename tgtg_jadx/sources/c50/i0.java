package c50;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i11 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = kotlin.collections.n0.f26529a;
        }
        ArrayList arrayListM = CollectionsKt.M(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i11) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new h0(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, Intrinsics.areEqual(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static h0 b(Context context) {
        Object next;
        String strA;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((h0) next).f7570b == iMyPid) {
                break;
            }
        }
        h0 h0Var = (h0) next;
        if (h0Var != null) {
            return h0Var;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 33) {
            strA = Process.myProcessName();
            strA.getClass();
        } else if ((i11 < 28 || (strA = Application.getProcessName()) == null) && (strA = vz.d.a()) == null) {
            strA = "";
        }
        return new h0(iMyPid, 0, strA, false);
    }
}
