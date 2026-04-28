package jb;

import android.content.ContentValues;
import android.text.TextUtils;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ba.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i11) {
        super(14, 15);
        this.f24918c = i11;
        switch (i11) {
            case 1:
                super(19, 20);
                this.f24919d = new r40.d();
                break;
            default:
                this.f24919d = new qb.e();
                break;
        }
    }

    @Override // ba.a
    public final void a(ha.a aVar) {
        int i11 = this.f24918c;
        aVar.getClass();
        switch (i11) {
            case 0:
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                z20.b.m(aVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                z20.b.m(aVar, "DROP TABLE `WorkSpec`");
                z20.b.m(aVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                qb.e eVar = (qb.e) this.f24919d;
                if (aVar instanceof ka.a) {
                    ja.b bVar = ((ka.a) aVar).f26243a;
                    eVar.getClass();
                    bVar.getClass();
                    bVar.r("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                    Object[] objArr = new Object[0];
                    bVar.getClass();
                    if (contentValues.size() == 0) {
                        i4.a.f("Empty values");
                        return;
                    }
                    int size = contentValues.size();
                    int length = objArr.length + size;
                    Object[] objArr2 = new Object[length];
                    StringBuilder sb2 = new StringBuilder("UPDATE ");
                    sb2.append(ja.b.f24766b[3]);
                    sb2.append("WorkSpec SET ");
                    int i12 = 0;
                    for (String str : contentValues.keySet()) {
                        sb2.append(i12 > 0 ? MessageLogView.COMMA_SEPARATOR : "");
                        sb2.append(str);
                        objArr2[i12] = contentValues.get(str);
                        sb2.append("=?");
                        i12++;
                    }
                    for (int i13 = size; i13 < length; i13++) {
                        objArr2[i13] = objArr[i13 - size];
                    }
                    if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                        sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                    }
                    ja.j jVarG = bVar.g(sb2.toString());
                    int length2 = objArr2.length;
                    int i14 = 0;
                    while (i14 < length2) {
                        Object obj = objArr2[i14];
                        i14++;
                        if (obj == null) {
                            jVarG.m(i14);
                        } else if (obj instanceof byte[]) {
                            jVarG.k(i14, (byte[]) obj);
                        } else if (obj instanceof Float) {
                            jVarG.f(i14, ((Number) obj).floatValue());
                        } else if (obj instanceof Double) {
                            jVarG.f(i14, ((Number) obj).doubleValue());
                        } else if (obj instanceof Long) {
                            jVarG.j(i14, ((Number) obj).longValue());
                        } else if (obj instanceof Integer) {
                            jVarG.j(i14, ((Number) obj).intValue());
                        } else if (obj instanceof Short) {
                            jVarG.j(i14, ((Number) obj).shortValue());
                        } else if (obj instanceof Byte) {
                            jVarG.j(i14, ((Number) obj).byteValue());
                        } else if (obj instanceof String) {
                            jVarG.s(i14, (String) obj);
                        } else {
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i14 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            jVarG.j(i14, ((Boolean) obj).booleanValue() ? 1L : 0L);
                        }
                    }
                    jVarG.f24791b.executeUpdateDelete();
                    return;
                }
                return;
            default:
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                z20.b.m(aVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                z20.b.m(aVar, "DROP TABLE `WorkSpec`");
                z20.b.m(aVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                r40.d dVar = (r40.d) this.f24919d;
                if (aVar instanceof ka.a) {
                    ja.b bVar2 = ((ka.a) aVar).f26243a;
                    dVar.getClass();
                    bVar2.getClass();
                    bVar2.r("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                    return;
                }
                return;
        }
    }
}
