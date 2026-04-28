package y00;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2.s0 f44905b;

    public l(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f44904a) {
            case 0:
                m mVar = (m) this.f44905b;
                n1 n1Var = (n1) mVar.f21216b;
                n1 n1Var2 = (n1) mVar.f21216b;
                n1Var.getClass();
                androidx.recyclerview.widget.j jVar = mVar.f44956f;
                if (jVar.f3774b != 0) {
                    ((vz.b) jVar.f3775c).getClass();
                    if (SystemClock.elapsedRealtime() - jVar.f3774b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((vz.b) jVar.f3775c).getClass();
                    jVar.f3774b = SystemClock.elapsedRealtime();
                    w0 w0Var = n1Var2.f44987f;
                    n1.m(w0Var);
                    w0Var.f45260g.a("Opening the database failed, dropping and recreating it");
                    if (!n1Var2.f44982a.getDatabasePath("google_app_measurement.db").delete()) {
                        w0 w0Var2 = n1Var2.f44987f;
                        n1.m(w0Var2);
                        w0Var2.f45260g.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        jVar.f3774b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e5) {
                        w0 w0Var3 = n1Var2.f44987f;
                        n1.m(w0Var3);
                        w0Var3.f45260g.b(e5, "Failed to open freshly created database");
                        throw e5;
                    }
                }
            default:
                q0 q0Var = (q0) this.f44905b;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e11) {
                    throw e11;
                } catch (SQLiteException unused2) {
                    n1 n1Var3 = (n1) q0Var.f21216b;
                    w0 w0Var4 = n1Var3.f44987f;
                    n1.m(w0Var4);
                    w0Var4.f45260g.a("Opening the local database failed, dropping and recreating it");
                    if (!n1Var3.f44982a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        w0 w0Var5 = n1Var3.f44987f;
                        n1.m(w0Var5);
                        w0Var5.f45260g.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e12) {
                        w0 w0Var6 = ((n1) q0Var.f21216b).f44987f;
                        n1.m(w0Var6);
                        w0Var6.f45260g.b(e12, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f44904a) {
            case 0:
                w0 w0Var = ((n1) ((m) this.f44905b).f21216b).f44987f;
                n1.m(w0Var);
                c2.f(w0Var, sQLiteDatabase);
                break;
            default:
                w0 w0Var2 = ((n1) ((q0) this.f44905b).f21216b).f44987f;
                n1.m(w0Var2);
                c2.f(w0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        int i13 = this.f44904a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.f44904a) {
            case 0:
                n1 n1Var = (n1) ((m) this.f44905b).f21216b;
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                c2.d(w0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", m.f44945g);
                w0 w0Var2 = n1Var.f44987f;
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", m.f44947i);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", m.f44948j);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", m.l);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", m.f44949k);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", m.f44950m);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", m.f44951n);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", m.f44952o);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", m.f44953p);
                com.google.android.gms.internal.measurement.f4.a();
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", m.f44954q);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", m.f44946h);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                n1.m(w0Var2);
                c2.d(w0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                w0 w0Var3 = ((n1) ((q0) this.f44905b).f21216b).f44987f;
                n1.m(w0Var3);
                c2.d(w0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", q0.f45080f);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        int i13 = this.f44904a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(q0 q0Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f44904a = 1;
        this.f44905b = q0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        this(context, "google_app_measurement.db");
        this.f44904a = 0;
        this.f44905b = mVar;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    private final void g(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    private final void p(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }
}
