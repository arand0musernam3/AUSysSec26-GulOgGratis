package jb;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ba.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24894c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f24895d;

    public g(Context context) {
        super(9, 10);
        this.f24895d = context;
    }

    @Override // ba.a
    public final void b(ja.b bVar) {
        int i11 = this.f24894c;
        bVar.getClass();
        switch (i11) {
            case 0:
                if (this.f6075b >= 10) {
                    bVar.t(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f24895d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.r("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f24895d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j9 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.a();
                    try {
                        bVar.t(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j9)});
                        bVar.t(new Object[]{"reschedule_needed", Long.valueOf(j11)});
                        sharedPreferences.edit().clear().apply();
                        bVar.A();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i12 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i13 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.a();
                    try {
                        bVar.t(new Object[]{"next_job_scheduler_id", Integer.valueOf(i12)});
                        bVar.t(new Object[]{"next_alarm_manager_id", Integer.valueOf(i13)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.A();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public g(Context context, int i11, int i12) {
        super(i11, i12);
        this.f24895d = context;
    }
}
