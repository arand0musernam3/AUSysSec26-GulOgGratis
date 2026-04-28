package y00;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.y8;
import com.google.android.gms.internal.measurement.z8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import zendesk.faye.internal.Bayeux;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends f4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f44945g = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f44946h = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f44947i = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f44948j = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f44949k = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] l = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f44950m = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f44951n = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f44952o = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f44953p = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String[] f44954q = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f44955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.j f44956f;

    public m(l4 l4Var) {
        super(l4Var);
        this.f44956f = new androidx.recyclerview.widget.j(((n1) this.f21216b).f44992k);
        ((n1) this.f21216b).getClass();
        this.f44955e = new l(this, ((n1) this.f21216b).f44982a);
    }

    public static final String U(List list) {
        return list.isEmpty() ? "" : w.a0.p(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void c0(ContentValues contentValues, Object obj) {
        com.google.android.gms.common.internal.i0.e("value");
        com.google.android.gms.common.internal.i0.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            i4.a.f("Invalid value type");
        }
    }

    public final void A(ArrayList arrayList) {
        n1 n1Var = (n1) this.f21216b;
        p();
        q();
        com.google.android.gms.common.internal.i0.h(arrayList);
        if (arrayList.size() == 0) {
            i4.a.f("Given Integer is zero");
            return;
        }
        if (a0()) {
            String strJoin = TextUtils.join(MessageLogView.COMMA_SEPARATOR, arrayList);
            String strN = e0.f.n(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (L(e0.f.n(new StringBuilder(strN.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strN, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45263j.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseG0 = g0();
                StringBuilder sb2 = new StringBuilder(strN.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strN);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseG0.execSQL(sb2.toString());
            } catch (SQLiteException e5) {
                w0 w0Var2 = n1Var.f44987f;
                n1.m(w0Var2);
                w0Var2.f45260g.b(e5, "Error incrementing retry count. error");
            }
        }
    }

    public final void B(Long l7) {
        n1 n1Var = (n1) this.f21216b;
        p();
        q();
        if (a0()) {
            StringBuilder sb2 = new StringBuilder(l7.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l7);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (L(sb2.toString(), null) > 0) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45263j.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseG0 = g0();
                n1Var.f44992k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l7.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l7);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseG0.execSQL(sb4.toString());
            } catch (SQLiteException e5) {
                w0 w0Var2 = n1Var.f44987f;
                n1.m(w0Var2);
                w0Var2.f45260g.b(e5, "Error incrementing retry count. error");
            }
        }
    }

    public final Object C(Cursor cursor, int i11) {
        n1 n1Var = (n1) this.f21216b;
        int type = cursor.getType(i11);
        if (type == 0) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i11));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i11));
        }
        if (type == 3) {
            return cursor.getString(i11);
        }
        if (type != 4) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45260g.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        w0 w0Var3 = n1Var.f44987f;
        n1.m(w0Var3);
        w0Var3.f45260g.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long D(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f21216b
            y00.n1 r0 = (y00.n1) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            com.google.android.gms.common.internal.i0.e(r14)
            java.lang.String r2 = "first_open_count"
            com.google.android.gms.common.internal.i0.e(r2)
            r13.p()
            r13.q()
            android.database.sqlite.SQLiteDatabase r3 = r13.g0()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.M(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r6 = "app2"
            java.lang.String r11 = "app_id"
            if (r1 != 0) goto L72
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r1, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L71
            y00.w0 r1 = r0.f44987f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            y00.n1.m(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            y00.u0 r1 = r1.f45260g     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            y00.v0 r9 = y00.w0.x(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.c(r6, r9, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r14 = move-exception
            goto Lc1
        L6f:
            r1 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r2, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r11 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = r3.update(r6, r1, r11, r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto La6
            y00.w0 r1 = r0.f44987f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            y00.n1.m(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            y00.u0 r1 = r1.f45260g     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            y00.v0 r5 = y00.w0.x(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.c(r4, r5, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r1 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            y00.w0 r0 = r0.f44987f     // Catch: java.lang.Throwable -> L6d
            y00.n1.m(r0)     // Catch: java.lang.Throwable -> L6d
            y00.u0 r0 = r0.f45260g     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            y00.v0 r14 = y00.w0.x(r14)     // Catch: java.lang.Throwable -> L6d
            r0.d(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.D(java.lang.String):long");
    }

    public final boolean E(String str, String str2) {
        return L("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void F(List list) {
        com.google.android.gms.common.internal.i0.h(list);
        p();
        q();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i11 != 0) {
                sb2.append(MessageLogView.COMMA_SEPARATOR);
            }
            sb2.append(((Long) list.get(i11)).longValue());
        }
        sb2.append(")");
        int iDelete = g0().delete("raw_events", sb2.toString(), null);
        if (iDelete != list.size()) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45260g.c("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    public final long G(String str) {
        com.google.android.gms.common.internal.i0.e(str);
        return M("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void H(String str, Long l7, long j9, t8 t8Var) {
        p();
        q();
        com.google.android.gms.common.internal.i0.h(t8Var);
        com.google.android.gms.common.internal.i0.e(str);
        n1 n1Var = (n1) this.f21216b;
        byte[] bArrA = t8Var.a();
        w0 w0Var = n1Var.f44987f;
        w0 w0Var2 = n1Var.f44987f;
        n1.m(w0Var);
        w0Var.f45267o.c("Saving complex main event, appId, data size", n1Var.f44991j.a(str), Integer.valueOf(bArrA.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l7);
        contentValues.put("children_to_process", Long.valueOf(j9));
        contentValues.put("main_event", bArrA);
        try {
            if (g0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                n1.m(w0Var2);
                w0Var2.f45260g.b(w0.x(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e5) {
            n1.m(w0Var2);
            w0Var2.f45260g.c("Error storing complex main event. appId", w0.x(str), e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.lang.String r27, java.lang.Long r28, java.lang.String r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.I(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.b2 J(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f21216b
            y00.n1 r0 = (y00.n1) r0
            com.google.android.gms.common.internal.i0.h(r5)
            r4.p()
            r4.q()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.g0()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            y00.w0 r1 = r0.f44987f     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            y00.n1.m(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            y00.u0 r1 = r1.f45267o     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.a(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r5.close()
            goto L5c
        L32:
            r0 = move-exception
            goto L45
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            y00.b2 r2 = y00.b2.c(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r5
            goto L62
        L47:
            r5 = move-exception
            r0 = r5
            goto L62
        L4a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L4d:
            y00.w0 r0 = r0.f44987f     // Catch: java.lang.Throwable -> L32
            y00.n1.m(r0)     // Catch: java.lang.Throwable -> L32
            y00.u0 r0 = r0.f45260g     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.b(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            y00.b2 r5 = y00.b2.f44615c
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.J(java.lang.String):y00.b2");
    }

    public final void K(String str, y3 y3Var) {
        p();
        q();
        com.google.android.gms.common.internal.i0.e(str);
        n1 n1Var = (n1) this.f21216b;
        vz.b bVar = n1Var.f44992k;
        w0 w0Var = n1Var.f44987f;
        bVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        f0 f0Var = g0.f44811u0;
        long jLongValue = jCurrentTimeMillis - ((Long) f0Var.a(null)).longValue();
        long j9 = y3Var.f45327b;
        if (j9 < jLongValue || j9 > ((Long) f0Var.a(null)).longValue() + jCurrentTimeMillis) {
            n1.m(w0Var);
            w0Var.f45263j.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", w0.x(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j9));
        }
        n1.m(w0Var);
        w0Var.f45267o.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", y3Var.f45326a);
        contentValues.put("source", Integer.valueOf(y3Var.f45328c));
        contentValues.put("timestamp_millis", Long.valueOf(j9));
        try {
            if (g0().insert("trigger_uris", null, contentValues) == -1) {
                n1.m(w0Var);
                w0Var.f45260g.b(w0.x(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e5) {
            n1.m(w0Var);
            w0Var.f45260g.c("Error storing trigger URI. appId", w0.x(str), e5);
        }
    }

    public final long L(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = g0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j9 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j9;
            } catch (SQLiteException e5) {
                w0 w0Var = ((n1) this.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45260g.c("Database error", str, e5);
                throw e5;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long M(String str, String[] strArr, long j9) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = g0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j9 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j9;
            } catch (SQLiteException e5) {
                w0 w0Var = ((n1) this.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45260g.c("Database error", str, e5);
                throw e5;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String N(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.g0()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r5 == 0) goto L18
            r5 = 0
            java.lang.String r4 = r1.getString(r5)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r1.close()
            return r4
        L18:
            r1.close()
            java.lang.String r4 = ""
            return r4
        L1e:
            r4 = move-exception
            goto L32
        L20:
            r5 = move-exception
            java.lang.Object r0 = r3.f21216b     // Catch: java.lang.Throwable -> L1e
            y00.n1 r0 = (y00.n1) r0     // Catch: java.lang.Throwable -> L1e
            y00.w0 r0 = r0.f44987f     // Catch: java.lang.Throwable -> L1e
            y00.n1.m(r0)     // Catch: java.lang.Throwable -> L1e
            y00.u0 r0 = r0.f45260g     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "Database error"
            r0.c(r2, r4, r5)     // Catch: java.lang.Throwable -> L1e
            throw r5     // Catch: java.lang.Throwable -> L1e
        L32:
            if (r1 == 0) goto L37
            r1.close()
        L37:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.N(java.lang.String, java.lang.String[]):java.lang.String");
    }

    public final void O(ContentValues contentValues) {
        n1 n1Var = (n1) this.f21216b;
        try {
            SQLiteDatabase sQLiteDatabaseG0 = g0();
            if (contentValues.getAsString("app_id") == null) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45262i.b(w0.x("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (sQLiteDatabaseG0.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && sQLiteDatabaseG0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                w0 w0Var2 = n1Var.f44987f;
                n1.m(w0Var2);
                w0Var2.f45260g.c("Failed to insert/update table (got -1). key", w0.x("consent_settings"), w0.x("app_id"));
            }
        } catch (SQLiteException e5) {
            w0 w0Var3 = n1Var.f44987f;
            n1.m(w0Var3);
            w0Var3.f45260g.d("Error storing into table. key", w0.x("consent_settings"), w0.x("app_id"), e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.r P(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.P(java.lang.String, java.lang.String, java.lang.String):y00.r");
    }

    public final void Q(String str, r rVar) {
        n1 n1Var = (n1) this.f21216b;
        com.google.android.gms.common.internal.i0.h(rVar);
        p();
        q();
        ContentValues contentValues = new ContentValues();
        String str2 = rVar.f45091a;
        contentValues.put("app_id", str2);
        contentValues.put("name", rVar.f45092b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f45093c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f45094d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f45096f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f45097g));
        contentValues.put("last_bundled_day", rVar.f45098h);
        contentValues.put("last_sampled_complex_event_id", rVar.f45099i);
        contentValues.put("last_sampling_rate", rVar.f45100j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f45095e));
        Boolean bool = rVar.f45101k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (g0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45260g.b(w0.x(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e5) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45260g.c("Error storing event aggregates. appId", w0.x(str2), e5);
        }
    }

    public final void R(String str, String str2) {
        com.google.android.gms.common.internal.i0.e(str2);
        p();
        q();
        try {
            g0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45260g.c("Error deleting snapshot. appId", w0.x(str2), e5);
        }
    }

    public final m4 S(String str, long j9, byte[] bArr, String str2, String str3, int i11, int i12, long j11, long j12, long j13) {
        n1 n1Var = (n1) this.f21216b;
        if (TextUtils.isEmpty(str2)) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45266n.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            y8 y8Var = (y8) n4.a0(z8.A(), bArr);
            z2 z2VarC = z2.c(i11);
            if (z2VarC != z2.GOOGLE_SIGNAL && z2VarC != z2.GOOGLE_SIGNAL_PENDING && i12 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((z8) y8Var.f11483b).t()).iterator();
                while (it.hasNext()) {
                    a9 a9Var = (a9) ((b9) it.next()).k();
                    a9Var.b();
                    ((b9) a9Var.f11483b).X0(i12);
                    arrayList.add((b9) a9Var.d());
                }
                y8Var.b();
                ((z8) y8Var.f11483b).F();
                y8Var.b();
                ((z8) y8Var.f11483b).E(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length = strArrSplit.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    String str4 = strArrSplit[i13];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        w0 w0Var2 = n1Var.f44987f;
                        n1.m(w0Var2);
                        w0Var2.f45260g.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i13++;
                }
            }
            return new m4(j9, (z8) y8Var.d(), str2, map, z2VarC, j11, j12, j13, i12);
        } catch (IOException e5) {
            w0 w0Var3 = n1Var.f44987f;
            n1.m(w0Var3);
            w0Var3.f45260g.c("Failed to queued MeasurementBatch from upload_queue. appId", str, e5);
            return null;
        }
    }

    public final String T() {
        ((n1) this.f21216b).f44992k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        z2 z2Var = z2.GOOGLE_SIGNAL;
        int iA = z2Var.a();
        Long l7 = (Long) g0.S.a(null);
        l7.getClass();
        String str = "(upload_type = " + iA + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l7 + ")";
        String str2 = "(upload_type != " + z2Var.a() + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) g0.R.a(null)).longValue() + ")";
        StringBuilder sb2 = new StringBuilder(org.bouncycastle.jcajce.provider.asymmetric.a.C(str.length(), 5, str2.length(), 1));
        j4.s.A(sb2, "(", str, " OR ", str2);
        sb2.append(")");
        return sb2.toString();
    }

    public final void V(String str, b2 b2Var) {
        com.google.android.gms.common.internal.i0.h(str);
        com.google.android.gms.common.internal.i0.h(b2Var);
        p();
        q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", b2Var.g());
        contentValues.put("consent_source", Integer.valueOf(b2Var.f44617b));
        O(contentValues);
    }

    public final List W(String str) {
        List list;
        String string;
        n1 n1Var = (n1) this.f21216b;
        p();
        q();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseG0 = g0();
            sQLiteDatabaseG0.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseG0.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                com.google.android.gms.common.internal.i0.h(string);
                            }
                            if (string2 == null) {
                                w0 w0Var = n1Var.f44987f;
                                n1.m(w0Var);
                                w0Var.f45260g.b(w0.x(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j9 = cursorQuery.getLong(2);
                                c7 c7VarT = d7.t();
                                c7VarT.b();
                                ((d7) c7VarT.f11483b).u(string2);
                                c7VarT.b();
                                ((d7) c7VarT.f11483b).x(j9);
                                c7VarT.b();
                                ((d7) c7VarT.f11483b).w(string);
                                if (zIsEmpty) {
                                    c7VarT.b();
                                    ((d7) c7VarT.f11483b).v();
                                }
                                arrayList.add((d7) c7VarT.d());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseG0.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseG0.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseG0.setTransactionSuccessful();
                        list = arrayList;
                    }
                } catch (SQLiteException e5) {
                    w0 w0Var2 = n1Var.f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45260g.c("Error querying or deleting diagnostic signals. appId", w0.x(str), e5);
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                sQLiteDatabaseG0.endTransaction();
                return list;
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseG0.endTransaction();
                throw th2;
            }
        } catch (SQLiteException e11) {
            w0 w0Var3 = n1Var.f44987f;
            n1.m(w0Var3);
            w0Var3.f45260g.c("Error opening database for diagnostic signals. appId", w0.x(str), e11);
            return Collections.EMPTY_LIST;
        }
    }

    public final void X(String str, b2 b2Var) {
        com.google.android.gms.common.internal.i0.h(str);
        p();
        q();
        V(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", b2Var.g());
        O(contentValues);
    }

    public final b2 Y(String str) {
        com.google.android.gms.common.internal.i0.h(str);
        p();
        q();
        return b2.c(100, N("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final r Z(String str, t8 t8Var, String str2) {
        r rVarP = P("events", str, t8Var.y());
        if (rVarP != null) {
            long j9 = rVarP.f45095e + 1;
            long j11 = rVarP.f45094d + 1;
            return new r(rVarP.f45091a, rVarP.f45092b, rVarP.f45093c + 1, j11, j9, rVarP.f45096f, rVarP.f45097g, rVarP.f45098h, rVarP.f45099i, rVarP.f45100j, rVarP.f45101k);
        }
        n1 n1Var = (n1) this.f21216b;
        w0 w0Var = n1Var.f44987f;
        n1.m(w0Var);
        w0Var.f45263j.c("Event aggregate wasn't created during raw event logging. appId, event", w0.x(str), n1Var.f44991j.a(str2));
        return new r(str, t8Var.y(), 1L, 1L, 1L, t8Var.A(), 0L, null, null, null, null);
    }

    public final boolean a0() {
        return ((n1) this.f21216b).f44982a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018d A[Catch: all -> 0x007a, SQLiteException -> 0x007d, LOOP:0: B:66:0x018d->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ea A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(java.lang.String r21, long r22, long r24, u90.j r26) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.b0(java.lang.String, long, long, u90.j):void");
    }

    public final void d0() {
        q();
        g0().beginTransaction();
    }

    public final void e0() {
        q();
        g0().setTransactionSuccessful();
    }

    public final void f0() {
        q();
        g0().endTransaction();
    }

    public final SQLiteDatabase g0() {
        p();
        try {
            return this.f44955e.getWritableDatabase();
        } catch (SQLiteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(e5, "Error opening database");
            throw e5;
        }
    }

    public final void h0(String str) {
        r rVarP;
        R("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = g0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (rVarP = P("events", str, string)) != null) {
                            Q("events_snapshot", rVarP);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e5) {
                w0 w0Var = ((n1) this.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45260g.c("Error creating snapshot. appId", w0.x(str), e5);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.i0(java.lang.String):void");
    }

    public final void j0(String str, String str2) {
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        p();
        q();
        try {
            g0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e5) {
            n1 n1Var = (n1) this.f21216b;
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.d("Error deleting user property. appId", w0.x(str), n1Var.f44991j.c(str2), e5);
        }
    }

    public final boolean k0(p4 p4Var) {
        n1 n1Var = (n1) this.f21216b;
        String str = p4Var.f45069b;
        p();
        q();
        String str2 = p4Var.f45068a;
        String str3 = p4Var.f45070c;
        if (l0(str2, str3) == null) {
            if (r4.q0(str3)) {
                if (L("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(n1Var.f44985d.y(str2, g0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jL = L("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                n1Var.getClass();
                if (jL >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(p4Var.f45071d));
        c0(contentValues, p4Var.f45072e);
        try {
            if (g0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(w0.x(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e5) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45260g.c("Error storing user property. appId", w0.x(str2), e5);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.p4 l0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f21216b
            r1 = r0
            y00.n1 r1 = (y00.n1) r1
            com.google.android.gms.common.internal.i0.e(r12)
            com.google.android.gms.common.internal.i0.e(r13)
            r11.p()
            r11.q()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.g0()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.C(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            y00.p4 r4 = new y00.p4     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            y00.w0 r12 = r1.f44987f     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            y00.n1.m(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            y00.u0 r12 = r12.f45260g     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            y00.v0 r0 = y00.w0.x(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.b(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r12 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r12 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r12 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L7f:
            y00.w0 r13 = r1.f44987f     // Catch: java.lang.Throwable -> L67
            y00.n1.m(r13)     // Catch: java.lang.Throwable -> L67
            y00.u0 r13 = r13.f45260g     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            y00.v0 r4 = y00.w0.x(r5)     // Catch: java.lang.Throwable -> L67
            y00.r0 r1 = r1.f44991j     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L67
            r13.d(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.l0(java.lang.String, java.lang.String):y00.p4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List m0(String str) {
        String str2;
        n1 n1Var = (n1) this.f21216b;
        com.google.android.gms.common.internal.i0.e(str);
        p();
        q();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                n1Var.getClass();
                cursorQuery = g0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j9 = cursorQuery.getLong(2);
                            Object objC = C(cursorQuery, 3);
                            if (objC == null) {
                                w0 w0Var = n1Var.f44987f;
                                n1.m(w0Var);
                                w0Var.f45260g.b(w0.x(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new p4(str2, str3, string, j9, objC));
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    w0 w0Var2 = n1Var.f44987f;
                                    n1.m(w0Var2);
                                    w0Var2.f45260g.c("Error querying user properties. appId", w0.x(str2), e);
                                    arrayList = Collections.EMPTY_LIST;
                                }
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e12) {
            e = e12;
            str2 = str;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        y00.n1.m(r13);
        r13.f45260g.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List n0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.n0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean o0(e eVar) {
        n1 n1Var = (n1) this.f21216b;
        p();
        q();
        String str = eVar.f44689a;
        com.google.android.gms.common.internal.i0.h(str);
        if (l0(str, eVar.f44691c.f45052b) == null) {
            long jL = L("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            n1Var.getClass();
            if (jL >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.f44690b);
        contentValues.put("name", eVar.f44691c.f45052b);
        Object objD = eVar.f44691c.d();
        com.google.android.gms.common.internal.i0.h(objD);
        c0(contentValues, objD);
        contentValues.put("active", Boolean.valueOf(eVar.f44693e));
        contentValues.put("trigger_event_name", eVar.f44694f);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.f44696h));
        u uVar = eVar.f44695g;
        r4 r4Var = n1Var.f44990i;
        w0 w0Var = n1Var.f44987f;
        n1.k(r4Var);
        contentValues.put("timed_out_event", r4.Z(uVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.f44692d));
        n1.k(r4Var);
        contentValues.put("triggered_event", r4.Z(eVar.f44697i));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.f44691c.f45053c));
        contentValues.put("time_to_live", Long.valueOf(eVar.f44698j));
        contentValues.put("expired_event", r4.Z(eVar.f44699k));
        try {
            if (g0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            n1.m(w0Var);
            w0Var.f45260g.b(w0.x(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e5) {
            n1.m(w0Var);
            w0Var.f45260g.c("Error storing conditional user property", w0.x(str), e5);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.e p0(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.p0(java.lang.String, java.lang.String):y00.e");
    }

    public final void q0(String str, String str2) {
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        p();
        q();
        try {
            g0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e5) {
            n1 n1Var = (n1) this.f21216b;
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.d("Error deleting conditional property", w0.x(str), n1Var.f44991j.c(str2), e5);
        }
    }

    public final List r0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.i0.e(str);
        p();
        q();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return s0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // y00.f4
    public final void s() {
        n1 n1Var = (n1) this.f21216b;
        if (n1Var.f44985d.A(null, g0.f44776e1)) {
            l1 l1Var = n1Var.f44988g;
            n1.m(l1Var);
            l1Var.y(new a8.f(this, 22));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r3 = r2.f44987f;
        y00.n1.m(r3);
        r3.f45260g.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List s0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.s0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final long t(String str, z8 z8Var, String str2, Map map, z2 z2Var, Long l7) {
        int iDelete;
        n1 n1Var = (n1) this.f21216b;
        p();
        q();
        com.google.android.gms.common.internal.i0.h(z8Var);
        com.google.android.gms.common.internal.i0.e(str);
        p();
        q();
        if (a0()) {
            l4 l4Var = this.f44586c;
            long jA = l4Var.f44928i.f45046g.a();
            vz.b bVar = n1Var.f44992k;
            w0 w0Var = n1Var.f44987f;
            bVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) g0.M.a(null)).longValue()) {
                l4Var.f44928i.f45046g.b(jElapsedRealtime);
                p();
                q();
                if (a0() && (iDelete = g0().delete("upload_queue", T(), new String[0])) > 0) {
                    n1.m(w0Var);
                    w0Var.f45267o.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                com.google.android.gms.common.internal.i0.e(str);
                p();
                q();
                try {
                    int iY = n1Var.f44985d.y(str, g0.A);
                    if (iY > 0) {
                        g0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iY)});
                    }
                } catch (SQLiteException e5) {
                    n1.m(w0Var);
                    w0Var.f45260g.c("Error deleting over the limit queued batches. appId", w0.x(str), e5);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrA = z8Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(z2Var.a()));
        vz.b bVar2 = n1Var.f44992k;
        w0 w0Var2 = n1Var.f44987f;
        bVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l7 != null) {
            contentValues.put("associated_row_id", l7);
        }
        try {
            long jInsert = g0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            n1.m(w0Var2);
            w0Var2.f45260g.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e11) {
            n1.m(w0Var2);
            w0Var2.f45260g.c("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0408  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.b1 t0(java.lang.String r54) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.t0(java.lang.String):y00.b1");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List u(java.lang.String r19, y00.c4 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.u(java.lang.String, y00.c4, int):java.util.List");
    }

    public final void u0(b1 b1Var, boolean z11) {
        n1 n1Var = (n1) this.f21216b;
        n1 n1Var2 = b1Var.f44590a;
        p();
        q();
        String strE = b1Var.E();
        com.google.android.gms.common.internal.i0.h(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strE);
        l4 l4Var = this.f44586c;
        if (z11) {
            contentValues.put("app_instance_id", (String) null);
        } else if (l4Var.e(strE).i(a2.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", b1Var.F());
        }
        contentValues.put("gmp_app_id", b1Var.H());
        if (l4Var.e(strE).i(a2.AD_STORAGE)) {
            l1 l1Var = n1Var2.f44988g;
            n1.m(l1Var);
            l1Var.p();
            contentValues.put("resettable_device_id_hash", b1Var.f44594e);
        }
        l1 l1Var2 = n1Var2.f44988g;
        n1.m(l1Var2);
        l1Var2.p();
        contentValues.put("last_bundle_index", Long.valueOf(b1Var.f44596g));
        l1 l1Var3 = n1Var2.f44988g;
        n1.m(l1Var3);
        l1Var3.p();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(b1Var.f44597h));
        l1 l1Var4 = n1Var2.f44988g;
        n1.m(l1Var4);
        l1Var4.p();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(b1Var.f44598i));
        contentValues.put("app_version", b1Var.O());
        l1 l1Var5 = n1Var2.f44988g;
        n1.m(l1Var5);
        l1Var5.p();
        contentValues.put("app_store", b1Var.l);
        l1 l1Var6 = n1Var2.f44988g;
        n1.m(l1Var6);
        l1Var6.p();
        contentValues.put("gmp_version", Long.valueOf(b1Var.f44601m));
        l1 l1Var7 = n1Var2.f44988g;
        n1.m(l1Var7);
        l1Var7.p();
        contentValues.put("dev_cert_hash", Long.valueOf(b1Var.f44602n));
        l1 l1Var8 = n1Var2.f44988g;
        n1.m(l1Var8);
        l1Var8.p();
        contentValues.put("measurement_enabled", Boolean.valueOf(b1Var.f44603o));
        l1 l1Var9 = n1Var2.f44988g;
        l1 l1Var10 = n1Var2.f44988g;
        n1.m(l1Var9);
        l1Var9.p();
        contentValues.put("day", Long.valueOf(b1Var.K));
        n1.m(l1Var10);
        l1Var10.p();
        contentValues.put("daily_public_events_count", Long.valueOf(b1Var.L));
        n1.m(l1Var10);
        l1Var10.p();
        contentValues.put("daily_events_count", Long.valueOf(b1Var.M));
        n1.m(l1Var10);
        l1Var10.p();
        contentValues.put("daily_conversions_count", Long.valueOf(b1Var.N));
        l1 l1Var11 = n1Var2.f44988g;
        n1.m(l1Var11);
        l1Var11.p();
        contentValues.put("config_fetched_time", Long.valueOf(b1Var.S));
        l1 l1Var12 = n1Var2.f44988g;
        n1.m(l1Var12);
        l1Var12.p();
        contentValues.put("failed_config_fetch_time", Long.valueOf(b1Var.T));
        contentValues.put("app_version_int", Long.valueOf(b1Var.Q()));
        contentValues.put("firebase_instance_id", b1Var.K());
        n1.m(l1Var10);
        l1Var10.p();
        contentValues.put("daily_error_events_count", Long.valueOf(b1Var.O));
        n1.m(l1Var10);
        l1Var10.p();
        contentValues.put("daily_realtime_events_count", Long.valueOf(b1Var.P));
        n1.m(l1Var10);
        l1Var10.p();
        contentValues.put("health_monitor_sample", b1Var.Q);
        contentValues.put("android_id", (Long) 0L);
        l1 l1Var13 = n1Var2.f44988g;
        n1.m(l1Var13);
        l1Var13.p();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(b1Var.f44604p));
        contentValues.put("dynamite_version", Long.valueOf(b1Var.b()));
        if (l4Var.e(strE).i(a2.ANALYTICS_STORAGE)) {
            l1 l1Var14 = n1Var2.f44988g;
            n1.m(l1Var14);
            l1Var14.p();
            contentValues.put("session_stitching_token", b1Var.f44608t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(b1Var.z()));
        l1 l1Var15 = n1Var2.f44988g;
        n1.m(l1Var15);
        l1Var15.p();
        contentValues.put("target_os_version", Long.valueOf(b1Var.f44610v));
        l1 l1Var16 = n1Var2.f44988g;
        n1.m(l1Var16);
        l1Var16.p();
        contentValues.put("session_stitching_token_hash", Long.valueOf(b1Var.f44611w));
        com.google.android.gms.internal.measurement.f4.a();
        g gVar = n1Var.f44985d;
        w0 w0Var = n1Var.f44987f;
        if (gVar.A(strE, g0.O0)) {
            l1 l1Var17 = n1Var2.f44988g;
            n1.m(l1Var17);
            l1Var17.p();
            contentValues.put("ad_services_version", Integer.valueOf(b1Var.f44612x));
            l1 l1Var18 = n1Var2.f44988g;
            n1.m(l1Var18);
            l1Var18.p();
            contentValues.put("attribution_eligibility_status", Long.valueOf(b1Var.B));
        }
        l1 l1Var19 = n1Var2.f44988g;
        n1.m(l1Var19);
        l1Var19.p();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(b1Var.f44613y));
        contentValues.put("npa_metadata_value", b1Var.x());
        l1 l1Var20 = n1Var2.f44988g;
        n1.m(l1Var20);
        l1Var20.p();
        contentValues.put("bundle_delivery_index", Long.valueOf(b1Var.F));
        contentValues.put("sgtm_preview_key", b1Var.D());
        n1.m(l1Var10);
        l1Var10.p();
        contentValues.put("dma_consent_state", Integer.valueOf(b1Var.D));
        n1.m(l1Var10);
        l1Var10.p();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(b1Var.E));
        contentValues.put("serialized_npa_metadata", b1Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(b1Var.t()));
        l1 l1Var21 = n1Var2.f44988g;
        n1.m(l1Var21);
        l1Var21.p();
        ArrayList arrayList = b1Var.f44607s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                n1.m(w0Var);
                w0Var.f45263j.b(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(MessageLogView.COMMA_SEPARATOR, arrayList));
            }
        }
        if (gVar.A(null, g0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        l1 l1Var22 = n1Var2.f44988g;
        n1.m(l1Var22);
        l1Var22.p();
        contentValues.put("unmatched_pfo", b1Var.f44614z);
        l1 l1Var23 = n1Var2.f44988g;
        n1.m(l1Var23);
        l1Var23.p();
        contentValues.put("unmatched_uwa", b1Var.A);
        l1 l1Var24 = n1Var2.f44988g;
        n1.m(l1Var24);
        l1Var24.p();
        contentValues.put("ad_campaign_info", b1Var.H);
        if (gVar.A(strE, g0.f44791j1)) {
            l1 l1Var25 = n1Var2.f44988g;
            n1.m(l1Var25);
            l1Var25.p();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(b1Var.J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseG0 = g0();
            if (sQLiteDatabaseG0.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseG0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                n1.m(w0Var);
                w0Var.f45260g.b(w0.x(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e5) {
            n1.m(w0Var);
            w0Var.f45260g.c("Error storing app. appId", w0.x(strE), e5);
        }
    }

    public final boolean v(String str) {
        z2[] z2VarArr = {z2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(z2VarArr[0].a()));
        String strU = U(arrayList);
        String strT = T();
        return L(e0.f.o(new StringBuilder((strU.length() + 61) + strT.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strU, " AND NOT ", strT), new String[]{str}) != 0;
    }

    public final j v0(long j9, String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        return w0(j9, str, 1L, false, false, z11, false, z12, z13, z14);
    }

    public final void w(Long l7) {
        n1 n1Var = (n1) this.f21216b;
        p();
        q();
        try {
            if (g0().delete("upload_queue", "rowid=?", new String[]{l7.toString()}) != 1) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45263j.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e5) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45260g.b(e5, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e5;
        }
    }

    public final j w0(long j9, String str, long j11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        n1 n1Var = (n1) this.f21216b;
        com.google.android.gms.common.internal.i0.e(str);
        p();
        q();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseG0 = g0();
                cursorQuery = sQLiteDatabaseG0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j9) {
                        jVar.f44865b = cursorQuery.getLong(1);
                        jVar.f44864a = cursorQuery.getLong(2);
                        jVar.f44866c = cursorQuery.getLong(3);
                        jVar.f44867d = cursorQuery.getLong(4);
                        jVar.f44868e = cursorQuery.getLong(5);
                        jVar.f44869f = cursorQuery.getLong(6);
                        jVar.f44870g = cursorQuery.getLong(7);
                    }
                    if (z11) {
                        jVar.f44865b += j11;
                    }
                    if (z12) {
                        jVar.f44864a += j11;
                    }
                    if (z13) {
                        jVar.f44866c += j11;
                    }
                    if (z14) {
                        jVar.f44867d += j11;
                    }
                    if (z15) {
                        jVar.f44868e += j11;
                    }
                    if (z16) {
                        jVar.f44869f += j11;
                    }
                    if (z17) {
                        jVar.f44870g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j9));
                    contentValues.put("daily_public_events_count", Long.valueOf(jVar.f44864a));
                    contentValues.put("daily_events_count", Long.valueOf(jVar.f44865b));
                    contentValues.put("daily_conversions_count", Long.valueOf(jVar.f44866c));
                    contentValues.put("daily_error_events_count", Long.valueOf(jVar.f44867d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f44868e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(jVar.f44869f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(jVar.f44870g));
                    sQLiteDatabaseG0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    w0 w0Var = n1Var.f44987f;
                    n1.m(w0Var);
                    w0Var.f45263j.b(w0.x(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e5) {
                w0 w0Var2 = n1Var.f44987f;
                n1.m(w0Var2);
                w0Var2.f45260g.c("Error updating daily counts. appId", w0.x(str), e5);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return jVar;
        } catch (Throwable th2) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String x() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.g0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L37
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            java.lang.Object r3 = r6.f21216b     // Catch: java.lang.Throwable -> L1a
            y00.n1 r3 = (y00.n1) r3     // Catch: java.lang.Throwable -> L1a
            y00.w0 r3 = r3.f44987f     // Catch: java.lang.Throwable -> L1a
            y00.n1.m(r3)     // Catch: java.lang.Throwable -> L1a
            y00.u0 r3 = r3.f45260g     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L1a
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            return r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.x():java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:109), block:B:19:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t5.a x0(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f21216b
            r1 = r0
            y00.n1 r1 = (y00.n1) r1
            com.google.android.gms.common.internal.i0.e(r12)
            r11.p()
            r11.q()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.g0()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L83
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            y00.w0 r6 = r1.f44987f     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            y00.n1.m(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            y00.u0 r6 = r6.f45260g     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            y00.v0 r8 = y00.w0.x(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.b(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6c
        L5c:
            r0 = move-exception
            goto L73
        L5e:
            if (r0 != 0) goto L61
            goto L83
        L61:
            t5.a r6 = new t5.a     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 18
            r6.<init>(r0, r4, r5, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6c:
            r2 = r3
            goto L89
        L6e:
            r0 = move-exception
            r12 = r0
            goto L89
        L71:
            r0 = move-exception
            r3 = r2
        L73:
            y00.w0 r1 = r1.f44987f     // Catch: java.lang.Throwable -> L59
            y00.n1.m(r1)     // Catch: java.lang.Throwable -> L59
            y00.u0 r1 = r1.f45260g     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            y00.v0 r12 = y00.w0.x(r12)     // Catch: java.lang.Throwable -> L59
            r1.c(r4, r12, r0)     // Catch: java.lang.Throwable -> L59
        L83:
            if (r3 == 0) goto L88
            r3.close()
        L88:
            return r2
        L89:
            if (r2 == 0) goto L8e
            r2.close()
        L8e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m.x0(java.lang.String):t5.a");
    }

    public final void y(long j9) {
        p();
        q();
        try {
            if (g0().delete("queue", "rowid=?", new String[]{String.valueOf(j9)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(e5, "Failed to delete a bundle in a queue table");
            throw e5;
        }
    }

    public final void y0(b9 b9Var, boolean z11) {
        p();
        q();
        com.google.android.gms.common.internal.i0.e(b9Var.t());
        if (!b9Var.g2()) {
            qc.y.e();
            return;
        }
        z();
        n1 n1Var = (n1) this.f21216b;
        vz.b bVar = n1Var.f44992k;
        w0 w0Var = n1Var.f44987f;
        bVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jH2 = b9Var.h2();
        f0 f0Var = g0.R;
        if (jH2 < jCurrentTimeMillis - ((Long) f0Var.a(null)).longValue() || b9Var.h2() > ((Long) f0Var.a(null)).longValue() + jCurrentTimeMillis) {
            n1.m(w0Var);
            w0Var.f45263j.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", w0.x(b9Var.t()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(b9Var.h2()));
        }
        byte[] bArrA = b9Var.a();
        try {
            n4 n4Var = this.f44586c.f44926g;
            l4.U(n4Var);
            byte[] bArrZ = n4Var.Z(bArrA);
            n1.m(w0Var);
            w0Var.f45267o.b(Integer.valueOf(bArrZ.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", b9Var.t());
            contentValues.put("bundle_end_timestamp", Long.valueOf(b9Var.h2()));
            contentValues.put(Bayeux.KEY_DATA, bArrZ);
            contentValues.put("has_realtime", Integer.valueOf(z11 ? 1 : 0));
            if (b9Var.t0()) {
                contentValues.put("retry_count", Integer.valueOf(b9Var.u0()));
            }
            try {
                if (g0().insert("queue", null, contentValues) == -1) {
                    n1.m(w0Var);
                    w0Var.f45260g.b(w0.x(b9Var.t()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e5) {
                n1.m(w0Var);
                w0Var.f45260g.c("Error storing bundle. appId", w0.x(b9Var.t()), e5);
            }
        } catch (IOException e11) {
            n1.m(w0Var);
            w0Var.f45260g.c("Data loss. Failed to serialize bundle. appId", w0.x(b9Var.t()), e11);
        }
    }

    public final void z() {
        p();
        q();
        if (a0()) {
            l4 l4Var = this.f44586c;
            long jA = l4Var.f44928i.f45045f.a();
            n1 n1Var = (n1) this.f21216b;
            n1Var.f44992k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) g0.M.a(null)).longValue()) {
                l4Var.f44928i.f45045f.b(jElapsedRealtime);
                p();
                q();
                if (a0()) {
                    SQLiteDatabase sQLiteDatabaseG0 = g0();
                    n1Var.f44992k.getClass();
                    int iDelete = sQLiteDatabaseG0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) g0.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        w0 w0Var = n1Var.f44987f;
                        n1.m(w0Var);
                        w0Var.f45267o.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }
}
