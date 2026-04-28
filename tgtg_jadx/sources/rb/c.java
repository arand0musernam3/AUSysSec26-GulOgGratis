package rb;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import ib.w;
import jb.s;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37829e = w.f("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f37830f = 315360000000L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f37832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb.b f37833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37834d = 0;

    public c(Context context, s sVar) {
        this.f37831a = context.getApplicationContext();
        this.f37832b = sVar;
        this.f37833c = sVar.f24930g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
        long jCurrentTimeMillis = System.currentTimeMillis() + f37830f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.c.a():void");
    }

    public final boolean b() {
        ib.b bVar = this.f37832b.f24925b;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f37829e;
        if (zIsEmpty) {
            w.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = j.a(this.f37831a, bVar);
        w.d().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f37831a;
        String str = f37829e;
        s sVar = this.f37832b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    p30.b.A(context);
                    w.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e5) {
                        int i11 = this.f37834d + 1;
                        this.f37834d = i11;
                        if (i11 >= 3) {
                            String str2 = u.K(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            w.d().c(str, str2, e5);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e5);
                            sVar.f24925b.getClass();
                            throw illegalStateException;
                        }
                        long j9 = ((long) i11) * 300;
                        String str3 = "Retrying after " + j9;
                        if (w.d().f23766a <= 3) {
                            Log.d(str, str3, e5);
                        }
                        try {
                            Thread.sleep(((long) this.f37834d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    w.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    sVar.f24925b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            sVar.g();
        }
    }
}
